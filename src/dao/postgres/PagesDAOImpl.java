/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.postgres;


import domain.postgres.Pages;
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
       return sessionFactory.getCurrentSession().createQuery("from Pages ORDER BY pageid").list(); 
    } // Получить список Страниц
  
    @Override
    public void addPages(Pages page) {
        if (page != null) {
            sessionFactory.getCurrentSession().save(page);
        }
    } //Добавить Страницу
 
    @Override
    public void updatePages(Pages page) {
        sessionFactory.getCurrentSession().update(page);
    }//Обновить Страницы

    @Override
    public Pages getPagesByID(int ID) {
       return (Pages) sessionFactory.getCurrentSession().createQuery("from Pages where pageid = :id").setParameter("id", ID).uniqueResult();
    }//Получить Страницы по ID

    @Override
    public Pages getPagesByName(String name) {
        return (Pages) sessionFactory.getCurrentSession().createQuery("from Pages where pagetitle = :name").setParameter("name", name).uniqueResult();
    }//Получить Страницы по названию
   
     @Override
     public Pages getMainPages(){
        return (Pages) sessionFactory.getCurrentSession().createQuery("from Pages where pagemainpage = :MainPage").setParameter("MainPage", true).uniqueResult();
     } //Получить главную страницу

    @Override
    public Pages getLoginPage() {
        return (Pages) sessionFactory.getCurrentSession().createQuery("from Pages where loginPage = :LoginPage").setParameter("LoginPage", true).uniqueResult();
    } //Получить страницу авторизации
}
