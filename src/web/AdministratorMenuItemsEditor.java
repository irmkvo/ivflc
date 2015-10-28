/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.postgres.Menu;
import domain.postgres.MenuItem;
import domain.postgres.Pages;
import domain.postgres.Roles;
import java.beans.PropertyEditorSupport;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import service.postgres.MenuService;
import service.postgres.PagesService;
import service.postgres.UsersService;

/**
 *
 * @author kvo
 */
@Controller
public class AdministratorMenuItemsEditor {
    
    @Autowired
    UsersService userService;
    
    @Autowired
    MenuService menuService;
    
    @Autowired
    PagesService pagesService;
    
    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {

        binder.registerCustomEditor(Roles.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) {
                setValue(userService.getRole(Integer.parseInt(text)));
            }
        });
        binder.registerCustomEditor(Menu.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) {
                setValue(menuService.GetMenuByID(Integer.parseInt(text)));
            }
        });
        binder.registerCustomEditor(Pages.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) {
                setValue(pagesService.getPagesByID(Integer.parseInt(text)));
            }
        });
    }
    
    // =========================================================================
    // MENU ITEM EDITOR ========================================================
    // MENU ITEM LIST
    @RequestMapping("/admin/menu_editor/menu_item_list/{menuId}/{roleId}")
    public String getMenuItemList(@PathVariable("menuId") Integer menuId,
            @PathVariable("roleId") Integer roleId,            
            Map<String, Object> map) {
        
        List<MenuItem> menuItemList = this.menuService.GetMenuItemListByRoleAndMenu(this.menuService.GetMenuByID(menuId), 
                this.userService.getRole(roleId));
        
        map.put("menuItemList", menuItemList);
        
        map.put("loadContent", "/WEB-INF/views/admin/menu_editor/menu_item_list.jsp");
        
        return "index";
        
    }
    
    // MENU ITEM EDITOR
    @RequestMapping("/admin/menu_editor/menu_item_edit/{id}")
    public String getEditMenuItem(Map<String, Object> map, @PathVariable("id") Integer id) {
        
        MenuItem menuItemEdit = menuService.GetMenuItemByID(id);
        if (menuItemEdit == null) {
            menuItemEdit = new MenuItem();
        }
        map.put("menuItemEdit", menuItemEdit);
        
        map.put("userRoles", userService.getRoles());
        map.put("pages", this.pagesService.getPagesList());
        map.put("menus", this.menuService.GetMenuList());
        
        map.put("loadContent", "/WEB-INF/views/admin/menu_editor/menu_item_editor.jsp");
        
        return "index";
    }
    
    // MENU LIST
    @RequestMapping("/admin/menu_editor/menu_item_edit/save")
    public String getMenuItemEditSave(@ModelAttribute(value = "menuItemEdit") MenuItem menuItemEdit, Map<String, Object> map) {
        
        if (menuItemEdit != null) {
            if (menuItemEdit.getMenuItemid() != null) {
                if (menuItemEdit.getMenuItemid() > 0) {
                    this.menuService.UpdateMenuItem(menuItemEdit);
                } else {
                    this.menuService.AddMenuItem(menuItemEdit);
                }
            }
        }
        
        List<MenuItem> menuItemList = this.menuService.GetMenuItemListByRoleAndMenu(menuItemEdit.getMenu(), 
                menuItemEdit.getRole());
        
        map.put("menuItemList", menuItemList);
        
        map.put("loadContent", "/WEB-INF/views/admin/menu_editor/menu_item_list.jsp");
        
        return "index";
        
    }
}
