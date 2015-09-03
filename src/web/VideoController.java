package web;

import domain.postgres.Broadcasts;
import domain.postgres.Puser;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
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

    // GET ONLINE TRANSLATION
    @RequestMapping("/video")
    public String getVideoPage(Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();

        List<Broadcasts> brdc = broadcastService.getBroadcasts();

        API broadcastAPI = new API();

        for (Broadcasts brdcTemp : brdc) {
            brdcTemp.setJoinURL(broadcastAPI.getJoinURLViewer(CurrentUser.getUserLogin(), brdcTemp.getMeetingID()));
        }

        map.put("Broadcasts", brdc);
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

    // GET BROADCAST LOGIN PAGE
    @RequestMapping("/video/login")
    public String getVideoBroadcastLoginPage(Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();

        map.put("UserData", CurrentUser);
        map.put("LeftPanel", 1);

        return "/video/login";
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

        broadcast.setMeetingID(UUID.randomUUID().toString());

        Map<String, String> metadata = new HashMap<String, String>();

        metadata.put("description", broadcast.getDescription());
        metadata.put("email", broadcast.getAuthor());
        metadata.put("title", broadcast.getMeetingID());

        broadcast.setJoinURL(broadcastAPI.getJoinURL(broadcast.getAuthor(), broadcast.getMeetingID(), "true", broadcast.getDescription(), metadata, null));
        broadcast.setStartURL(broadcastAPI.getJoinURL(broadcast.getAuthor(), broadcast.getMeetingID(), "true", broadcast.getDescription(), metadata, null));

        broadcast.setCreationDate(new Date());
        broadcast.setStartDate(new Date());
        broadcast.setEndDate(new Date());

        broadcastService.addBroadcast(broadcast);

        map.put("LeftPanel", 1);

        return "/video";
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
