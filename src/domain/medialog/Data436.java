/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.medialog;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * БИО ЭЛЕКРОЛИТЫ
 * @author kvo
 */
@Entity
@Table(name = "DATA436")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Data436.findAll", query = "SELECT d FROM Data436 d"),
    @NamedQuery(name = "Data436.findByData436Id", query = "SELECT d FROM Data436 d WHERE d.data436Id = :data436Id"),
    @NamedQuery(name = "Data436.findByPatientsId", query = "SELECT d FROM Data436 d WHERE d.patientsId = :patientsId"),
    @NamedQuery(name = "Data436.findByDateConsultation", query = "SELECT d FROM Data436 d WHERE d.dateConsultation = :dateConsultation"),
    @NamedQuery(name = "Data436.findByMotconsuId", query = "SELECT d FROM Data436 d WHERE d.motconsuId = :motconsuId"),
    @NamedQuery(name = "Data436.findByLehahijVrah", query = "SELECT d FROM Data436 d WHERE d.lehahijVrah = :lehahijVrah"),
    @NamedQuery(name = "Data436.findByDataAnaliza", query = "SELECT d FROM Data436 d WHERE d.dataAnaliza = :dataAnaliza"),
    @NamedQuery(name = "Data436.findByVrahLaborant", query = "SELECT d FROM Data436 d WHERE d.vrahLaborant = :vrahLaborant"),
    @NamedQuery(name = "Data436.findByKalij", query = "SELECT d FROM Data436 d WHERE d.kalij = :kalij"),
    @NamedQuery(name = "Data436.findByKalCij", query = "SELECT d FROM Data436 d WHERE d.kalCij = :kalCij"),
    @NamedQuery(name = "Data436.findByNomerAnaliza", query = "SELECT d FROM Data436 d WHERE d.nomerAnaliza = :nomerAnaliza"),
    @NamedQuery(name = "Data436.findByNatrij", query = "SELECT d FROM Data436 d WHERE d.natrij = :natrij"),
    @NamedQuery(name = "Data436.findByOtpravitNapohtu", query = "SELECT d FROM Data436 d WHERE d.otpravitNapohtu = :otpravitNapohtu"),
    @NamedQuery(name = "Data436.findByKrnCreateDate", query = "SELECT d FROM Data436 d WHERE d.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Data436.findByKrnCreateUserId", query = "SELECT d FROM Data436 d WHERE d.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Data436.findByKrnModifyDate", query = "SELECT d FROM Data436 d WHERE d.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Data436.findByKrnModifyUserId", query = "SELECT d FROM Data436 d WHERE d.krnModifyUserId = :krnModifyUserId")})
public class Data436 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA436_ID")
    private Integer data436Id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PATIENTS_ID")
    private int patientsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_CONSULTATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateConsultation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOTCONSU_ID")
    private int motconsuId;
    @Size(max = 29)
    @Column(name = "LEHAHIJ_VRAH")
    private String lehahijVrah;
    @Column(name = "DATA_ANALIZA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAnaliza;
    @Size(max = 29)
    @Column(name = "VRAH_LABORANT")
    private String vrahLaborant;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "KALIJ")
    private BigDecimal kalij;
    @Column(name = "KAL_CIJ")
    private BigDecimal kalCij;
    @Column(name = "NOMER_ANALIZA")
    private BigDecimal nomerAnaliza;
    @Column(name = "NATRIJ")
    private BigDecimal natrij;
    @Column(name = "OTPRAVIT_NAPOHTU")
    private Boolean otpravitNapohtu;
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

    public Data436() {
    }

    public Data436(Integer data436Id) {
        this.data436Id = data436Id;
    }

    public Data436(Integer data436Id, int patientsId, Date dateConsultation, int motconsuId) {
        this.data436Id = data436Id;
        this.patientsId = patientsId;
        this.dateConsultation = dateConsultation;
        this.motconsuId = motconsuId;
    }

    public Integer getData436Id() {
        return data436Id;
    }

    public void setData436Id(Integer data436Id) {
        this.data436Id = data436Id;
    }

    public int getPatientsId() {
        return patientsId;
    }

    public void setPatientsId(int patientsId) {
        this.patientsId = patientsId;
    }

    public Date getDateConsultation() {
        return dateConsultation;
    }

    public void setDateConsultation(Date dateConsultation) {
        this.dateConsultation = dateConsultation;
    }

    public int getMotconsuId() {
        return motconsuId;
    }

    public void setMotconsuId(int motconsuId) {
        this.motconsuId = motconsuId;
    }

    public String getLehahijVrah() {
        return lehahijVrah;
    }

    public void setLehahijVrah(String lehahijVrah) {
        this.lehahijVrah = lehahijVrah;
    }

    public Date getDataAnaliza() {
        return dataAnaliza;
    }

    public void setDataAnaliza(Date dataAnaliza) {
        this.dataAnaliza = dataAnaliza;
    }

    public String getVrahLaborant() {
        return vrahLaborant;
    }

    public void setVrahLaborant(String vrahLaborant) {
        this.vrahLaborant = vrahLaborant;
    }

    public BigDecimal getKalij() {
        return kalij;
    }

    public void setKalij(BigDecimal kalij) {
        this.kalij = kalij;
    }

    public BigDecimal getKalCij() {
        return kalCij;
    }

    public void setKalCij(BigDecimal kalCij) {
        this.kalCij = kalCij;
    }

    public BigDecimal getNomerAnaliza() {
        return nomerAnaliza;
    }

    public void setNomerAnaliza(BigDecimal nomerAnaliza) {
        this.nomerAnaliza = nomerAnaliza;
    }

    public BigDecimal getNatrij() {
        return natrij;
    }

    public void setNatrij(BigDecimal natrij) {
        this.natrij = natrij;
    }

    public Boolean getOtpravitNapohtu() {
        return otpravitNapohtu;
    }

    public void setOtpravitNapohtu(Boolean otpravitNapohtu) {
        this.otpravitNapohtu = otpravitNapohtu;
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
        hash += (data436Id != null ? data436Id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data436)) {
            return false;
        }
        Data436 other = (Data436) object;
        if ((this.data436Id == null && other.data436Id != null) || (this.data436Id != null && !this.data436Id.equals(other.data436Id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.Data436[ data436Id=" + data436Id + " ]";
    }
    
}
