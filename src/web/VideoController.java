package web;

import domain.postgres.Broadcasts;
import domain.postgres.Puser;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pojo.VideoArchive;
import service.postgres.BroadcastService;
import service.postgres.UsersService;
import video.api.API;

/**
 *
 * @author Kimboo
 */
@Controller
public class VideoController {

    @Autowired
    UsersService userService;

    @Autowired
    BroadcastService broadcastService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("MM/dd/yyyy HH:mm"), true);
        binder.registerCustomEditor(Date.class, editor);
    }

    // GET BROADCAST LOGIN PAGE
    @RequestMapping("/video/login/{mettingId}")
    public String getVideoLoginPage(@PathVariable("mettingId") String meetingId, Map<String, Object> map) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
    
        API broadcastAPI = new API();
        
        Broadcasts brdc = this.broadcastService.getBroadcastByMeetingID(meetingId);
        
        if (brdc != null) {
            String status = broadcastAPI.isMeetingRunning(meetingId);

            if (status.equalsIgnoreCase("true")) {
                map.put("status", 1);
                map.put("meetingId", meetingId);
            } else {
                map.put("status", 0);
                String strDate = sdf.format(brdc.getStartDate());
                map.put("brdcDate", strDate);
            }
        } else {
            map.put("status", 3);
        }

        return "meeting/login";
    }
    // GET BROADCAST LOGIN PAGE LOGIN
    @RequestMapping(value = "/video/login/login", method = RequestMethod.GET)
    public String getVideoLoginPageLogin(@RequestParam("meetingId") String meetingId
            , @RequestParam("login") String login
            , @RequestParam("pass") String pass
            , Map<String, Object> map, Model model) {
        
        API broadcastAPI = new API();
        
        Broadcasts brdc = broadcastService.getBroadcastByMeetingID(meetingId);
        if (brdc != null) {
            brdc.setJoinURL(broadcastAPI.getJoinURLViewer(login, brdc.getMeetingID()));

            String status = broadcastAPI.isMeetingRunning(brdc.getMeetingID());

            if (status.equalsIgnoreCase("true")) {
                model.asMap().clear();
                return "redirect:" + brdc.getJoinURL();
                //return new ModelAndView(new RedirectView(brdc.getJoinURL(), true, true, false));
            } else {
                map.put("status", 0);
                return "/video/broadcast/login";
                
                //return model;
            }
        } else {
            map.put("status", 2);
            return "/video/broadcast/login";
            //return model;
        }
        
    }
    // GET ONLINE TRANSLATION
    @RequestMapping("/video")
    public String getVideoPage(Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();

        List<Broadcasts> brdc = broadcastService.getBroadcasts();

        API broadcastAPI = new API();

        for (Broadcasts brdcTemp : brdc) {
            brdcTemp.setJoinURL(broadcastAPI.getJoinURLViewer(CurrentUser.getUserLogin(), brdcTemp.getMeetingID()));
        }

        map.put("loadContent", "/WEB-INF/views/video/broadcast/broadcast_list.jsp");
             
        map.put("brdcList", brdc);
        map.put("UserData", CurrentUser);
        map.put("LeftPanel", 1);

        return "index";
    }

    // GET ARCHIV TRANSLATION
    @RequestMapping("/video/archive")
    public String getVideoArchivePage(Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();
        
        List<Broadcasts> brdc = broadcastService.getBroadcasts();

        map.put("loadContent", "/WEB-INF/views/video/admin/videoarchive.jsp");

        map.put("brdcList", brdc);
        map.put("UserData", CurrentUser);
        map.put("LeftPanel", 1);

        return "/admin/index";
    }

    // GET ARCHIV RECORD LIST
    @RequestMapping("/video/archive/list/meetingId")
    public String getVideoArchiveRecordsPage(@PathVariable("meetingId") String meetingId, Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();
        
        API broadcastAPI = new API();
         
        List<VideoArchive> records = broadcastAPI.getRecordingsObj(meetingId);
        
        map.put("loadContent", "/WEB-INF/views/video/admin/videoarchivelist.jsp");
        
        map.put("brdcRecordsList", records);
        map.put("UserData", CurrentUser);
        map.put("LeftPanel", 1);

        return "/admin/index";
    }
    
    // VIDEO API PAGES
    // BROADCAST COMMAND

    @RequestMapping("/video/broadcast/helper/{command}/{meetingID}/{recordID}")
    public String broadcastHelper(Map<String, Object> map,
            @PathVariable("command") String command,
            @PathVariable("meetingID") String meetingID,
            @PathVariable("recordID") String recordID) {

        API broadcastAPI = new API();
        String status = "";
        String recordings = "";
        String recordingsURL = "";
        String recordingsDeleteURL = "";

        if (command.equals("isRunning")) {
            status = broadcastAPI.isMeetingRunning(meetingID);
        } else if (command.equals("getRecords")) {
            recordings = broadcastAPI.getRecordings(meetingID);
        } else if (command.equals("publish") || command.equals("unpublish")) {
            recordingsURL = broadcastAPI.setPublishRecordings((command.equals("publish")) ? true : false, recordID);
        } else if (command.equals("delete")) {
            recordingsDeleteURL = broadcastAPI.deleteRecordings(recordID);
        }

        return "/video";
    }

    // VIDEO API ADMIN PAGES
    // CREATE BROADCAST
    @RequestMapping("/admin/broadcast/create/{ID}")
    public String createBroadcast(Map<String, Object> map,
            @PathVariable("ID") Integer ID) {

        Broadcasts brdc = broadcastService.getBroadcastByID(ID);
        if (brdc != null) {
            map.put("broadcast", brdc);
        } else {
            brdc = new Broadcasts();
            brdc.setCreationDate(new Date());
            brdc.setStartDate(new Date());
            brdc.setEndDate(new Date());

            map.put("broadcast", brdc);
        }

        map.put("LeftPanel", 1);

        return "/video/admin/createBroadcast";
    }

    // SAVE/UPDATE BROADCAST

    @RequestMapping("/admin/broadcast/create/save")
    public String setBroadcast(@ModelAttribute(value = "broadcast") Broadcasts broadcast, Map<String, Object> map) {

        API broadcastAPI = new API();

        //broadcast.setMeetingID(UUID.randomUUID().toString());

        Map<String, String> metadata = new HashMap<String, String>();

        metadata.put("description", broadcast.getDescription());
        metadata.put("email", broadcast.getAuthor());
        metadata.put("title", broadcast.getMeetingID());

        broadcast.setJoinURL("");
        broadcast.setLoginURL("http://my.ivf.kz/video/login/" + broadcast.getMeetingID());
        broadcast.setStartURL("");
        // broadcastAPI.getJoinURL(broadcast.getAuthor(), broadcast.getMeetingID(), "true", broadcast.getDescription(), null, null)

        broadcast.setCreationDate(new Date());
        broadcast.setStartDate(new Date());
        broadcast.setEndDate(new Date());
        
        if (!broadcast.getMeetingID().isEmpty()) {
            broadcastService.addBroadcast(broadcast);
        }
        Puser CurrentUser = GetCurrentUser();

        List<Broadcasts> brdc = broadcastService.getBroadcasts();

        for (Broadcasts brdcTemp : brdc) {
            brdcTemp.setJoinURL(broadcastAPI.getJoinURLViewer(CurrentUser.getUserLogin(), brdcTemp.getMeetingID()));
        }

        map.put("brdcList", brdc);
        map.put("UserData", CurrentUser);
        map.put("LeftPanel", 1);

        return "/video/admin/video";
    }

    // DELETE BROADCAST
    @RequestMapping("/admin/broadcast/delete/{ID}")
    public String deleteBroadcast(Map<String, Object> map,
            @PathVariable("ID") Integer ID) {

        API broadcastAPI = new API();

        if (ID != null) {
            broadcastService.deleteBroadcastByID(broadcastService.getBroadcastByID(ID));
        }
        Puser CurrentUser = GetCurrentUser();

        List<Broadcasts> brdc = broadcastService.getBroadcasts();

        for (Broadcasts brdcTemp : brdc) {
            brdcTemp.setJoinURL(broadcastAPI.getJoinURLViewer(CurrentUser.getUserLogin(), brdcTemp.getMeetingID()));
        }

        map.put("brdcList", brdc);
        map.put("UserData", CurrentUser);
        map.put("LeftPanel", 1);

        return "/video/admin/video";
    }
    // START BROADCAST 
    @RequestMapping(value = "/video/start/meetingId", method = RequestMethod.GET)
    public String startBroadcast(@PathVariable("meetingId") String meetingId
            , Model model) {
        
        API broadcastAPI = new API();
        
        Broadcasts brdc = broadcastService.getBroadcastByMeetingID(meetingId);
        if (brdc != null) {
            
            String status = broadcastAPI.isMeetingRunning(brdc.getMeetingID());
            
            brdc.setStartURL(broadcastAPI.getJoinURL(brdc.getAuthor(), brdc.getMeetingID(), "true", brdc.getDescription(), null, null));
            
            if (status.equalsIgnoreCase("true")) {
                model.asMap().clear();
                return "redirect:" + brdc.getStartURL();
                //return new ModelAndView(new RedirectView(brdc.getJoinURL(), true, true, false));
            } else {
                return "/video";
                
                //return model;
            }
        } else {
            return "/video";
            //return model;
        }
        
    }
    // GET CURRENT USER FOR INDEX PAGE INFO
    private Puser GetCurrentUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (null == auth) {
            // throw new NotFndException("");
        }

        Object obj = auth.getPrincipal();

        String username = "";

        if (obj instanceof UserDetails) {
            username = ((UserDetails) obj).getUsername();
        } else {
            username = obj.toString();
        }

        return userService.getUserbyLogin(username);
    }
}
