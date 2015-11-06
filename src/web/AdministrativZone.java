/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.postgres.Pages;
import domain.postgres.Puser;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
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
    // ADMIN PANEL
    @RequestMapping("/admin/administrator")
    public String getAdministrator(Map<String, Object> map) {        
        
        map.put("loadContent", "/WEB-INF/views/admin/admin_panel/administrator.jsp");
        
        return "index";
        
    }        
    
    // =========================================================================
    // PAGES EDITOR ============================================================
    // PAGES LIST
    @RequestMapping("/admin/pages_list")
    public String getPagesList(Map<String, Object> map) {
        
        List<Pages> pagesList = this.pagesService.getPagesList();
        
        map.put("pagesList", pagesList);
        
        map.put("loadContent", "/WEB-INF/views/admin/pages_editor/pages_list.jsp");
        
        return "index";
        
    }
    
    // PAGE EDITOR
    @RequestMapping("/admin/pages_editor/page_edit/{id}")
    public String getEditPage(Map<String, Object> map, @PathVariable("id") Integer id) {
        
        Pages pageEdit = this.pagesService.getPagesByID(id);
        if (pageEdit == null) {
            pageEdit = new Pages();
        }
        map.put("pageEdit", pageEdit);
        
        map.put("loadContent", "/WEB-INF/views/admin/pages_editor/page_edit.jsp");
        
        return "index";
    }
    
    // SAVE ЗФПУ CHANGES
    @RequestMapping("/admin/pages_editor/page_edit/save")
    public String getEditPageSave(@ModelAttribute(value = "pageEdit") Pages pageEdit, Map<String, Object> map) {
        
        if (pageEdit != null) {
            if (pageEdit.getPageid() != null) {
                if (pageEdit.getPageid() > 0) {
                    this.pagesService.updatePages(pageEdit);
                } else {
                    this.pagesService.addPages(pageEdit);
                }
            } else {
                this.pagesService.addPages(pageEdit);
            }
        }
        
        List<Pages> pagesList = this.pagesService.getPagesList();
        
        map.put("pagesList", pagesList);
        
        map.put("loadContent", "/WEB-INF/views/admin/pages_editor/pages_list.jsp");
        
        return "index";
    }
    
    // =========================================================================
}
