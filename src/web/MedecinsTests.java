/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.medialog.Motconsu;
import domain.postgres.Puser;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import service.medialog.ModelsService;
import service.medialog.MotconsuService;
import service.postgres.UsersService;

/**
 *
 * @author kvo
 */
@Controller
public class MedecinsTests {
 
    @Autowired
    UsersService userService;
    
    @Autowired
    MotconsuService motconsuService;
    
    @Autowired
    ModelsService modelsService;
    
    @RequestMapping("/patient/index")
    public String getPageOnRole(Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();

        map.put("UserData", CurrentUser);

        return "/clients/testslist";
        
    }
    // GET MODELS 180 DATA
    @RequestMapping("/med/patients/tests/180/{motconsuId}")
    public String getTestModels180(@PathVariable("motconsuId") Integer motconsuId, Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();

        if (CurrentUser != null) {
            Motconsu mtcs = this.motconsuService.getMotconsuById(motconsuId);
            map.put("DATAS180_1", mtcs.getData143());
            map.put("DATAS180_2", mtcs.getData144());
            map.put("DATAS180_3", mtcs.getData327());
        }
        
        map.put("loadContent", "/WEB-INF/views/doctor/patients/tests/list180.jsp");
        
        return "index";
        
    }
    // GET MODELS 181 DATA
    @RequestMapping("/med/patients/tests/181/{motconsuId}")
    public String getTestModels181(@PathVariable("motconsuId") Integer motconsuId, Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();

        if (CurrentUser != null) {
            Motconsu mtcs = this.motconsuService.getMotconsuById(motconsuId);
            map.put("DATAS181_1", mtcs.getData146());
            map.put("DATAS181_2", mtcs.getData262());
            map.put("DATAS181_3", mtcs.getData372());
        }
        
        map.put("loadContent", "/WEB-INF/views/doctor/patients/tests/list181.jsp");
        return "index";
        
    }
    // GET MODELS 222 DATA
    @RequestMapping("/med/patients/tests/222/{motconsuId}")
    public String getTestModels222(@PathVariable("motconsuId") Integer motconsuId, Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();

        if (CurrentUser != null) {
            Motconsu mtcs = this.motconsuService.getMotconsuById(motconsuId);
            map.put("DATAS222_1", mtcs.getData328());
            map.put("DATAS222_2", mtcs.getData329());
            map.put("DATAS222_3", mtcs.getData330());
            map.put("DATAS222_4", mtcs.getData331());
            map.put("DATAS222_5", mtcs.getData333());
            map.put("DATAS222_6", mtcs.getData334());
            map.put("DATAS222_7", mtcs.getData335());
            map.put("DATAS222_8", mtcs.getData436());
        }
        
        map.put("loadContent", "/WEB-INF/views/doctor/patients/tests/list222.jsp");
        return "index";
        
    }
    // GET MODELS 257 DATA
    @RequestMapping("/med/patients/tests/257/{motconsuId}")
    public String getTestModels257(@PathVariable("motconsuId") Integer motconsuId, Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();

        if (CurrentUser != null) {
            Motconsu mtcs = this.motconsuService.getMotconsuById(motconsuId);
            map.put("DATAS257_1", mtcs.getData269());
        }
        
        map.put("loadContent", "/WEB-INF/views/doctor/patients/tests/list257.jsp");
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
