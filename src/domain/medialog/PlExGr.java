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
@Table(name = "PL_EX_GR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlExGr.findAll", query = "SELECT p FROM PlExGr p"),
    @NamedQuery(name = "PlExGr.findByPlExGrId", query = "SELECT p FROM PlExGr p WHERE p.plExGrId = :plExGrId"),
    @NamedQuery(name = "PlExGr.findByCode", query = "SELECT p FROM PlExGr p WHERE p.code = :code"),
    @NamedQuery(name = "PlExGr.findByName", query = "SELECT p FROM PlExGr p WHERE p.name = :name"),
    @NamedQuery(name = "PlExGr.findByBase", query = "SELECT p FROM PlExGr p WHERE p.base = :base"),
    @NamedQuery(name = "PlExGr.findByChamp", query = "SELECT p FROM PlExGr p WHERE p.champ = :champ"),
    @NamedQuery(name = "PlExGr.findByExamgroupOrder", query = "SELECT p FROM PlExGr p WHERE p.examgroupOrder = :examgroupOrder"),
    @NamedQuery(name = "PlExGr.findByKrnCreateDate", query = "SELECT p FROM PlExGr p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "PlExGr.findByKrnCreateUserId", query = "SELECT p FROM PlExGr p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "PlExGr.findByKrnModifyDate", query = "SELECT p FROM PlExGr p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "PlExGr.findByKrnModifyUserId", query = "SELECT p FROM PlExGr p WHERE p.krnModifyUserId = :krnModifyUserId")})
public class PlExGr implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_EX_GR_ID")
    private Integer plExGrId;
    @Size(max = 20)
    @Column(name = "CODE")
    private String code;
    @Size(max = 150)
    @Column(name = "NAME")
    private String name;
    @Size(max = 30)
    @Column(name = "BASE")
    private String base;
    @Size(max = 150)
    @Column(name = "CHAMP")
    private String champ;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EXAMGROUP_ORDER")
    private int examgroupOrder;
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

    public PlExGr() {
    }

    public PlExGr(Integer plExGrId) {
        this.plExGrId = plExGrId;
    }

    public PlExGr(Integer plExGrId, int examgroupOrder) {
        this.plExGrId = plExGrId;
        this.examgroupOrder = examgroupOrder;
    }

    public Integer getPlExGrId() {
        return plExGrId;
    }

    public void setPlExGrId(Integer plExGrId) {
        this.plExGrId = plExGrId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getChamp() {
        return champ;
    }

    public void setChamp(String champ) {
        this.champ = champ;
    }

    public int getExamgroupOrder() {
        return examgroupOrder;
    }

    public void setExamgroupOrder(int examgroupOrder) {
        this.examgroupOrder = examgroupOrder;
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
        hash += (plExGrId != null ? plExGrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlExGr)) {
            return false;
        }
        PlExGr other = (PlExGr) object;
        if ((this.plExGrId == null && other.plExGrId != null) || (this.plExGrId != null && !this.plExGrId.equals(other.plExGrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.PlExGr[ plExGrId=" + plExGrId + " ]";
    }
    
}
