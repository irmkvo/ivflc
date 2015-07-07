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
@Table(name = "MED_PLSUBJ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MedPlsubj.findAll", query = "SELECT m FROM MedPlsubj m"),
    @NamedQuery(name = "MedPlsubj.findByMedPlsubjId", query = "SELECT m FROM MedPlsubj m WHERE m.medPlsubjId = :medPlsubjId"),
    @NamedQuery(name = "MedPlsubj.findByPlSubjId", query = "SELECT m FROM MedPlsubj m WHERE m.plSubjId = :plSubjId"),
    @NamedQuery(name = "MedPlsubj.findByMedecinsId", query = "SELECT m FROM MedPlsubj m WHERE m.medecinsId = :medecinsId"),
    @NamedQuery(name = "MedPlsubj.findByKrnCreateDate", query = "SELECT m FROM MedPlsubj m WHERE m.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "MedPlsubj.findByKrnCreateUserId", query = "SELECT m FROM MedPlsubj m WHERE m.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "MedPlsubj.findByKrnModifyDate", query = "SELECT m FROM MedPlsubj m WHERE m.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "MedPlsubj.findByKrnModifyUserId", query = "SELECT m FROM MedPlsubj m WHERE m.krnModifyUserId = :krnModifyUserId")})
public class MedPlsubj implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MED_PLSUBJ_ID")
    private Integer medPlsubjId;
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

    public MedPlsubj() {
    }

    public MedPlsubj(Integer medPlsubjId) {
        this.medPlsubjId = medPlsubjId;
    }

    public MedPlsubj(Integer medPlsubjId, int plSubjId) {
        this.medPlsubjId = medPlsubjId;
        this.plSubjId = plSubjId;
    }

    public Integer getMedPlsubjId() {
        return medPlsubjId;
    }

    public void setMedPlsubjId(Integer medPlsubjId) {
        this.medPlsubjId = medPlsubjId;
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
        hash += (medPlsubjId != null ? medPlsubjId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MedPlsubj)) {
            return false;
        }
        MedPlsubj other = (MedPlsubj) object;
        if ((this.medPlsubjId == null && other.medPlsubjId != null) || (this.medPlsubjId != null && !this.medPlsubjId.equals(other.medPlsubjId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.MedPlsubj[ medPlsubjId=" + medPlsubjId + " ]";
    }
    
}
