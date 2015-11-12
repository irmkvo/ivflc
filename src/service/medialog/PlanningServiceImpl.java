/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.medialog;

import dao.medialog.PlanningDAO;
import domain.medialog.PlDay;
import domain.medialog.PlExcl;
import domain.medialog.PlSubj;
import domain.medialog.Planning;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author kvo
 */
@Service("planningService")
@Transactional("mssqlT")
public class PlanningServiceImpl implements PlanningService{

    @Autowired
    PlanningDAO planningDAO;
    
    @Override
    public List<Planning> getAllPL() {
        return this.planningDAO.getAllPL();
    }

    @Override
    public List<Planning> getPLByWeekAndMedecinsSubId(Date start, Date end, Integer medSubId) {
        return this.planningDAO.getPLByWeekAndMedecinsSubId(start, end, medSubId);
    }

    @Override
    public List<Planning> getPLByWeekAndSub(Date start, Date end, Integer subId) {
        return this.planningDAO.getPLByWeekAndSub(start, end, subId);
    }

    @Override
    public List<Planning> getPLByPatientsID(Integer patId) {
        return this.planningDAO.getPLByPatientsID(patId);
    }

    @Override
    public Planning getPLByID(Integer Id) {
        return this.planningDAO.getPLByID(Id);
    }

    @Override
    public List<PlExcl> getAllPLEXCL() {
        return this.planningDAO.getAllPLEXCL();
    }

    @Override
    public List<PlExcl> getPLEXCLByOwnerID(Integer ownId) {
        return this.planningDAO.getPLEXCLByOwnerID(ownId);
    }

    @Override
    public PlExcl getPLEXCLByID(Integer ID) {
        return this.planningDAO.getPLEXCLByID(ID);
    }

    @Override
    public List<PlDay> getAllPLDAY() {
        return this.planningDAO.getAllPLDAY();
    }

    @Override
    public List<PlDay> getPLDAYByAgentID(Integer agentId) {
        return this.planningDAO.getPLDAYByAgentID(agentId);
    }

    @Override
    public PlDay getPLDAYByID(Integer Id) {
        return this.planningDAO.getPLDAYByID(Id);
    }

    @Override
    public PlDay getPLDAYByAgentIDMaxEndTime(Integer agentId) {
        return this.planningDAO.getPLDAYByAgentIDMaxEndTime(agentId);
    }

    @Override
    public PlDay getPLDAYByAgentIDMinStartTime(Integer agentId) {
        return this.planningDAO.getPLDAYByAgentIDMinStartTime(agentId);
    }

    @Override
    public List<PlSubj> getAllPLSUBJ() {
        return this.planningDAO.getAllPLSUBJ();
    }

    @Override
    public PlSubj getPLSUBJById(Integer Id) {
        return this.planningDAO.getPLSUBJById(Id);
    }
    
}
