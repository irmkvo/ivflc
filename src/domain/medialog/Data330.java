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
 * MODELS_ID = 222 
 * БИО БХК
 * @author kvo
 */
@Entity
@Table(name = "DATA330")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Data330.findAll", query = "SELECT d FROM Data330 d"),
    @NamedQuery(name = "Data330.findByData330Id", query = "SELECT d FROM Data330 d WHERE d.data330Id = :data330Id"),
    @NamedQuery(name = "Data330.findByPatientsId", query = "SELECT d FROM Data330 d WHERE d.patientsId = :patientsId"),
    @NamedQuery(name = "Data330.findByDateConsultation", query = "SELECT d FROM Data330 d WHERE d.dateConsultation = :dateConsultation"),
    @NamedQuery(name = "Data330.findByMotconsuId", query = "SELECT d FROM Data330 d WHERE d.motconsuId = :motconsuId"),
    @NamedQuery(name = "Data330.findByBioImiq8Pokazatelej", query = "SELECT d FROM Data330 d WHERE d.bioImiq8Pokazatelej = :bioImiq8Pokazatelej"),
    @NamedQuery(name = "Data330.findByMohevina1", query = "SELECT d FROM Data330 d WHERE d.mohevina1 = :mohevina1"),
    @NamedQuery(name = "Data330.findByObhijBelok1", query = "SELECT d FROM Data330 d WHERE d.obhijBelok1 = :obhijBelok1"),
    @NamedQuery(name = "Data330.findByFOlesterin1", query = "SELECT d FROM Data330 d WHERE d.fOlesterin1 = :fOlesterin1"),
    @NamedQuery(name = "Data330.findByKreatinin1", query = "SELECT d FROM Data330 d WHERE d.kreatinin1 = :kreatinin1"),
    @NamedQuery(name = "Data330.findByAsat1", query = "SELECT d FROM Data330 d WHERE d.asat1 = :asat1"),
    @NamedQuery(name = "Data330.findByAlat1", query = "SELECT d FROM Data330 d WHERE d.alat1 = :alat1"),
    @NamedQuery(name = "Data330.findByBilirubinObhij1", query = "SELECT d FROM Data330 d WHERE d.bilirubinObhij1 = :bilirubinObhij1"),
    @NamedQuery(name = "Data330.findByAlBumin1", query = "SELECT d FROM Data330 d WHERE d.alBumin1 = :alBumin1"),
    @NamedQuery(name = "Data330.findByMohevaqKislota1", query = "SELECT d FROM Data330 d WHERE d.mohevaqKislota1 = :mohevaqKislota1"),
    @NamedQuery(name = "Data330.findByBilirubinPrqmoj1", query = "SELECT d FROM Data330 d WHERE d.bilirubinPrqmoj1 = :bilirubinPrqmoj1"),
    @NamedQuery(name = "Data330.findByGlykoza1", query = "SELECT d FROM Data330 d WHERE d.glykoza1 = :glykoza1"),
    @NamedQuery(name = "Data330.findByBilirubinNeprqmoj1", query = "SELECT d FROM Data330 d WHERE d.bilirubinNeprqmoj1 = :bilirubinNeprqmoj1"),
    @NamedQuery(name = "Data330.findByHelohnaqFosfotaza1", query = "SELECT d FROM Data330 d WHERE d.helohnaqFosfotaza1 = :helohnaqFosfotaza1"),
    @NamedQuery(name = "Data330.findByTriglicerid1", query = "SELECT d FROM Data330 d WHERE d.triglicerid1 = :triglicerid1"),
    @NamedQuery(name = "Data330.findByGgt1", query = "SELECT d FROM Data330 d WHERE d.ggt1 = :ggt1"),
    @NamedQuery(name = "Data330.findBySVorotohnoeGelezo1", query = "SELECT d FROM Data330 d WHERE d.sVorotohnoeGelezo1 = :sVorotohnoeGelezo1"),
    @NamedQuery(name = "Data330.findBySVorotohnoeGelezo", query = "SELECT d FROM Data330 d WHERE d.sVorotohnoeGelezo = :sVorotohnoeGelezo"),
    @NamedQuery(name = "Data330.findByGgt", query = "SELECT d FROM Data330 d WHERE d.ggt = :ggt"),
    @NamedQuery(name = "Data330.findByTriglicerid", query = "SELECT d FROM Data330 d WHERE d.triglicerid = :triglicerid"),
    @NamedQuery(name = "Data330.findByHelohnaqFosfotaza", query = "SELECT d FROM Data330 d WHERE d.helohnaqFosfotaza = :helohnaqFosfotaza"),
    @NamedQuery(name = "Data330.findByBilirubinNeprqmoj", query = "SELECT d FROM Data330 d WHERE d.bilirubinNeprqmoj = :bilirubinNeprqmoj"),
    @NamedQuery(name = "Data330.findByBilirubinPrqmoj", query = "SELECT d FROM Data330 d WHERE d.bilirubinPrqmoj = :bilirubinPrqmoj"),
    @NamedQuery(name = "Data330.findByMohevaqKislota", query = "SELECT d FROM Data330 d WHERE d.mohevaqKislota = :mohevaqKislota"),
    @NamedQuery(name = "Data330.findByAlBumin", query = "SELECT d FROM Data330 d WHERE d.alBumin = :alBumin"),
    @NamedQuery(name = "Data330.findByHek", query = "SELECT d FROM Data330 d WHERE d.hek = :hek"),
    @NamedQuery(name = "Data330.findByNomer", query = "SELECT d FROM Data330 d WHERE d.nomer = :nomer"),
    @NamedQuery(name = "Data330.findByFOlesterin", query = "SELECT d FROM Data330 d WHERE d.fOlesterin = :fOlesterin"),
    @NamedQuery(name = "Data330.findByBilirubinObhij", query = "SELECT d FROM Data330 d WHERE d.bilirubinObhij = :bilirubinObhij"),
    @NamedQuery(name = "Data330.findByAsat", query = "SELECT d FROM Data330 d WHERE d.asat = :asat"),
    @NamedQuery(name = "Data330.findByAlat", query = "SELECT d FROM Data330 d WHERE d.alat = :alat"),
    @NamedQuery(name = "Data330.findByGlykoza", query = "SELECT d FROM Data330 d WHERE d.glykoza = :glykoza"),
    @NamedQuery(name = "Data330.findByMohevina", query = "SELECT d FROM Data330 d WHERE d.mohevina = :mohevina"),
    @NamedQuery(name = "Data330.findByKreatinin", query = "SELECT d FROM Data330 d WHERE d.kreatinin = :kreatinin"),
    @NamedQuery(name = "Data330.findByObhijBelok", query = "SELECT d FROM Data330 d WHERE d.obhijBelok = :obhijBelok"),
    @NamedQuery(name = "Data330.findByData", query = "SELECT d FROM Data330 d WHERE d.data = :data"),
    @NamedQuery(name = "Data330.findByVrahLaborant", query = "SELECT d FROM Data330 d WHERE d.vrahLaborant = :vrahLaborant"),
    @NamedQuery(name = "Data330.findByLehahijVrah", query = "SELECT d FROM Data330 d WHERE d.lehahijVrah = :lehahijVrah"),
    @NamedQuery(name = "Data330.findByOtpravitNapohtu", query = "SELECT d FROM Data330 d WHERE d.otpravitNapohtu = :otpravitNapohtu"),
    @NamedQuery(name = "Data330.findByKrnCreateDate", query = "SELECT d FROM Data330 d WHERE d.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Data330.findByKrnCreateUserId", query = "SELECT d FROM Data330 d WHERE d.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Data330.findByKrnModifyDate", query = "SELECT d FROM Data330 d WHERE d.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Data330.findByKrnModifyUserId", query = "SELECT d FROM Data330 d WHERE d.krnModifyUserId = :krnModifyUserId")})
public class Data330 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA330_ID")
    private Integer data330Id;
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
    
    @Column(name = "BIO_IMIQ_8_POKAZATELEJ")
    private Boolean bioImiq8Pokazatelej;
    @Column(name = "MOHEVINA1")
    private Boolean mohevina1;
    @Column(name = "OBHIJ_BELOK1")
    private Boolean obhijBelok1;
    @Column(name = "F_OLESTERIN1")
    private Boolean fOlesterin1;
    @Column(name = "KREATININ1")
    private Boolean kreatinin1;
    @Column(name = "ASAT1")
    private Boolean asat1;
    @Column(name = "ALAT1")
    private Boolean alat1;
    @Column(name = "BILIRUBIN_OBHIJ_1")
    private Boolean bilirubinObhij1;
    @Column(name = "AL_BUMIN1")
    private Boolean alBumin1;
    @Column(name = "MOHEVAQ_KISLOTA1")
    private Boolean mohevaqKislota1;
    @Column(name = "BILIRUBIN_PRQMOJ_1")
    private Boolean bilirubinPrqmoj1;
    @Column(name = "GLYKOZA1")
    private Boolean glykoza1;
    @Column(name = "BILIRUBIN_NEPRQMOJ_1")
    private Boolean bilirubinNeprqmoj1;
    @Column(name = "HELOHNAQ_FOSFOTAZA1")
    private Boolean helohnaqFosfotaza1;
    @Column(name = "TRIGLICERID_1")
    private Boolean triglicerid1;
    @Column(name = "GGT1")
    private Boolean ggt1;
    @Column(name = "S_VOROTOHNOE_GELEZO1")
    private Boolean sVorotohnoeGelezo1;
    @Size(max = 4)
    @Column(name = "S_VOROTOHNOE_GELEZO")
    private String sVorotohnoeGelezo;
    @Size(max = 4)
    @Column(name = "GGT")
    private String ggt;
    @Size(max = 4)
    @Column(name = "TRIGLICERID")
    private String triglicerid;
    @Size(max = 4)
    @Column(name = "HELOHNAQ_FOSFOTAZA")
    private String helohnaqFosfotaza;
    @Size(max = 4)
    @Column(name = "BILIRUBIN_NEPRQMOJ")
    private String bilirubinNeprqmoj;
    @Size(max = 4)
    @Column(name = "BILIRUBIN_PRQMOJ")
    private String bilirubinPrqmoj;
    @Size(max = 4)
    @Column(name = "MOHEVAQ_KISLOTA")
    private String mohevaqKislota;
    @Size(max = 4)
    @Column(name = "AL_BUMIN")
    private String alBumin;
    @Size(max = 21)
    @Column(name = "HEK")
    private String hek;
    @Size(max = 6)
    @Column(name = "NOMER")
    private String nomer;
    @Size(max = 4)
    @Column(name = "F_OLESTERIN")
    private String fOlesterin;
    @Size(max = 4)
    @Column(name = "BILIRUBIN_OBHIJ")
    private String bilirubinObhij;
    @Size(max = 4)
    @Column(name = "ASAT")
    private String asat;
    @Size(max = 4)
    @Column(name = "ALAT")
    private String alat;
    @Size(max = 4)
    @Column(name = "GLYKOZA")
    private String glykoza;
    @Size(max = 4)
    @Column(name = "MOHEVINA")
    private String mohevina;
    @Size(max = 4)
    @Column(name = "KREATININ")
    private String kreatinin;
    @Size(max = 4)
    @Column(name = "OBHIJ_BELOK")
    private String obhijBelok;
    @Column(name = "DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @Size(max = 19)
    @Column(name = "VRAH_LABORANT")
    private String vrahLaborant;
    @Size(max = 19)
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

    public Data330() {
    }

    public Data330(Integer data330Id) {
        this.data330Id = data330Id;
    }

    public Data330(Integer data330Id, int patientsId, Date dateConsultation) {
        this.data330Id = data330Id;
        this.patientsId = patientsId;
        this.dateConsultation = dateConsultation;
    }

    public Integer getData330Id() {
        return data330Id;
    }

    public void setData330Id(Integer data330Id) {
        this.data330Id = data330Id;
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

    public void setMotconsuId(Motconsu motconsuId) {
        this.motconsuId = motconsuId;
    }

    public Boolean getBioImiq8Pokazatelej() {
        return bioImiq8Pokazatelej;
    }

    public void setBioImiq8Pokazatelej(Boolean bioImiq8Pokazatelej) {
        this.bioImiq8Pokazatelej = bioImiq8Pokazatelej;
    }

    public Boolean getMohevina1() {
        return mohevina1;
    }

    public void setMohevina1(Boolean mohevina1) {
        this.mohevina1 = mohevina1;
    }

    public Boolean getObhijBelok1() {
        return obhijBelok1;
    }

    public void setObhijBelok1(Boolean obhijBelok1) {
        this.obhijBelok1 = obhijBelok1;
    }

    public Boolean getFOlesterin1() {
        return fOlesterin1;
    }

    public void setFOlesterin1(Boolean fOlesterin1) {
        this.fOlesterin1 = fOlesterin1;
    }

    public Boolean getKreatinin1() {
        return kreatinin1;
    }

    public void setKreatinin1(Boolean kreatinin1) {
        this.kreatinin1 = kreatinin1;
    }

    public Boolean getAsat1() {
        return asat1;
    }

    public void setAsat1(Boolean asat1) {
        this.asat1 = asat1;
    }

    public Boolean getAlat1() {
        return alat1;
    }

    public void setAlat1(Boolean alat1) {
        this.alat1 = alat1;
    }

    public Boolean getBilirubinObhij1() {
        return bilirubinObhij1;
    }

    public void setBilirubinObhij1(Boolean bilirubinObhij1) {
        this.bilirubinObhij1 = bilirubinObhij1;
    }

    public Boolean getAlBumin1() {
        return alBumin1;
    }

    public void setAlBumin1(Boolean alBumin1) {
        this.alBumin1 = alBumin1;
    }

    public Boolean getMohevaqKislota1() {
        return mohevaqKislota1;
    }

    public void setMohevaqKislota1(Boolean mohevaqKislota1) {
        this.mohevaqKislota1 = mohevaqKislota1;
    }

    public Boolean getBilirubinPrqmoj1() {
        return bilirubinPrqmoj1;
    }

    public void setBilirubinPrqmoj1(Boolean bilirubinPrqmoj1) {
        this.bilirubinPrqmoj1 = bilirubinPrqmoj1;
    }

    public Boolean getGlykoza1() {
        return glykoza1;
    }

    public void setGlykoza1(Boolean glykoza1) {
        this.glykoza1 = glykoza1;
    }

    public Boolean getBilirubinNeprqmoj1() {
        return bilirubinNeprqmoj1;
    }

    public void setBilirubinNeprqmoj1(Boolean bilirubinNeprqmoj1) {
        this.bilirubinNeprqmoj1 = bilirubinNeprqmoj1;
    }

    public Boolean getHelohnaqFosfotaza1() {
        return helohnaqFosfotaza1;
    }

    public void setHelohnaqFosfotaza1(Boolean helohnaqFosfotaza1) {
        this.helohnaqFosfotaza1 = helohnaqFosfotaza1;
    }

    public Boolean getTriglicerid1() {
        return triglicerid1;
    }

    public void setTriglicerid1(Boolean triglicerid1) {
        this.triglicerid1 = triglicerid1;
    }

    public Boolean getGgt1() {
        return ggt1;
    }

    public void setGgt1(Boolean ggt1) {
        this.ggt1 = ggt1;
    }

    public Boolean getSVorotohnoeGelezo1() {
        return sVorotohnoeGelezo1;
    }

    public void setSVorotohnoeGelezo1(Boolean sVorotohnoeGelezo1) {
        this.sVorotohnoeGelezo1 = sVorotohnoeGelezo1;
    }

    public String getSVorotohnoeGelezo() {
        return sVorotohnoeGelezo;
    }

    public void setSVorotohnoeGelezo(String sVorotohnoeGelezo) {
        this.sVorotohnoeGelezo = sVorotohnoeGelezo;
    }

    public String getGgt() {
        return ggt;
    }

    public void setGgt(String ggt) {
        this.ggt = ggt;
    }

    public String getTriglicerid() {
        return triglicerid;
    }

    public void setTriglicerid(String triglicerid) {
        this.triglicerid = triglicerid;
    }

    public String getHelohnaqFosfotaza() {
        return helohnaqFosfotaza;
    }

    public void setHelohnaqFosfotaza(String helohnaqFosfotaza) {
        this.helohnaqFosfotaza = helohnaqFosfotaza;
    }

    public String getBilirubinNeprqmoj() {
        return bilirubinNeprqmoj;
    }

    public void setBilirubinNeprqmoj(String bilirubinNeprqmoj) {
        this.bilirubinNeprqmoj = bilirubinNeprqmoj;
    }

    public String getBilirubinPrqmoj() {
        return bilirubinPrqmoj;
    }

    public void setBilirubinPrqmoj(String bilirubinPrqmoj) {
        this.bilirubinPrqmoj = bilirubinPrqmoj;
    }

    public String getMohevaqKislota() {
        return mohevaqKislota;
    }

    public void setMohevaqKislota(String mohevaqKislota) {
        this.mohevaqKislota = mohevaqKislota;
    }

    public String getAlBumin() {
        return alBumin;
    }

    public void setAlBumin(String alBumin) {
        this.alBumin = alBumin;
    }

    public String getHek() {
        return hek;
    }

    public void setHek(String hek) {
        this.hek = hek;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public String getFOlesterin() {
        return fOlesterin;
    }

    public void setFOlesterin(String fOlesterin) {
        this.fOlesterin = fOlesterin;
    }

    public String getBilirubinObhij() {
        return bilirubinObhij;
    }

    public void setBilirubinObhij(String bilirubinObhij) {
        this.bilirubinObhij = bilirubinObhij;
    }

    public String getAsat() {
        return asat;
    }

    public void setAsat(String asat) {
        this.asat = asat;
    }

    public String getAlat() {
        return alat;
    }

    public void setAlat(String alat) {
        this.alat = alat;
    }

    public String getGlykoza() {
        return glykoza;
    }

    public void setGlykoza(String glykoza) {
        this.glykoza = glykoza;
    }

    public String getMohevina() {
        return mohevina;
    }

    public void setMohevina(String mohevina) {
        this.mohevina = mohevina;
    }

    public String getKreatinin() {
        return kreatinin;
    }

    public void setKreatinin(String kreatinin) {
        this.kreatinin = kreatinin;
    }

    public String getObhijBelok() {
        return obhijBelok;
    }

    public void setObhijBelok(String obhijBelok) {
        this.obhijBelok = obhijBelok;
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
        hash += (data330Id != null ? data330Id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data330)) {
            return false;
        }
        Data330 other = (Data330) object;
        if ((this.data330Id == null && other.data330Id != null) || (this.data330Id != null && !this.data330Id.equals(other.data330Id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.Data330[ data330Id=" + data330Id + " ]";
    }
    
}
