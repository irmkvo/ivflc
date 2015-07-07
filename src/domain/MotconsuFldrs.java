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
@Table(name = "MOTCONSU_FLDRS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MotconsuFldrs.findAll", query = "SELECT m FROM MotconsuFldrs m"),
    @NamedQuery(name = "MotconsuFldrs.findByMotconsuFldrsId", query = "SELECT m FROM MotconsuFldrs m WHERE m.motconsuFldrsId = :motconsuFldrsId"),
    @NamedQuery(name = "MotconsuFldrs.findByPatientsId", query = "SELECT m FROM MotconsuFldrs m WHERE m.patientsId = :patientsId"),
    @NamedQuery(name = "MotconsuFldrs.findByMotconsuMainId", query = "SELECT m FROM MotconsuFldrs m WHERE m.motconsuMainId = :motconsuMainId"),
    @NamedQuery(name = "MotconsuFldrs.findByMotconsuFldrTypesId", query = "SELECT m FROM MotconsuFldrs m WHERE m.motconsuFldrTypesId = :motconsuFldrTypesId"),
    @NamedQuery(name = "MotconsuFldrs.findByLabel", query = "SELECT m FROM MotconsuFldrs m WHERE m.label = :label"),
    @NamedQuery(name = "MotconsuFldrs.findByKrnCreateDate", query = "SELECT m FROM MotconsuFldrs m WHERE m.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "MotconsuFldrs.findByKrnCreateUserId", query = "SELECT m FROM MotconsuFldrs m WHERE m.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "MotconsuFldrs.findByKrnModifyDate", query = "SELECT m FROM MotconsuFldrs m WHERE m.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "MotconsuFldrs.findByKrnModifyUserId", query = "SELECT m FROM MotconsuFldrs m WHERE m.krnModifyUserId = :krnModifyUserId")})
public class MotconsuFldrs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOTCONSU_FLDRS_ID")
    private Integer motconsuFldrsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PATIENTS_ID")
    private int patientsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOTCONSU_MAIN_ID")
    private int motconsuMainId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOTCONSU_FLDR_TYPES_ID")
    private int motconsuFldrTypesId;
    @Size(max = 60)
    @Column(name = "LABEL")
    private String label;
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

    public MotconsuFldrs() {
    }

    public MotconsuFldrs(Integer motconsuFldrsId) {
        this.motconsuFldrsId = motconsuFldrsId;
    }

    public MotconsuFldrs(Integer motconsuFldrsId, int patientsId, int motconsuMainId, int motconsuFldrTypesId) {
        this.motconsuFldrsId = motconsuFldrsId;
        this.patientsId = patientsId;
        this.motconsuMainId = motconsuMainId;
        this.motconsuFldrTypesId = motconsuFldrTypesId;
    }

    public Integer getMotconsuFldrsId() {
        return motconsuFldrsId;
    }

    public void setMotconsuFldrsId(Integer motconsuFldrsId) {
        this.motconsuFldrsId = motconsuFldrsId;
    }

    public int getPatientsId() {
        return patientsId;
    }

    public void setPatientsId(int patientsId) {
        this.patientsId = patientsId;
    }

    public int getMotconsuMainId() {
        return motconsuMainId;
    }

    public void setMotconsuMainId(int motconsuMainId) {
        this.motconsuMainId = motconsuMainId;
    }

    public int getMotconsuFldrTypesId() {
        return motconsuFldrTypesId;
    }

    public void setMotconsuFldrTypesId(int motconsuFldrTypesId) {
        this.motconsuFldrTypesId = motconsuFldrTypesId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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
        hash += (motconsuFldrsId != null ? motconsuFldrsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MotconsuFldrs)) {
            return false;
        }
        MotconsuFldrs other = (MotconsuFldrs) object;
        if ((this.motconsuFldrsId == null && other.motconsuFldrsId != null) || (this.motconsuFldrsId != null && !this.motconsuFldrsId.equals(other.motconsuFldrsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.MotconsuFldrs[ motconsuFldrsId=" + motconsuFldrsId + " ]";
    }
    
}
