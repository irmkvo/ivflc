/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.Menu;
import domain.Puser;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import service.MenuService;
import service.PagesService;
import service.UsersService;

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
    
    // ADMINISTRATOR METHODS
    @RequestMapping("/admin/menu_editor/menu_list")
    public String getMenuList(Map<String, Object> map) {
        
        List<Menu> menuList = this.menuService.GetMenuList();
        
        map.put("menuList", menuList);
        
        return "/admin/menu_editor/menu_list";
        
    }
    
    @RequestMapping("/admin/menu_editor/menu_edit/{id}")
    public String getEditMenu(Map<String, Object> map, @PathVariable("id") Integer id) {
        
        Menu menuEdit = menuService.GetMenuByID(id);
        if (menuEdit == null) {
            menuEdit = new Menu();
        }
        map.put("menuEdit", menuEdit);
        
        return "/admin/menu_editor/menuEditor";
    }
    
    @RequestMapping("/admin/menu_editor/menu_edit/save")
    public String getEditMenuSave(@ModelAttribute(value = "menuEdit") Menu menuEdit) {
        
        menuService.AddMenu(menuEdit);
        
        return "redirect:../menu_list";
    }
}
