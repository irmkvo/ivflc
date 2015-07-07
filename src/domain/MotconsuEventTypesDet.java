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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Shah
 */
@Entity
@Table(name = "MOTCONSU_EVENT_TYPES_DET")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MotconsuEventTypesDet.findAll", query = "SELECT m FROM MotconsuEventTypesDet m"),
    @NamedQuery(name = "MotconsuEventTypesDet.findByMotconsuEventTypesDetId", query = "SELECT m FROM MotconsuEventTypesDet m WHERE m.motconsuEventTypesDetId = :motconsuEventTypesDetId"),
    @NamedQuery(name = "MotconsuEventTypesDet.findByMotconsuEventTypesId", query = "SELECT m FROM MotconsuEventTypesDet m WHERE m.motconsuEventTypesId = :motconsuEventTypesId"),
    @NamedQuery(name = "MotconsuEventTypesDet.findByModelsId", query = "SELECT m FROM MotconsuEventTypesDet m WHERE m.modelsId = :modelsId"),
    @NamedQuery(name = "MotconsuEventTypesDet.findByAutoattach", query = "SELECT m FROM MotconsuEventTypesDet m WHERE m.autoattach = :autoattach"),
    @NamedQuery(name = "MotconsuEventTypesDet.findByHideSubCons", query = "SELECT m FROM MotconsuEventTypesDet m WHERE m.hideSubCons = :hideSubCons"),
    @NamedQuery(name = "MotconsuEventTypesDet.findByInsideEventOnly", query = "SELECT m FROM MotconsuEventTypesDet m WHERE m.insideEventOnly = :insideEventOnly"),
    @NamedQuery(name = "MotconsuEventTypesDet.findByMaxConsCount", query = "SELECT m FROM MotconsuEventTypesDet m WHERE m.maxConsCount = :maxConsCount"),
    @NamedQuery(name = "MotconsuEventTypesDet.findByOverfillAction", query = "SELECT m FROM MotconsuEventTypesDet m WHERE m.overfillAction = :overfillAction"),
    @NamedQuery(name = "MotconsuEventTypesDet.findByKrnCreateDate", query = "SELECT m FROM MotconsuEventTypesDet m WHERE m.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "MotconsuEventTypesDet.findByKrnCreateUserId", query = "SELECT m FROM MotconsuEventTypesDet m WHERE m.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "MotconsuEventTypesDet.findByKrnModifyDate", query = "SELECT m FROM MotconsuEventTypesDet m WHERE m.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "MotconsuEventTypesDet.findByKrnModifyUserId", query = "SELECT m FROM MotconsuEventTypesDet m WHERE m.krnModifyUserId = :krnModifyUserId")})
public class MotconsuEventTypesDet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOTCONSU_EVENT_TYPES_DET_ID")
    private Integer motconsuEventTypesDetId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOTCONSU_EVENT_TYPES_ID")
    private int motconsuEventTypesId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MODELS_ID")
    private int modelsId;
    @Column(name = "AUTOATTACH")
    private Boolean autoattach;
    @Column(name = "HIDE_SUB_CONS")
    private Boolean hideSubCons;
    @Column(name = "INSIDE_EVENT_ONLY")
    private Boolean insideEventOnly;
    @Column(name = "MAX_CONS_COUNT")
    private Integer maxConsCount;
    @Column(name = "OVERFILL_ACTION")
    private Integer overfillAction;
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

    public MotconsuEventTypesDet() {
    }

    public MotconsuEventTypesDet(Integer motconsuEventTypesDetId) {
        this.motconsuEventTypesDetId = motconsuEventTypesDetId;
    }

    public MotconsuEventTypesDet(Integer motconsuEventTypesDetId, int motconsuEventTypesId, int modelsId) {
        this.motconsuEventTypesDetId = motconsuEventTypesDetId;
        this.motconsuEventTypesId = motconsuEventTypesId;
        this.modelsId = modelsId;
    }

    public Integer getMotconsuEventTypesDetId() {
        return motconsuEventTypesDetId;
    }

    public void setMotconsuEventTypesDetId(Integer motconsuEventTypesDetId) {
        this.motconsuEventTypesDetId = motconsuEventTypesDetId;
    }

    public int getMotconsuEventTypesId() {
        return motconsuEventTypesId;
    }

    public void setMotconsuEventTypesId(int motconsuEventTypesId) {
        this.motconsuEventTypesId = motconsuEventTypesId;
    }

    public int getModelsId() {
        return modelsId;
    }

    public void setModelsId(int modelsId) {
        this.modelsId = modelsId;
    }

    public Boolean getAutoattach() {
        return autoattach;
    }

    public void setAutoattach(Boolean autoattach) {
        this.autoattach = autoattach;
    }

    public Boolean getHideSubCons() {
        return hideSubCons;
    }

    public void setHideSubCons(Boolean hideSubCons) {
        this.hideSubCons = hideSubCons;
    }

    public Boolean getInsideEventOnly() {
        return insideEventOnly;
    }

    public void setInsideEventOnly(Boolean insideEventOnly) {
        this.insideEventOnly = insideEventOnly;
    }

    public Integer getMaxConsCount() {
        return maxConsCount;
    }

    public void setMaxConsCount(Integer maxConsCount) {
        this.maxConsCount = maxConsCount;
    }

    public Integer getOverfillAction() {
        return overfillAction;
    }

    public void setOverfillAction(Integer overfillAction) {
        this.overfillAction = overfillAction;
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
        hash += (motconsuEventTypesDetId != null ? motconsuEventTypesDetId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MotconsuEventTypesDet)) {
            return false;
        }
        MotconsuEventTypesDet other = (MotconsuEventTypesDet) object;
        if ((this.motconsuEventTypesDetId == null && other.motconsuEventTypesDetId != null) || (this.motconsuEventTypesDetId != null && !this.motconsuEventTypesDetId.equals(other.motconsuEventTypesDetId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.MotconsuEventTypesDet[ motconsuEventTypesDetId=" + motconsuEventTypesDetId + " ]";
    }
    
}
