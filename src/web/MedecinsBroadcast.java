/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.medialog.Motconsu;
import domain.postgres.Broadcasts;
import domain.postgres.Puser;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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
import pojo.AaDataMotconsu;
import pojo.AaDataRecords;
import pojo.MotconsuPOJO;
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
