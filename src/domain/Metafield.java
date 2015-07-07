/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Shah
 */
@Entity
@Table(name = "METAFIELD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Metafield.findAll", query = "SELECT m FROM Metafield m"),
    @NamedQuery(name = "Metafield.findByTableName", query = "SELECT m FROM Metafield m WHERE m.metafieldPK.tableName = :tableName"),
    @NamedQuery(name = "Metafield.findByFieldName", query = "SELECT m FROM Metafield m WHERE m.metafieldPK.fieldName = :fieldName"),
    @NamedQuery(name = "Metafield.findByRequired", query = "SELECT m FROM Metafield m WHERE m.required = :required"),
    @NamedQuery(name = "Metafield.findByVisible", query = "SELECT m FROM Metafield m WHERE m.visible = :visible"),
    @NamedQuery(name = "Metafield.findByMetatype", query = "SELECT m FROM Metafield m WHERE m.metatype = :metatype"),
    @NamedQuery(name = "Metafield.findByDatatype", query = "SELECT m FROM Metafield m WHERE m.datatype = :datatype"),
    @NamedQuery(name = "Metafield.findByFsize", query = "SELECT m FROM Metafield m WHERE m.fsize = :fsize"),
    @NamedQuery(name = "Metafield.findByFprec", query = "SELECT m FROM Metafield m WHERE m.fprec = :fprec"),
    @NamedQuery(name = "Metafield.findByOrd", query = "SELECT m FROM Metafield m WHERE m.ord = :ord"),
    @NamedQuery(name = "Metafield.findByOrigin", query = "SELECT m FROM Metafield m WHERE m.origin = :origin"),
    @NamedQuery(name = "Metafield.findByNativeName", query = "SELECT m FROM Metafield m WHERE m.nativeName = :nativeName")})
public class Metafield implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MetafieldPK metafieldPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REQUIRED")
    private boolean required;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VISIBLE")
    private boolean visible;
    @Size(max = 20)
    @Column(name = "METATYPE")
    private String metatype;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "CUSTOM")
    private String custom;
    @Column(name = "DATATYPE")
    private Integer datatype;
    @Column(name = "FSIZE")
    private Integer fsize;
    @Column(name = "FPREC")
    private Integer fprec;
    @Column(name = "ORD")
    private Integer ord;
    @Size(max = 30)
    @Column(name = "ORIGIN")
    private String origin;
    @Size(max = 30)
    @Column(name = "NATIVE_NAME")
    private String nativeName;

    public Metafield() {
    }

    public Metafield(MetafieldPK metafieldPK) {
        this.metafieldPK = metafieldPK;
    }

    public Metafield(MetafieldPK metafieldPK, boolean required, boolean visible) {
        this.metafieldPK = metafieldPK;
        this.required = required;
        this.visible = visible;
    }

    public Metafield(String tableName, String fieldName) {
        this.metafieldPK = new MetafieldPK(tableName, fieldName);
    }

    public MetafieldPK getMetafieldPK() {
        return metafieldPK;
    }

    public void setMetafieldPK(MetafieldPK metafieldPK) {
        this.metafieldPK = metafieldPK;
    }

    public boolean getRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public boolean getVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getMetatype() {
        return metatype;
    }

    public void setMetatype(String metatype) {
        this.metatype = metatype;
    }

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }

    public Integer getDatatype() {
        return datatype;
    }

    public void setDatatype(Integer datatype) {
        this.datatype = datatype;
    }

    public Integer getFsize() {
        return fsize;
    }

    public void setFsize(Integer fsize) {
        this.fsize = fsize;
    }

    public Integer getFprec() {
        return fprec;
    }

    public void setFprec(Integer fprec) {
        this.fprec = fprec;
    }

    public Integer getOrd() {
        return ord;
    }

    public void setOrd(Integer ord) {
        this.ord = ord;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (metafieldPK != null ? metafieldPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Metafield)) {
            return false;
        }
        Metafield other = (Metafield) object;
        if ((this.metafieldPK == null && other.metafieldPK != null) || (this.metafieldPK != null && !this.metafieldPK.equals(other.metafieldPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Metafield[ metafieldPK=" + metafieldPK + " ]";
    }
    
}
