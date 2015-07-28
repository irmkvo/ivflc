/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.postgres.Puser;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import service.medialog.MotconsuService;
import service.postgres.UsersService;

/**
 *
 * @author kvo
 */
public class MedicinsTests {
 
    @Autowired
    UsersService userService;
    
    @Autowired
    MotconsuService motconsuService;
    
    @RequestMapping("/patient/index")
    public String getPageOnRole(Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();

        map.put("UserData", CurrentUser);
        map.put("LeftPanel", 1);
        map.put("RightPanel", 0);

        return "/clients/testslist";
        
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
