/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.medialog;

import domain.medialog.Medecins;
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
public class MedecinsDAOImpl implements MedecinsDAO {

    @Autowired
    @Qualifier("sessionFactoryMssql")
    private SessionFactory sessionFactory;
    
    @Override
    public List<Medecins> getMedecinList() {
        return sessionFactory.getCurrentSession().createQuery("from Medecins").list();
    }

    @Override
    public Medecins getMedecinById(Integer ID) {
        return (Medecins) sessionFactory.getCurrentSession().createQuery("from Motconsu where medecinsId = :ID").setParameter("ID", ID).uniqueResult();
    }
    
}
