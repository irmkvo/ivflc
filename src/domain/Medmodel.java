/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Shah
 */
@Entity
@Table(name = "MEDMODEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medmodel.findAll", query = "SELECT m FROM Medmodel m"),
    @NamedQuery(name = "Medmodel.findByMedmodelId", query = "SELECT m FROM Medmodel m WHERE m.medmodelId = :medmodelId"),
    @NamedQuery(name = "Medmodel.findByMedecinsId", query = "SELECT m FROM Medmodel m WHERE m.medecinsId = :medecinsId"),
    @NamedQuery(name = "Medmodel.findByModelsId", query = "SELECT m FROM Medmodel m WHERE m.modelsId = :modelsId"),
    @NamedQuery(name = "Medmodel.findByAssistantsAccess", query = "SELECT m FROM Medmodel m WHERE m.assistantsAccess = :assistantsAccess"),
    @NamedQuery(name = "Medmodel.findByKrnCreateDate", query = "SELECT m FROM Medmodel m WHERE m.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Medmodel.findByKrnCreateUserId", query = "SELECT m FROM Medmodel m WHERE m.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Medmodel.findByKrnModifyDate", query = "SELECT m FROM Medmodel m WHERE m.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Medmodel.findByKrnModifyUserId", query = "SELECT m FROM Medmodel m WHERE m.krnModifyUserId = :krnModifyUserId")})
public class Medmodel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MEDMODEL_ID")
    private Integer medmodelId;
    @Column(name = "MEDECINS_ID")
    private Integer medecinsId;
    @Column(name = "MODELS_ID")
    private Integer modelsId;
    @Column(name = "ASSISTANTS_ACCESS")
    private Boolean assistantsAccess;
    @Column(name = "KRN_CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date krnCreateDate;
    @Column(name = "KRN_CREATE_USER_ID")
    private Integer krnCreateUserId;
    @Column(name = "KRN_MODIFY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date krnModifyDate;
    @Column(name = "KRN_MODIFY_USER_ID")
    private Integer krnModifyUserId;

    public Medmodel() {
    }

    public Medmodel(Integer medmodelId) {
        this.medmodelId = medmodelId;
    }

    public Integer getMedmodelId() {
        return medmodelId;
    }

    public void setMedmodelId(Integer medmodelId) {
        this.medmodelId = medmodelId;
    }

    public Integer getMedecinsId() {
        return medecinsId;
    }

    public void setMedecinsId(Integer medecinsId) {
        this.medecinsId = medecinsId;
    }

    public Integer getModelsId() {
        return modelsId;
    }

    public void setModelsId(Integer modelsId) {
        this.modelsId = modelsId;
    }

    public Boolean getAssistantsAccess() {
        return assistantsAccess;
    }

    public void setAssistantsAccess(Boolean assistantsAccess) {
        this.assistantsAccess = assistantsAccess;
    }

    public Date getKrnCreateDate() {
        return krnCreateDate;
    }

    public void setKrnCreateDate(Date krnCreateDate) {
        this.krnCreateDate = krnCreateDate;
    }

    public Integer getKrnCreateUserId() {
        return krnCreateUserId;
    }

    public void setKrnCreateUserId(Integer krnCreateUserId) {
        this.krnCreateUserId = krnCreateUserId;
    }

    public Date getKrnModifyDate() {
        return krnModifyDate;
    }

    public void setKrnModifyDate(Date krnModifyDate) {
        this.krnModifyDate = krnModifyDate;
    }

    public Integer getKrnModifyUserId() {
        return krnModifyUserId;
    }

    public void setKrnModifyUserId(Integer krnModifyUserId) {
        this.krnModifyUserId = krnModifyUserId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (medmodelId != null ? medmodelId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medmodel)) {
            return false;
        }
        Medmodel other = (Medmodel) object;
        if ((this.medmodelId == null && other.medmodelId != null) || (this.medmodelId != null && !this.medmodelId.equals(other.medmodelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Medmodel[ medmodelId=" + medmodelId + " ]";
    }
    
}
