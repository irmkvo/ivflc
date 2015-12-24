/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.postgres.BroadcastRegistration;
import domain.postgres.Broadcasts;
import domain.postgres.Puser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pojo.AaDataBrdcUsers;
import pojo.AaDataRecords;
import service.postgres.BroadcastService;
import service.postgres.UsersService;
import video.api.API;
import video.api.objects.Records;

/**
 *
 * @author kvo
 */
@Controller
public class MedecinsBroadcast {
    
    @Autowired
    UsersService userService;
    
    @Autowired
    BroadcastService broadcastService;
    
    @RequestMapping(value="/med/video/webconf", method= RequestMethod.GET)
    public String getDocMedconf(Map<String, Object> map){
        
        Puser CurrentUser = GetCurrentUser();
        
        List<Broadcasts> brdc = new ArrayList<Broadcasts>();
        
        API broadcastAPI = new API();
        
        if(CurrentUser.getBrdc() != null){
            CurrentUser.getBrdc().setJoinURL(broadcastAPI.getJoinURLViewer(CurrentUser.getUserLogin(), CurrentUser.getBrdc().getMeetingID()));
            brdc.add(CurrentUser.getBrdc());
        }       
        
        map.put("brdcList", brdc);
        map.put("UserData", CurrentUser);
                     
        map.put("loadContent", "/WEB-INF/views/doctor/webinar/webconf_list.jsp");
        
        return "index";
    }
    
    @RequestMapping(value="/med/broadcast/archiv/json", method={RequestMethod.POST,RequestMethod.GET})
    public String getDocMedconfArchivJSON(Map<String, Object> map){
        
        Puser CurrentUser = GetCurrentUser();
        
        API broadcastAPI = new API();
        
        List<Records> brdc = broadcastAPI.getRecordingsObj(CurrentUser.getBrdc().getMeetingID());

        String resultDataJson = "";
        
        ObjectMapper mapper = new ObjectMapper();
        AaDataRecords aa = new AaDataRecords();
        aa.setAaData(brdc);
        try {
            resultDataJson = mapper.writeValueAsString(aa);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        map.put("body", resultDataJson);

        return "json";
    }
    
    @RequestMapping(value="/med/broadcast/user/json", method={RequestMethod.POST,RequestMethod.GET})
    public String getDocMedconfUserJSON(Map<String, Object> map){
        
        Puser CurrentUser = GetCurrentUser();
        
        API broadcastAPI = new API();
        
        List<BroadcastRegistration> brdcRegs = CurrentUser.getBrdc().getBrdcReg();

        String resultDataJson = "";
        
        for(int i = 0; i < brdcRegs.size(); i++){
            brdcRegs.get(i).setFname(brdcRegs.get(i).getLname() + " " + brdcRegs.get(i).getFname() + " " + brdcRegs.get(i).getMname());
            brdcRegs.get(i).setBrdc(null);
        }
        
        ObjectMapper mapper = new ObjectMapper();
        AaDataBrdcUsers aa = new AaDataBrdcUsers();
        aa.setAaData(brdcRegs);
        try {
            resultDataJson = mapper.writeValueAsString(aa);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        map.put("body", resultDataJson);

        return "json";
    }
    
    @RequestMapping(value="/med/video/personalvideo", method= RequestMethod.GET)
    public String getDocPersonalVideo(Map<String, Object> map){
        
        Puser CurrentUser = GetCurrentUser();
        
        List<Broadcasts> brdc = this.broadcastService.getBroadcastByUserId(CurrentUser);
        
        API broadcastAPI = new API();
        
        for(int i = 0; i < brdc.size(); i++){
            brdc.get(i).setJoinURL(broadcastAPI.getJoinURLViewer(CurrentUser.getUserLogin(), brdc.get(i).getMeetingID()));
        }       
        
        map.put("brdcList", brdc);
        map.put("UserData", CurrentUser);
                     
        map.put("loadContent", "/WEB-INF/views/doctor/personalvideo/webconf_list.jsp");
        
        return "index";
    }
    
    @RequestMapping(value="/med/video/personalvideo/{meetingId}", method={RequestMethod.POST,RequestMethod.GET})
    public String getDocPersonalVideoArchiv(@PathVariable("meetingId") String meetingId, Map<String, Object> map){
        
        Puser CurrentUser = GetCurrentUser();
        
        API broadcastAPI = new API();
        
        Broadcasts brdcTemp = this.broadcastService.getBroadcastByMeetingID(meetingId);
        
        List<Records> brdc = broadcastAPI.getRecordingsObj(brdcTemp.getMeetingID());

        map.put("confName", brdcTemp.getMeetingID());
        map.put("confPat", brdcTemp.getPatientId());
        map.put("confDesc", brdcTemp.getDescription());
        map.put("brdcArchive", brdc);
        map.put("loadContent", "/WEB-INF/views/doctor/personalvideo/webconf_archive_list.jsp");
        
        return "index";
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
