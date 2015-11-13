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
    
    private List<PatientsPOJO> aaData = new ArrayList<PatientsPOJO>();

    public List<PatientsPOJO> getAaData() {
        return aaData;
    }

    public void setAaData(List<PatientsPOJO> aaData) {
        this.aaData = aaData;
    }
        
}
