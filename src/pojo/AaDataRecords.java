/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.ArrayList;
import java.util.List;
import video.api.objects.Records;

/**
 *
 * @author kvo
 */
public class AaDataRecords {
    
    private List<Records> aaData = new ArrayList<Records>();

    public List<Records> getAaData() {
        return aaData;
    }

    public void setAaData(List<Records> aaData) {
        this.aaData = aaData;
    }
    
    
}
