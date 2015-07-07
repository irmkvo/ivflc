/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import domain.Menu;
import domain.MenuItem;
import domain.Pages;
import domain.Puser;
import domain.Roles;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.MenuService;
import service.PagesService;
import service.UsersService;

/**
 *
 * @author Kimboo
 */
@Controller
public class LoadMainData {
    @Autowired
    UsersService userService;
    
    @Autowired
    MenuService menuService;
    
    @Autowired
    PagesService pagesService;
    
    // GET ADMIN MAIN PAGE
    @RequestMapping("/admin/load_main_data/panel")
    public String getLoadMainDataPanel(Map<String, Object> map) {
        
        
        
        return "/admin/load_main_data/load_main_data";
    }
    
    @RequestMapping("/admin/load_main_data/load")
    public String getLoadMainData(Map<String, Object> map) {
        // ЗАГРУЗИТЬ РОЛИ
        List<Roles> roles = userService.getRoles();
        
        if(roles.isEmpty()){
            Roles roleNew = new Roles();
            
            roleNew.setAdminRole(Boolean.TRUE);
            roleNew.setCreationDate(new Date());
            roleNew.setDefaultRole(Boolean.FALSE);
            roleNew.setRoleCode("ROLE_ADMIN");
            roleNew.setRoleName("ROLE_ADMIN");
            roleNew.setRoleTitle("Administrators");
            
            userService.saveOrUpdateRole(roleNew);
            
            roleNew = new Roles();
            
            roleNew.setAdminRole(Boolean.FALSE);
            roleNew.setCreationDate(new Date());
            roleNew.setDefaultRole(Boolean.TRUE);
            roleNew.setRoleCode("ROLE_MEDIC");
            roleNew.setRoleName("ROLE_MEDIC");
            roleNew.setRoleTitle("Medics");
            
            userService.saveOrUpdateRole(roleNew);
            
            roleNew = new Roles();
            
            roleNew.setAdminRole(Boolean.FALSE);
            roleNew.setCreationDate(new Date());
            roleNew.setDefaultRole(Boolean.FALSE);
            roleNew.setRoleCode("ROLE_STUDENT");
            roleNew.setRoleName("ROLE_STUDENT");
            roleNew.setRoleTitle("Students");
            
            userService.saveOrUpdateRole(roleNew);
            
            roleNew = new Roles();
            
            roleNew.setAdminRole(Boolean.FALSE);
            roleNew.setCreationDate(new Date());
            roleNew.setDefaultRole(Boolean.FALSE);
            roleNew.setRoleCode("ROLE_EMPLOYER");
            roleNew.setRoleName("ROLE_EMPLOYER");
            roleNew.setRoleTitle("Employers");
            
            userService.saveOrUpdateRole(roleNew);
            
            roleNew = new Roles();
            
            roleNew.setAdminRole(Boolean.FALSE);
            roleNew.setCreationDate(new Date());
            roleNew.setDefaultRole(Boolean.FALSE);
            roleNew.setRoleCode("ROLE_PATIENT");
            roleNew.setRoleName("ROLE_PATIENT");
            roleNew.setRoleTitle("Patiets");
            
            userService.saveOrUpdateRole(roleNew);
        }
        
        // ЗАГРУЗИТЬ ПОЛЬЗОВАТЕЛЯ
        List<Puser> users = userService.listUser();
        
        if(users.isEmpty()){
            Puser userNew = new Puser();
            
            userNew.setAccountNonExpired(Boolean.TRUE);
            userNew.setAccountNonLocked(Boolean.TRUE);
            userNew.setCredentialsNonExpired(Boolean.TRUE);
            userNew.setEnabled(Boolean.TRUE);
            
            userNew.setUserLname("Administrator");
            userNew.setUserLname("IVF");
            userNew.setUserMname("IRM");
            userNew.setUserLogin("admin@ivf.kz");
            userNew.setUserMail("admin@ivf.kz");
            userNew.setRole(userService.getRole(1));
            userNew.setUserPassword("b1a5a62187264079ae321f3b10fbf420");
            userNew.setUserPhone("572481");
        }
        
        // ЗАГРУЗИТЬ СТРАНИЦЫ
        List<Pages> pages = pagesService.getPagesList();
        
        if(pages.isEmpty()){
            Pages pageNew = new Pages();
            
            pageNew.setPagemainpage(Boolean.FALSE);
            pageNew.setLoginPage(Boolean.TRUE);
            pageNew.setPagetitle("Авторизация в личный кабинет");
            pageNew.setPageurl("/login");
            pageNew.setPagedescription("Страница авторизации в личный кабинет!");
            
            pageNew = new Pages();
            
            pageNew.setPagemainpage(Boolean.TRUE);
            pageNew.setLoginPage(Boolean.FALSE);
            pageNew.setPagetitle("Главная страница");
            pageNew.setPageurl("/index");
            pageNew.setPagedescription("Главная новостная лента!");
            
            // РЕДАКТОР МЕНЮ
            pageNew = new Pages();
            
            pageNew.setPagemainpage(Boolean.FALSE);
            pageNew.setLoginPage(Boolean.FALSE);
            pageNew.setPagetitle("Список меню");
            pageNew.setPageurl("/admin/menu_editor/menu_list");
            pageNew.setPagedescription("Список доступных меню!");
                        
        }
        
        // ЗАГРУЗИТЬ МЕНЮ И ПУНКТЫ
        List<Menu> menus = menuService.GetMenuList();
        
        if(menus.isEmpty()){
            Menu menuNew = new Menu();
            
            menuNew.setMenutitle("Пользовательское меню");
            menuNew.setMenuposition("0");
            menuNew.setMenudescription("Пользовательское меню");
            
            menuService.AddMenu(menuNew);
            
            menuNew = new Menu();
            
            menuNew.setMenutitle("Главное меню");
            menuNew.setMenuposition("0");
            menuNew.setMenudescription("Главное меню");
            
            menuService.AddMenu(menuNew);
        }
        
        List<MenuItem> menuItems = menuService.GetMenuItemList();
        
        if(menuItems.isEmpty()){
            // ЗАПОЛНЯЕМ ПОЛЬЗОВАТЕЛЬСКОЕ МЕНЮ
            MenuItem menuItemNew = new MenuItem();
            
            menuItemNew.setMenuItemtitle("Моя страница");
            menuItemNew.setMenuItemdescription("Страница с персональными данными");
            menuItemNew.setMenu(menuService.GetMenuByName("Пользовательское меню"));
            menuItemNew.setPage(pagesService.getMainPages());   
            
            menuService.AddMenuItem(menuItemNew);
            
            menuItemNew = new MenuItem();
            
            menuItemNew.setMenuItemtitle("Все врачи");
            menuItemNew.setMenuItemdescription("Список врачей зарегистрированных на сайте");
            menuItemNew.setMenu(menuService.GetMenuByName("Пользовательское меню"));
            menuItemNew.setPage(pagesService.getMainPages());   
            
            menuService.AddMenuItem(menuItemNew);
            
            menuItemNew = new MenuItem();
            
            menuItemNew.setMenuItemtitle("Личные сообщения");
            menuItemNew.setMenuItemdescription("Личные сообщения");
            menuItemNew.setMenu(menuService.GetMenuByName("Пользовательское меню"));
            menuItemNew.setPage(pagesService.getMainPages());   
            
            menuService.AddMenuItem(menuItemNew);
            
            menuItemNew = new MenuItem();
            
            menuItemNew.setMenuItemtitle("Интересное");
            menuItemNew.setMenuItemdescription("Новостная лента");
            menuItemNew.setMenu(menuService.GetMenuByName("Пользовательское меню"));
            menuItemNew.setPage(pagesService.getMainPages());   
            
            menuService.AddMenuItem(menuItemNew);
            
            // ЗАПОЛНЯЕМ ГЛАВНОЕ МЕНЮ
            menuItemNew = new MenuItem();
            
            menuItemNew.setMenuItemtitle("Главная лента");
            menuItemNew.setMenuItemdescription("Главная лента");
            menuItemNew.setMenu(menuService.GetMenuByName("Главное меню"));
            menuItemNew.setPage(pagesService.getMainPages());   
            
            menuService.AddMenuItem(menuItemNew);
            
            menuItemNew = new MenuItem();
            
            menuItemNew.setMenuItemtitle("Календарь мероприятий");
            menuItemNew.setMenuItemdescription("Календарь мероприятий");
            menuItemNew.setMenu(menuService.GetMenuByName("Главное меню"));
            menuItemNew.setPage(pagesService.getMainPages());   
            
            menuService.AddMenuItem(menuItemNew);
            
            menuItemNew = new MenuItem();
            
            menuItemNew.setMenuItemtitle("Онлайн трансляции");
            menuItemNew.setMenuItemdescription("Онлайн трансляции");
            menuItemNew.setMenu(menuService.GetMenuByName("Главное меню"));
            menuItemNew.setPage(pagesService.getMainPages());   
            
            menuService.AddMenuItem(menuItemNew);
            
            menuItemNew = new MenuItem();
            
            menuItemNew.setMenuItemtitle("Видео материалы");
            menuItemNew.setMenuItemdescription("Видео материалы");
            menuItemNew.setMenu(menuService.GetMenuByName("Главное меню"));
            menuItemNew.setPage(pagesService.getMainPages());   
            
            menuService.AddMenuItem(menuItemNew);
            
            menuItemNew = new MenuItem();
            
            menuItemNew.setMenuItemtitle("Фотогалерея");
            menuItemNew.setMenuItemdescription("Фотогалерея");
            menuItemNew.setMenu(menuService.GetMenuByName("Главное меню"));
            menuItemNew.setPage(pagesService.getMainPages());   
            
            menuService.AddMenuItem(menuItemNew);
            
            menuItemNew = new MenuItem();
            
            menuItemNew.setMenuItemtitle("Группы");
            menuItemNew.setMenuItemdescription("Группы");
            menuItemNew.setMenu(menuService.GetMenuByName("Главное меню"));
            menuItemNew.setPage(pagesService.getMainPages());   
            
            menuService.AddMenuItem(menuItemNew);
            
            menuItemNew = new MenuItem();
            
            menuItemNew.setMenuItemtitle("Новое в моих группах");
            menuItemNew.setMenuItemdescription("Новое в моих группах");
            menuItemNew.setMenu(menuService.GetMenuByName("Главное меню"));
            menuItemNew.setPage(pagesService.getMainPages());   
            
            menuService.AddMenuItem(menuItemNew);
            
            menuItemNew = new MenuItem();
            
            menuItemNew.setMenuItemtitle("Резуме и вакансии");
            menuItemNew.setMenuItemdescription("Резуме и вакансии");
            menuItemNew.setMenu(menuService.GetMenuByName("Главное меню"));
            menuItemNew.setPage(pagesService.getMainPages());   
            
            menuService.AddMenuItem(menuItemNew);
            
            menuItemNew = new MenuItem();
            
            menuItemNew.setMenuItemtitle("Опросы и иследования");
            menuItemNew.setMenuItemdescription("Опросы и иследования");
            menuItemNew.setMenu(menuService.GetMenuByName("Главное меню"));
            menuItemNew.setPage(pagesService.getMainPages());   
            
            menuService.AddMenuItem(menuItemNew);
            
            menuItemNew = new MenuItem();
            
            menuItemNew.setMenuItemtitle("Книги и журналы");
            menuItemNew.setMenuItemdescription("Книги и журналы");
            menuItemNew.setMenu(menuService.GetMenuByName("Главное меню"));
            menuItemNew.setPage(pagesService.getMainPages());   
            
            menuService.AddMenuItem(menuItemNew);
            
            menuItemNew = new MenuItem();
            
            menuItemNew.setMenuItemtitle("Наши партнеры");
            menuItemNew.setMenuItemdescription("Наши партнеры");
            menuItemNew.setMenu(menuService.GetMenuByName("Главное меню"));
            menuItemNew.setPage(pagesService.getMainPages());
                        
            menuService.AddMenuItem(menuItemNew);
                        
        }
        
        return "redirect:../panel";
    }
}
