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
@Table(name = "PL_EXT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlExt.findAll", query = "SELECT p FROM PlExt p"),
    @NamedQuery(name = "PlExt.findByPlExtId", query = "SELECT p FROM PlExt p WHERE p.plExtId = :plExtId"),
    @NamedQuery(name = "PlExt.findByPlExamId", query = "SELECT p FROM PlExt p WHERE p.plExamId = :plExamId"),
    @NamedQuery(name = "PlExt.findByKrnCreateDate", query = "SELECT p FROM PlExt p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "PlExt.findByKrnCreateUserId", query = "SELECT p FROM PlExt p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "PlExt.findByKrnModifyDate", query = "SELECT p FROM PlExt p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "PlExt.findByKrnModifyUserId", query = "SELECT p FROM PlExt p WHERE p.krnModifyUserId = :krnModifyUserId")})
public class PlExt implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_EXT_ID")
    private Integer plExtId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_EXAM_ID")
    private int plExamId;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "DESCR")
    private String descr;
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

    public PlExt() {
    }

    public PlExt(Integer plExtId) {
        this.plExtId = plExtId;
    }

    public PlExt(Integer plExtId, int plExamId) {
        this.plExtId = plExtId;
        this.plExamId = plExamId;
    }

    public Integer getPlExtId() {
        return plExtId;
    }

    public void setPlExtId(Integer plExtId) {
        this.plExtId = plExtId;
    }

    public int getPlExamId() {
        return plExamId;
    }

    public void setPlExamId(int plExamId) {
        this.plExamId = plExamId;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
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
        hash += (plExtId != null ? plExtId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlExt)) {
            return false;
        }
        PlExt other = (PlExt) object;
        if ((this.plExtId == null && other.plExtId != null) || (this.plExtId != null && !this.plExtId.equals(other.plExtId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.PlExt[ plExtId=" + plExtId + " ]";
    }
    
}
