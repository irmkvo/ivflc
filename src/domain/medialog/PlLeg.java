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
@Table(name = "PL_LEG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlLeg.findAll", query = "SELECT p FROM PlLeg p"),
    @NamedQuery(name = "PlLeg.findByPlLegId", query = "SELECT p FROM PlLeg p WHERE p.plLegId = :plLegId"),
    @NamedQuery(name = "PlLeg.findByName", query = "SELECT p FROM PlLeg p WHERE p.name = :name"),
    @NamedQuery(name = "PlLeg.findByColor", query = "SELECT p FROM PlLeg p WHERE p.color = :color"),
    @NamedQuery(name = "PlLeg.findByFont", query = "SELECT p FROM PlLeg p WHERE p.font = :font"),
    @NamedQuery(name = "PlLeg.findByDuree", query = "SELECT p FROM PlLeg p WHERE p.duree = :duree"),
    @NamedQuery(name = "PlLeg.findByDefTime", query = "SELECT p FROM PlLeg p WHERE p.defTime = :defTime"),
    @NamedQuery(name = "PlLeg.findByOwnerType", query = "SELECT p FROM PlLeg p WHERE p.ownerType = :ownerType"),
    @NamedQuery(name = "PlLeg.findByCapacite", query = "SELECT p FROM PlLeg p WHERE p.capacite = :capacite"),
    @NamedQuery(name = "PlLeg.findByKrnCreateDate", query = "SELECT p FROM PlLeg p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "PlLeg.findByKrnCreateUserId", query = "SELECT p FROM PlLeg p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "PlLeg.findByKrnModifyDate", query = "SELECT p FROM PlLeg p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "PlLeg.findByKrnModifyUserId", query = "SELECT p FROM PlLeg p WHERE p.krnModifyUserId = :krnModifyUserId"),
    @NamedQuery(name = "PlLeg.findByIsTransparent", query = "SELECT p FROM PlLeg p WHERE p.isTransparent = :isTransparent")})
public class PlLeg implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_LEG_ID")
    private Integer plLegId;
    @Size(max = 100)
    @Column(name = "NAME")
    private String name;
    @Column(name = "COLOR")
    private Integer color;
    @Column(name = "FONT")
    private Integer font;
    @Column(name = "DUREE")
    private Integer duree;
    @Column(name = "DEF_TIME")
    private Integer defTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OWNER_TYPE")
    private int ownerType;
    @Column(name = "CAPACITE")
    private Integer capacite;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "PARAMS")
    private String params;
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
    @Column(name = "IS_TRANSPARENT")
    private Boolean isTransparent;

    public PlLeg() {
    }

    public PlLeg(Integer plLegId) {
        this.plLegId = plLegId;
    }

    public PlLeg(Integer plLegId, int ownerType) {
        this.plLegId = plLegId;
        this.ownerType = ownerType;
    }

    public Integer getPlLegId() {
        return plLegId;
    }

    public void setPlLegId(Integer plLegId) {
        this.plLegId = plLegId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public Integer getFont() {
        return font;
    }

    public void setFont(Integer font) {
        this.font = font;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public Integer getDefTime() {
        return defTime;
    }

    public void setDefTime(Integer defTime) {
        this.defTime = defTime;
    }

    public int getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(int ownerType) {
        this.ownerType = ownerType;
    }

    public Integer getCapacite() {
        return capacite;
    }

    public void setCapacite(Integer capacite) {
        this.capacite = capacite;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
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

    public Boolean getIsTransparent() {
        return isTransparent;
    }

    public void setIsTransparent(Boolean isTransparent) {
        this.isTransparent = isTransparent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (plLegId != null ? plLegId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlLeg)) {
            return false;
        }
        PlLeg other = (PlLeg) object;
        if ((this.plLegId == null && other.plLegId != null) || (this.plLegId != null && !this.plLegId.equals(other.plLegId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.PlLeg[ plLegId=" + plLegId + " ]";
    }
    
}
