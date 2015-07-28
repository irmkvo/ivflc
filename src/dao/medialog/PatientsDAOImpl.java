/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.medialog;

import domain.medialog.Patients;
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
public class PatientsDAOImpl implements PatientsDAO {

    @Autowired
    @Qualifier("sessionFactoryMssql")
    private SessionFactory sessionFactory;

    @Override
    public List<Patients> GetPatientsList() {
        return sessionFactory.getCurrentSession().createQuery("from Patients").list();
    }

    @Override
    public Patients GetPatientByIIN(String IIN) {
        return (Patients) sessionFactory.getCurrentSession().createQuery("from Patients where IIN = :IIN").setParameter("IIN", IIN).uniqueResult();
    }

}
