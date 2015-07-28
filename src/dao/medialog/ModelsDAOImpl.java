/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.medialog;

import domain.medialog.Models;
import domain.medialog.Motconsu;
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
public class ModelsDAOImpl implements ModelsDAO {

    @Autowired
    @Qualifier("sessionFactoryMssql")
    private SessionFactory sessionFactory;
    
    @Override
    public List<Models> getModels() {
        return sessionFactory.getCurrentSession().createQuery("from Models").list();
    }

    @Override
    public Models getModeleById(Integer ID) {
        return (Models) sessionFactory.getCurrentSession().createQuery("from Models where modelsID = :ID").setParameter("ID", ID).uniqueResult();
    }
    
}
