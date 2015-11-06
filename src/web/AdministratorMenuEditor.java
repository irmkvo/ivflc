/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.postgres.Menu;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import service.postgres.MenuService;
import service.postgres.UsersService;

/**
 *
 * @author kvo
 */
@Controller
public class AdministratorMenuEditor {
    
    @Autowired
    UsersService userService;
    
    @Autowired
    MenuService menuService;
    
    // MENU EDITOR =============================================================
    // MENU LIST
    @RequestMapping("/admin/menu_editor/menu_list")
    public String getMenuList(Map<String, Object> map) {
        
        List<Menu> menuList = this.menuService.GetMenuList();
        
        map.put("menuList", menuList);
        
        map.put("loadContent", "/WEB-INF/views/admin/menu_editor/menu_list.jsp");
        
        return "index";
        
    }
    // MENU EDITOR
    @RequestMapping("/admin/menu_editor/menu_edit/{id}")
    public String getEditMenu(Map<String, Object> map, @PathVariable("id") Integer id) {
        
        Menu menuEdit = menuService.GetMenuByID(id);
        if (menuEdit == null) {
            menuEdit = new Menu();
        }
        map.put("menuEdit", menuEdit);
        
        map.put("userRoles", userService.getRoles());
        
        map.put("loadContent", "/WEB-INF/views/admin/menu_editor/menuEditor.jsp");
        
        return "index";
    }
    // SAVE MENU CHANGES
    @RequestMapping("/admin/menu_editor/menu_edit/save")
    public String getEditMenuSave(@ModelAttribute(value = "menuEdit") Menu menuEdit, Map<String, Object> map) {
        
        if (menuEdit != null) {
            if (menuEdit.getMenuid() != null) {
                if (menuEdit.getMenuid() > 0) {
                    menuService.UpdateMenu(menuEdit);
                } else {
                    menuService.AddMenu(menuEdit);
                }
            } else {
                menuService.AddMenu(menuEdit);
            }
        }
        
        List<Menu> menuList = this.menuService.GetMenuList();
        
        map.put("menuList", menuList);
        
        map.put("loadContent", "/WEB-INF/views/admin/menu_editor/menu_list.jsp");
        
        return "index";
    }
}
