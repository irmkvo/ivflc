package web;

import domain.postgres.Puser;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.postgres.UsersService;

/**
 *
 * @author Kimboo
 */
@Controller
public class VideoController {
    
    @Autowired
    UsersService userService;
    
    // GET ONLINE TRANSLATION
    @RequestMapping("/video")
    public String getVideoPage(Map<String, Object> map) {        
                
        Puser CurrentUser = GetCurrentUser();
        
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
