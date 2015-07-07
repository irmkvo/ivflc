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
@Table(name = "MOTCONSU_FLDR_TYPES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MotconsuFldrTypes.findAll", query = "SELECT m FROM MotconsuFldrTypes m"),
    @NamedQuery(name = "MotconsuFldrTypes.findByMotconsuFldrTypesId", query = "SELECT m FROM MotconsuFldrTypes m WHERE m.motconsuFldrTypesId = :motconsuFldrTypesId"),
    @NamedQuery(name = "MotconsuFldrTypes.findByLabel", query = "SELECT m FROM MotconsuFldrTypes m WHERE m.label = :label"),
    @NamedQuery(name = "MotconsuFldrTypes.findByArchive", query = "SELECT m FROM MotconsuFldrTypes m WHERE m.archive = :archive"),
    @NamedQuery(name = "MotconsuFldrTypes.findByKrnCreateDate", query = "SELECT m FROM MotconsuFldrTypes m WHERE m.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "MotconsuFldrTypes.findByKrnCreateUserId", query = "SELECT m FROM MotconsuFldrTypes m WHERE m.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "MotconsuFldrTypes.findByKrnModifyDate", query = "SELECT m FROM MotconsuFldrTypes m WHERE m.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "MotconsuFldrTypes.findByKrnModifyUserId", query = "SELECT m FROM MotconsuFldrTypes m WHERE m.krnModifyUserId = :krnModifyUserId")})
public class MotconsuFldrTypes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOTCONSU_FLDR_TYPES_ID")
    private Integer motconsuFldrTypesId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "LABEL")
    private String label;
    @Column(name = "ARCHIVE")
    private Boolean archive;
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

    public MotconsuFldrTypes() {
    }

    public MotconsuFldrTypes(Integer motconsuFldrTypesId) {
        this.motconsuFldrTypesId = motconsuFldrTypesId;
    }

    public MotconsuFldrTypes(Integer motconsuFldrTypesId, String label) {
        this.motconsuFldrTypesId = motconsuFldrTypesId;
        this.label = label;
    }

    public Integer getMotconsuFldrTypesId() {
        return motconsuFldrTypesId;
    }

    public void setMotconsuFldrTypesId(Integer motconsuFldrTypesId) {
        this.motconsuFldrTypesId = motconsuFldrTypesId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
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
        hash += (motconsuFldrTypesId != null ? motconsuFldrTypesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MotconsuFldrTypes)) {
            return false;
        }
        MotconsuFldrTypes other = (MotconsuFldrTypes) object;
        if ((this.motconsuFldrTypesId == null && other.motconsuFldrTypesId != null) || (this.motconsuFldrTypesId != null && !this.motconsuFldrTypesId.equals(other.motconsuFldrTypesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.MotconsuFldrTypes[ motconsuFldrTypesId=" + motconsuFldrTypesId + " ]";
    }
    
}
