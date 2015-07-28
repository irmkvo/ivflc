package web;

import domain.postgres.Menu;
import domain.postgres.MenuItem;
import domain.postgres.Puser;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.postgres.MenuService;
import service.postgres.PagesService;
import service.postgres.UsersService;

@Controller
public class MainPage {

    @Autowired
    UsersService userService;
    
    @Autowired
    MenuService menuService;

    @Autowired
    PagesService pagesService;
    
    @RequestMapping("/index")
    public String getPageOnRole(Map<String, Object> map) {

        Puser CurrentUser = GetCurrentUser();

        map.put("UserData", CurrentUser);
        map.put("LeftPanel", 1);
        map.put("RightPanel", 0);

        if (CurrentUser != null) {
            if ("ROLE_ADMIN".equals(CurrentUser.getRole().getRoleName())) {
                return "/admin/index";
            } else if ("ROLE_ADMIN".equals(CurrentUser.getRole().getRoleName())) {
                return "/admin/index";
            } else {
                return "/employers/index";
            }
        } else {
            // ЕСЛИ НЕ АВТОРИЗОВАН ПЕРЕНАПРАВИТЬ НА СТРАНИЦУ АВТОРИЗАЦИИ
            return pagesService.getLoginPages().getPageurl();
        }
    }

    @RequestMapping("/")
    public String home() {
        return "/login";
    }

    // GET ADMIN MAIN PAGE
    @RequestMapping("/admin/index")
    public String getAdministrativPanel(Map<String, Object> map) {
                        
        Puser CurrentUser = GetCurrentUser();

        map.put("UserData", CurrentUser);
        map.put("LeftPanel", 1);
        map.put("RightPanel", 0);

        return "/admin/index";
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
