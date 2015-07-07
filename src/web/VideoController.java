/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.Puser;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UsersService;

/**
 *
 * @author Kimboo
 */
@Controller
public class VideoController {
    
    @Autowired
    UsersService userService;
    
    @RequestMapping("/video")
    public String getVideoPage(Map<String, Object> map) {        
                
        Puser CurrentUser = GetCurrentUser();
        
        map.put("UserData", CurrentUser);
        map.put("LeftPanel", 0);
        map.put("RightPanel", 1);
        
        
        return "/video/admin/video";        
    }
    
    // GET CURRENT USER FOR INDEX PAGE INFO
    private Puser GetCurrentUser()
    {
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
