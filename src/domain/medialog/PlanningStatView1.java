/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.medialog;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kvo
 */
@Entity
@Table(name = "PLANNING_STAT_VIEW_1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlanningStatView1.findAll", query = "SELECT p FROM PlanningStatView1 p"),
    @NamedQuery(name = "PlanningStatView1.findByDateCons", query = "SELECT p FROM PlanningStatView1 p WHERE p.dateCons = :dateCons"),
    @NamedQuery(name = "PlanningStatView1.findByHeure", query = "SELECT p FROM PlanningStatView1 p WHERE p.heure = :heure"),
    @NamedQuery(name = "PlanningStatView1.findByDuree", query = "SELECT p FROM PlanningStatView1 p WHERE p.duree = :duree"),
    @NamedQuery(name = "PlanningStatView1.findByNom", query = "SELECT p FROM PlanningStatView1 p WHERE p.nom = :nom"),
    @NamedQuery(name = "PlanningStatView1.findByPrenom", query = "SELECT p FROM PlanningStatView1 p WHERE p.prenom = :prenom"),
    @NamedQuery(name = "PlanningStatView1.findByPatronyme", query = "SELECT p FROM PlanningStatView1 p WHERE p.patronyme = :patronyme"),
    @NamedQuery(name = "PlanningStatView1.findByName", query = "SELECT p FROM PlanningStatView1 p WHERE p.name = :name"),
    @NamedQuery(name = "PlanningStatView1.findByFio", query = "SELECT p FROM PlanningStatView1 p WHERE p.fio = :fio")})
public class PlanningStatView1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_CONS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCons;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HEURE")
    private int heure;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DUREE")
    private int duree;
    @Size(max = 100)
    @Column(name = "NOM")
    private String nom;
    @Size(max = 100)
    @Column(name = "PRENOM")
    private String prenom;
    @Size(max = 100)
    @Column(name = "PATRONYME")
    private String patronyme;
    @Size(max = 255)
    @Column(name = "NAME")
    private String name;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "COMMENTAIRE")
    private String commentaire;
    @Size(max = 302)
    @Column(name = "FIO")
    private String fio;

    public PlanningStatView1() {
    }

    public Date getDateCons() {
        return dateCons;
    }

    public void setDateCons(Date dateCons) {
        this.dateCons = dateCons;
    }

    public int getHeure() {
        return heure;
    }

    public void setHeure(int heure) {
        this.heure = heure;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
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

    public String getPatronyme() {
        return patronyme;
    }

    public void setPatronyme(String patronyme) {
        this.patronyme = patronyme;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
    
}
