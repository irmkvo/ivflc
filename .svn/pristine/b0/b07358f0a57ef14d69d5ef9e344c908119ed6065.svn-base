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
@Table(name = "MED_ASSISTANTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MedAssistants.findAll", query = "SELECT m FROM MedAssistants m"),
    @NamedQuery(name = "MedAssistants.findByMedAssistantsId", query = "SELECT m FROM MedAssistants m WHERE m.medAssistantsId = :medAssistantsId"),
    @NamedQuery(name = "MedAssistants.findByMedecinsId", query = "SELECT m FROM MedAssistants m WHERE m.medecinsId = :medecinsId"),
    @NamedQuery(name = "MedAssistants.findByAssistantsId", query = "SELECT m FROM MedAssistants m WHERE m.assistantsId = :assistantsId"),
    @NamedQuery(name = "MedAssistants.findByKrnCreateDate", query = "SELECT m FROM MedAssistants m WHERE m.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "MedAssistants.findByKrnCreateUserId", query = "SELECT m FROM MedAssistants m WHERE m.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "MedAssistants.findByKrnModifyDate", query = "SELECT m FROM MedAssistants m WHERE m.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "MedAssistants.findByKrnModifyUserId", query = "SELECT m FROM MedAssistants m WHERE m.krnModifyUserId = :krnModifyUserId")})
public class MedAssistants implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MED_ASSISTANTS_ID")
    private Integer medAssistantsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MEDECINS_ID")
    private int medecinsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ASSISTANTS_ID")
    private int assistantsId;
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

    public MedAssistants() {
    }

    public MedAssistants(Integer medAssistantsId) {
        this.medAssistantsId = medAssistantsId;
    }

    public MedAssistants(Integer medAssistantsId, int medecinsId, int assistantsId) {
        this.medAssistantsId = medAssistantsId;
        this.medecinsId = medecinsId;
        this.assistantsId = assistantsId;
    }

    public Integer getMedAssistantsId() {
        return medAssistantsId;
    }

    public void setMedAssistantsId(Integer medAssistantsId) {
        this.medAssistantsId = medAssistantsId;
    }

    public int getMedecinsId() {
        return medecinsId;
    }

    public void setMedecinsId(int medecinsId) {
        this.medecinsId = medecinsId;
    }

    public int getAssistantsId() {
        return assistantsId;
    }

    public void setAssistantsId(int assistantsId) {
        this.assistantsId = assistantsId;
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
        hash += (medAssistantsId != null ? medAssistantsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MedAssistants)) {
            return false;
        }
        MedAssistants other = (MedAssistants) object;
        if ((this.medAssistantsId == null && other.medAssistantsId != null) || (this.medAssistantsId != null && !this.medAssistantsId.equals(other.medAssistantsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.MedAssistants[ medAssistantsId=" + medAssistantsId + " ]";
    }
    
}
