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
@Table(name = "MED_EXTGUIDS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MedExtguids.findAll", query = "SELECT m FROM MedExtguids m"),
    @NamedQuery(name = "MedExtguids.findByMedExtguidsId", query = "SELECT m FROM MedExtguids m WHERE m.medExtguidsId = :medExtguidsId"),
    @NamedQuery(name = "MedExtguids.findByExtGuidsId", query = "SELECT m FROM MedExtguids m WHERE m.extGuidsId = :extGuidsId"),
    @NamedQuery(name = "MedExtguids.findByMedecinsId", query = "SELECT m FROM MedExtguids m WHERE m.medecinsId = :medecinsId"),
    @NamedQuery(name = "MedExtguids.findByKrnCreateDate", query = "SELECT m FROM MedExtguids m WHERE m.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "MedExtguids.findByKrnCreateUserId", query = "SELECT m FROM MedExtguids m WHERE m.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "MedExtguids.findByKrnModifyDate", query = "SELECT m FROM MedExtguids m WHERE m.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "MedExtguids.findByKrnModifyUserId", query = "SELECT m FROM MedExtguids m WHERE m.krnModifyUserId = :krnModifyUserId")})
public class MedExtguids implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MED_EXTGUIDS_ID")
    private Integer medExtguidsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EXT_GUIDS_ID")
    private int extGuidsId;
    @Column(name = "MEDECINS_ID")
    private Integer medecinsId;
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

    public MedExtguids() {
    }

    public MedExtguids(Integer medExtguidsId) {
        this.medExtguidsId = medExtguidsId;
    }

    public MedExtguids(Integer medExtguidsId, int extGuidsId) {
        this.medExtguidsId = medExtguidsId;
        this.extGuidsId = extGuidsId;
    }

    public Integer getMedExtguidsId() {
        return medExtguidsId;
    }

    public void setMedExtguidsId(Integer medExtguidsId) {
        this.medExtguidsId = medExtguidsId;
    }

    public int getExtGuidsId() {
        return extGuidsId;
    }

    public void setExtGuidsId(int extGuidsId) {
        this.extGuidsId = extGuidsId;
    }

    public Integer getMedecinsId() {
        return medecinsId;
    }

    public void setMedecinsId(Integer medecinsId) {
        this.medecinsId = medecinsId;
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
        hash += (medExtguidsId != null ? medExtguidsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MedExtguids)) {
            return false;
        }
        MedExtguids other = (MedExtguids) object;
        if ((this.medExtguidsId == null && other.medExtguidsId != null) || (this.medExtguidsId != null && !this.medExtguidsId.equals(other.medExtguidsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.MedExtguids[ medExtguidsId=" + medExtguidsId + " ]";
    }
    
}
