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
@Table(name = "PL_INT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlInt.findAll", query = "SELECT p FROM PlInt p"),
    @NamedQuery(name = "PlInt.findByPlIntId", query = "SELECT p FROM PlInt p WHERE p.plIntId = :plIntId"),
    @NamedQuery(name = "PlInt.findByIntFrom", query = "SELECT p FROM PlInt p WHERE p.intFrom = :intFrom"),
    @NamedQuery(name = "PlInt.findByIntTo", query = "SELECT p FROM PlInt p WHERE p.intTo = :intTo"),
    @NamedQuery(name = "PlInt.findByPlLegId", query = "SELECT p FROM PlInt p WHERE p.plLegId = :plLegId"),
    @NamedQuery(name = "PlInt.findByPlDayId", query = "SELECT p FROM PlInt p WHERE p.plDayId = :plDayId"),
    @NamedQuery(name = "PlInt.findByKrnCreateDate", query = "SELECT p FROM PlInt p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "PlInt.findByKrnCreateUserId", query = "SELECT p FROM PlInt p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "PlInt.findByKrnModifyDate", query = "SELECT p FROM PlInt p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "PlInt.findByKrnModifyUserId", query = "SELECT p FROM PlInt p WHERE p.krnModifyUserId = :krnModifyUserId")})
public class PlInt implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_INT_ID")
    private Integer plIntId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "INT_FROM")
    private int intFrom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "INT_TO")
    private int intTo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_LEG_ID")
    private int plLegId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_DAY_ID")
    private int plDayId;
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

    public PlInt() {
    }

    public PlInt(Integer plIntId) {
        this.plIntId = plIntId;
    }

    public PlInt(Integer plIntId, int intFrom, int intTo, int plLegId, int plDayId) {
        this.plIntId = plIntId;
        this.intFrom = intFrom;
        this.intTo = intTo;
        this.plLegId = plLegId;
        this.plDayId = plDayId;
    }

    public Integer getPlIntId() {
        return plIntId;
    }

    public void setPlIntId(Integer plIntId) {
        this.plIntId = plIntId;
    }

    public int getIntFrom() {
        return intFrom;
    }

    public void setIntFrom(int intFrom) {
        this.intFrom = intFrom;
    }

    public int getIntTo() {
        return intTo;
    }

    public void setIntTo(int intTo) {
        this.intTo = intTo;
    }

    public int getPlLegId() {
        return plLegId;
    }

    public void setPlLegId(int plLegId) {
        this.plLegId = plLegId;
    }

    public int getPlDayId() {
        return plDayId;
    }

    public void setPlDayId(int plDayId) {
        this.plDayId = plDayId;
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
        hash += (plIntId != null ? plIntId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlInt)) {
            return false;
        }
        PlInt other = (PlInt) object;
        if ((this.plIntId == null && other.plIntId != null) || (this.plIntId != null && !this.plIntId.equals(other.plIntId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.PlInt[ plIntId=" + plIntId + " ]";
    }
    
}
