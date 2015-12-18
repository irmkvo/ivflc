/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.postgres;

import domain.postgres.Puser;
import domain.postgres.Roles;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 *
 * @author KVO
 */
@Repository
public class UsersDAOImpl implements UsersDAO {

    
    @Autowired
    @Qualifier("sessionFactoryPostgres")
    private SessionFactory sessionFactory;
    // РАБОТА С ПОЛЬЗОВАТЕЛЯМИ
    @Override
    public void addUser(Puser user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void updateUser(Puser user) {
        sessionFactory.getCurrentSession().update(user);
    }
    
    @Override
    public Puser getUser(Integer id) {
        return (Puser) sessionFactory.getCurrentSession().createQuery("from Puser where id = :id").setParameter("id", id).uniqueResult();

    }

    @Override
    public List<Puser> listUser() {
        return sessionFactory.getCurrentSession().createQuery("from Puser").list();
    }

    @Override
    public Puser getUserbyLogin(String login) {
        return (Puser) sessionFactory.getCurrentSession().createQuery("from Puser where userLogin = :login").setString("login", login).uniqueResult();
    }
    // РАБОТА С РОЛЯМИ
    @Override
    public void saveOrUpdateRole(Roles role) {
        sessionFactory.getCurrentSession().saveOrUpdate(role);
    }

    @Override
    public Roles getRole(Integer id) {
        return (Roles) sessionFactory.getCurrentSession().createQuery("from Roles where id = :id").setInteger("id", id).uniqueResult();
    }

    @Override
    public List<Roles> getRoles() {
        return sessionFactory.getCurrentSession().createQuery("from Roles").list();
    }

    
}
