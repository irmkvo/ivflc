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
@Table(name = "MED_PLPARAM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MedPlparam.findAll", query = "SELECT m FROM MedPlparam m"),
    @NamedQuery(name = "MedPlparam.findByMedPlparamId", query = "SELECT m FROM MedPlparam m WHERE m.medPlparamId = :medPlparamId"),
    @NamedQuery(name = "MedPlparam.findByPlParamId", query = "SELECT m FROM MedPlparam m WHERE m.plParamId = :plParamId"),
    @NamedQuery(name = "MedPlparam.findByMedecinsId", query = "SELECT m FROM MedPlparam m WHERE m.medecinsId = :medecinsId"),
    @NamedQuery(name = "MedPlparam.findByKrnCreateDate", query = "SELECT m FROM MedPlparam m WHERE m.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "MedPlparam.findByKrnCreateUserId", query = "SELECT m FROM MedPlparam m WHERE m.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "MedPlparam.findByKrnModifyDate", query = "SELECT m FROM MedPlparam m WHERE m.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "MedPlparam.findByKrnModifyUserId", query = "SELECT m FROM MedPlparam m WHERE m.krnModifyUserId = :krnModifyUserId")})
public class MedPlparam implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MED_PLPARAM_ID")
    private Integer medPlparamId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_PARAM_ID")
    private int plParamId;
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

    public MedPlparam() {
    }

    public MedPlparam(Integer medPlparamId) {
        this.medPlparamId = medPlparamId;
    }

    public MedPlparam(Integer medPlparamId, int plParamId) {
        this.medPlparamId = medPlparamId;
        this.plParamId = plParamId;
    }

    public Integer getMedPlparamId() {
        return medPlparamId;
    }

    public void setMedPlparamId(Integer medPlparamId) {
        this.medPlparamId = medPlparamId;
    }

    public int getPlParamId() {
        return plParamId;
    }

    public void setPlParamId(int plParamId) {
        this.plParamId = plParamId;
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
        hash += (medPlparamId != null ? medPlparamId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MedPlparam)) {
            return false;
        }
        MedPlparam other = (MedPlparam) object;
        if ((this.medPlparamId == null && other.medPlparamId != null) || (this.medPlparamId != null && !this.medPlparamId.equals(other.medPlparamId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.MedPlparam[ medPlparamId=" + medPlparamId + " ]";
    }
    
}
