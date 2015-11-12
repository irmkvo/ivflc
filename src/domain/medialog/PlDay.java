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
@Table(name = "PL_DAY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlDay.findAll", query = "SELECT p FROM PlDay p"),
    @NamedQuery(name = "PlDay.findByPlDayId", query = "SELECT p FROM PlDay p WHERE p.plDayId = :plDayId"),
    @NamedQuery(name = "PlDay.findByName", query = "SELECT p FROM PlDay p WHERE p.name = :name"),
    @NamedQuery(name = "PlDay.findByStartTime", query = "SELECT p FROM PlDay p WHERE p.startTime = :startTime"),
    @NamedQuery(name = "PlDay.findByEndTime", query = "SELECT p FROM PlDay p WHERE p.endTime = :endTime"),
    @NamedQuery(name = "PlDay.findByEnabled", query = "SELECT p FROM PlDay p WHERE p.enabled = :enabled"),
    @NamedQuery(name = "PlDay.findByDayOfWeek", query = "SELECT p FROM PlDay p WHERE p.dayOfWeek = :dayOfWeek"),
    @NamedQuery(name = "PlDay.findByDayEven", query = "SELECT p FROM PlDay p WHERE p.dayEven = :dayEven"),
    @NamedQuery(name = "PlDay.findByDayOfMonth", query = "SELECT p FROM PlDay p WHERE p.dayOfMonth = :dayOfMonth"),
    @NamedQuery(name = "PlDay.findByDayOrder", query = "SELECT p FROM PlDay p WHERE p.dayOrder = :dayOrder"),
    @NamedQuery(name = "PlDay.findByDayWeek", query = "SELECT p FROM PlDay p WHERE p.dayWeek = :dayWeek"),
    @NamedQuery(name = "PlDay.findByDayMonth", query = "SELECT p FROM PlDay p WHERE p.dayMonth = :dayMonth"),
    @NamedQuery(name = "PlDay.findByDayYear", query = "SELECT p FROM PlDay p WHERE p.dayYear = :dayYear"),
    @NamedQuery(name = "PlDay.findByPlAgendId", query = "SELECT p FROM PlDay p WHERE p.plAgendId = :plAgendId"),
    @NamedQuery(name = "PlDay.findByPlSubjId", query = "SELECT p FROM PlDay p WHERE p.plSubjId = :plSubjId"),
    @NamedQuery(name = "PlDay.findByDureeTranche", query = "SELECT p FROM PlDay p WHERE p.dureeTranche = :dureeTranche"),
    @NamedQuery(name = "PlDay.findByPeriodFrom", query = "SELECT p FROM PlDay p WHERE p.periodFrom = :periodFrom"),
    @NamedQuery(name = "PlDay.findByPeriodTo", query = "SELECT p FROM PlDay p WHERE p.periodTo = :periodTo"),
    @NamedQuery(name = "PlDay.findByCreateDateTime", query = "SELECT p FROM PlDay p WHERE p.createDateTime = :createDateTime"),
    @NamedQuery(name = "PlDay.findByModifyDateTime", query = "SELECT p FROM PlDay p WHERE p.modifyDateTime = :modifyDateTime"),
    @NamedQuery(name = "PlDay.findByMedecinsCreateId", query = "SELECT p FROM PlDay p WHERE p.medecinsCreateId = :medecinsCreateId"),
    @NamedQuery(name = "PlDay.findByMedecinsModifyId", query = "SELECT p FROM PlDay p WHERE p.medecinsModifyId = :medecinsModifyId"),
    @NamedQuery(name = "PlDay.findByKrnCreateDate", query = "SELECT p FROM PlDay p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "PlDay.findByKrnCreateUserId", query = "SELECT p FROM PlDay p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "PlDay.findByKrnModifyDate", query = "SELECT p FROM PlDay p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "PlDay.findByKrnModifyUserId", query = "SELECT p FROM PlDay p WHERE p.krnModifyUserId = :krnModifyUserId"),
    @NamedQuery(name = "PlDay.findByDayWeekMonth", query = "SELECT p FROM PlDay p WHERE p.dayWeekMonth = :dayWeekMonth"),
    @NamedQuery(name = "PlDay.findByIntervalWork", query = "SELECT p FROM PlDay p WHERE p.intervalWork = :intervalWork"),
    @NamedQuery(name = "PlDay.findByIntervalOff", query = "SELECT p FROM PlDay p WHERE p.intervalOff = :intervalOff"),
    @NamedQuery(name = "PlDay.findByIntervalStartfrom", query = "SELECT p FROM PlDay p WHERE p.intervalStartfrom = :intervalStartfrom")})
public class PlDay implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_DAY_ID")
    private Integer plDayId;
    @Size(max = 100)
    @Column(name = "NAME")
    private String name;
    @Column(name = "START_TIME")
    private Integer startTime;
    @Column(name = "END_TIME")
    private Integer endTime;
    @Column(name = "ENABLED")
    private Boolean enabled;
    @Column(name = "DAY_OF_WEEK")
    private Integer dayOfWeek;
    @Column(name = "DAY_EVEN")
    private Integer dayEven;
    @Column(name = "DAY_OF_MONTH")
    private Integer dayOfMonth;
    @Column(name = "DAY_ORDER")
    private Integer dayOrder;
    @Column(name = "DAY_WEEK")
    private Integer dayWeek;
    @Column(name = "DAY_MONTH")
    private Integer dayMonth;
    @Column(name = "DAY_YEAR")
    private Integer dayYear;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_AGEND_ID")
    private int plAgendId;
    @Column(name = "PL_SUBJ_ID")
    private Integer plSubjId;
    @Column(name = "DUREE_TRANCHE")
    private Integer dureeTranche;
    @Column(name = "PERIOD_FROM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date periodFrom;
    @Column(name = "PERIOD_TO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date periodTo;
    @Column(name = "CREATE_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;
    @Column(name = "MODIFY_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDateTime;
    @Column(name = "MEDECINS_CREATE_ID")
    private Integer medecinsCreateId;
    @Column(name = "MEDECINS_MODIFY_ID")
    private Integer medecinsModifyId;
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
    @Column(name = "DAY_WEEK_MONTH")
    private Integer dayWeekMonth;
    @Column(name = "INTERVAL_WORK")
    private Integer intervalWork;
    @Column(name = "INTERVAL_OFF")
    private Integer intervalOff;
    @Column(name = "INTERVAL_STARTFROM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date intervalStartfrom;

    public PlDay() {
    }

    public PlDay(Integer plDayId) {
        this.plDayId = plDayId;
    }

    public PlDay(Integer plDayId, int plAgendId) {
        this.plDayId = plDayId;
        this.plAgendId = plAgendId;
    }

    public Integer getPlDayId() {
        return plDayId;
    }

    public void setPlDayId(Integer plDayId) {
        this.plDayId = plDayId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Integer getDayEven() {
        return dayEven;
    }

    public void setDayEven(Integer dayEven) {
        this.dayEven = dayEven;
    }

    public Integer getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public Integer getDayOrder() {
        return dayOrder;
    }

    public void setDayOrder(Integer dayOrder) {
        this.dayOrder = dayOrder;
    }

    public Integer getDayWeek() {
        return dayWeek;
    }

    public void setDayWeek(Integer dayWeek) {
        this.dayWeek = dayWeek;
    }

    public Integer getDayMonth() {
        return dayMonth;
    }

    public void setDayMonth(Integer dayMonth) {
        this.dayMonth = dayMonth;
    }

    public Integer getDayYear() {
        return dayYear;
    }

    public void setDayYear(Integer dayYear) {
        this.dayYear = dayYear;
    }

    public int getPlAgendId() {
        return plAgendId;
    }

    public void setPlAgendId(int plAgendId) {
        this.plAgendId = plAgendId;
    }

    public Integer getPlSubjId() {
        return plSubjId;
    }

    public void setPlSubjId(Integer plSubjId) {
        this.plSubjId = plSubjId;
    }

    public Integer getDureeTranche() {
        return dureeTranche;
    }

    public void setDureeTranche(Integer dureeTranche) {
        this.dureeTranche = dureeTranche;
    }

    public Date getPeriodFrom() {
        return periodFrom;
    }

    public void setPeriodFrom(Date periodFrom) {
        this.periodFrom = periodFrom;
    }

    public Date getPeriodTo() {
        return periodTo;
    }

    public void setPeriodTo(Date periodTo) {
        this.periodTo = periodTo;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Date getModifyDateTime() {
        return modifyDateTime;
    }

    public void setModifyDateTime(Date modifyDateTime) {
        this.modifyDateTime = modifyDateTime;
    }

    public Integer getMedecinsCreateId() {
        return medecinsCreateId;
    }

    public void setMedecinsCreateId(Integer medecinsCreateId) {
        this.medecinsCreateId = medecinsCreateId;
    }

    public Integer getMedecinsModifyId() {
        return medecinsModifyId;
    }

    public void setMedecinsModifyId(Integer medecinsModifyId) {
        this.medecinsModifyId = medecinsModifyId;
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

    public Integer getDayWeekMonth() {
        return dayWeekMonth;
    }

    public void setDayWeekMonth(Integer dayWeekMonth) {
        this.dayWeekMonth = dayWeekMonth;
    }

    public Integer getIntervalWork() {
        return intervalWork;
    }

    public void setIntervalWork(Integer intervalWork) {
        this.intervalWork = intervalWork;
    }

    public Integer getIntervalOff() {
        return intervalOff;
    }

    public void setIntervalOff(Integer intervalOff) {
        this.intervalOff = intervalOff;
    }

    public Date getIntervalStartfrom() {
        return intervalStartfrom;
    }

    public void setIntervalStartfrom(Date intervalStartfrom) {
        this.intervalStartfrom = intervalStartfrom;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (plDayId != null ? plDayId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlDay)) {
            return false;
        }
        PlDay other = (PlDay) object;
        if ((this.plDayId == null && other.plDayId != null) || (this.plDayId != null && !this.plDayId.equals(other.plDayId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.PlDay[ plDayId=" + plDayId + " ]";
    }
    
}
