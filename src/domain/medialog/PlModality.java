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
@Table(name = "PL_MODALITY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlModality.findAll", query = "SELECT p FROM PlModality p"),
    @NamedQuery(name = "PlModality.findByPlModalityId", query = "SELECT p FROM PlModality p WHERE p.plModalityId = :plModalityId"),
    @NamedQuery(name = "PlModality.findByCode", query = "SELECT p FROM PlModality p WHERE p.code = :code"),
    @NamedQuery(name = "PlModality.findByDescr", query = "SELECT p FROM PlModality p WHERE p.descr = :descr"),
    @NamedQuery(name = "PlModality.findByKrnCreateDate", query = "SELECT p FROM PlModality p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "PlModality.findByKrnCreateUserId", query = "SELECT p FROM PlModality p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "PlModality.findByKrnModifyDate", query = "SELECT p FROM PlModality p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "PlModality.findByKrnModifyUserId", query = "SELECT p FROM PlModality p WHERE p.krnModifyUserId = :krnModifyUserId")})
public class PlModality implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_MODALITY_ID")
    private Integer plModalityId;
    @Size(max = 2)
    @Column(name = "CODE")
    private String code;
    @Size(max = 100)
    @Column(name = "DESCR")
    private String descr;
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

    public PlModality() {
    }

    public PlModality(Integer plModalityId) {
        this.plModalityId = plModalityId;
    }

    public Integer getPlModalityId() {
        return plModalityId;
    }

    public void setPlModalityId(Integer plModalityId) {
        this.plModalityId = plModalityId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
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
        hash += (plModalityId != null ? plModalityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlModality)) {
            return false;
        }
        PlModality other = (PlModality) object;
        if ((this.plModalityId == null && other.plModalityId != null) || (this.plModalityId != null && !this.plModalityId.equals(other.plModalityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.PlModality[ plModalityId=" + plModalityId + " ]";
    }
    
}
