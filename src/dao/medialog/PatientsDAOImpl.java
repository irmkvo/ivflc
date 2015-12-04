/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.medialog;

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

    @Override
    public List<Patients> GetPatientsListByPage(int page, int limitResultsPerPage) {
//        CallableStatement callStmt = .prepareCall(buf.toString(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//        Query q = sessionFactory.getCurrentSession().createQuery(
//                "from Patients ORDER BY patientsId ASC");
//        q.setFirstResult(page * limitResultsPerPage); 
//        q.setMaxResults(limitResultsPerPage);
        return sessionFactory.getCurrentSession().createQuery("from Patients ORDER BY patientsId ASC").setFirstResult(page * limitResultsPerPage).setMaxResults(limitResultsPerPage).list();
    }

    @Override
    public Integer GetPatientsPageCount(int limitResultsPerPage) {
        Integer countRows = (Integer) ((Long)sessionFactory.getCurrentSession().createQuery("SELECT COUNT(*) from Patients").uniqueResult()).intValue();
        return countRows/limitResultsPerPage;
    }

    @Override
    public Integer GetPatientsCount() {
        return (Integer) ((Long)sessionFactory.getCurrentSession().createQuery("SELECT COUNT(*) from Patients").uniqueResult()).intValue();
    }

    @Override
    public List<Patients> GetPatientsListByPageAndSearchParam(int page, int limitResultsPerPage, String searchParam) {
        String[] srf = searchParam.split(" ");
        String whereParam = "";
        for(int i = 0; i < srf.length; i++){
            if(i == 0){
                whereParam = " nom LIKE '%" + srf[i] + "%' OR prenom LIKE '%" + srf[i] + "%' OR patronyme LIKE '%" + srf[i] + "%' ";
            } else {
                whereParam += " OR nom LIKE '%" + srf[i] + "%' OR prenom LIKE '%" + srf[i] + "%' OR patronyme LIKE '%" + srf[i] + "%' ";
            }
        }
        
        return sessionFactory.getCurrentSession().createQuery("from Patients WHERE " + whereParam + " ORDER BY patientsId ASC").setMaxResults(limitResultsPerPage).list();
    }

    @Override
    public Integer GetPatientsCountBySearch(String searchParam) {
        String[] srf = searchParam.split(" ");
        String whereParam = "";
        for(int i = 0; i < srf.length; i++){
            if(i == 0){
                whereParam = " nom LIKE '%" + srf[i] + "%' OR prenom LIKE '%" + srf[i] + "%' OR patronyme LIKE '%" + srf[i] + "%' ";
            } else {
                whereParam += " OR nom LIKE '%" + srf[i] + "%' OR prenom LIKE '%" + srf[i] + "%' OR patronyme LIKE '%" + srf[i] + "%' ";
            }
        }
        return (Integer) ((Long)sessionFactory.getCurrentSession().createQuery("SELECT COUNT(*) from Patients WHERE " + whereParam + "").uniqueResult()).intValue();
    }

}
