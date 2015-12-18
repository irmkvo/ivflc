package web;

import domain.postgres.Broadcasts;
import domain.postgres.Puser;
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
import service.postgres.BroadcastService;
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
    
    @Autowired
    BroadcastService broadcastService;
    
    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {

        binder.registerCustomEditor(Roles.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) {
                setValue(userService.getRole(Integer.parseInt(text)));
            }
        });
        binder.registerCustomEditor(Broadcasts.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) {
                setValue(broadcastService.getBroadcastByID(Integer.parseInt(text)));
            }
        });  
    }
    
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
        List<Broadcasts> brdc = this.broadcastService.getBroadcasts();
        List<Roles> roles = this.userService.getRoles();
        
        if(userObj != null){
            map.put("userObj", userObj);
        } else {
            map.put("userObj", new Puser());
        }
        
        map.put("brdcList", brdc);
        map.put("userRoles", roles);
        map.put("loadContent", "/WEB-INF/views/admin/user_editor/useredit.jsp");
        
        return "index";
        
    } 
    
    // USERS EDITOR
    @RequestMapping("/admin/user_editor/save")
    public String getUsersEditSave(@ModelAttribute(value = "userObj") Puser userObj, Map<String, Object> map) {
                
        if (userObj.getId() == null) {
            userObj.setUserPassword(this.userService.createHash(userObj.getUserPassword()));
            this.userService.addUser(userObj);
        } else {
            this.userService.updateUser(userObj);
        }

        List<Puser> userList = this.userService.listUser();

        map.put("userList", userList);
        map.put("loadContent", "/WEB-INF/views/admin/user_editor/userlist.jsp");

        return "index";       
    }
}
