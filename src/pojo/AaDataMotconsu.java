/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import domain.medialog.Motconsu;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kvo
 */
public class AaDataMotconsu {

    private List<MotconsuPOJO> aaData = new ArrayList<MotconsuPOJO>();

    public List<MotconsuPOJO> getAaData() {
        return aaData;
    }

    public void setAaData(List<MotconsuPOJO> aaData) {
        this.aaData = aaData;
    }
}
