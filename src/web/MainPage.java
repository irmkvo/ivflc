package web;

import domain.postgres.Puser;
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

        if (CurrentUser != null) {
            if ("ROLE_ADMIN".equals(CurrentUser.getRole().getRoleName())) {
                map.put("loadContent", "/WEB-INF/views/clients/index.jsp");
                return "index";
            } else if ("ROLE_DOCTOR".equals(CurrentUser.getRole().getRoleName())) {
                map.put("loadContent", "/WEB-INF/views/doctor/schedule/schedule.jsp");
                return "index";
            } else {
                return "index";
            }
        } else {
            // ЕСЛИ НЕ АВТОРИЗОВАН ПЕРЕНАПРАВИТЬ НА СТРАНИЦУ АВТОРИЗАЦИИ
            return pagesService.getLoginPages().getPageurl();
        }
    }

    @RequestMapping("/")
    public String home(Map<String, Object> map) {

        map.put("loadContent", "/WEB-INF/views/login.jsp");

        return "login";
    }

    // GET ADMIN MAIN PAGE
    @RequestMapping("/admin/index")
    public String getAdministrativPanel(Map<String, Object> map) {

        map.put("loadContent", "/WEB-INF/views/template/default/content.jsp");

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
