package web;


import domain.postgres.Puser;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.postgres.UsersService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kvo
 */
@Controller
public class ScheduleController {
    
    @Autowired
    UsersService userService;
    
    @RequestMapping(value="/schedule", method= RequestMethod.GET)
    public String getSchedule(Map<String, Object> map){
        
        Puser CurrentUser = GetCurrentUser();
        
        map.put("UserData", CurrentUser);
        
        map.put("loadContent", "/WEB-INF/views/schedule/admin/schedule.jsp");
        
        map.put("LeftPanel", 1);
        map.put("RightPanel", 0);
        
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
