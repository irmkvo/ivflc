package dao.medialog;

import domain.medialog.PlDay;
import domain.medialog.PlExcl;
import domain.medialog.PlSubj;
import domain.medialog.Planning;
import java.util.Date;
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
public class PlanningDAOImpl implements PlanningDAO{

    @Autowired
    @Qualifier("sessionFactoryMssql")
    private SessionFactory sessionFactory;
    
    @Override
    public List<Planning> getAllPL() {
        return sessionFactory.getCurrentSession().createQuery("from Planning").list();
    }

    @Override
    public List<Planning> getPLByWeekAndMedecinsSubId(Date start, Date end, Integer medSubId) {
        return sessionFactory.getCurrentSession().createQuery("from Planning WHERE plSubjId = :plSubjId AND dateCons BETWEEN :start AND :end").setParameter("plSubjId", medSubId).setParameter("start", start).setParameter("end", end).list();
    }

    @Override
    public List<Planning> getPLByWeekAndSub(Date start, Date end, Integer subId) {
        return sessionFactory.getCurrentSession().createQuery("from Planning WHERE plSubjId = :plSubjId AND dateCons BETWEEN :start AND :end ORDER BY dateCons, heure").setParameter("plSubjId", subId).setParameter("start", start).setParameter("end", end).list();
    }

    @Override
    public List<Planning> getPLByPatientsID(Integer patId) {
        return sessionFactory.getCurrentSession().createQuery("from Planning WHERE patientsId = :patientsId ORDER BY dateCons, heure").setParameter("patientsId", patId).list();
    }

    @Override
    public Planning getPLByID(Integer Id) {
        return (Planning)sessionFactory.getCurrentSession().createQuery("from Planning WHERE planningId = :planningId").setParameter("planningId", Id).uniqueResult();
    }

    @Override
    public List<PlExcl> getAllPLEXCL() {
        return sessionFactory.getCurrentSession().createQuery("from PlExcl").list();
    }

    @Override
    public List<PlExcl> getPLEXCLByOwnerID(Integer ownId) {
        return sessionFactory.getCurrentSession().createQuery("from PlExcl WHERE ownerId = :ownerId").setParameter("ownerId", ownId).list();
    }

    @Override
    public PlExcl getPLEXCLByID(Integer ID) {
        return (PlExcl)sessionFactory.getCurrentSession().createQuery("from PlExcl WHERE plExclId = :plExclId").setParameter("plExclId", ID).uniqueResult();
    }

    @Override
    public List<PlDay> getAllPLDAY() {
        return sessionFactory.getCurrentSession().createQuery("from PlDay").list();
    }

    @Override
    public List<PlDay> getPLDAYByAgentID(Integer agentId) {
        return sessionFactory.getCurrentSession().createQuery("from PlDay WHERE plAgendId = :plAgendId ORDER BY dayOfWeek").setParameter("plAgendId", agentId).list();
    }

    @Override
    public PlDay getPLDAYByID(Integer Id) {
        return (PlDay)sessionFactory.getCurrentSession().createQuery("from PlDay WHERE plDayId = :plDayId").setParameter("plDayId", Id).uniqueResult();
    }

    @Override
    public PlDay getPLDAYByAgentIDMaxEndTime(Integer agentId) {
        return (PlDay)sessionFactory.getCurrentSession().createQuery("from PlDay WHERE endTime = (SELECT MAX(endTime) FROM PlDay WHERE plAgendId = :plAgendId)").setParameter("plAgendId", agentId).uniqueResult();
    }

    @Override
    public PlDay getPLDAYByAgentIDMinStartTime(Integer agentId) {
        return (PlDay)sessionFactory.getCurrentSession().createQuery("from PlDay WHERE startTime = (SELECT MIN(startTime) FROM PlDay WHERE plAgendId = :plAgendId)").setParameter("plAgendId", agentId).uniqueResult();
    }

    @Override
    public List<PlSubj> getAllPLSUBJ() {
        return sessionFactory.getCurrentSession().createQuery("from PlSubj").list();
    }

    @Override
    public PlSubj getPLSUBJById(Integer Id) {
        return (PlSubj)sessionFactory.getCurrentSession().createQuery("from PlSubj WHERE plSubjId = :plSubjId").setParameter("plSubjId", Id).uniqueResult();
    }
    
}
