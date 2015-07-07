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
@Table(name = "MOTCONSU_EVENT_TYPES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MotconsuEventTypes.findAll", query = "SELECT m FROM MotconsuEventTypes m"),
    @NamedQuery(name = "MotconsuEventTypes.findByMotconsuEventTypesId", query = "SELECT m FROM MotconsuEventTypes m WHERE m.motconsuEventTypesId = :motconsuEventTypesId"),
    @NamedQuery(name = "MotconsuEventTypes.findByCode", query = "SELECT m FROM MotconsuEventTypes m WHERE m.code = :code"),
    @NamedQuery(name = "MotconsuEventTypes.findByLabel", query = "SELECT m FROM MotconsuEventTypes m WHERE m.label = :label"),
    @NamedQuery(name = "MotconsuEventTypes.findByIsHospitalization", query = "SELECT m FROM MotconsuEventTypes m WHERE m.isHospitalization = :isHospitalization"),
    @NamedQuery(name = "MotconsuEventTypes.findByKrnCreateDate", query = "SELECT m FROM MotconsuEventTypes m WHERE m.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "MotconsuEventTypes.findByKrnCreateUserId", query = "SELECT m FROM MotconsuEventTypes m WHERE m.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "MotconsuEventTypes.findByKrnModifyDate", query = "SELECT m FROM MotconsuEventTypes m WHERE m.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "MotconsuEventTypes.findByKrnModifyUserId", query = "SELECT m FROM MotconsuEventTypes m WHERE m.krnModifyUserId = :krnModifyUserId")})
public class MotconsuEventTypes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOTCONSU_EVENT_TYPES_ID")
    private Integer motconsuEventTypesId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CODE")
    private String code;
    @Size(max = 255)
    @Column(name = "LABEL")
    private String label;
    @Column(name = "IS_HOSPITALIZATION")
    private Boolean isHospitalization;
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

    public MotconsuEventTypes() {
    }

    public MotconsuEventTypes(Integer motconsuEventTypesId) {
        this.motconsuEventTypesId = motconsuEventTypesId;
    }

    public MotconsuEventTypes(Integer motconsuEventTypesId, String code) {
        this.motconsuEventTypesId = motconsuEventTypesId;
        this.code = code;
    }

    public Integer getMotconsuEventTypesId() {
        return motconsuEventTypesId;
    }

    public void setMotconsuEventTypesId(Integer motconsuEventTypesId) {
        this.motconsuEventTypesId = motconsuEventTypesId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Boolean getIsHospitalization() {
        return isHospitalization;
    }

    public void setIsHospitalization(Boolean isHospitalization) {
        this.isHospitalization = isHospitalization;
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
        hash += (motconsuEventTypesId != null ? motconsuEventTypesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MotconsuEventTypes)) {
            return false;
        }
        MotconsuEventTypes other = (MotconsuEventTypes) object;
        if ((this.motconsuEventTypesId == null && other.motconsuEventTypesId != null) || (this.motconsuEventTypesId != null && !this.motconsuEventTypesId.equals(other.motconsuEventTypesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.MotconsuEventTypes[ motconsuEventTypesId=" + motconsuEventTypesId + " ]";
    }
    
}
