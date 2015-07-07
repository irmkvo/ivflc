/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.Puser;
import java.util.Map;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import service.UsersService;


@Controller
public class UserController {

    @Autowired
    UsersService userService;

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

    // GEt
    @RequestMapping("/spravka")
    private String spravka(Map<String, Object> map) {

        return "spravka";
    }

    @RequestMapping("/login/register")
    private String loadForm(Map<String, Object> map) {
        System.out.println("1");
        map.put("newuser", new Puser());
        return "login/register";
    }

    //POST SAVE NEW USER
    @RequestMapping(value = "/login/register/reg", method = RequestMethod.POST)
    private String register(@ModelAttribute(value = "newuser") @Valid Puser user, BindingResult result) {

        if (result.hasErrors()) {

            return "/login/register/reg";

        } else {
            // пароль  в MD5
            user.setUserPassword(userService.createHash(user.getUserPassword()));
            // Сохраняем    
            userService.addOrUpdateUser(user);
        }

        return "redirect:/index";
    }
    // Admin all user

    @RequestMapping("/admin/usershow")
    private String listUsers(Map<String, Object> map) {
        map.put("listUsers", userService.listUser());
        return "/admin/usershow";
    }

    @RequestMapping("/admin/useredit/edit/{id}")
    public String getEditUser(Map<String, Object> map, @PathVariable("id") Integer id) {
        System.out.println("3");
        map.put("user", userService.getUser(id));
        return "admin/useredit";
    }

    @RequestMapping(value = "/admin/useredit/edit", method = RequestMethod.POST)
    private String editUser(@ModelAttribute(value = "user") Puser user, BindingResult result) {
        if (!result.hasErrors()) {
            userService.addOrUpdateUser(user);
            return "redirect:../usershow";
        } else {
        }
        return "redirect:../useredit";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    private String loginform(Map<String, Object> map, HttpSession session) {

        Puser user=getCurrentUser();
        if(user==null)
                   return "login";
        else
        {
            map.put("UserData", user);
            if (user.getRole().getRoleName() == "ROLE_ADMIN") {
                return "redirect:/admin/index";
            } else {
                if (user.getRole().getRoleName() == "ROLE_USER") {
                    return "redirect:/admin/index";
                } else {
                    return "redirect:/admin/index";
                }
        }
    }
    }
    @JsonIgnore
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    private String loginform(Map<String, Object> map,
            HttpSession session,
            @RequestParam(value = "rememberme", required = false) boolean remember,
            @RequestParam("login") String login,
            @RequestParam("password") String password) {
        
        Puser user = getCurrentUser();
        if (user == null) {
            return "login";
        } else {
            if (user.getRole().getRoleName() == "ROLE_ADMIN") {
                return "redirect:/admin/index";
            } else {
                if (user.getRole().getRoleName() == "ROLE_ADMIN") {
                    return "redirect:/admin/index";
                } else {
                    return "redirect:/employers/index";
                }
            }
        }
    }
}
