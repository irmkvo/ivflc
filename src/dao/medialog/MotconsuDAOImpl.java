/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.medialog;

import domain.medialog.Motconsu;
import domain.medialog.Patients;
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
public class MotconsuDAOImpl implements MotconsuDAO {

    @Autowired
    @Qualifier("sessionFactoryMssql")
    private SessionFactory sessionFactory;
    
    @Override
    public List<Motconsu> getMotconsuList() {
        return sessionFactory.getCurrentSession().createQuery("from Motconsu").list();
    }

    @Override
    public Motconsu getMotconsuById(Integer ID) {
        return (Motconsu) sessionFactory.getCurrentSession().createQuery("from Motconsu where motconsuId = :ID").setParameter("ID", ID).uniqueResult();
    }

    @Override
    public List<Motconsu> getMotconsuListByPatientId(Integer ID) {
        return sessionFactory.getCurrentSession().createQuery("from Motconsu where patientsId = :ID").setParameter("ID", ID).list();
    }
    
}
