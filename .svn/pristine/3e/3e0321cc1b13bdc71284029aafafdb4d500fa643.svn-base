/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Shah
 */
@Entity
@Table(name = "MED_GROUP_VIEW")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MedGroupView.findAll", query = "SELECT m FROM MedGroupView m"),
    @NamedQuery(name = "MedGroupView.findByMedecinsId", query = "SELECT m FROM MedGroupView m WHERE m.medecinsId = :medecinsId"),
    @NamedQuery(name = "MedGroupView.findByNom", query = "SELECT m FROM MedGroupView m WHERE m.nom = :nom"),
    @NamedQuery(name = "MedGroupView.findByPrenom", query = "SELECT m FROM MedGroupView m WHERE m.prenom = :prenom"),
    @NamedQuery(name = "MedGroupView.findBySystemFlags", query = "SELECT m FROM MedGroupView m WHERE m.systemFlags = :systemFlags"),
    @NamedQuery(name = "MedGroupView.findByAccessCode", query = "SELECT m FROM MedGroupView m WHERE m.accessCode = :accessCode"),
    @NamedQuery(name = "MedGroupView.findByLogin", query = "SELECT m FROM MedGroupView m WHERE m.login = :login"),
    @NamedQuery(name = "MedGroupView.findByMedGroupViewId", query = "SELECT m FROM MedGroupView m WHERE m.medGroupViewId = :medGroupViewId"),
    @NamedQuery(name = "MedGroupView.findByRmDatabasesId", query = "SELECT m FROM MedGroupView m WHERE m.rmDatabasesId = :rmDatabasesId"),
    @NamedQuery(name = "MedGroupView.findByArchive", query = "SELECT m FROM MedGroupView m WHERE m.archive = :archive")})
public class MedGroupView implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MEDECINS_ID")
    private int medecinsId;
    @Size(max = 50)
    @Column(name = "NOM")
    private String nom;
    @Size(max = 50)
    @Column(name = "PRENOM")
    private String prenom;
    @Size(max = 254)
    @Column(name = "SYSTEM_FLAGS")
    private String systemFlags;
    @Size(max = 24)
    @Column(name = "ACCESS_CODE")
    private String accessCode;
    @Size(max = 80)
    @Column(name = "LOGIN")
    private String login;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MED_GROUP_VIEW_ID")
    private int medGroupViewId;
    @Column(name = "RM_DATABASES_ID")
    private Integer rmDatabasesId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ARCHIVE")
    private boolean archive;

    public MedGroupView() {
    }

    public int getMedecinsId() {
        return medecinsId;
    }

    public void setMedecinsId(int medecinsId) {
        this.medecinsId = medecinsId;
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

    public String getSystemFlags() {
        return systemFlags;
    }

    public void setSystemFlags(String systemFlags) {
        this.systemFlags = systemFlags;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getMedGroupViewId() {
        return medGroupViewId;
    }

    public void setMedGroupViewId(int medGroupViewId) {
        this.medGroupViewId = medGroupViewId;
    }

    public Integer getRmDatabasesId() {
        return rmDatabasesId;
    }

    public void setRmDatabasesId(Integer rmDatabasesId) {
        this.rmDatabasesId = rmDatabasesId;
    }

    public boolean getArchive() {
        return archive;
    }

    public void setArchive(boolean archive) {
        this.archive = archive;
    }
    
}
