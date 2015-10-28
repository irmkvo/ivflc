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
 * БИО НЕЧИПОРЕНКО
 * @author kvo
 */
@Entity
@Table(name = "DATA333")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Data333.findAll", query = "SELECT d FROM Data333 d"),
    @NamedQuery(name = "Data333.findByData333Id", query = "SELECT d FROM Data333 d WHERE d.data333Id = :data333Id"),
    @NamedQuery(name = "Data333.findByPatientsId", query = "SELECT d FROM Data333 d WHERE d.patientsId = :patientsId"),
    @NamedQuery(name = "Data333.findByDateConsultation", query = "SELECT d FROM Data333 d WHERE d.dateConsultation = :dateConsultation"),
    @NamedQuery(name = "Data333.findByMotconsuId", query = "SELECT d FROM Data333 d WHERE d.motconsuId = :motconsuId"),
    @NamedQuery(name = "Data333.findByLehahijVrah", query = "SELECT d FROM Data333 d WHERE d.lehahijVrah = :lehahijVrah"),
    @NamedQuery(name = "Data333.findByCilindr", query = "SELECT d FROM Data333 d WHERE d.cilindr = :cilindr"),
    @NamedQuery(name = "Data333.findByBakterii", query = "SELECT d FROM Data333 d WHERE d.bakterii = :bakterii"),
    @NamedQuery(name = "Data333.findByEritrocit", query = "SELECT d FROM Data333 d WHERE d.eritrocit = :eritrocit"),
    @NamedQuery(name = "Data333.findByLejkocit", query = "SELECT d FROM Data333 d WHERE d.lejkocit = :lejkocit"),
    @NamedQuery(name = "Data333.findByNomerHeka", query = "SELECT d FROM Data333 d WHERE d.nomerHeka = :nomerHeka"),
    @NamedQuery(name = "Data333.findByDataAnaliza", query = "SELECT d FROM Data333 d WHERE d.dataAnaliza = :dataAnaliza"),
    @NamedQuery(name = "Data333.findByNomer", query = "SELECT d FROM Data333 d WHERE d.nomer = :nomer"),
    @NamedQuery(name = "Data333.findByVrahLaborant", query = "SELECT d FROM Data333 d WHERE d.vrahLaborant = :vrahLaborant"),
    @NamedQuery(name = "Data333.findByOtpravitNapohtu", query = "SELECT d FROM Data333 d WHERE d.otpravitNapohtu = :otpravitNapohtu"),
    @NamedQuery(name = "Data333.findByKrnCreateDate", query = "SELECT d FROM Data333 d WHERE d.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Data333.findByKrnCreateUserId", query = "SELECT d FROM Data333 d WHERE d.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Data333.findByKrnModifyDate", query = "SELECT d FROM Data333 d WHERE d.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Data333.findByKrnModifyUserId", query = "SELECT d FROM Data333 d WHERE d.krnModifyUserId = :krnModifyUserId")})
public class Data333 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA333_ID")
    private Integer data333Id;
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
    @Size(max = 19)
    @Column(name = "LEHAHIJ_VRAH")
    private String lehahijVrah;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CILINDR")
    private BigDecimal cilindr;
    @Size(max = 4)
    @Column(name = "BAKTERII")
    private String bakterii;
    @Column(name = "ERITROCIT")
    private BigDecimal eritrocit;
    @Column(name = "LEJKOCIT")
    private BigDecimal lejkocit;
    @Size(max = 21)
    @Column(name = "NOMER_HEKA")
    private String nomerHeka;
    @Column(name = "DATA_ANALIZA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAnaliza;
    @Column(name = "NOMER")
    private BigDecimal nomer;
    @Size(max = 19)
    @Column(name = "VRAH_LABORANT")
    private String vrahLaborant;
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

    public Data333() {
    }

    public Data333(Integer data333Id) {
        this.data333Id = data333Id;
    }

    public Data333(Integer data333Id, int patientsId, Date dateConsultation, int motconsuId) {
        this.data333Id = data333Id;
        this.patientsId = patientsId;
        this.dateConsultation = dateConsultation;
        this.motconsuId = motconsuId;
    }

    public Integer getData333Id() {
        return data333Id;
    }

    public void setData333Id(Integer data333Id) {
        this.data333Id = data333Id;
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

    public BigDecimal getCilindr() {
        return cilindr;
    }

    public void setCilindr(BigDecimal cilindr) {
        this.cilindr = cilindr;
    }

    public String getBakterii() {
        return bakterii;
    }

    public void setBakterii(String bakterii) {
        this.bakterii = bakterii;
    }

    public BigDecimal getEritrocit() {
        return eritrocit;
    }

    public void setEritrocit(BigDecimal eritrocit) {
        this.eritrocit = eritrocit;
    }

    public BigDecimal getLejkocit() {
        return lejkocit;
    }

    public void setLejkocit(BigDecimal lejkocit) {
        this.lejkocit = lejkocit;
    }

    public String getNomerHeka() {
        return nomerHeka;
    }

    public void setNomerHeka(String nomerHeka) {
        this.nomerHeka = nomerHeka;
    }

    public Date getDataAnaliza() {
        return dataAnaliza;
    }

    public void setDataAnaliza(Date dataAnaliza) {
        this.dataAnaliza = dataAnaliza;
    }

    public BigDecimal getNomer() {
        return nomer;
    }

    public void setNomer(BigDecimal nomer) {
        this.nomer = nomer;
    }

    public String getVrahLaborant() {
        return vrahLaborant;
    }

    public void setVrahLaborant(String vrahLaborant) {
        this.vrahLaborant = vrahLaborant;
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
        hash += (data333Id != null ? data333Id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data333)) {
            return false;
        }
        Data333 other = (Data333) object;
        if ((this.data333Id == null && other.data333Id != null) || (this.data333Id != null && !this.data333Id.equals(other.data333Id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.Data333[ data333Id=" + data333Id + " ]";
    }
    
}
