/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.postgres;

import domain.postgres.Broadcasts;
import domain.postgres.Menu;
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
public class BroadcastDAOImpl implements BroadcastDAO {

    @Autowired
    @Qualifier("sessionFactoryPostgres")
    private SessionFactory sessionFactory;
    
    @Override
    public List<Broadcasts> getBroadcasts() {
        return sessionFactory.getCurrentSession().createQuery("from Broadcasts").list();
    }

    @Override
    public void addBroadcast(Broadcasts brdc) {
         sessionFactory.getCurrentSession().saveOrUpdate(brdc);
    }

    @Override
    public void updateBroadcast(Broadcasts brdc) {
        sessionFactory.getCurrentSession().saveOrUpdate(brdc);
    }

    @Override
    public Broadcasts getBroadcastByID(Integer ID) {
        return (Broadcasts) sessionFactory.getCurrentSession().createQuery("from Broadcasts where id = :id").setParameter("id", ID).uniqueResult();
    }

    @Override
    public Broadcasts getBroadcastByMeetingID(String meetingID) {
        return (Broadcasts) sessionFactory.getCurrentSession().createQuery("from Broadcasts where meetingID = :meetingID").setParameter("meetingID", meetingID).uniqueResult();
    }

    @Override
    public void deleteBroadcastByID(Broadcasts brdc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
