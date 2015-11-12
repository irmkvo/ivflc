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
@Table(name = "PLANNING_USER_EXT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlanningUserExt.findAll", query = "SELECT p FROM PlanningUserExt p"),
    @NamedQuery(name = "PlanningUserExt.findByPlanningUserExtId", query = "SELECT p FROM PlanningUserExt p WHERE p.planningUserExtId = :planningUserExtId"),
    @NamedQuery(name = "PlanningUserExt.findByPlanningId", query = "SELECT p FROM PlanningUserExt p WHERE p.planningId = :planningId"),
    @NamedQuery(name = "PlanningUserExt.findByKrnCreateDate", query = "SELECT p FROM PlanningUserExt p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "PlanningUserExt.findByKrnCreateUserId", query = "SELECT p FROM PlanningUserExt p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "PlanningUserExt.findByKrnModifyDate", query = "SELECT p FROM PlanningUserExt p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "PlanningUserExt.findByKrnModifyUserId", query = "SELECT p FROM PlanningUserExt p WHERE p.krnModifyUserId = :krnModifyUserId")})
public class PlanningUserExt implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PLANNING_USER_EXT_ID")
    private Integer planningUserExtId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PLANNING_ID")
    private int planningId;
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

    public PlanningUserExt() {
    }

    public PlanningUserExt(Integer planningUserExtId) {
        this.planningUserExtId = planningUserExtId;
    }

    public PlanningUserExt(Integer planningUserExtId, int planningId) {
        this.planningUserExtId = planningUserExtId;
        this.planningId = planningId;
    }

    public Integer getPlanningUserExtId() {
        return planningUserExtId;
    }

    public void setPlanningUserExtId(Integer planningUserExtId) {
        this.planningUserExtId = planningUserExtId;
    }

    public int getPlanningId() {
        return planningId;
    }

    public void setPlanningId(int planningId) {
        this.planningId = planningId;
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
        hash += (planningUserExtId != null ? planningUserExtId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanningUserExt)) {
            return false;
        }
        PlanningUserExt other = (PlanningUserExt) object;
        if ((this.planningUserExtId == null && other.planningUserExtId != null) || (this.planningUserExtId != null && !this.planningUserExtId.equals(other.planningUserExtId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.PlanningUserExt[ planningUserExtId=" + planningUserExtId + " ]";
    }
    
}
