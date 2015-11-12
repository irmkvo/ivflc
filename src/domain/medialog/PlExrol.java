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
@Table(name = "PL_EXROL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlExrol.findAll", query = "SELECT p FROM PlExrol p"),
    @NamedQuery(name = "PlExrol.findByPlExrolId", query = "SELECT p FROM PlExrol p WHERE p.plExrolId = :plExrolId"),
    @NamedQuery(name = "PlExrol.findByPlRoleId", query = "SELECT p FROM PlExrol p WHERE p.plRoleId = :plRoleId"),
    @NamedQuery(name = "PlExrol.findByPlExamId", query = "SELECT p FROM PlExrol p WHERE p.plExamId = :plExamId"),
    @NamedQuery(name = "PlExrol.findByRoletype", query = "SELECT p FROM PlExrol p WHERE p.roletype = :roletype"),
    @NamedQuery(name = "PlExrol.findByKrnCreateDate", query = "SELECT p FROM PlExrol p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "PlExrol.findByKrnCreateUserId", query = "SELECT p FROM PlExrol p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "PlExrol.findByKrnModifyDate", query = "SELECT p FROM PlExrol p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "PlExrol.findByKrnModifyUserId", query = "SELECT p FROM PlExrol p WHERE p.krnModifyUserId = :krnModifyUserId")})
public class PlExrol implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_EXROL_ID")
    private Integer plExrolId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_ROLE_ID")
    private int plRoleId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_EXAM_ID")
    private int plExamId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ROLETYPE")
    private int roletype;
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

    public PlExrol() {
    }

    public PlExrol(Integer plExrolId) {
        this.plExrolId = plExrolId;
    }

    public PlExrol(Integer plExrolId, int plRoleId, int plExamId, int roletype) {
        this.plExrolId = plExrolId;
        this.plRoleId = plRoleId;
        this.plExamId = plExamId;
        this.roletype = roletype;
    }

    public Integer getPlExrolId() {
        return plExrolId;
    }

    public void setPlExrolId(Integer plExrolId) {
        this.plExrolId = plExrolId;
    }

    public int getPlRoleId() {
        return plRoleId;
    }

    public void setPlRoleId(int plRoleId) {
        this.plRoleId = plRoleId;
    }

    public int getPlExamId() {
        return plExamId;
    }

    public void setPlExamId(int plExamId) {
        this.plExamId = plExamId;
    }

    public int getRoletype() {
        return roletype;
    }

    public void setRoletype(int roletype) {
        this.roletype = roletype;
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
        hash += (plExrolId != null ? plExrolId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlExrol)) {
            return false;
        }
        PlExrol other = (PlExrol) object;
        if ((this.plExrolId == null && other.plExrolId != null) || (this.plExrolId != null && !this.plExrolId.equals(other.plExrolId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.PlExrol[ plExrolId=" + plExrolId + " ]";
    }
    
}
