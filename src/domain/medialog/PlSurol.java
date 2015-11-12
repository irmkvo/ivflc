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
@Table(name = "PL_SUROL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlSurol.findAll", query = "SELECT p FROM PlSurol p"),
    @NamedQuery(name = "PlSurol.findByPlSurolId", query = "SELECT p FROM PlSurol p WHERE p.plSurolId = :plSurolId"),
    @NamedQuery(name = "PlSurol.findByPlRoleId", query = "SELECT p FROM PlSurol p WHERE p.plRoleId = :plRoleId"),
    @NamedQuery(name = "PlSurol.findByPlSubjId", query = "SELECT p FROM PlSurol p WHERE p.plSubjId = :plSubjId"),
    @NamedQuery(name = "PlSurol.findByKrnCreateDate", query = "SELECT p FROM PlSurol p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "PlSurol.findByKrnCreateUserId", query = "SELECT p FROM PlSurol p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "PlSurol.findByKrnModifyDate", query = "SELECT p FROM PlSurol p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "PlSurol.findByKrnModifyUserId", query = "SELECT p FROM PlSurol p WHERE p.krnModifyUserId = :krnModifyUserId")})
public class PlSurol implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_SUROL_ID")
    private Integer plSurolId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_ROLE_ID")
    private int plRoleId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_SUBJ_ID")
    private int plSubjId;
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

    public PlSurol() {
    }

    public PlSurol(Integer plSurolId) {
        this.plSurolId = plSurolId;
    }

    public PlSurol(Integer plSurolId, int plRoleId, int plSubjId) {
        this.plSurolId = plSurolId;
        this.plRoleId = plRoleId;
        this.plSubjId = plSubjId;
    }

    public Integer getPlSurolId() {
        return plSurolId;
    }

    public void setPlSurolId(Integer plSurolId) {
        this.plSurolId = plSurolId;
    }

    public int getPlRoleId() {
        return plRoleId;
    }

    public void setPlRoleId(int plRoleId) {
        this.plRoleId = plRoleId;
    }

    public int getPlSubjId() {
        return plSubjId;
    }

    public void setPlSubjId(int plSubjId) {
        this.plSubjId = plSubjId;
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
        hash += (plSurolId != null ? plSurolId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlSurol)) {
            return false;
        }
        PlSurol other = (PlSurol) object;
        if ((this.plSurolId == null && other.plSurolId != null) || (this.plSurolId != null && !this.plSurolId.equals(other.plSurolId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.PlSurol[ plSurolId=" + plSurolId + " ]";
    }
    
}
