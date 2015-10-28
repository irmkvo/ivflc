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
 *
 * @author kvo
 */
@Entity
@Table(name = "DATA334")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Data334.findAll", query = "SELECT d FROM Data334 d"),
    @NamedQuery(name = "Data334.findByData334Id", query = "SELECT d FROM Data334 d WHERE d.data334Id = :data334Id"),
    @NamedQuery(name = "Data334.findByPatientsId", query = "SELECT d FROM Data334 d WHERE d.patientsId = :patientsId"),
    @NamedQuery(name = "Data334.findByDateConsultation", query = "SELECT d FROM Data334 d WHERE d.dateConsultation = :dateConsultation"),
    @NamedQuery(name = "Data334.findByMotconsuId", query = "SELECT d FROM Data334 d WHERE d.motconsuId = :motconsuId"),
    @NamedQuery(name = "Data334.findByRfmk", query = "SELECT d FROM Data334 d WHERE d.rfmk = :rfmk"),
    @NamedQuery(name = "Data334.findByVremqSvertVaniqPoSu1", query = "SELECT d FROM Data334 d WHERE d.vremqSvertVaniqPoSu1 = :vremqSvertVaniqPoSu1"),
    @NamedQuery(name = "Data334.findByProtrombinovJIndeks", query = "SELECT d FROM Data334 d WHERE d.protrombinovJIndeks = :protrombinovJIndeks"),
    @NamedQuery(name = "Data334.findByFibrinogenPoKlaussu", query = "SELECT d FROM Data334 d WHERE d.fibrinogenPoKlaussu = :fibrinogenPoKlaussu"),
    @NamedQuery(name = "Data334.findByProtrombinovoeVremqPoK", query = "SELECT d FROM Data334 d WHERE d.protrombinovoeVremqPoK = :protrombinovoeVremqPoK"),
    @NamedQuery(name = "Data334.findByMno", query = "SELECT d FROM Data334 d WHERE d.mno = :mno"),
    @NamedQuery(name = "Data334.findByProtrombinovoeVremq", query = "SELECT d FROM Data334 d WHERE d.protrombinovoeVremq = :protrombinovoeVremq"),
    @NamedQuery(name = "Data334.findByTrombinovoeVremqTv", query = "SELECT d FROM Data334 d WHERE d.trombinovoeVremqTv = :trombinovoeVremqTv"),
    @NamedQuery(name = "Data334.findByAhtvAktivHastTrombVre", query = "SELECT d FROM Data334 d WHERE d.ahtvAktivHastTrombVre = :ahtvAktivHastTrombVre"),
    @NamedQuery(name = "Data334.findByKolihestvoTrombocitov", query = "SELECT d FROM Data334 d WHERE d.kolihestvoTrombocitov = :kolihestvoTrombocitov"),
    @NamedQuery(name = "Data334.findByVremqSvertVaniqPoSuA", query = "SELECT d FROM Data334 d WHERE d.vremqSvertVaniqPoSuA = :vremqSvertVaniqPoSuA"),
    @NamedQuery(name = "Data334.findByNomerHeka", query = "SELECT d FROM Data334 d WHERE d.nomerHeka = :nomerHeka"),
    @NamedQuery(name = "Data334.findByNomerAnaliza", query = "SELECT d FROM Data334 d WHERE d.nomerAnaliza = :nomerAnaliza"),
    @NamedQuery(name = "Data334.findByLaborant", query = "SELECT d FROM Data334 d WHERE d.laborant = :laborant"),
    @NamedQuery(name = "Data334.findByLehahijVrah", query = "SELECT d FROM Data334 d WHERE d.lehahijVrah = :lehahijVrah"),
    @NamedQuery(name = "Data334.findByData", query = "SELECT d FROM Data334 d WHERE d.data = :data"),
    @NamedQuery(name = "Data334.findByDdimer", query = "SELECT d FROM Data334 d WHERE d.ddimer = :ddimer"),
    @NamedQuery(name = "Data334.findByVolhanAntikoagul", query = "SELECT d FROM Data334 d WHERE d.volhanAntikoagul = :volhanAntikoagul"),
    @NamedQuery(name = "Data334.findBySkrinningVolhanohnJ", query = "SELECT d FROM Data334 d WHERE d.skrinningVolhanohnJ = :skrinningVolhanohnJ"),
    @NamedQuery(name = "Data334.findByPodtvergdenieVolhanohnJ", query = "SELECT d FROM Data334 d WHERE d.podtvergdenieVolhanohnJ = :podtvergdenieVolhanohnJ"),
    @NamedQuery(name = "Data334.findByOtpravitNapohtu", query = "SELECT d FROM Data334 d WHERE d.otpravitNapohtu = :otpravitNapohtu"),
    @NamedQuery(name = "Data334.findByKrnCreateDate", query = "SELECT d FROM Data334 d WHERE d.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Data334.findByKrnCreateUserId", query = "SELECT d FROM Data334 d WHERE d.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Data334.findByKrnModifyDate", query = "SELECT d FROM Data334 d WHERE d.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Data334.findByKrnModifyUserId", query = "SELECT d FROM Data334 d WHERE d.krnModifyUserId = :krnModifyUserId")})
public class Data334 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA334_ID")
    private Integer data334Id;
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
    @Column(name = "RFMK")
    private BigDecimal rfmk;
    @Column(name = "VREMQ_SVERT_VANIQ_PO_SU_1")
    private BigDecimal vremqSvertVaniqPoSu1;
    @Column(name = "PROTROMBINOV_J_INDEKS")
    private BigDecimal protrombinovJIndeks;
    @Column(name = "FIBRINOGEN_PO_KLAUSSU")
    private BigDecimal fibrinogenPoKlaussu;
    @Column(name = "PROTROMBINOVOE_VREMQ_PO_K")
    private BigDecimal protrombinovoeVremqPoK;
    @Column(name = "MNO")
    private BigDecimal mno;
    @Column(name = "PROTROMBINOVOE_VREMQ")
    private BigDecimal protrombinovoeVremq;
    @Column(name = "TROMBINOVOE_VREMQ_TV")
    private BigDecimal trombinovoeVremqTv;
    @Column(name = "AHTV_AKTIV_HAST_TROMB_VRE")
    private BigDecimal ahtvAktivHastTrombVre;
    @Column(name = "KOLIHESTVO_TROMBOCITOV")
    private BigDecimal kolihestvoTrombocitov;
    @Column(name = "VREMQ_SVERT_VANIQ_PO_SU_A")
    private BigDecimal vremqSvertVaniqPoSuA;
    @Size(max = 23)
    @Column(name = "NOMER_HEKA")
    private String nomerHeka;
    @Column(name = "NOMER_ANALIZA")
    private BigDecimal nomerAnaliza;
    @Size(max = 19)
    @Column(name = "LABORANT")
    private String laborant;
    @Size(max = 19)
    @Column(name = "LEHAHIJ_VRAH")
    private String lehahijVrah;
    @Column(name = "DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @Column(name = "DDIMER")
    private BigDecimal ddimer;
    @Column(name = "VOLHAN_ANTIKOAGUL")
    private BigDecimal volhanAntikoagul;
    @Column(name = "SKRINNING_VOLHANOHN_J")
    private BigDecimal skrinningVolhanohnJ;
    @Column(name = "PODTVERGDENIE_VOLHANOHN_J")
    private BigDecimal podtvergdenieVolhanohnJ;
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

    public Data334() {
    }

    public Data334(Integer data334Id) {
        this.data334Id = data334Id;
    }

    public Data334(Integer data334Id, int patientsId, Date dateConsultation, int motconsuId) {
        this.data334Id = data334Id;
        this.patientsId = patientsId;
        this.dateConsultation = dateConsultation;
        this.motconsuId = motconsuId;
    }

    public Integer getData334Id() {
        return data334Id;
    }

    public void setData334Id(Integer data334Id) {
        this.data334Id = data334Id;
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

    public BigDecimal getRfmk() {
        return rfmk;
    }

    public void setRfmk(BigDecimal rfmk) {
        this.rfmk = rfmk;
    }

    public BigDecimal getVremqSvertVaniqPoSu1() {
        return vremqSvertVaniqPoSu1;
    }

    public void setVremqSvertVaniqPoSu1(BigDecimal vremqSvertVaniqPoSu1) {
        this.vremqSvertVaniqPoSu1 = vremqSvertVaniqPoSu1;
    }

    public BigDecimal getProtrombinovJIndeks() {
        return protrombinovJIndeks;
    }

    public void setProtrombinovJIndeks(BigDecimal protrombinovJIndeks) {
        this.protrombinovJIndeks = protrombinovJIndeks;
    }

    public BigDecimal getFibrinogenPoKlaussu() {
        return fibrinogenPoKlaussu;
    }

    public void setFibrinogenPoKlaussu(BigDecimal fibrinogenPoKlaussu) {
        this.fibrinogenPoKlaussu = fibrinogenPoKlaussu;
    }

    public BigDecimal getProtrombinovoeVremqPoK() {
        return protrombinovoeVremqPoK;
    }

    public void setProtrombinovoeVremqPoK(BigDecimal protrombinovoeVremqPoK) {
        this.protrombinovoeVremqPoK = protrombinovoeVremqPoK;
    }

    public BigDecimal getMno() {
        return mno;
    }

    public void setMno(BigDecimal mno) {
        this.mno = mno;
    }

    public BigDecimal getProtrombinovoeVremq() {
        return protrombinovoeVremq;
    }

    public void setProtrombinovoeVremq(BigDecimal protrombinovoeVremq) {
        this.protrombinovoeVremq = protrombinovoeVremq;
    }

    public BigDecimal getTrombinovoeVremqTv() {
        return trombinovoeVremqTv;
    }

    public void setTrombinovoeVremqTv(BigDecimal trombinovoeVremqTv) {
        this.trombinovoeVremqTv = trombinovoeVremqTv;
    }

    public BigDecimal getAhtvAktivHastTrombVre() {
        return ahtvAktivHastTrombVre;
    }

    public void setAhtvAktivHastTrombVre(BigDecimal ahtvAktivHastTrombVre) {
        this.ahtvAktivHastTrombVre = ahtvAktivHastTrombVre;
    }

    public BigDecimal getKolihestvoTrombocitov() {
        return kolihestvoTrombocitov;
    }

    public void setKolihestvoTrombocitov(BigDecimal kolihestvoTrombocitov) {
        this.kolihestvoTrombocitov = kolihestvoTrombocitov;
    }

    public BigDecimal getVremqSvertVaniqPoSuA() {
        return vremqSvertVaniqPoSuA;
    }

    public void setVremqSvertVaniqPoSuA(BigDecimal vremqSvertVaniqPoSuA) {
        this.vremqSvertVaniqPoSuA = vremqSvertVaniqPoSuA;
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

    public String getLaborant() {
        return laborant;
    }

    public void setLaborant(String laborant) {
        this.laborant = laborant;
    }

    public String getLehahijVrah() {
        return lehahijVrah;
    }

    public void setLehahijVrah(String lehahijVrah) {
        this.lehahijVrah = lehahijVrah;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public BigDecimal getDdimer() {
        return ddimer;
    }

    public void setDdimer(BigDecimal ddimer) {
        this.ddimer = ddimer;
    }

    public BigDecimal getVolhanAntikoagul() {
        return volhanAntikoagul;
    }

    public void setVolhanAntikoagul(BigDecimal volhanAntikoagul) {
        this.volhanAntikoagul = volhanAntikoagul;
    }

    public BigDecimal getSkrinningVolhanohnJ() {
        return skrinningVolhanohnJ;
    }

    public void setSkrinningVolhanohnJ(BigDecimal skrinningVolhanohnJ) {
        this.skrinningVolhanohnJ = skrinningVolhanohnJ;
    }

    public BigDecimal getPodtvergdenieVolhanohnJ() {
        return podtvergdenieVolhanohnJ;
    }

    public void setPodtvergdenieVolhanohnJ(BigDecimal podtvergdenieVolhanohnJ) {
        this.podtvergdenieVolhanohnJ = podtvergdenieVolhanohnJ;
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
        hash += (data334Id != null ? data334Id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data334)) {
            return false;
        }
        Data334 other = (Data334) object;
        if ((this.data334Id == null && other.data334Id != null) || (this.data334Id != null && !this.data334Id.equals(other.data334Id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.Data334[ data334Id=" + data334Id + " ]";
    }
    
}
