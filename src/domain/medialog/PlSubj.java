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
@Table(name = "PL_SUBJ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlSubj.findAll", query = "SELECT p FROM PlSubj p"),
    @NamedQuery(name = "PlSubj.findByPlSubjId", query = "SELECT p FROM PlSubj p WHERE p.plSubjId = :plSubjId"),
    @NamedQuery(name = "PlSubj.findByName", query = "SELECT p FROM PlSubj p WHERE p.name = :name"),
    @NamedQuery(name = "PlSubj.findByOwnerType", query = "SELECT p FROM PlSubj p WHERE p.ownerType = :ownerType"),
    @NamedQuery(name = "PlSubj.findByOwnerId", query = "SELECT p FROM PlSubj p WHERE p.ownerId = :ownerId"),
    @NamedQuery(name = "PlSubj.findByLieu", query = "SELECT p FROM PlSubj p WHERE p.lieu = :lieu"),
    @NamedQuery(name = "PlSubj.findByUsePlan", query = "SELECT p FROM PlSubj p WHERE p.usePlan = :usePlan"),
    @NamedQuery(name = "PlSubj.findByReplacement", query = "SELECT p FROM PlSubj p WHERE p.replacement = :replacement"),
    @NamedQuery(name = "PlSubj.findBySemaines", query = "SELECT p FROM PlSubj p WHERE p.semaines = :semaines"),
    @NamedQuery(name = "PlSubj.findByStartFrom", query = "SELECT p FROM PlSubj p WHERE p.startFrom = :startFrom"),
    @NamedQuery(name = "PlSubj.findByPlExamId", query = "SELECT p FROM PlSubj p WHERE p.plExamId = :plExamId"),
    @NamedQuery(name = "PlSubj.findByPlAgendId1", query = "SELECT p FROM PlSubj p WHERE p.plAgendId1 = :plAgendId1"),
    @NamedQuery(name = "PlSubj.findByPlAgendId2", query = "SELECT p FROM PlSubj p WHERE p.plAgendId2 = :plAgendId2"),
    @NamedQuery(name = "PlSubj.findByPlAgendId3", query = "SELECT p FROM PlSubj p WHERE p.plAgendId3 = :plAgendId3"),
    @NamedQuery(name = "PlSubj.findByPlAgendId4", query = "SELECT p FROM PlSubj p WHERE p.plAgendId4 = :plAgendId4"),
    @NamedQuery(name = "PlSubj.findBySubjOrder", query = "SELECT p FROM PlSubj p WHERE p.subjOrder = :subjOrder"),
    @NamedQuery(name = "PlSubj.findByFmIntorgId", query = "SELECT p FROM PlSubj p WHERE p.fmIntorgId = :fmIntorgId"),
    @NamedQuery(name = "PlSubj.findByHl7ModalityId", query = "SELECT p FROM PlSubj p WHERE p.hl7ModalityId = :hl7ModalityId"),
    @NamedQuery(name = "PlSubj.findByForbidAfterDate", query = "SELECT p FROM PlSubj p WHERE p.forbidAfterDate = :forbidAfterDate"),
    @NamedQuery(name = "PlSubj.findByPeriodAllowCreate", query = "SELECT p FROM PlSubj p WHERE p.periodAllowCreate = :periodAllowCreate"),
    @NamedQuery(name = "PlSubj.findByKrnCreateDate", query = "SELECT p FROM PlSubj p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "PlSubj.findByKrnCreateUserId", query = "SELECT p FROM PlSubj p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "PlSubj.findByKrnModifyDate", query = "SELECT p FROM PlSubj p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "PlSubj.findByKrnModifyUserId", query = "SELECT p FROM PlSubj p WHERE p.krnModifyUserId = :krnModifyUserId")})
public class PlSubj implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_SUBJ_ID")
    private Integer plSubjId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OWNER_TYPE")
    private int ownerType;
    @Column(name = "OWNER_ID")
    private Integer ownerId;
    @Size(max = 100)
    @Column(name = "LIEU")
    private String lieu;
    @Column(name = "USE_PLAN")
    private Boolean usePlan;
    @Column(name = "REPLACEMENT")
    private Integer replacement;
    @Column(name = "SEMAINES")
    private Integer semaines;
    @Column(name = "START_FROM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startFrom;
    @Column(name = "PL_EXAM_ID")
    private Integer plExamId;
    @Column(name = "PL_AGEND_ID1")
    private Integer plAgendId1;
    @Column(name = "PL_AGEND_ID2")
    private Integer plAgendId2;
    @Column(name = "PL_AGEND_ID3")
    private Integer plAgendId3;
    @Column(name = "PL_AGEND_ID4")
    private Integer plAgendId4;
    @Column(name = "SUBJ_ORDER")
    private Integer subjOrder;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FM_INTORG_ID")
    private int fmIntorgId;
    @Column(name = "HL7_MODALITY_ID")
    private Integer hl7ModalityId;
    @Column(name = "FORBID_AFTER_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date forbidAfterDate;
    @Column(name = "PERIOD_ALLOW_CREATE")
    private Integer periodAllowCreate;
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

    public PlSubj() {
    }

    public PlSubj(Integer plSubjId) {
        this.plSubjId = plSubjId;
    }

    public PlSubj(Integer plSubjId, String name, int ownerType, int fmIntorgId) {
        this.plSubjId = plSubjId;
        this.name = name;
        this.ownerType = ownerType;
        this.fmIntorgId = fmIntorgId;
    }

    public Integer getPlSubjId() {
        return plSubjId;
    }

    public void setPlSubjId(Integer plSubjId) {
        this.plSubjId = plSubjId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(int ownerType) {
        this.ownerType = ownerType;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Boolean getUsePlan() {
        return usePlan;
    }

    public void setUsePlan(Boolean usePlan) {
        this.usePlan = usePlan;
    }

    public Integer getReplacement() {
        return replacement;
    }

    public void setReplacement(Integer replacement) {
        this.replacement = replacement;
    }

    public Integer getSemaines() {
        return semaines;
    }

    public void setSemaines(Integer semaines) {
        this.semaines = semaines;
    }

    public Date getStartFrom() {
        return startFrom;
    }

    public void setStartFrom(Date startFrom) {
        this.startFrom = startFrom;
    }

    public Integer getPlExamId() {
        return plExamId;
    }

    public void setPlExamId(Integer plExamId) {
        this.plExamId = plExamId;
    }

    public Integer getPlAgendId1() {
        return plAgendId1;
    }

    public void setPlAgendId1(Integer plAgendId1) {
        this.plAgendId1 = plAgendId1;
    }

    public Integer getPlAgendId2() {
        return plAgendId2;
    }

    public void setPlAgendId2(Integer plAgendId2) {
        this.plAgendId2 = plAgendId2;
    }

    public Integer getPlAgendId3() {
        return plAgendId3;
    }

    public void setPlAgendId3(Integer plAgendId3) {
        this.plAgendId3 = plAgendId3;
    }

    public Integer getPlAgendId4() {
        return plAgendId4;
    }

    public void setPlAgendId4(Integer plAgendId4) {
        this.plAgendId4 = plAgendId4;
    }

    public Integer getSubjOrder() {
        return subjOrder;
    }

    public void setSubjOrder(Integer subjOrder) {
        this.subjOrder = subjOrder;
    }

    public int getFmIntorgId() {
        return fmIntorgId;
    }

    public void setFmIntorgId(int fmIntorgId) {
        this.fmIntorgId = fmIntorgId;
    }

    public Integer getHl7ModalityId() {
        return hl7ModalityId;
    }

    public void setHl7ModalityId(Integer hl7ModalityId) {
        this.hl7ModalityId = hl7ModalityId;
    }

    public Date getForbidAfterDate() {
        return forbidAfterDate;
    }

    public void setForbidAfterDate(Date forbidAfterDate) {
        this.forbidAfterDate = forbidAfterDate;
    }

    public Integer getPeriodAllowCreate() {
        return periodAllowCreate;
    }

    public void setPeriodAllowCreate(Integer periodAllowCreate) {
        this.periodAllowCreate = periodAllowCreate;
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
        hash += (plSubjId != null ? plSubjId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlSubj)) {
            return false;
        }
        PlSubj other = (PlSubj) object;
        if ((this.plSubjId == null && other.plSubjId != null) || (this.plSubjId != null && !this.plSubjId.equals(other.plSubjId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.PlSubj[ plSubjId=" + plSubjId + " ]";
    }
    
}
