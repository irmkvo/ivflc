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
 * @author Shah
 */
@Entity
@Table(name = "META_MACRO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MetaMacro.findAll", query = "SELECT m FROM MetaMacro m"),
    @NamedQuery(name = "MetaMacro.findByMetaMacroId", query = "SELECT m FROM MetaMacro m WHERE m.metaMacroId = :metaMacroId"),
    @NamedQuery(name = "MetaMacro.findByCode", query = "SELECT m FROM MetaMacro m WHERE m.code = :code"),
    @NamedQuery(name = "MetaMacro.findByLib", query = "SELECT m FROM MetaMacro m WHERE m.lib = :lib"),
    @NamedQuery(name = "MetaMacro.findByKrnCreateDate", query = "SELECT m FROM MetaMacro m WHERE m.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "MetaMacro.findByKrnCreateUserId", query = "SELECT m FROM MetaMacro m WHERE m.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "MetaMacro.findByKrnModifyDate", query = "SELECT m FROM MetaMacro m WHERE m.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "MetaMacro.findByKrnModifyUserId", query = "SELECT m FROM MetaMacro m WHERE m.krnModifyUserId = :krnModifyUserId")})
public class MetaMacro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "META_MACRO_ID")
    private Integer metaMacroId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE")
    private String code;
    @Size(max = 50)
    @Column(name = "LIB")
    private String lib;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "MACRO")
    private String macro;
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

    public MetaMacro() {
    }

    public MetaMacro(Integer metaMacroId) {
        this.metaMacroId = metaMacroId;
    }

    public MetaMacro(Integer metaMacroId, String code) {
        this.metaMacroId = metaMacroId;
        this.code = code;
    }

    public Integer getMetaMacroId() {
        return metaMacroId;
    }

    public void setMetaMacroId(Integer metaMacroId) {
        this.metaMacroId = metaMacroId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

    public String getMacro() {
        return macro;
    }

    public void setMacro(String macro) {
        this.macro = macro;
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
        hash += (metaMacroId != null ? metaMacroId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MetaMacro)) {
            return false;
        }
        MetaMacro other = (MetaMacro) object;
        if ((this.metaMacroId == null && other.metaMacroId != null) || (this.metaMacroId != null && !this.metaMacroId.equals(other.metaMacroId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.MetaMacro[ metaMacroId=" + metaMacroId + " ]";
    }
    
}
