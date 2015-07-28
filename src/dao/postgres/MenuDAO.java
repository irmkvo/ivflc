/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.postgres;

import domain.postgres.MenuAcces;
import domain.postgres.MenuItem;
import domain.postgres.Menu;
import java.util.List;

/**
 *
 * @author Shah
 */
public interface MenuDAO {
   
    
     
    public List<Menu> GetMenuList(); //Получить список Меню 
    
    public void AddMenu(Menu menu); //Добавить Меню
    
    public void UpdateMenu(Menu menu); //Обновить Меню
    
    public Menu GetMenuByID(int ID); //Получить Меню по ID
    
    public Menu GetMenuByName(String name); // Получить Меню по названию
    

    public List<MenuItem> GetMenuItemList(); //Получить список Пунктов Меню
    
    public void AddMenuItem(MenuItem menuItem); //Получить список Пунктов Меню
    
    public void UpdateMenuItem(MenuItem menuItem); //Обновить Пукты Меню
    
    public MenuItem GetMenuItemByID(int ID); // Получить Пукты Меню по ID
    
    public MenuItem GetMenuItemByName(String name); // Получить Пукты Меню по имени

    public List<MenuItem> GetMenuItemListByMenuID(int ID); // Получить Пукты Меню
    
    
    public List<MenuAcces> GetMenuAccesList(); // Получить список Контролей Доступа
    
    public void AddMenuAcces(MenuAcces menuAcces);// Добавить Контроль Доступа
    
    public void UpdateMenuAcces(MenuAcces menuAcces);// Обновить Контроль Доступа
    
    public MenuAcces GetMenuAccesByID(int ID); // Получить Контроль Доступа по ID                                                        
    
    public MenuAcces GetMenuAccesByName(String name);// Получить Контроль Доступа по имени
    
    public List<MenuAcces> GetMenuAccesListByMenuID(int ID); //Получить Контроль Доступа по Меню id
    
}

