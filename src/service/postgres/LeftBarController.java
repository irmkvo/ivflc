/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.postgres;

import domain.postgres.MenuItem;
import domain.postgres.Puser;
import java.util.List;
import org.apache.tiles.Attribute;
import org.apache.tiles.AttributeContext;
import org.apache.tiles.preparer.ViewPreparer;
import org.apache.tiles.request.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import service.postgres.MenuService;
import service.postgres.UsersService;

/**
 *
 * @author kvo
 */
@Component
public class LeftBarController implements ViewPreparer {

    @Autowired
    UsersService userService;
  
    @Autowired
    MenuService menuService;
    
    @Override
    public void execute(Request rqst, AttributeContext ac) {
        Puser user = getCurrentUser();
        ac.putAttribute("UserData", new Attribute(user));
        
        List<MenuItem> userMenuItems = this.menuService.GetMenuItemListByRoleAndMenu(this.menuService.GetMenuByID(1), user.getRole());
        ac.putAttribute("UserMenu", new Attribute(userMenuItems));
        
        List<MenuItem> mainMenuItems = this.menuService.GetMenuItemListByRoleAndMenu(this.menuService.GetMenuByID(2), user.getRole());
        ac.putAttribute("MainMenu", new Attribute(mainMenuItems));
        
    }
     
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
