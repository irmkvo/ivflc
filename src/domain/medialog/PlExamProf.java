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
@Table(name = "PL_EXAM_PROF")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlExamProf.findAll", query = "SELECT p FROM PlExamProf p"),
    @NamedQuery(name = "PlExamProf.findByPlExamProfId", query = "SELECT p FROM PlExamProf p WHERE p.plExamProfId = :plExamProfId"),
    @NamedQuery(name = "PlExamProf.findByPlExamId", query = "SELECT p FROM PlExamProf p WHERE p.plExamId = :plExamId"),
    @NamedQuery(name = "PlExamProf.findByCode", query = "SELECT p FROM PlExamProf p WHERE p.code = :code"),
    @NamedQuery(name = "PlExamProf.findByLabel", query = "SELECT p FROM PlExamProf p WHERE p.label = :label"),
    @NamedQuery(name = "PlExamProf.findByExtSysId", query = "SELECT p FROM PlExamProf p WHERE p.extSysId = :extSysId"),
    @NamedQuery(name = "PlExamProf.findByKrnCreateDate", query = "SELECT p FROM PlExamProf p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "PlExamProf.findByKrnCreateUserId", query = "SELECT p FROM PlExamProf p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "PlExamProf.findByKrnModifyDate", query = "SELECT p FROM PlExamProf p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "PlExamProf.findByKrnModifyUserId", query = "SELECT p FROM PlExamProf p WHERE p.krnModifyUserId = :krnModifyUserId")})
public class PlExamProf implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_EXAM_PROF_ID")
    private Integer plExamProfId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_EXAM_ID")
    private int plExamId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODE")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LABEL")
    private String label;
    @Column(name = "EXT_SYS_ID")
    private Integer extSysId;
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

    public PlExamProf() {
    }

    public PlExamProf(Integer plExamProfId) {
        this.plExamProfId = plExamProfId;
    }

    public PlExamProf(Integer plExamProfId, int plExamId, String code, String label) {
        this.plExamProfId = plExamProfId;
        this.plExamId = plExamId;
        this.code = code;
        this.label = label;
    }

    public Integer getPlExamProfId() {
        return plExamProfId;
    }

    public void setPlExamProfId(Integer plExamProfId) {
        this.plExamProfId = plExamProfId;
    }

    public int getPlExamId() {
        return plExamId;
    }

    public void setPlExamId(int plExamId) {
        this.plExamId = plExamId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getExtSysId() {
        return extSysId;
    }

    public void setExtSysId(Integer extSysId) {
        this.extSysId = extSysId;
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
        hash += (plExamProfId != null ? plExamProfId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlExamProf)) {
            return false;
        }
        PlExamProf other = (PlExamProf) object;
        if ((this.plExamProfId == null && other.plExamProfId != null) || (this.plExamProfId != null && !this.plExamProfId.equals(other.plExamProfId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.PlExamProf[ plExamProfId=" + plExamProfId + " ]";
    }
    
}
