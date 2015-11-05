/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.postgres.Broadcasts;
import java.text.SimpleDateFormat;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import service.postgres.BroadcastRegistrationService;
import service.postgres.BroadcastService;
import video.api.API;

/**
 *
 * @author kvo
 */
@Controller
public class VideoRegistrationController {
    
    @Autowired
    BroadcastRegistrationService brdcService;
    
    @Autowired
    BroadcastService broadcastService;
    
    // GET BROADCAST REGISTRATION PAGE
    @RequestMapping("/video/registration/{mettingId}")
    public String getVideoRegistrationPage(@PathVariable("mettingId") String meetingId, Map<String, Object> map) {

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
}
