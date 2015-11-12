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
@Table(name = "PL_GENER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlGener.findAll", query = "SELECT p FROM PlGener p"),
    @NamedQuery(name = "PlGener.findByPlGenerId", query = "SELECT p FROM PlGener p WHERE p.plGenerId = :plGenerId"),
    @NamedQuery(name = "PlGener.findByGenerDate", query = "SELECT p FROM PlGener p WHERE p.generDate = :generDate"),
    @NamedQuery(name = "PlGener.findByKrnCreateDate", query = "SELECT p FROM PlGener p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "PlGener.findByKrnCreateUserId", query = "SELECT p FROM PlGener p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "PlGener.findByKrnModifyDate", query = "SELECT p FROM PlGener p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "PlGener.findByKrnModifyUserId", query = "SELECT p FROM PlGener p WHERE p.krnModifyUserId = :krnModifyUserId")})
public class PlGener implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_GENER_ID")
    private Integer plGenerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GENER_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date generDate;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "BLACK")
    private String black;
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

    public PlGener() {
    }

    public PlGener(Integer plGenerId) {
        this.plGenerId = plGenerId;
    }

    public PlGener(Integer plGenerId, Date generDate) {
        this.plGenerId = plGenerId;
        this.generDate = generDate;
    }

    public Integer getPlGenerId() {
        return plGenerId;
    }

    public void setPlGenerId(Integer plGenerId) {
        this.plGenerId = plGenerId;
    }

    public Date getGenerDate() {
        return generDate;
    }

    public void setGenerDate(Date generDate) {
        this.generDate = generDate;
    }

    public String getBlack() {
        return black;
    }

    public void setBlack(String black) {
        this.black = black;
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
        hash += (plGenerId != null ? plGenerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlGener)) {
            return false;
        }
        PlGener other = (PlGener) object;
        if ((this.plGenerId == null && other.plGenerId != null) || (this.plGenerId != null && !this.plGenerId.equals(other.plGenerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.PlGener[ plGenerId=" + plGenerId + " ]";
    }
    
}
