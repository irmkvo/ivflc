/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.medialog;

import dao.medialog.PatientsDAO;
import domain.medialog.Patients;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author kvo
 */
@Service("patientsService")
@Transactional("mssqlT")
public class PatientsServiceImpl implements PatientsService{

    @Autowired
    PatientsDAO patientsDAO;
    
    @Override
    public List<Patients> GetPatientsList() {
        return patientsDAO.GetPatientsList();
    }

    @Override
    public Patients GetPatientByIIN(String IIN) {
        return patientsDAO.GetPatientByIIN(IIN);
    }

    @Override
    public List<Patients> GetPatientsListByPage(int page, int limitResultsPerPage) {
        return this.patientsDAO.GetPatientsListByPage(page, limitResultsPerPage);
    }

    @Override
    public Integer GetPatientsPageCount(int limitResultsPerPage) {
        return this.patientsDAO.GetPatientsPageCount(limitResultsPerPage);
    }

    @Override
    public Integer GetPatientsCount() {
        return this.patientsDAO.GetPatientsCount();
    }

    @Override
    public List<Patients> GetPatientsListByPageAndSearchParam(int page, int limitResultsPerPage, String searchParam) {
        return this.patientsDAO.GetPatientsListByPageAndSearchParam(page, limitResultsPerPage, searchParam);
    }

    @Override
    public Integer GetPatientsCountBySearch(String searchParam) {
        return this.patientsDAO.GetPatientsCountBySearch(searchParam);
    }
    
}
