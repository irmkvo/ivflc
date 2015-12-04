/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kvo
 */
public class AaDataPatients {
    
    int iTotalRecords;
 
    int iTotalDisplayRecords;
 
    String sEcho;
 
    String sColumns;
    
    private List<PatientsPOJO> aaData = new ArrayList<PatientsPOJO>();

    public int getiTotalRecords() {
        return iTotalRecords;
    }

    public void setiTotalRecords(int iTotalRecords) {
        this.iTotalRecords = iTotalRecords;
    }

    public int getiTotalDisplayRecords() {
        return iTotalDisplayRecords;
    }

    public void setiTotalDisplayRecords(int iTotalDisplayRecords) {
        this.iTotalDisplayRecords = iTotalDisplayRecords;
    }

    public String getsEcho() {
        return sEcho;
    }

    public void setsEcho(String sEcho) {
        this.sEcho = sEcho;
    }

    public String getsColumns() {
        return sColumns;
    }

    public void setsColumns(String sColumns) {
        this.sColumns = sColumns;
    }

    
    public List<PatientsPOJO> getAaData() {
        return aaData;
    }

    public void setAaData(List<PatientsPOJO> aaData) {
        this.aaData = aaData;
    }
        
}
