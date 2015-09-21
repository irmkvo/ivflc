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
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
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

        API broadcastAPI = new API();
                        
        String status = broadcastAPI.isMeetingRunning(meetingId);
        
        if (status.equalsIgnoreCase("true")){
            map.put("status", 1);
            map.put("meetingId", meetingId);
        } else {
            map.put("status", 0);
        }

        return "/video/broadcast/login";
    }
    // GET BROADCAST LOGIN PAGE LOGIN
    @RequestMapping(value = "/video/login/login", method = RequestMethod.GET)
    public String getVideoLoginPageLogin(@RequestParam("meetingId") String meetingId
            , @RequestParam("login") String login
            , @RequestParam("pass") String pass
            , Map<String, Object> map) {
        
        API broadcastAPI = new API();
        
        Broadcasts brdc = broadcastService.getBroadcastByMeetingID(meetingId);
        if (brdc != null) {
            brdc.setJoinURL(broadcastAPI.getJoinURLViewer(login, brdc.getMeetingID()));

            String status = broadcastAPI.isMeetingRunning(brdc.getMeetingID());

            if (status.equalsIgnoreCase("true")) {
                map.clear();
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

        map.put("brdcList", brdc);
        map.put("UserData", CurrentUser);
        map.put("LeftPanel", 1);

        return "/video/admin/video";
    }

    // GET ARCHIV TRANSLATION

    @RequestMapping("/video/archive")
    public String getVideoArchivePage(Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();

        map.put("UserData", CurrentUser);
        map.put("LeftPanel", 1);

        return "/video/admin/videoarchive";
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
            recordings = broadcastAPI.getRecordings("English 101,English 102,English 103,English 104,English 105,English 106,English 107,English 108,English 109,English 110");
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
        broadcast.setStartURL(broadcastAPI.getJoinURL(broadcast.getAuthor(), broadcast.getMeetingID(), "true", broadcast.getDescription(), null, null));

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

    // CREATE BROADCAST
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
