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
@Table(name = "PL_AGEND")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlAgend.findAll", query = "SELECT p FROM PlAgend p"),
    @NamedQuery(name = "PlAgend.findByPlAgendId", query = "SELECT p FROM PlAgend p WHERE p.plAgendId = :plAgendId"),
    @NamedQuery(name = "PlAgend.findByName", query = "SELECT p FROM PlAgend p WHERE p.name = :name"),
    @NamedQuery(name = "PlAgend.findByOwnerType", query = "SELECT p FROM PlAgend p WHERE p.ownerType = :ownerType"),
    @NamedQuery(name = "PlAgend.findByDureeTranche", query = "SELECT p FROM PlAgend p WHERE p.dureeTranche = :dureeTranche"),
    @NamedQuery(name = "PlAgend.findByKrnCreateDate", query = "SELECT p FROM PlAgend p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "PlAgend.findByKrnCreateUserId", query = "SELECT p FROM PlAgend p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "PlAgend.findByKrnModifyDate", query = "SELECT p FROM PlAgend p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "PlAgend.findByKrnModifyUserId", query = "SELECT p FROM PlAgend p WHERE p.krnModifyUserId = :krnModifyUserId")})
public class PlAgend implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_AGEND_ID")
    private Integer plAgendId;
    @Size(max = 100)
    @Column(name = "NAME")
    private String name;
    @Column(name = "OWNER_TYPE")
    private Integer ownerType;
    @Column(name = "DUREE_TRANCHE")
    private Integer dureeTranche;
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

    public PlAgend() {
    }

    public PlAgend(Integer plAgendId) {
        this.plAgendId = plAgendId;
    }

    public Integer getPlAgendId() {
        return plAgendId;
    }

    public void setPlAgendId(Integer plAgendId) {
        this.plAgendId = plAgendId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(Integer ownerType) {
        this.ownerType = ownerType;
    }

    public Integer getDureeTranche() {
        return dureeTranche;
    }

    public void setDureeTranche(Integer dureeTranche) {
        this.dureeTranche = dureeTranche;
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
        hash += (plAgendId != null ? plAgendId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlAgend)) {
            return false;
        }
        PlAgend other = (PlAgend) object;
        if ((this.plAgendId == null && other.plAgendId != null) || (this.plAgendId != null && !this.plAgendId.equals(other.plAgendId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.PlAgend[ plAgendId=" + plAgendId + " ]";
    }
    
}
