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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kvo
 */
@Entity
@Table(name = "PL_EXAM_ORG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlExamOrg.findAll", query = "SELECT p FROM PlExamOrg p"),
    @NamedQuery(name = "PlExamOrg.findByPlExamOrgId", query = "SELECT p FROM PlExamOrg p WHERE p.plExamOrgId = :plExamOrgId"),
    @NamedQuery(name = "PlExamOrg.findByPlExamId", query = "SELECT p FROM PlExamOrg p WHERE p.plExamId = :plExamId"),
    @NamedQuery(name = "PlExamOrg.findByFmIntorgId", query = "SELECT p FROM PlExamOrg p WHERE p.fmIntorgId = :fmIntorgId"),
    @NamedQuery(name = "PlExamOrg.findByFmExtorgId", query = "SELECT p FROM PlExamOrg p WHERE p.fmExtorgId = :fmExtorgId"),
    @NamedQuery(name = "PlExamOrg.findByKrnCreateDate", query = "SELECT p FROM PlExamOrg p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "PlExamOrg.findByKrnCreateUserId", query = "SELECT p FROM PlExamOrg p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "PlExamOrg.findByKrnModifyDate", query = "SELECT p FROM PlExamOrg p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "PlExamOrg.findByKrnModifyUserId", query = "SELECT p FROM PlExamOrg p WHERE p.krnModifyUserId = :krnModifyUserId")})
public class PlExamOrg implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_EXAM_ORG_ID")
    private Integer plExamOrgId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_EXAM_ID")
    private int plExamId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FM_INTORG_ID")
    private int fmIntorgId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FM_EXTORG_ID")
    private int fmExtorgId;
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

    public PlExamOrg() {
    }

    public PlExamOrg(Integer plExamOrgId) {
        this.plExamOrgId = plExamOrgId;
    }

    public PlExamOrg(Integer plExamOrgId, int plExamId, int fmIntorgId, int fmExtorgId) {
        this.plExamOrgId = plExamOrgId;
        this.plExamId = plExamId;
        this.fmIntorgId = fmIntorgId;
        this.fmExtorgId = fmExtorgId;
    }

    public Integer getPlExamOrgId() {
        return plExamOrgId;
    }

    public void setPlExamOrgId(Integer plExamOrgId) {
        this.plExamOrgId = plExamOrgId;
    }

    public int getPlExamId() {
        return plExamId;
    }

    public void setPlExamId(int plExamId) {
        this.plExamId = plExamId;
    }

    public int getFmIntorgId() {
        return fmIntorgId;
    }

    public void setFmIntorgId(int fmIntorgId) {
        this.fmIntorgId = fmIntorgId;
    }

    public int getFmExtorgId() {
        return fmExtorgId;
    }

    public void setFmExtorgId(int fmExtorgId) {
        this.fmExtorgId = fmExtorgId;
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
        hash += (plExamOrgId != null ? plExamOrgId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlExamOrg)) {
            return false;
        }
        PlExamOrg other = (PlExamOrg) object;
        if ((this.plExamOrgId == null && other.plExamOrgId != null) || (this.plExamOrgId != null && !this.plExamOrgId.equals(other.plExamOrgId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.PlExamOrg[ plExamOrgId=" + plExamOrgId + " ]";
    }
    
}
