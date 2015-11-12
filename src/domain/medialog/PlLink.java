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
@Table(name = "PL_LINK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlLink.findAll", query = "SELECT p FROM PlLink p"),
    @NamedQuery(name = "PlLink.findByPlLinkId", query = "SELECT p FROM PlLink p WHERE p.plLinkId = :plLinkId"),
    @NamedQuery(name = "PlLink.findByPlExtId", query = "SELECT p FROM PlLink p WHERE p.plExtId = :plExtId"),
    @NamedQuery(name = "PlLink.findByPlanningId", query = "SELECT p FROM PlLink p WHERE p.planningId = :planningId"),
    @NamedQuery(name = "PlLink.findByPlRoleId", query = "SELECT p FROM PlLink p WHERE p.plRoleId = :plRoleId"),
    @NamedQuery(name = "PlLink.findByKrnCreateDate", query = "SELECT p FROM PlLink p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "PlLink.findByKrnCreateUserId", query = "SELECT p FROM PlLink p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "PlLink.findByKrnModifyDate", query = "SELECT p FROM PlLink p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "PlLink.findByKrnModifyUserId", query = "SELECT p FROM PlLink p WHERE p.krnModifyUserId = :krnModifyUserId")})
public class PlLink implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_LINK_ID")
    private Integer plLinkId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_EXT_ID")
    private int plExtId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PLANNING_ID")
    private int planningId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_ROLE_ID")
    private int plRoleId;
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

    public PlLink() {
    }

    public PlLink(Integer plLinkId) {
        this.plLinkId = plLinkId;
    }

    public PlLink(Integer plLinkId, int plExtId, int planningId, int plRoleId) {
        this.plLinkId = plLinkId;
        this.plExtId = plExtId;
        this.planningId = planningId;
        this.plRoleId = plRoleId;
    }

    public Integer getPlLinkId() {
        return plLinkId;
    }

    public void setPlLinkId(Integer plLinkId) {
        this.plLinkId = plLinkId;
    }

    public int getPlExtId() {
        return plExtId;
    }

    public void setPlExtId(int plExtId) {
        this.plExtId = plExtId;
    }

    public int getPlanningId() {
        return planningId;
    }

    public void setPlanningId(int planningId) {
        this.planningId = planningId;
    }

    public int getPlRoleId() {
        return plRoleId;
    }

    public void setPlRoleId(int plRoleId) {
        this.plRoleId = plRoleId;
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
        hash += (plLinkId != null ? plLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlLink)) {
            return false;
        }
        PlLink other = (PlLink) object;
        if ((this.plLinkId == null && other.plLinkId != null) || (this.plLinkId != null && !this.plLinkId.equals(other.plLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.PlLink[ plLinkId=" + plLinkId + " ]";
    }
    
}
