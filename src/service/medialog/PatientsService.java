/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.medialog;

import domain.medialog.Patients;
import java.util.List;

/**
 *
 * @author kvo
 */
public interface PatientsService {

    public List<Patients> GetPatientsList(); //Получить список Пациентов 
    
    public List<Patients> GetPatientsListByPage(int page, int limitResultsPerPage); //Получить список Пациентов с пагинацией
    
    public List<Patients> GetPatientsListByPageAndSearchParam(int page, int limitResultsPerPage, String searchParam); //Получить список Пациентов с пагинацией
    
    public Integer GetPatientsCountBySearch(String searchParam); //Получить список Пациентов с пагинацией
    
    public Integer GetPatientsPageCount(int limitResultsPerPage); //Получить список Пациентов с пагинацией
    
    public Integer GetPatientsCount(); //Получить список Пациентов с пагинацией

    public Patients GetPatientByIIN(String IIN); //Получить Пациента по ИИН 
}
