/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.postgres.Menu;
import domain.postgres.Puser;
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
import service.postgres.MenuService;
import service.postgres.PagesService;
import service.postgres.UsersService;

/**
 *
 * @author kvo
 */
@Controller
public class AdministrativZone {
    
    @Autowired
    UsersService userService;
    
    @Autowired
    MenuService menuService;

    @Autowired
    PagesService pagesService;
    
    // ADMINISTRATOR METHODS
    // ADMINISTRATOR METHODS
    // ADMIN PANEL
    @RequestMapping("/admin/administrator")
    public String getAdministrator(Map<String, Object> map) {        
        
        Puser CurrentUser = GetCurrentUser();

        map.put("UserData", CurrentUser);
        
        map.put("loadContent", "/WEB-INF/views/admin/admin_panel/administrator.jsp");
        
        map.put("LeftPanel", 1);
        map.put("RightPanel", 0);
        
        return "/admin/index";
        
    }
    
    // MENU LIST
    @RequestMapping("/admin/menu_editor/menu_list")
    public String getMenuList(Map<String, Object> map) {
        
        List<Menu> menuList = this.menuService.GetMenuList();
        
        map.put("menuList", menuList);
        
        Puser CurrentUser = GetCurrentUser();

        map.put("UserData", CurrentUser);
        
        map.put("loadContent", "/WEB-INF/views/admin/menu_editor/menu_list.jsp");
        
        map.put("LeftPanel", 1);
        map.put("RightPanel", 0);
        
        return "/admin/index";
        
    }
    // MENU EDITOR
    @RequestMapping("/admin/menu_editor/menu_edit/{id}")
    public String getEditMenu(Map<String, Object> map, @PathVariable("id") Integer id) {
        
        Menu menuEdit = menuService.GetMenuByID(id);
        if (menuEdit == null) {
            menuEdit = new Menu();
        }
        map.put("menuEdit", menuEdit);
        
        Puser CurrentUser = GetCurrentUser();

        map.put("UserData", CurrentUser);
        
        map.put("loadContent", "/WEB-INF/views/admin/menu_editor/menuEditor.jsp");
        
        map.put("LeftPanel", 1);
        map.put("RightPanel", 0);
        
        return "/admin/index";
    }
    // SAVE MENU CHANGES
    @RequestMapping("/admin/menu_editor/menu_edit/save")
    public String getEditMenuSave(@ModelAttribute(value = "menuEdit") Menu menuEdit, Map<String, Object> map) {
        
        menuService.AddMenu(menuEdit);
        
        List<Menu> menuList = this.menuService.GetMenuList();
        
        map.put("menuList", menuList);
        
        Puser CurrentUser = GetCurrentUser();

        map.put("UserData", CurrentUser);
        
        map.put("loadContent", "/WEB-INF/views/admin/menu_editor/menu_list.jsp");
        
        map.put("LeftPanel", 1);
        map.put("RightPanel", 0);
        
        return "redirect:../index";
    }
    
    // USERS EDITOR ============================================================
    // USERS LIST
    @RequestMapping("/admin/user_list")
    public String getUsersList(Map<String, Object> map) {
        
        List<Puser> userList = this.userService.listUser();
        
        map.put("userList", userList);
        
        Puser CurrentUser = GetCurrentUser();

        map.put("UserData", CurrentUser);
        
        map.put("loadContent", "/WEB-INF/views/admin/user_editor/userlist.jsp");
        
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
