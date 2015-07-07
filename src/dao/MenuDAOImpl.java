/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.MenuAcces;
import domain.MenuItem;
import domain.Menu;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Shah
 */
@Repository
public class MenuDAOImpl implements MenuDAO{
     
    @Autowired
    @Qualifier("sessionFactoryPostgres")
    private SessionFactory sessionFactory;
    
    @Override
    public List<Menu> GetMenuList() {
        return sessionFactory.getCurrentSession().createQuery("from Menu").list();
    } // Получить список Меню

    @Override
    public void AddMenu(Menu menu) {
         sessionFactory.getCurrentSession().saveOrUpdate(menu);
    }// Добавить Меню

    @Override
    public void UpdateMenu(Menu menu) {
        sessionFactory.getCurrentSession().saveOrUpdate(menu);
    }// Обновить Меню

    @Override
    public Menu GetMenuByID(int ID) {
         return (Menu) sessionFactory.getCurrentSession().createQuery("from Menu where id = :id").setParameter("id", ID).uniqueResult();
    } // Получить Меню по ID

    @Override
    public Menu GetMenuByName(String name) {
        return (Menu) sessionFactory.getCurrentSession().createQuery("from Menu where title = :name").setParameter("name", name).uniqueResult();
    }// Получить Меню по названию

    @Override
    public List<MenuItem> GetMenuItemList() {
        return sessionFactory.getCurrentSession().createQuery("from MenuItem").list();
    }//Получить список пунктов Меню

    @Override
    public void AddMenuItem(MenuItem menuItem) {
        sessionFactory.getCurrentSession().saveOrUpdate(menuItem);
    }// Добавить пункт Меню

    @Override
    public void UpdateMenuItem(MenuItem menuItem) {
        sessionFactory.getCurrentSession().saveOrUpdate(menuItem);
    } // Обновить пункты Меню

    @Override
    public MenuItem GetMenuItemByID(int ID) {
        return (MenuItem) sessionFactory.getCurrentSession().createQuery("from MenuItem where id = :id").setParameter("id", ID).uniqueResult();
    } // Получить пункт Меню по ID

    @Override
    public MenuItem GetMenuItemByName(String name) {
       return (MenuItem) sessionFactory.getCurrentSession().createQuery("from MenuItem where title = :name").setParameter("name", name).uniqueResult();
    } //Получить пункт Меню по названию 

    @Override
    public List<MenuItem> GetMenuItemListByMenuID(int ID) {
        return sessionFactory.getCurrentSession().createQuery("from MenuItem where Menu_id = :id").setParameter("id", ID).list(); 
    } // Получить список пунктов меню по сопоставлению ID Меню

    @Override
    public List<MenuAcces> GetMenuAccesList() {
        return sessionFactory.getCurrentSession().createQuery("from MenuAcces").list();
    }// Получить список Контролей Доступа

    @Override
    public void AddMenuAcces(MenuAcces menuAcces) {
       sessionFactory.getCurrentSession().saveOrUpdate(menuAcces); 
    }//Добавить новый Контроль Доступа

    @Override
    public void UpdateMenuAcces(MenuAcces menuAcces) {
       sessionFactory.getCurrentSession().saveOrUpdate(menuAcces);  
    }// Обновить Контроль Доступа

    @Override
    public MenuAcces GetMenuAccesByID(int ID) {
        return (MenuAcces) sessionFactory.getCurrentSession().createQuery("from MenuAcces where id = :id").setParameter("id", ID).uniqueResult();
    } // Получить Контроль Доступа по ID

    @Override
    public MenuAcces GetMenuAccesByName(String name) {
         return (MenuAcces) sessionFactory.getCurrentSession().createQuery("from MenuAcces where title = :name").setParameter("name", name).uniqueResult();
    }// Получить Контроль Доступа по названию

    @Override
    public List<MenuAcces> GetMenuAccesListByMenuID(int ID) {
        return sessionFactory.getCurrentSession().createQuery("from MenuAcces where MenuAcces_menu_id = :id").setParameter("id", ID).list();
    }// Получить список Контролей Доступа по Меню ID
    
    
}
