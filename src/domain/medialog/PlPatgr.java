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
@Table(name = "PL_PATGR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlPatgr.findAll", query = "SELECT p FROM PlPatgr p"),
    @NamedQuery(name = "PlPatgr.findByPlPatgrId", query = "SELECT p FROM PlPatgr p WHERE p.plPatgrId = :plPatgrId"),
    @NamedQuery(name = "PlPatgr.findByName", query = "SELECT p FROM PlPatgr p WHERE p.name = :name"),
    @NamedQuery(name = "PlPatgr.findByUsePlan", query = "SELECT p FROM PlPatgr p WHERE p.usePlan = :usePlan"),
    @NamedQuery(name = "PlPatgr.findByPlAgendId", query = "SELECT p FROM PlPatgr p WHERE p.plAgendId = :plAgendId"),
    @NamedQuery(name = "PlPatgr.findByArchive", query = "SELECT p FROM PlPatgr p WHERE p.archive = :archive"),
    @NamedQuery(name = "PlPatgr.findByKrnCreateDate", query = "SELECT p FROM PlPatgr p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "PlPatgr.findByKrnCreateUserId", query = "SELECT p FROM PlPatgr p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "PlPatgr.findByKrnModifyDate", query = "SELECT p FROM PlPatgr p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "PlPatgr.findByKrnModifyUserId", query = "SELECT p FROM PlPatgr p WHERE p.krnModifyUserId = :krnModifyUserId")})
public class PlPatgr implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_PATGR_ID")
    private Integer plPatgrId;
    @Size(max = 100)
    @Column(name = "NAME")
    private String name;
    @Size(max = 1)
    @Column(name = "USE_PLAN")
    private String usePlan;
    @Column(name = "PL_AGEND_ID")
    private Integer plAgendId;
    @Column(name = "ARCHIVE")
    private Boolean archive;
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

    public PlPatgr() {
    }

    public PlPatgr(Integer plPatgrId) {
        this.plPatgrId = plPatgrId;
    }

    public Integer getPlPatgrId() {
        return plPatgrId;
    }

    public void setPlPatgrId(Integer plPatgrId) {
        this.plPatgrId = plPatgrId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsePlan() {
        return usePlan;
    }

    public void setUsePlan(String usePlan) {
        this.usePlan = usePlan;
    }

    public Integer getPlAgendId() {
        return plAgendId;
    }

    public void setPlAgendId(Integer plAgendId) {
        this.plAgendId = plAgendId;
    }

    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
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
        hash += (plPatgrId != null ? plPatgrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlPatgr)) {
            return false;
        }
        PlPatgr other = (PlPatgr) object;
        if ((this.plPatgrId == null && other.plPatgrId != null) || (this.plPatgrId != null && !this.plPatgrId.equals(other.plPatgrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.PlPatgr[ plPatgrId=" + plPatgrId + " ]";
    }
    
}
