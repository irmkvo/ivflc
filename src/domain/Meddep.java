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
@Table(name = "MEDDEP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Meddep.findAll", query = "SELECT m FROM Meddep m"),
    @NamedQuery(name = "Meddep.findByMeddepId", query = "SELECT m FROM Meddep m WHERE m.meddepId = :meddepId"),
    @NamedQuery(name = "Meddep.findByMedecinsId", query = "SELECT m FROM Meddep m WHERE m.medecinsId = :medecinsId"),
    @NamedQuery(name = "Meddep.findByFmDepId", query = "SELECT m FROM Meddep m WHERE m.fmDepId = :fmDepId"),
    @NamedQuery(name = "Meddep.findByMedecinsGroupId", query = "SELECT m FROM Meddep m WHERE m.medecinsGroupId = :medecinsGroupId"),
    @NamedQuery(name = "Meddep.findByKrnCreateDate", query = "SELECT m FROM Meddep m WHERE m.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Meddep.findByKrnCreateUserId", query = "SELECT m FROM Meddep m WHERE m.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Meddep.findByKrnModifyDate", query = "SELECT m FROM Meddep m WHERE m.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Meddep.findByKrnModifyUserId", query = "SELECT m FROM Meddep m WHERE m.krnModifyUserId = :krnModifyUserId")})
public class Meddep implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MEDDEP_ID")
    private Integer meddepId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MEDECINS_ID")
    private int medecinsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FM_DEP_ID")
    private int fmDepId;
    @Column(name = "MEDECINS_GROUP_ID")
    private Integer medecinsGroupId;
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

    public Meddep() {
    }

    public Meddep(Integer meddepId) {
        this.meddepId = meddepId;
    }

    public Meddep(Integer meddepId, int medecinsId, int fmDepId) {
        this.meddepId = meddepId;
        this.medecinsId = medecinsId;
        this.fmDepId = fmDepId;
    }

    public Integer getMeddepId() {
        return meddepId;
    }

    public void setMeddepId(Integer meddepId) {
        this.meddepId = meddepId;
    }

    public int getMedecinsId() {
        return medecinsId;
    }

    public void setMedecinsId(int medecinsId) {
        this.medecinsId = medecinsId;
    }

    public int getFmDepId() {
        return fmDepId;
    }

    public void setFmDepId(int fmDepId) {
        this.fmDepId = fmDepId;
    }

    public Integer getMedecinsGroupId() {
        return medecinsGroupId;
    }

    public void setMedecinsGroupId(Integer medecinsGroupId) {
        this.medecinsGroupId = medecinsGroupId;
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
        hash += (meddepId != null ? meddepId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Meddep)) {
            return false;
        }
        Meddep other = (Meddep) object;
        if ((this.meddepId == null && other.meddepId != null) || (this.meddepId != null && !this.meddepId.equals(other.meddepId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Meddep[ meddepId=" + meddepId + " ]";
    }
    
}
