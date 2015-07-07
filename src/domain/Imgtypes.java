/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

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
 * @author Shah
 */
@Entity
@Table(name = "IMGTYPES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Imgtypes.findAll", query = "SELECT i FROM Imgtypes i"),
    @NamedQuery(name = "Imgtypes.findByImgtypesID", query = "SELECT i FROM Imgtypes i WHERE i.imgtypesID = :imgtypesID"),
    @NamedQuery(name = "Imgtypes.findByName", query = "SELECT i FROM Imgtypes i WHERE i.name = :name"),
    @NamedQuery(name = "Imgtypes.findByType", query = "SELECT i FROM Imgtypes i WHERE i.type = :type"),
    @NamedQuery(name = "Imgtypes.findByQuality", query = "SELECT i FROM Imgtypes i WHERE i.quality = :quality"),
    @NamedQuery(name = "Imgtypes.findByKrnCreateDate", query = "SELECT i FROM Imgtypes i WHERE i.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Imgtypes.findByKrnCreateUserId", query = "SELECT i FROM Imgtypes i WHERE i.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Imgtypes.findByKrnModifyDate", query = "SELECT i FROM Imgtypes i WHERE i.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Imgtypes.findByKrnModifyUserId", query = "SELECT i FROM Imgtypes i WHERE i.krnModifyUserId = :krnModifyUserId")})
public class Imgtypes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Imgtypes_ID")
    private Integer imgtypesID;
    @Size(max = 30)
    @Column(name = "Name")
    private String name;
    @Column(name = "Type")
    private Integer type;
    @Column(name = "Quality")
    private Integer quality;
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

    public Imgtypes() {
    }

    public Imgtypes(Integer imgtypesID) {
        this.imgtypesID = imgtypesID;
    }

    public Integer getImgtypesID() {
        return imgtypesID;
    }

    public void setImgtypesID(Integer imgtypesID) {
        this.imgtypesID = imgtypesID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
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
        hash += (imgtypesID != null ? imgtypesID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Imgtypes)) {
            return false;
        }
        Imgtypes other = (Imgtypes) object;
        if ((this.imgtypesID == null && other.imgtypesID != null) || (this.imgtypesID != null && !this.imgtypesID.equals(other.imgtypesID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Imgtypes[ imgtypesID=" + imgtypesID + " ]";
    }
    
}
