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
@Table(name = "PL_SALLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlSalle.findAll", query = "SELECT p FROM PlSalle p"),
    @NamedQuery(name = "PlSalle.findByPlSalleId", query = "SELECT p FROM PlSalle p WHERE p.plSalleId = :plSalleId"),
    @NamedQuery(name = "PlSalle.findByNom", query = "SELECT p FROM PlSalle p WHERE p.nom = :nom"),
    @NamedQuery(name = "PlSalle.findByCapacite", query = "SELECT p FROM PlSalle p WHERE p.capacite = :capacite"),
    @NamedQuery(name = "PlSalle.findByKrnCreateDate", query = "SELECT p FROM PlSalle p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "PlSalle.findByKrnCreateUserId", query = "SELECT p FROM PlSalle p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "PlSalle.findByKrnModifyDate", query = "SELECT p FROM PlSalle p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "PlSalle.findByKrnModifyUserId", query = "SELECT p FROM PlSalle p WHERE p.krnModifyUserId = :krnModifyUserId")})
public class PlSalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_SALLE_ID")
    private Integer plSalleId;
    @Size(max = 100)
    @Column(name = "NOM")
    private String nom;
    @Column(name = "CAPACITE")
    private Integer capacite;
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

    public PlSalle() {
    }

    public PlSalle(Integer plSalleId) {
        this.plSalleId = plSalleId;
    }

    public Integer getPlSalleId() {
        return plSalleId;
    }

    public void setPlSalleId(Integer plSalleId) {
        this.plSalleId = plSalleId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getCapacite() {
        return capacite;
    }

    public void setCapacite(Integer capacite) {
        this.capacite = capacite;
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
        hash += (plSalleId != null ? plSalleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlSalle)) {
            return false;
        }
        PlSalle other = (PlSalle) object;
        if ((this.plSalleId == null && other.plSalleId != null) || (this.plSalleId != null && !this.plSalleId.equals(other.plSalleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.PlSalle[ plSalleId=" + plSalleId + " ]";
    }
    
}
