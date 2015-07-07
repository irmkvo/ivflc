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
@Table(name = "MEDEXAM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medexam.findAll", query = "SELECT m FROM Medexam m"),
    @NamedQuery(name = "Medexam.findByMedexamId", query = "SELECT m FROM Medexam m WHERE m.medexamId = :medexamId"),
    @NamedQuery(name = "Medexam.findByMedecinsId", query = "SELECT m FROM Medexam m WHERE m.medecinsId = :medecinsId"),
    @NamedQuery(name = "Medexam.findByPlExamId", query = "SELECT m FROM Medexam m WHERE m.plExamId = :plExamId"),
    @NamedQuery(name = "Medexam.findByKrnCreateDate", query = "SELECT m FROM Medexam m WHERE m.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Medexam.findByKrnCreateUserId", query = "SELECT m FROM Medexam m WHERE m.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Medexam.findByKrnModifyDate", query = "SELECT m FROM Medexam m WHERE m.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Medexam.findByKrnModifyUserId", query = "SELECT m FROM Medexam m WHERE m.krnModifyUserId = :krnModifyUserId")})
public class Medexam implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MEDEXAM_ID")
    private Integer medexamId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MEDECINS_ID")
    private int medecinsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_EXAM_ID")
    private int plExamId;
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

    public Medexam() {
    }

    public Medexam(Integer medexamId) {
        this.medexamId = medexamId;
    }

    public Medexam(Integer medexamId, int medecinsId, int plExamId) {
        this.medexamId = medexamId;
        this.medecinsId = medecinsId;
        this.plExamId = plExamId;
    }

    public Integer getMedexamId() {
        return medexamId;
    }

    public void setMedexamId(Integer medexamId) {
        this.medexamId = medexamId;
    }

    public int getMedecinsId() {
        return medecinsId;
    }

    public void setMedecinsId(int medecinsId) {
        this.medecinsId = medecinsId;
    }

    public int getPlExamId() {
        return plExamId;
    }

    public void setPlExamId(int plExamId) {
        this.plExamId = plExamId;
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
        hash += (medexamId != null ? medexamId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medexam)) {
            return false;
        }
        Medexam other = (Medexam) object;
        if ((this.medexamId == null && other.medexamId != null) || (this.medexamId != null && !this.medexamId.equals(other.medexamId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Medexam[ medexamId=" + medexamId + " ]";
    }
    
}
