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
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ОБЩИЙ АНАЛИЗ КРОВИ
 * @author kvo
 */
@Entity
@Table(name = "DATA328")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Data328.findAll", query = "SELECT d FROM Data328 d"),
    @NamedQuery(name = "Data328.findByData328Id", query = "SELECT d FROM Data328 d WHERE d.data328Id = :data328Id"),
    @NamedQuery(name = "Data328.findByPatientsId", query = "SELECT d FROM Data328 d WHERE d.patientsId = :patientsId"),
    @NamedQuery(name = "Data328.findByDateConsultation", query = "SELECT d FROM Data328 d WHERE d.dateConsultation = :dateConsultation"),
    @NamedQuery(name = "Data328.findByMotconsuId", query = "SELECT d FROM Data328 d WHERE d.motconsuId = :motconsuId"),
    @NamedQuery(name = "Data328.findByGranulocit", query = "SELECT d FROM Data328 d WHERE d.granulocit = :granulocit"),
    @NamedQuery(name = "Data328.findByRashetCvet", query = "SELECT d FROM Data328 d WHERE d.rashetCvet = :rashetCvet"),
    @NamedQuery(name = "Data328.findByHek", query = "SELECT d FROM Data328 d WHERE d.hek = :hek"),
    @NamedQuery(name = "Data328.findByGemotokritnoeHislo", query = "SELECT d FROM Data328 d WHERE d.gemotokritnoeHislo = :gemotokritnoeHislo"),
    @NamedQuery(name = "Data328.findByData", query = "SELECT d FROM Data328 d WHERE d.data = :data"),
    @NamedQuery(name = "Data328.findBySoe", query = "SELECT d FROM Data328 d WHERE d.soe = :soe"),
    @NamedQuery(name = "Data328.findByLimfocit", query = "SELECT d FROM Data328 d WHERE d.limfocit = :limfocit"),
    @NamedQuery(name = "Data328.findByMonocit", query = "SELECT d FROM Data328 d WHERE d.monocit = :monocit"),
    @NamedQuery(name = "Data328.findByEozinofil", query = "SELECT d FROM Data328 d WHERE d.eozinofil = :eozinofil"),
    @NamedQuery(name = "Data328.findBySegmentoqdernE", query = "SELECT d FROM Data328 d WHERE d.segmentoqdernE = :segmentoqdernE"),
    @NamedQuery(name = "Data328.findByPalohkoqdernE", query = "SELECT d FROM Data328 d WHERE d.palohkoqdernE = :palohkoqdernE"),
    @NamedQuery(name = "Data328.findByLejkocit", query = "SELECT d FROM Data328 d WHERE d.lejkocit = :lejkocit"),
    @NamedQuery(name = "Data328.findByTrombocT", query = "SELECT d FROM Data328 d WHERE d.trombocT = :trombocT"),
    @NamedQuery(name = "Data328.findByCvetnojPokazatel", query = "SELECT d FROM Data328 d WHERE d.cvetnojPokazatel = :cvetnojPokazatel"),
    @NamedQuery(name = "Data328.findByEritrocit", query = "SELECT d FROM Data328 d WHERE d.eritrocit = :eritrocit"),
    @NamedQuery(name = "Data328.findByRitrocitF", query = "SELECT d FROM Data328 d WHERE d.ritrocitF = :ritrocitF"),
    @NamedQuery(name = "Data328.findByGemoglobinf", query = "SELECT d FROM Data328 d WHERE d.gemoglobinf = :gemoglobinf"),
    @NamedQuery(name = "Data328.findByGemoglobin", query = "SELECT d FROM Data328 d WHERE d.gemoglobin = :gemoglobin"),
    @NamedQuery(name = "Data328.findByVrahLaborant", query = "SELECT d FROM Data328 d WHERE d.vrahLaborant = :vrahLaborant"),
    @NamedQuery(name = "Data328.findByLehahijVrah", query = "SELECT d FROM Data328 d WHERE d.lehahijVrah = :lehahijVrah"),
    @NamedQuery(name = "Data328.findByFAnaliza", query = "SELECT d FROM Data328 d WHERE d.fAnaliza = :fAnaliza"),
    @NamedQuery(name = "Data328.findByOtpravitNapohtu", query = "SELECT d FROM Data328 d WHERE d.otpravitNapohtu = :otpravitNapohtu"),
    @NamedQuery(name = "Data328.findByKrnCreateDate", query = "SELECT d FROM Data328 d WHERE d.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Data328.findByKrnCreateUserId", query = "SELECT d FROM Data328 d WHERE d.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Data328.findByKrnModifyDate", query = "SELECT d FROM Data328 d WHERE d.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Data328.findByKrnModifyUserId", query = "SELECT d FROM Data328 d WHERE d.krnModifyUserId = :krnModifyUserId")})
public class Data328 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA328_ID")
    private Integer data328Id;
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
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MOTCONSU_ID")
    private Motconsu motconsuId;
    
    @Size(max = 3)
    @Column(name = "GRANULOCIT")
    private String granulocit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RASHET_CVET")
    private BigDecimal rashetCvet;
    @Size(max = 21)
    @Column(name = "HEK")
    private String hek;
    @Size(max = 11)
    @Column(name = "GEMOTOKRITNOE_HISLO")
    private String gemotokritnoeHislo;
    @Column(name = "DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @Size(max = 11)
    @Column(name = "SOE")
    private String soe;
    @Size(max = 11)
    @Column(name = "LIMFOCIT")
    private String limfocit;
    @Size(max = 11)
    @Column(name = "MONOCIT")
    private String monocit;
    @Size(max = 11)
    @Column(name = "EOZINOFIL")
    private String eozinofil;
    @Size(max = 11)
    @Column(name = "SEGMENTOQDERN_E")
    private String segmentoqdernE;
    @Size(max = 11)
    @Column(name = "PALOHKOQDERN_E")
    private String palohkoqdernE;
    @Size(max = 11)
    @Column(name = "LEJKOCIT")
    private String lejkocit;
    @Size(max = 4)
    @Column(name = "TROMBOC_T")
    private String trombocT;
    @Size(max = 4)
    @Column(name = "CVETNOJ_POKAZATEL")
    private String cvetnojPokazatel;
    @Size(max = 11)
    @Column(name = "ERITROCIT")
    private String eritrocit;
    @Column(name = "RITROCIT_F")
    private BigDecimal ritrocitF;
    @Column(name = "GEMOGLOBINF")
    private BigDecimal gemoglobinf;
    @Size(max = 4)
    @Column(name = "GEMOGLOBIN")
    private String gemoglobin;
    @Size(max = 19)
    @Column(name = "VRAH_LABORANT")
    private String vrahLaborant;
    @Size(max = 19)
    @Column(name = "LEHAHIJ_VRAH")
    private String lehahijVrah;
    @Column(name = "F_ANALIZA")
    private BigDecimal fAnaliza;
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

    public Data328() {
    }

    public Data328(Integer data328Id) {
        this.data328Id = data328Id;
    }

    public Data328(Integer data328Id, int patientsId, Date dateConsultation, Motconsu motconsuId) {
        this.data328Id = data328Id;
        this.patientsId = patientsId;
        this.dateConsultation = dateConsultation;
        this.motconsuId = motconsuId;
    }

    public Integer getData328Id() {
        return data328Id;
    }

    public void setData328Id(Integer data328Id) {
        this.data328Id = data328Id;
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

    public Motconsu getMotconsuId() {
        return motconsuId;
    }

    public String getGranulocit() {
        return granulocit;
    }

    public void setGranulocit(String granulocit) {
        this.granulocit = granulocit;
    }

    public BigDecimal getRashetCvet() {
        return rashetCvet;
    }

    public void setRashetCvet(BigDecimal rashetCvet) {
        this.rashetCvet = rashetCvet;
    }

    public String getHek() {
        return hek;
    }

    public void setHek(String hek) {
        this.hek = hek;
    }

    public String getGemotokritnoeHislo() {
        return gemotokritnoeHislo;
    }

    public void setGemotokritnoeHislo(String gemotokritnoeHislo) {
        this.gemotokritnoeHislo = gemotokritnoeHislo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getSoe() {
        return soe;
    }

    public void setSoe(String soe) {
        this.soe = soe;
    }

    public String getLimfocit() {
        return limfocit;
    }

    public void setLimfocit(String limfocit) {
        this.limfocit = limfocit;
    }

    public String getMonocit() {
        return monocit;
    }

    public void setMonocit(String monocit) {
        this.monocit = monocit;
    }

    public String getEozinofil() {
        return eozinofil;
    }

    public void setEozinofil(String eozinofil) {
        this.eozinofil = eozinofil;
    }

    public String getSegmentoqdernE() {
        return segmentoqdernE;
    }

    public void setSegmentoqdernE(String segmentoqdernE) {
        this.segmentoqdernE = segmentoqdernE;
    }

    public String getPalohkoqdernE() {
        return palohkoqdernE;
    }

    public void setPalohkoqdernE(String palohkoqdernE) {
        this.palohkoqdernE = palohkoqdernE;
    }

    public String getLejkocit() {
        return lejkocit;
    }

    public void setLejkocit(String lejkocit) {
        this.lejkocit = lejkocit;
    }

    public String getTrombocT() {
        return trombocT;
    }

    public void setTrombocT(String trombocT) {
        this.trombocT = trombocT;
    }

    public String getCvetnojPokazatel() {
        return cvetnojPokazatel;
    }

    public void setCvetnojPokazatel(String cvetnojPokazatel) {
        this.cvetnojPokazatel = cvetnojPokazatel;
    }

    public String getEritrocit() {
        return eritrocit;
    }

    public void setEritrocit(String eritrocit) {
        this.eritrocit = eritrocit;
    }

    public BigDecimal getRitrocitF() {
        return ritrocitF;
    }

    public void setRitrocitF(BigDecimal ritrocitF) {
        this.ritrocitF = ritrocitF;
    }

    public BigDecimal getGemoglobinf() {
        return gemoglobinf;
    }

    public void setGemoglobinf(BigDecimal gemoglobinf) {
        this.gemoglobinf = gemoglobinf;
    }

    public String getGemoglobin() {
        return gemoglobin;
    }

    public void setGemoglobin(String gemoglobin) {
        this.gemoglobin = gemoglobin;
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

    public BigDecimal getFAnaliza() {
        return fAnaliza;
    }

    public void setFAnaliza(BigDecimal fAnaliza) {
        this.fAnaliza = fAnaliza;
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
        hash += (data328Id != null ? data328Id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data328)) {
            return false;
        }
        Data328 other = (Data328) object;
        if ((this.data328Id == null && other.data328Id != null) || (this.data328Id != null && !this.data328Id.equals(other.data328Id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.Data328[ data328Id=" + data328Id + " ]";
    }
    
}
