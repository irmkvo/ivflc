/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.postgres.Puser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import service.postgres.UsersService;


@Controller
public class UserController {

    @Autowired
    UsersService userService;

    private Puser getCurrentUser() {
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
        Puser u = userService.getUserbyLogin(username);

        return u;
    }    
}
