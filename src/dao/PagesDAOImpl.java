/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import domain.Pages;
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
public class PagesDAOImpl implements PagesDAO {

    @Autowired
    @Qualifier("sessionFactoryPostgres")
    private SessionFactory sessionFactory;
    
    @Override
    public List<Pages> getPagesList() {
       return sessionFactory.getCurrentSession().createQuery("from Pages").list(); 
    } // Получить список Страниц
  
    @Override
    public void addPages(Pages page) {
      sessionFactory.getCurrentSession().saveOrUpdate(page);  
    } //Добавить Страницу
 
    @Override
    public void updatePages(Pages page) {
        sessionFactory.getCurrentSession().saveOrUpdate(page);
    }//Обновить Страницы

    @Override
    public Pages getPagesByID(int ID) {
       return (Pages) sessionFactory.getCurrentSession().createQuery("from Pages where Pages_id = :id").setParameter("id", ID).uniqueResult();
    }//Получить Страницы по ID

    @Override
    public Pages getPagesByName(String name) {
        return (Pages) sessionFactory.getCurrentSession().createQuery("from Pages where Pages_title = :name").setParameter("name", name).uniqueResult();
    }//Получить Страницы по названию
   
     @Override
     public Pages getMainPages(){
        return (Pages) sessionFactory.getCurrentSession().createQuery("from Pages where pageMainPage = :MainPage").setParameter("MainPage", true).uniqueResult();
     } //Получить главную страницу

    @Override
    public Pages getLoginPage() {
        return (Pages) sessionFactory.getCurrentSession().createQuery("from Pages where pageLoginPage = :LoginPage").setParameter("LoginPage", true).uniqueResult();
    } //Получить страницу авторизации
}
