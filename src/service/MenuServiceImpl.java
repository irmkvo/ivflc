/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.MenuDAO;
import dao.UsersDAO;
import domain.MenuAcces;
import domain.MenuItem;
import domain.Menu;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Shah
 */

@Service("menuService")
@Transactional("postgresT")
public class MenuServiceImpl implements MenuService {
    
    @Autowired
    MenuDAO menuDAO;
    
    @Override
    public List<Menu> GetMenuList() {
       return menuDAO.GetMenuList();
    }

    @Override
    public void AddMenu(Menu menu) {
        menuDAO.AddMenu(menu);
    }

    @Override
    public void UpdateMenu(Menu menu) {
        menuDAO.UpdateMenu(menu);
    }

    
    @Override
    public Menu GetMenuByID(int ID) {
        return menuDAO. GetMenuByID(ID);
    }

    
    @Override
    public Menu GetMenuByName(String name) {
        return menuDAO. GetMenuByName(name);
    }

    
    @Override
    public List<MenuItem> GetMenuItemList() {
       return menuDAO.GetMenuItemList();
    }

    
    @Override
    public void AddMenuItem(MenuItem menuItem) {
        menuDAO.AddMenuItem(menuItem);
    }

    @Override
    public void UpdateMenuItem(MenuItem menuItem) {
        menuDAO.UpdateMenuItem(menuItem);
    }

    @Override
    public MenuItem GetMenuItemByID(int ID) {
        return menuDAO.GetMenuItemByID(ID);
    }

    @Override
    public MenuItem GetMenuItemByName(String name) {
        return menuDAO.GetMenuItemByName(name);    
    }

    @Override
    public List<MenuItem> GetMenuItemListByMenuID(int ID) {
      return menuDAO.GetMenuItemListByMenuID(ID);
    }

    @Override
    public List<MenuAcces> GetMenuAccesList() {
        return menuDAO.GetMenuAccesList();
    }

    @Override
    public void AddMenuAcces(MenuAcces menuAcces) {
        menuDAO.AddMenuAcces(menuAcces);
    }

    @Override
    public void UpdateMenuAcces(MenuAcces menuAcces) {
        menuDAO.UpdateMenuAcces(menuAcces);
    }

    @Override
    public MenuAcces GetMenuAccesByID(int ID) {
      return  menuDAO.GetMenuAccesByID(ID);
    }

    @Override
    public MenuAcces GetMenuAccesByName(String name) {
       return menuDAO.GetMenuAccesByName(name);
    }

    @Override
    public List<MenuAcces> GetMenuAccesListByMenuID(int ID) {
       return menuDAO.GetMenuAccesListByMenuID(ID);
    }
    
}
