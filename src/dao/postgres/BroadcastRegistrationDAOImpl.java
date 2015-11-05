/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.postgres;

import domain.postgres.BroadcastRegistration;
import domain.postgres.Broadcasts;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kvo
 */
@Repository
public class BroadcastRegistrationDAOImpl implements BroadcastRegistrationDAO{

    @Autowired
    @Qualifier("sessionFactoryPostgres")
    private SessionFactory sessionFactory;
    
    @Override
    public List<BroadcastRegistration> getAllBrdcUsers() {
        return sessionFactory.getCurrentSession().createQuery("from BroadcastRegistration").list();
    }

    @Override
    public BroadcastRegistration getBrdcUserById(Integer Id) {
        return (BroadcastRegistration) sessionFactory.getCurrentSession().createQuery("from BroadcastRegistration where id = :id").setParameter("id", Id).uniqueResult();
    }

    @Override
    public BroadcastRegistration getBrdcUserByLogin(String login) {
        return (BroadcastRegistration) sessionFactory.getCurrentSession().createQuery("from BroadcastRegistration where login = :login").setParameter("login", login).uniqueResult();
    }

    @Override
    public void addBrdcUser(BroadcastRegistration brdc) {
        sessionFactory.getCurrentSession().save(brdc);
    }

    @Override
    public void updateBrdcUser(BroadcastRegistration brdc) {
        sessionFactory.getCurrentSession().update(brdc);
    }
    
}
