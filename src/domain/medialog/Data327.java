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
 * Мазки проба Шуварского
 * @author kvo
 */
@Entity
@Table(name = "DATA327")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Data327.findAll", query = "SELECT d FROM Data327 d"),
    @NamedQuery(name = "Data327.findByData327Id", query = "SELECT d FROM Data327 d WHERE d.data327Id = :data327Id"),
    @NamedQuery(name = "Data327.findByPatientsId", query = "SELECT d FROM Data327 d WHERE d.patientsId = :patientsId"),
    @NamedQuery(name = "Data327.findByDateConsultation", query = "SELECT d FROM Data327 d WHERE d.dateConsultation = :dateConsultation"),
    @NamedQuery(name = "Data327.findByMotconsuId", query = "SELECT d FROM Data327 d WHERE d.motconsuId = :motconsuId"),
    @NamedQuery(name = "Data327.findByNomer", query = "SELECT d FROM Data327 d WHERE d.nomer = :nomer"),
    @NamedQuery(name = "Data327.findByData", query = "SELECT d FROM Data327 d WHERE d.data = :data"),
    @NamedQuery(name = "Data327.findByVrahLaborant", query = "SELECT d FROM Data327 d WHERE d.vrahLaborant = :vrahLaborant"),
    @NamedQuery(name = "Data327.findByLehahijVrah", query = "SELECT d FROM Data327 d WHERE d.lehahijVrah = :lehahijVrah"),
    @NamedQuery(name = "Data327.findByCerPodvignostSpermatozo", query = "SELECT d FROM Data327 d WHERE d.cerPodvignostSpermatozo = :cerPodvignostSpermatozo"),
    @NamedQuery(name = "Data327.findByVagPodvignostSpermatozo", query = "SELECT d FROM Data327 d WHERE d.vagPodvignostSpermatozo = :vagPodvignostSpermatozo"),
    @NamedQuery(name = "Data327.findByOtpravitNapohtu", query = "SELECT d FROM Data327 d WHERE d.otpravitNapohtu = :otpravitNapohtu"),
    @NamedQuery(name = "Data327.findByKrnCreateDate", query = "SELECT d FROM Data327 d WHERE d.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Data327.findByKrnCreateUserId", query = "SELECT d FROM Data327 d WHERE d.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Data327.findByKrnModifyDate", query = "SELECT d FROM Data327 d WHERE d.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Data327.findByKrnModifyUserId", query = "SELECT d FROM Data327 d WHERE d.krnModifyUserId = :krnModifyUserId")})
public class Data327 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA327_ID")
    private Integer data327Id;
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "NOMER")
    private BigDecimal nomer;
    @Column(name = "DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @Size(max = 19)
    @Column(name = "VRAH_LABORANT")
    private String vrahLaborant;
    @Size(max = 19)
    @Column(name = "LEHAHIJ_VRAH")
    private String lehahijVrah;
    @Size(max = 44)
    @Column(name = "CER_PODVIGNOST_SPERMATOZO")
    private String cerPodvignostSpermatozo;
    @Size(max = 44)
    @Column(name = "VAG_PODVIGNOST_SPERMATOZO")
    private String vagPodvignostSpermatozo;
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

    public Data327() {
    }

    public Data327(Integer data327Id) {
        this.data327Id = data327Id;
    }

    public Data327(Integer data327Id, int patientsId, Date dateConsultation, int motconsuId) {
        this.data327Id = data327Id;
        this.patientsId = patientsId;
        this.dateConsultation = dateConsultation;
        this.motconsuId = motconsuId;
    }

    public Integer getData327Id() {
        return data327Id;
    }

    public void setData327Id(Integer data327Id) {
        this.data327Id = data327Id;
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

    public BigDecimal getNomer() {
        return nomer;
    }

    public void setNomer(BigDecimal nomer) {
        this.nomer = nomer;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getVrahLaborant() {
        return vrahLaborant;
    }

    public void setVrahLaborant(String vrahLaborant) {
        this.vrahLaborant = vrahLaborant;
    }

    public String getLehahijVrah() {
        return lehahijVrah;
    }

    public void setLehahijVrah(String lehahijVrah) {
        this.lehahijVrah = lehahijVrah;
    }

    public String getCerPodvignostSpermatozo() {
        return cerPodvignostSpermatozo;
    }

    public void setCerPodvignostSpermatozo(String cerPodvignostSpermatozo) {
        this.cerPodvignostSpermatozo = cerPodvignostSpermatozo;
    }

    public String getVagPodvignostSpermatozo() {
        return vagPodvignostSpermatozo;
    }

    public void setVagPodvignostSpermatozo(String vagPodvignostSpermatozo) {
        this.vagPodvignostSpermatozo = vagPodvignostSpermatozo;
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
        hash += (data327Id != null ? data327Id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data327)) {
            return false;
        }
        Data327 other = (Data327) object;
        if ((this.data327Id == null && other.data327Id != null) || (this.data327Id != null && !this.data327Id.equals(other.data327Id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.Data327[ data327Id=" + data327Id + " ]";
    }
    
}
