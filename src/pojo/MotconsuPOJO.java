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
public class MotconsuPOJO {
    
    private Integer motconsuId;
    private String module;
    private String dateConsultation;
    private String medecins;
    private String url;

    public MotconsuPOJO(Integer motconsuId, String module, String dateConsultation, String medecins, String url) {
        this.motconsuId = motconsuId;
        this.module = module;
        this.dateConsultation = dateConsultation;
        this.medecins = medecins;
        this.url = url;
    }

    public MotconsuPOJO() {
    }

    public Integer getMotconsuId() {
        return motconsuId;
    }

    public void setMotconsuId(Integer motconsuId) {
        this.motconsuId = motconsuId;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getDateConsultation() {
        return dateConsultation;
    }

    public void setDateConsultation(String dateConsultation) {
        this.dateConsultation = dateConsultation;
    }

    public String getMedecins() {
        return medecins;
    }

    public void setMedecins(String medecins) {
        this.medecins = medecins;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
}
