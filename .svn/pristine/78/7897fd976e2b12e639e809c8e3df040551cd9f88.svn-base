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
@Table(name = "MEDRUBR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medrubr.findAll", query = "SELECT m FROM Medrubr m"),
    @NamedQuery(name = "Medrubr.findByMedrubrId", query = "SELECT m FROM Medrubr m WHERE m.medrubrId = :medrubrId"),
    @NamedQuery(name = "Medrubr.findByMedecinsId", query = "SELECT m FROM Medrubr m WHERE m.medecinsId = :medecinsId"),
    @NamedQuery(name = "Medrubr.findByRubricsId", query = "SELECT m FROM Medrubr m WHERE m.rubricsId = :rubricsId"),
    @NamedQuery(name = "Medrubr.findByKrnCreateDate", query = "SELECT m FROM Medrubr m WHERE m.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Medrubr.findByKrnCreateUserId", query = "SELECT m FROM Medrubr m WHERE m.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Medrubr.findByKrnModifyDate", query = "SELECT m FROM Medrubr m WHERE m.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Medrubr.findByKrnModifyUserId", query = "SELECT m FROM Medrubr m WHERE m.krnModifyUserId = :krnModifyUserId")})
public class Medrubr implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MEDRUBR_ID")
    private Integer medrubrId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MEDECINS_ID")
    private int medecinsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RUBRICS_ID")
    private int rubricsId;
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

    public Medrubr() {
    }

    public Medrubr(Integer medrubrId) {
        this.medrubrId = medrubrId;
    }

    public Medrubr(Integer medrubrId, int medecinsId, int rubricsId) {
        this.medrubrId = medrubrId;
        this.medecinsId = medecinsId;
        this.rubricsId = rubricsId;
    }

    public Integer getMedrubrId() {
        return medrubrId;
    }

    public void setMedrubrId(Integer medrubrId) {
        this.medrubrId = medrubrId;
    }

    public int getMedecinsId() {
        return medecinsId;
    }

    public void setMedecinsId(int medecinsId) {
        this.medecinsId = medecinsId;
    }

    public int getRubricsId() {
        return rubricsId;
    }

    public void setRubricsId(int rubricsId) {
        this.rubricsId = rubricsId;
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
        hash += (medrubrId != null ? medrubrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medrubr)) {
            return false;
        }
        Medrubr other = (Medrubr) object;
        if ((this.medrubrId == null && other.medrubrId != null) || (this.medrubrId != null && !this.medrubrId.equals(other.medrubrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Medrubr[ medrubrId=" + medrubrId + " ]";
    }
    
}
