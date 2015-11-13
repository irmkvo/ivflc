/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author kvo
 */
public class PatientsPOJO {
    
    private int patId;
    private String FIO;
    private String bDate;
    private String type;

    public PatientsPOJO() {
    }

    public int getPatId() {
        return patId;
    }

    public void setPatId(int patId) {
        this.patId = patId;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getbDate() {
        return bDate;
    }

    public void setbDate(String bDate) {
        this.bDate = bDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
