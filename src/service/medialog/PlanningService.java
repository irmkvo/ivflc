/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.medialog;

import domain.medialog.PlAgend;
import domain.medialog.PlDay;
import domain.medialog.PlExcl;
import domain.medialog.PlSubj;
import domain.medialog.Planning;
import java.util.Date;
import java.util.List;

/**
 *
 * @author kvo
 */
public interface PlanningService {
    
    public List<Planning> getAllPL();
    public List<Planning> getPLByWeekAndMedecinsSubId(Date start, Date end, Integer medSubId);
    public List<Planning> getPLByWeekAndSub(Date start, Date end, Integer subId);
    public List<Planning> getPLByPatientsID(Integer patId);
    public Planning getPLByID(Integer Id);
    
    public Planning getPLByMax(Date start, Date end, Integer subId);
    public Planning getPLByMin(Date start, Date end, Integer subId);
    
    public Integer getPLMax(Date start, Date end, Integer subId);
    public Integer getPLMin(Date start, Date end, Integer subId);
    
    public Integer getPLMinDeure(Date start, Date end, Integer subId);
    
    public Planning getPLByHeure(Integer heure);
    
    public List<PlExcl> getAllPLEXCL();
    public List<PlExcl> getPLEXCLByOwnerID(Integer ownId); // OWNER ID IS A PL_SUB_ID
    public PlExcl getPLEXCLByID(Integer ID);
    
    public List<PlDay> getAllPLDAY();
    public List<PlDay> getPLDAYByAgentID(Integer agentId);
    public PlDay getPLDAYByID(Integer Id);    
    public PlDay getPLDAYByAgentIDMaxEndTime(Integer agentId);
    public PlDay getPLDAYByAgentIDMinStartTime(Integer agentId);
    
    public List<PlSubj> getAllPLSUBJ();
    public PlSubj getPLSUBJById(Integer Id);
    
    public List<PlAgend> getAllPLAGEND();
    public PlAgend getPLAGENDById(Integer Id);
}
