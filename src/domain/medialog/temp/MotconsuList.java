/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.medialog.temp;

import java.util.Date;

/**
 *
 * @author kvo
 */
public class MotconsuList {
    
    private Integer motconsuId;
    private Date dateConsultation;
    private String modeleName;
    private String nom;
    private String prenom;
    private String specialisation;

    public MotconsuList() {
    }

    public MotconsuList(Integer motconsuId, Date dateConsultation, String modeleName, String nom, String prenom, String specialisation) {
        this.motconsuId = motconsuId;
        this.dateConsultation = dateConsultation;
        this.modeleName = modeleName;
        this.nom = nom;
        this.prenom = prenom;
        this.specialisation = specialisation;
    }

    public Integer getMotconsuId() {
        return motconsuId;
    }

    public void setMotconsuId(Integer motconsuId) {
        this.motconsuId = motconsuId;
    }

    public Date getDateConsultation() {
        return dateConsultation;
    }

    public void setDateConsultation(Date dateConsultation) {
        this.dateConsultation = dateConsultation;
    }

    public String getModeleName() {
        return modeleName;
    }

    public void setModeleName(String modeleName) {
        this.modeleName = modeleName;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }    
}
