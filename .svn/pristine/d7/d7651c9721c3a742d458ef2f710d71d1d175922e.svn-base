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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Shah
 */
@Entity
@Table(name = "DOSAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dosage.findAll", query = "SELECT d FROM Dosage d"),
    @NamedQuery(name = "Dosage.findByDosageId", query = "SELECT d FROM Dosage d WHERE d.dosageId = :dosageId"),
    @NamedQuery(name = "Dosage.findByName", query = "SELECT d FROM Dosage d WHERE d.name = :name"),
    @NamedQuery(name = "Dosage.findByFormula", query = "SELECT d FROM Dosage d WHERE d.formula = :formula"),
    @NamedQuery(name = "Dosage.findByDformula", query = "SELECT d FROM Dosage d WHERE d.dformula = :dformula"),
    @NamedQuery(name = "Dosage.findByKrnCreateDate", query = "SELECT d FROM Dosage d WHERE d.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Dosage.findByKrnCreateUserId", query = "SELECT d FROM Dosage d WHERE d.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Dosage.findByKrnModifyDate", query = "SELECT d FROM Dosage d WHERE d.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Dosage.findByKrnModifyUserId", query = "SELECT d FROM Dosage d WHERE d.krnModifyUserId = :krnModifyUserId")})
public class Dosage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DOSAGE_ID")
    private Integer dosageId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "NAME")
    private String name;
    @Size(max = 255)
    @Column(name = "FORMULA")
    private String formula;
    @Size(max = 255)
    @Column(name = "DFORMULA")
    private String dformula;
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

    public Dosage() {
    }

    public Dosage(Integer dosageId) {
        this.dosageId = dosageId;
    }

    public Dosage(Integer dosageId, String name) {
        this.dosageId = dosageId;
        this.name = name;
    }

    public Integer getDosageId() {
        return dosageId;
    }

    public void setDosageId(Integer dosageId) {
        this.dosageId = dosageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getDformula() {
        return dformula;
    }

    public void setDformula(String dformula) {
        this.dformula = dformula;
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
        hash += (dosageId != null ? dosageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dosage)) {
            return false;
        }
        Dosage other = (Dosage) object;
        if ((this.dosageId == null && other.dosageId != null) || (this.dosageId != null && !this.dosageId.equals(other.dosageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Dosage[ dosageId=" + dosageId + " ]";
    }
    
}
