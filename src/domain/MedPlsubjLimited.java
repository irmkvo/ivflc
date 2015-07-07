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
@Table(name = "MED_PLSUBJ_LIMITED")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MedPlsubjLimited.findAll", query = "SELECT m FROM MedPlsubjLimited m"),
    @NamedQuery(name = "MedPlsubjLimited.findByMedPlsubjLimitedId", query = "SELECT m FROM MedPlsubjLimited m WHERE m.medPlsubjLimitedId = :medPlsubjLimitedId"),
    @NamedQuery(name = "MedPlsubjLimited.findByPlSubjId", query = "SELECT m FROM MedPlsubjLimited m WHERE m.plSubjId = :plSubjId"),
    @NamedQuery(name = "MedPlsubjLimited.findByMedecinsId", query = "SELECT m FROM MedPlsubjLimited m WHERE m.medecinsId = :medecinsId"),
    @NamedQuery(name = "MedPlsubjLimited.findByKrnCreateDate", query = "SELECT m FROM MedPlsubjLimited m WHERE m.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "MedPlsubjLimited.findByKrnCreateUserId", query = "SELECT m FROM MedPlsubjLimited m WHERE m.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "MedPlsubjLimited.findByKrnModifyDate", query = "SELECT m FROM MedPlsubjLimited m WHERE m.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "MedPlsubjLimited.findByKrnModifyUserId", query = "SELECT m FROM MedPlsubjLimited m WHERE m.krnModifyUserId = :krnModifyUserId")})
public class MedPlsubjLimited implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MED_PLSUBJ_LIMITED_ID")
    private Integer medPlsubjLimitedId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_SUBJ_ID")
    private int plSubjId;
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

    public MedPlsubjLimited() {
    }

    public MedPlsubjLimited(Integer medPlsubjLimitedId) {
        this.medPlsubjLimitedId = medPlsubjLimitedId;
    }

    public MedPlsubjLimited(Integer medPlsubjLimitedId, int plSubjId) {
        this.medPlsubjLimitedId = medPlsubjLimitedId;
        this.plSubjId = plSubjId;
    }

    public Integer getMedPlsubjLimitedId() {
        return medPlsubjLimitedId;
    }

    public void setMedPlsubjLimitedId(Integer medPlsubjLimitedId) {
        this.medPlsubjLimitedId = medPlsubjLimitedId;
    }

    public int getPlSubjId() {
        return plSubjId;
    }

    public void setPlSubjId(int plSubjId) {
        this.plSubjId = plSubjId;
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
        hash += (medPlsubjLimitedId != null ? medPlsubjLimitedId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MedPlsubjLimited)) {
            return false;
        }
        MedPlsubjLimited other = (MedPlsubjLimited) object;
        if ((this.medPlsubjLimitedId == null && other.medPlsubjLimitedId != null) || (this.medPlsubjLimitedId != null && !this.medPlsubjLimitedId.equals(other.medPlsubjLimitedId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.MedPlsubjLimited[ medPlsubjLimitedId=" + medPlsubjLimitedId + " ]";
    }
    
}
