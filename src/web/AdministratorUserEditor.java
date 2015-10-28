/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

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
public class AdministratorUserEditor {
    
    @Autowired
    UsersService userService;
    
    @Autowired
    MenuService menuService;

    @Autowired
    PagesService pagesService; 
    
    // USERS EDITOR ============================================================
    // USERS LIST
    @RequestMapping("/admin/user_list")
    public String getUsersList(Map<String, Object> map) {
        
        List<Puser> userList = this.userService.listUser();
        
        map.put("userList", userList);
        
        map.put("loadContent", "/WEB-INF/views/admin/user_editor/userlist.jsp");
        
        return "index";
        
    }   
    
    // USERS EDITOR
    @RequestMapping("/admin/user_editor/{id}")
    public String getUsersEdit(@PathVariable("id") Integer id, Map<String, Object> map) {
        
        Puser userObj = this.userService.getUser(id);
        
        if(userObj != null){
            map.put("userObj", userObj);
        } else {
            map.put("userObj", new Puser());
        }
        
        map.put("loadContent", "/WEB-INF/views/admin/user_editor/useredit.jsp");
        
        return "index";
        
    } 
    
    // USERS EDITOR
    @RequestMapping("/admin/user_editor/save")
    public String getUsersEditSave(@ModelAttribute(value = "userObj") Puser userObj, Map<String, Object> map) {
                
        List<Puser> userList = this.userService.listUser();
        
        map.put("userList", userList);
        
        map.put("loadContent", "/WEB-INF/views/admin/user_editor/userlist.jsp");
        
        return "index";
        
    }
}
