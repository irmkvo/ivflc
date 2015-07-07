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
@Table(name = "MEDMODEL_DENIED")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MedmodelDenied.findAll", query = "SELECT m FROM MedmodelDenied m"),
    @NamedQuery(name = "MedmodelDenied.findByMedmodelDeniedId", query = "SELECT m FROM MedmodelDenied m WHERE m.medmodelDeniedId = :medmodelDeniedId"),
    @NamedQuery(name = "MedmodelDenied.findByMedecinsId", query = "SELECT m FROM MedmodelDenied m WHERE m.medecinsId = :medecinsId"),
    @NamedQuery(name = "MedmodelDenied.findByModelsId", query = "SELECT m FROM MedmodelDenied m WHERE m.modelsId = :modelsId"),
    @NamedQuery(name = "MedmodelDenied.findByKrnCreateDate", query = "SELECT m FROM MedmodelDenied m WHERE m.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "MedmodelDenied.findByKrnCreateUserId", query = "SELECT m FROM MedmodelDenied m WHERE m.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "MedmodelDenied.findByKrnModifyDate", query = "SELECT m FROM MedmodelDenied m WHERE m.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "MedmodelDenied.findByKrnModifyUserId", query = "SELECT m FROM MedmodelDenied m WHERE m.krnModifyUserId = :krnModifyUserId")})
public class MedmodelDenied implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MEDMODEL_DENIED_ID")
    private Integer medmodelDeniedId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MEDECINS_ID")
    private int medecinsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MODELS_ID")
    private int modelsId;
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

    public MedmodelDenied() {
    }

    public MedmodelDenied(Integer medmodelDeniedId) {
        this.medmodelDeniedId = medmodelDeniedId;
    }

    public MedmodelDenied(Integer medmodelDeniedId, int medecinsId, int modelsId) {
        this.medmodelDeniedId = medmodelDeniedId;
        this.medecinsId = medecinsId;
        this.modelsId = modelsId;
    }

    public Integer getMedmodelDeniedId() {
        return medmodelDeniedId;
    }

    public void setMedmodelDeniedId(Integer medmodelDeniedId) {
        this.medmodelDeniedId = medmodelDeniedId;
    }

    public int getMedecinsId() {
        return medecinsId;
    }

    public void setMedecinsId(int medecinsId) {
        this.medecinsId = medecinsId;
    }

    public int getModelsId() {
        return modelsId;
    }

    public void setModelsId(int modelsId) {
        this.modelsId = modelsId;
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
        hash += (medmodelDeniedId != null ? medmodelDeniedId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MedmodelDenied)) {
            return false;
        }
        MedmodelDenied other = (MedmodelDenied) object;
        if ((this.medmodelDeniedId == null && other.medmodelDeniedId != null) || (this.medmodelDeniedId != null && !this.medmodelDeniedId.equals(other.medmodelDeniedId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.MedmodelDenied[ medmodelDeniedId=" + medmodelDeniedId + " ]";
    }
    
}
