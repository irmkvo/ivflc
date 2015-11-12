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
@Table(name = "PL_ROLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlRole.findAll", query = "SELECT p FROM PlRole p"),
    @NamedQuery(name = "PlRole.findByPlRoleId", query = "SELECT p FROM PlRole p WHERE p.plRoleId = :plRoleId"),
    @NamedQuery(name = "PlRole.findByName", query = "SELECT p FROM PlRole p WHERE p.name = :name"),
    @NamedQuery(name = "PlRole.findByKrnCreateDate", query = "SELECT p FROM PlRole p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "PlRole.findByKrnCreateUserId", query = "SELECT p FROM PlRole p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "PlRole.findByKrnModifyDate", query = "SELECT p FROM PlRole p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "PlRole.findByKrnModifyUserId", query = "SELECT p FROM PlRole p WHERE p.krnModifyUserId = :krnModifyUserId")})
public class PlRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_ROLE_ID")
    private Integer plRoleId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "NAME")
    private String name;
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

    public PlRole() {
    }

    public PlRole(Integer plRoleId) {
        this.plRoleId = plRoleId;
    }

    public PlRole(Integer plRoleId, String name) {
        this.plRoleId = plRoleId;
        this.name = name;
    }

    public Integer getPlRoleId() {
        return plRoleId;
    }

    public void setPlRoleId(Integer plRoleId) {
        this.plRoleId = plRoleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        hash += (plRoleId != null ? plRoleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlRole)) {
            return false;
        }
        PlRole other = (PlRole) object;
        if ((this.plRoleId == null && other.plRoleId != null) || (this.plRoleId != null && !this.plRoleId.equals(other.plRoleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.PlRole[ plRoleId=" + plRoleId + " ]";
    }
    
}
