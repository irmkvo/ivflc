/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import domain.postgres.BroadcastRegistration;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kvo
 */
public class AaDataBrdcUsers {
    
    private List<BroadcastRegistration> aaData = new ArrayList<BroadcastRegistration>();

    public List<BroadcastRegistration> getAaData() {
        return aaData;
    }

    public void setAaData(List<BroadcastRegistration> aaData) {
        this.aaData = aaData;
    }
    
    
}
