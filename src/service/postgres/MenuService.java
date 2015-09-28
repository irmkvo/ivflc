/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.postgres;

import domain.postgres.MenuAcces;
import domain.postgres.MenuItem;
import domain.postgres.Menu;
import domain.postgres.Roles;
import java.util.List;

/**
 *
 * @author Shah
 */
public interface MenuService {
    
    public List<Menu> GetMenuList();
    
    public void AddMenu(Menu menu);
    
    public void UpdateMenu(Menu menu);
    
    public Menu GetMenuByID(int ID);
    
    public Menu GetMenuByName(String name);
    

    public List<MenuItem> GetMenuItemList();
    
    public void AddMenuItem(MenuItem menuItem);
    
    public void UpdateMenuItem(MenuItem menuItem);
    
    public MenuItem GetMenuItemByID(int ID);
    
    public MenuItem GetMenuItemByName(String name);

    public List<MenuItem> GetMenuItemListByMenuID(int ID);
    
    public List<MenuItem> GetMenuItemListByRole(Roles role); // Получить Пукты Меню
    
    public List<MenuItem> GetMenuItemListByRoleAndMenu(Menu menu, Roles role); // Получить Пукты Меню
    
    public List<MenuAcces> GetMenuAccesList();
    
    public void AddMenuAcces(MenuAcces menuAcces);
    
    public void UpdateMenuAcces(MenuAcces menuAcces);
    
    public MenuAcces GetMenuAccesByID(int ID);
    
    public MenuAcces GetMenuAccesByName(String name);
    
    public List<MenuAcces> GetMenuAccesListByMenuID(int ID);
    
}
