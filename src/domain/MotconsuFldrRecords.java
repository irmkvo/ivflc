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
@Table(name = "MOTCONSU_FLDR_RECORDS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MotconsuFldrRecords.findAll", query = "SELECT m FROM MotconsuFldrRecords m"),
    @NamedQuery(name = "MotconsuFldrRecords.findByMotconsuFldrRecordsId", query = "SELECT m FROM MotconsuFldrRecords m WHERE m.motconsuFldrRecordsId = :motconsuFldrRecordsId"),
    @NamedQuery(name = "MotconsuFldrRecords.findByPatientsId", query = "SELECT m FROM MotconsuFldrRecords m WHERE m.patientsId = :patientsId"),
    @NamedQuery(name = "MotconsuFldrRecords.findByMotconsuFldrsId", query = "SELECT m FROM MotconsuFldrRecords m WHERE m.motconsuFldrsId = :motconsuFldrsId"),
    @NamedQuery(name = "MotconsuFldrRecords.findByMotconsuLinkId", query = "SELECT m FROM MotconsuFldrRecords m WHERE m.motconsuLinkId = :motconsuLinkId"),
    @NamedQuery(name = "MotconsuFldrRecords.findByOrdindex", query = "SELECT m FROM MotconsuFldrRecords m WHERE m.ordindex = :ordindex"),
    @NamedQuery(name = "MotconsuFldrRecords.findByKrnCreateDate", query = "SELECT m FROM MotconsuFldrRecords m WHERE m.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "MotconsuFldrRecords.findByKrnCreateUserId", query = "SELECT m FROM MotconsuFldrRecords m WHERE m.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "MotconsuFldrRecords.findByKrnModifyDate", query = "SELECT m FROM MotconsuFldrRecords m WHERE m.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "MotconsuFldrRecords.findByKrnModifyUserId", query = "SELECT m FROM MotconsuFldrRecords m WHERE m.krnModifyUserId = :krnModifyUserId")})
public class MotconsuFldrRecords implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOTCONSU_FLDR_RECORDS_ID")
    private Integer motconsuFldrRecordsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PATIENTS_ID")
    private int patientsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOTCONSU_FLDRS_ID")
    private int motconsuFldrsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOTCONSU_LINK_ID")
    private int motconsuLinkId;
    @Column(name = "ORDINDEX")
    private Integer ordindex;
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

    public MotconsuFldrRecords() {
    }

    public MotconsuFldrRecords(Integer motconsuFldrRecordsId) {
        this.motconsuFldrRecordsId = motconsuFldrRecordsId;
    }

    public MotconsuFldrRecords(Integer motconsuFldrRecordsId, int patientsId, int motconsuFldrsId, int motconsuLinkId) {
        this.motconsuFldrRecordsId = motconsuFldrRecordsId;
        this.patientsId = patientsId;
        this.motconsuFldrsId = motconsuFldrsId;
        this.motconsuLinkId = motconsuLinkId;
    }

    public Integer getMotconsuFldrRecordsId() {
        return motconsuFldrRecordsId;
    }

    public void setMotconsuFldrRecordsId(Integer motconsuFldrRecordsId) {
        this.motconsuFldrRecordsId = motconsuFldrRecordsId;
    }

    public int getPatientsId() {
        return patientsId;
    }

    public void setPatientsId(int patientsId) {
        this.patientsId = patientsId;
    }

    public int getMotconsuFldrsId() {
        return motconsuFldrsId;
    }

    public void setMotconsuFldrsId(int motconsuFldrsId) {
        this.motconsuFldrsId = motconsuFldrsId;
    }

    public int getMotconsuLinkId() {
        return motconsuLinkId;
    }

    public void setMotconsuLinkId(int motconsuLinkId) {
        this.motconsuLinkId = motconsuLinkId;
    }

    public Integer getOrdindex() {
        return ordindex;
    }

    public void setOrdindex(Integer ordindex) {
        this.ordindex = ordindex;
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
        hash += (motconsuFldrRecordsId != null ? motconsuFldrRecordsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MotconsuFldrRecords)) {
            return false;
        }
        MotconsuFldrRecords other = (MotconsuFldrRecords) object;
        if ((this.motconsuFldrRecordsId == null && other.motconsuFldrRecordsId != null) || (this.motconsuFldrRecordsId != null && !this.motconsuFldrRecordsId.equals(other.motconsuFldrRecordsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.MotconsuFldrRecords[ motconsuFldrRecordsId=" + motconsuFldrRecordsId + " ]";
    }
    
}
