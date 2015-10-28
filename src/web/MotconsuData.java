/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.medialog.Motconsu;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pojo.AaDataMotconsu;
import pojo.MotconsuPOJO;
import service.medialog.MotconsuService;
import service.postgres.UsersService;

/**
 *
 * @author kvo
 */
@Controller
public class MotconsuData {
    
    @Autowired
    UsersService userService;
    
    @Autowired
    MotconsuService motconsuService;
    
    @RequestMapping(method={RequestMethod.POST,RequestMethod.GET} , value="/getmotconsu")
    public String getMotconsu(Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();        

        if (CurrentUser != null) {
            List<Motconsu> mtcs = this.motconsuService.getMotconsuListByPatientId(CurrentUser.getPatientId());          
            
            String mtcsDataJson = "";
            if (mtcs != null) {
                List<MotconsuPOJO> mtcsPojo = new ArrayList<MotconsuPOJO>();
                Locale dLocale = new Locale.Builder().setLanguage("ru").setScript("Cyrl").build();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MMMMM.dd", dLocale);
                for(int i = 0; i < mtcs.size(); i++){
                    String medecinsNPS = ((Motconsu)mtcs.get(i)).getMedecinsId().getSpecialisation() + " " + 
                            ((Motconsu)mtcs.get(i)).getMedecinsId().getNom() + " " + 
                            ((Motconsu)mtcs.get(i)).getMedecinsId().getPrenom();
                    mtcsPojo.add(new MotconsuPOJO(
                            ((Motconsu)mtcs.get(i)).getMotconsuId(), 
                            ((Motconsu)mtcs.get(i)).getModelsId().getModeleName(), 
                            formatter.format(((Motconsu)mtcs.get(i)).getDateConsultation()), 
                            medecinsNPS));
                }
                ObjectMapper mapper = new ObjectMapper();
                AaDataMotconsu aa = new AaDataMotconsu();
                aa.setAaData(mtcsPojo);
                try {                    
                    mtcsDataJson = mapper.writeValueAsString(aa);
                } catch (JsonGenerationException e) {
                    e.printStackTrace();
                } catch (JsonMappingException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            
            map.put("body", mtcsDataJson);
            
            return "json";
        } else {
            // ЕСЛИ НЕ АВТОРИЗОВАН ПЕРЕНАПРАВИТЬ НА СТРАНИЦУ АВТОРИЗАЦИИ
            return "login";
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
