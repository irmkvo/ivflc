/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.medialog;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
 * @author kvo
 */
@Entity
@Table(name = "PL_EXCL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlExcl.findAll", query = "SELECT p FROM PlExcl p"),
    @NamedQuery(name = "PlExcl.findByPlExclId", query = "SELECT p FROM PlExcl p WHERE p.plExclId = :plExclId"),
    @NamedQuery(name = "PlExcl.findByOwnerType", query = "SELECT p FROM PlExcl p WHERE p.ownerType = :ownerType"),
    @NamedQuery(name = "PlExcl.findByOwnerId", query = "SELECT p FROM PlExcl p WHERE p.ownerId = :ownerId"),
    @NamedQuery(name = "PlExcl.findByName", query = "SELECT p FROM PlExcl p WHERE p.name = :name"),
    @NamedQuery(name = "PlExcl.findByUseTime", query = "SELECT p FROM PlExcl p WHERE p.useTime = :useTime"),
    @NamedQuery(name = "PlExcl.findByFromDate", query = "SELECT p FROM PlExcl p WHERE p.fromDate = :fromDate"),
    @NamedQuery(name = "PlExcl.findByFromTime", query = "SELECT p FROM PlExcl p WHERE p.fromTime = :fromTime"),
    @NamedQuery(name = "PlExcl.findByToDate", query = "SELECT p FROM PlExcl p WHERE p.toDate = :toDate"),
    @NamedQuery(name = "PlExcl.findByToTime", query = "SELECT p FROM PlExcl p WHERE p.toTime = :toTime"),
    @NamedQuery(name = "PlExcl.findByPlLegId", query = "SELECT p FROM PlExcl p WHERE p.plLegId = :plLegId"),
    @NamedQuery(name = "PlExcl.findByCreateDateTime", query = "SELECT p FROM PlExcl p WHERE p.createDateTime = :createDateTime"),
    @NamedQuery(name = "PlExcl.findByModifyDateTime", query = "SELECT p FROM PlExcl p WHERE p.modifyDateTime = :modifyDateTime"),
    @NamedQuery(name = "PlExcl.findByMedecinsCreateId", query = "SELECT p FROM PlExcl p WHERE p.medecinsCreateId = :medecinsCreateId"),
    @NamedQuery(name = "PlExcl.findByMedecinsModifyId", query = "SELECT p FROM PlExcl p WHERE p.medecinsModifyId = :medecinsModifyId"),
    @NamedQuery(name = "PlExcl.findByKrnCreateDate", query = "SELECT p FROM PlExcl p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "PlExcl.findByKrnCreateUserId", query = "SELECT p FROM PlExcl p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "PlExcl.findByKrnModifyDate", query = "SELECT p FROM PlExcl p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "PlExcl.findByKrnModifyUserId", query = "SELECT p FROM PlExcl p WHERE p.krnModifyUserId = :krnModifyUserId")})
public class PlExcl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_EXCL_ID")
    private Integer plExclId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OWNER_TYPE")
    private int ownerType;
    @Column(name = "OWNER_ID")
    private Integer ownerId;
    @Size(max = 100)
    @Column(name = "NAME")
    private String name;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "EXCL_MEMO")
    private String exclMemo;
    @Column(name = "USE_TIME")
    private Boolean useTime;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "FROM_TIME")
    private Integer fromTime;
    @Column(name = "TO_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date toDate;
    @Column(name = "TO_TIME")
    private Integer toTime;
    @Column(name = "PL_LEG_ID")
    private Integer plLegId;
    @Column(name = "CREATE_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;
    @Column(name = "MODIFY_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDateTime;
    @Column(name = "MEDECINS_CREATE_ID")
    private Integer medecinsCreateId;
    @Column(name = "MEDECINS_MODIFY_ID")
    private Integer medecinsModifyId;
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

    public PlExcl() {
    }

    public PlExcl(Integer plExclId) {
        this.plExclId = plExclId;
    }

    public PlExcl(Integer plExclId, int ownerType) {
        this.plExclId = plExclId;
        this.ownerType = ownerType;
    }

    public Integer getPlExclId() {
        return plExclId;
    }

    public void setPlExclId(Integer plExclId) {
        this.plExclId = plExclId;
    }

    public int getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(int ownerType) {
        this.ownerType = ownerType;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExclMemo() {
        return exclMemo;
    }

    public void setExclMemo(String exclMemo) {
        this.exclMemo = exclMemo;
    }

    public Boolean getUseTime() {
        return useTime;
    }

    public void setUseTime(Boolean useTime) {
        this.useTime = useTime;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Integer getFromTime() {
        return fromTime;
    }

    public void setFromTime(Integer fromTime) {
        this.fromTime = fromTime;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Integer getToTime() {
        return toTime;
    }

    public void setToTime(Integer toTime) {
        this.toTime = toTime;
    }

    public Integer getPlLegId() {
        return plLegId;
    }

    public void setPlLegId(Integer plLegId) {
        this.plLegId = plLegId;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Date getModifyDateTime() {
        return modifyDateTime;
    }

    public void setModifyDateTime(Date modifyDateTime) {
        this.modifyDateTime = modifyDateTime;
    }

    public Integer getMedecinsCreateId() {
        return medecinsCreateId;
    }

    public void setMedecinsCreateId(Integer medecinsCreateId) {
        this.medecinsCreateId = medecinsCreateId;
    }

    public Integer getMedecinsModifyId() {
        return medecinsModifyId;
    }

    public void setMedecinsModifyId(Integer medecinsModifyId) {
        this.medecinsModifyId = medecinsModifyId;
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
        hash += (plExclId != null ? plExclId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlExcl)) {
            return false;
        }
        PlExcl other = (PlExcl) object;
        if ((this.plExclId == null && other.plExclId != null) || (this.plExclId != null && !this.plExclId.equals(other.plExclId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.PlExcl[ plExclId=" + plExclId + " ]";
    }
    
}
