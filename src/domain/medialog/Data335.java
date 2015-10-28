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
 * БИО КРОВЬ НА САХАР
 * @author kvo
 */
@Entity
@Table(name = "DATA335")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Data335.findAll", query = "SELECT d FROM Data335 d"),
    @NamedQuery(name = "Data335.findByData335Id", query = "SELECT d FROM Data335 d WHERE d.data335Id = :data335Id"),
    @NamedQuery(name = "Data335.findByPatientsId", query = "SELECT d FROM Data335 d WHERE d.patientsId = :patientsId"),
    @NamedQuery(name = "Data335.findByDateConsultation", query = "SELECT d FROM Data335 d WHERE d.dateConsultation = :dateConsultation"),
    @NamedQuery(name = "Data335.findByMotconsuId", query = "SELECT d FROM Data335 d WHERE d.motconsuId = :motconsuId"),
    @NamedQuery(name = "Data335.findByVrahLaborant", query = "SELECT d FROM Data335 d WHERE d.vrahLaborant = :vrahLaborant"),
    @NamedQuery(name = "Data335.findByKrovNaSaAr", query = "SELECT d FROM Data335 d WHERE d.krovNaSaAr = :krovNaSaAr"),
    @NamedQuery(name = "Data335.findByNomerHeka", query = "SELECT d FROM Data335 d WHERE d.nomerHeka = :nomerHeka"),
    @NamedQuery(name = "Data335.findByNomerAnaliza", query = "SELECT d FROM Data335 d WHERE d.nomerAnaliza = :nomerAnaliza"),
    @NamedQuery(name = "Data335.findByDataAnaliza", query = "SELECT d FROM Data335 d WHERE d.dataAnaliza = :dataAnaliza"),
    @NamedQuery(name = "Data335.findByLehahijVrah", query = "SELECT d FROM Data335 d WHERE d.lehahijVrah = :lehahijVrah"),
    @NamedQuery(name = "Data335.findByOtpravitNapohtu", query = "SELECT d FROM Data335 d WHERE d.otpravitNapohtu = :otpravitNapohtu"),
    @NamedQuery(name = "Data335.findByKrnCreateDate", query = "SELECT d FROM Data335 d WHERE d.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Data335.findByKrnCreateUserId", query = "SELECT d FROM Data335 d WHERE d.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Data335.findByKrnModifyDate", query = "SELECT d FROM Data335 d WHERE d.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Data335.findByKrnModifyUserId", query = "SELECT d FROM Data335 d WHERE d.krnModifyUserId = :krnModifyUserId")})
public class Data335 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA335_ID")
    private Integer data335Id;
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
    @Size(max = 21)
    @Column(name = "VRAH_LABORANT")
    private String vrahLaborant;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "KROV_NA_SA_AR")
    private BigDecimal krovNaSaAr;
    @Size(max = 25)
    @Column(name = "NOMER_HEKA")
    private String nomerHeka;
    @Column(name = "NOMER_ANALIZA")
    private BigDecimal nomerAnaliza;
    @Column(name = "DATA_ANALIZA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAnaliza;
    @Size(max = 21)
    @Column(name = "LEHAHIJ_VRAH")
    private String lehahijVrah;
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

    public Data335() {
    }

    public Data335(Integer data335Id) {
        this.data335Id = data335Id;
    }

    public Data335(Integer data335Id, int patientsId, Date dateConsultation, int motconsuId) {
        this.data335Id = data335Id;
        this.patientsId = patientsId;
        this.dateConsultation = dateConsultation;
        this.motconsuId = motconsuId;
    }

    public Integer getData335Id() {
        return data335Id;
    }

    public void setData335Id(Integer data335Id) {
        this.data335Id = data335Id;
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

    public String getVrahLaborant() {
        return vrahLaborant;
    }

    public void setVrahLaborant(String vrahLaborant) {
        this.vrahLaborant = vrahLaborant;
    }

    public BigDecimal getKrovNaSaAr() {
        return krovNaSaAr;
    }

    public void setKrovNaSaAr(BigDecimal krovNaSaAr) {
        this.krovNaSaAr = krovNaSaAr;
    }

    public String getNomerHeka() {
        return nomerHeka;
    }

    public void setNomerHeka(String nomerHeka) {
        this.nomerHeka = nomerHeka;
    }

    public BigDecimal getNomerAnaliza() {
        return nomerAnaliza;
    }

    public void setNomerAnaliza(BigDecimal nomerAnaliza) {
        this.nomerAnaliza = nomerAnaliza;
    }

    public Date getDataAnaliza() {
        return dataAnaliza;
    }

    public void setDataAnaliza(Date dataAnaliza) {
        this.dataAnaliza = dataAnaliza;
    }

    public String getLehahijVrah() {
        return lehahijVrah;
    }

    public void setLehahijVrah(String lehahijVrah) {
        this.lehahijVrah = lehahijVrah;
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
        hash += (data335Id != null ? data335Id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data335)) {
            return false;
        }
        Data335 other = (Data335) object;
        if ((this.data335Id == null && other.data335Id != null) || (this.data335Id != null && !this.data335Id.equals(other.data335Id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.Data335[ data335Id=" + data335Id + " ]";
    }
    
}
