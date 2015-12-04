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
import javax.persistence.Lob;
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
 * MODELS_ID = 181
 * Гормон грмоны
 * @author kvo
 */
@Entity
@Table(name = "DATA146")
@XmlRootElement
public class Data146 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA146_ID")
    private Integer data146Id;
    @Column(name = "PATIENTS_ID")
    private Integer patientsId;
    @Column(name = "DATE_CONSULTATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateConsultation;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MOTCONSU_ID")
    private Motconsu motconsuId;
    
    @Size(max = 19)
    @Column(name = "VEDENIE_BEREMENNOSTI_1")
    private String vedenieBeremennosti1;
    @Column(name = "VEDENIE_BEREMENNOSTI")
    private Boolean vedenieBeremennosti;
    @Column(name = "FT4")
    private Boolean ft4;
    @Column(name = "FT3")
    private Boolean ft3;
    @Column(name = "SA_1251")
    private Boolean sa1251;
    @Column(name = "KORTIZOL1")
    private Boolean kortizol1;
    @Column(name = "TESTOSTERON1")
    private Boolean testosteron1;
    @Column(name = "DGEA_S")
    private Boolean dgeaS;
    @Column(name = "ESTRADIOL1")
    private Boolean estradiol1;
    @Column(name = "PROGESTERON1")
    private Boolean progesteron1;
    @Column(name = "FSG1")
    private Boolean fsg1;
    @Column(name = "LG1")
    private Boolean lg1;
    @Column(name = "PROLAKTIN1")
    private Boolean prolaktin1;
    @Column(name = "AT_K_TG1")
    private Boolean atKTg1;
    @Column(name = "AT_K_TPO")
    private Boolean atKTpo;
    @Column(name = "T4_SVOBODN_J1")
    private Boolean t4SvobodnJ1;
    @Column(name = "T4_OBHIJ1")
    private Boolean t4Obhij1;
    @Column(name = "T3_SVOBODN_J1")
    private Boolean t3SvobodnJ1;
    @Column(name = "T3_OBHIJ1")
    private Boolean t3Obhij1;
    @Column(name = "TTG1")
    private Boolean ttg1;
    @Column(name = "ASA1")
    private Boolean asa1;
    @Column(name = "ANTI_MYLLERVSKIJ_GORMON1")
    private Boolean antiMyllervskijGormon1;
    @Column(name = "SVOBODN_J_TESTOSTERON1")
    private Boolean svobodnJTestosteron1;
    @Size(max = 7)
    @Column(name = "SVOBODN_J_TESTOSTERON")
    private String svobodnJTestosteron;
    @Size(max = 7)
    @Column(name = "ANTI_MYLLERVSKIJ_GORMON")
    private String antiMyllervskijGormon;
    @Size(max = 25)
    @Column(name = "F_BEREMEN")
    private String fBeremen;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "F_ANALIZA")
    private BigDecimal fAnaliza;
    @Size(max = 149)
    @Column(name = "DIAGNOZ")
    private String diagnoz;
    @Size(max = 7)
    @Column(name = "ASA")
    private String asa;
    @Size(max = 49)
    @Column(name = "LEHAHIJ_VRAH")
    private String lehahijVrah;
    @Column(name = "DATA_ZABORA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataZabora;
    @Column(name = "DATA_OTPRAVLENIQ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataOtpravleniq;
    @Size(max = 49)
    @Column(name = "TTG")
    private String ttg;
    @Size(max = 49)
    @Column(name = "T3_OBHIJ")
    private String t3Obhij;
    @Size(max = 49)
    @Column(name = "T3_SVOBODN_J")
    private String t3SvobodnJ;
    @Size(max = 49)
    @Column(name = "T4_OBHIJ")
    private String t4Obhij;
    @Size(max = 49)
    @Column(name = "T4_SVOBODN_J")
    private String t4SvobodnJ;
    @Size(max = 49)
    @Column(name = "TIROKSINSVQZ_GLOBULIN")
    private String tiroksinsvqzGlobulin;
    @Column(name = "TIROKSINSVQZ_SPOSOBNOST")
    private BigDecimal tiroksinsvqzSposobnost;
    @Size(max = 49)
    @Column(name = "TIREOGLOBULIN")
    private String tireoglobulin;
    @Size(max = 49)
    @Column(name = "A_T_K_HITOVIDNOJ_GELEZE")
    private String aTKHG;
    @Size(max = 49)
    @Column(name = "AT_K_TG")
    private String atKTg;
    @Size(max = 12)
    @Column(name = "DEN_CIKLA")
    private String denCikla;
    @Size(max = 49)
    @Column(name = "PROLAKTIN")
    private String prolaktin;
    @Size(max = 49)
    @Column(name = "LG")
    private String lg;
    @Size(max = 49)
    @Column(name = "FSG")
    private String fsg;
    @Column(name = "PROGESTERON")
    private BigDecimal progesteron;
    @Column(name = "OH_PROGESTERON")
    private BigDecimal ohProgesteron;
    @Column(name = "TESTOSTERON")
    private BigDecimal testosteron;
    @Column(name = "TESTOSTERON_SVOBODN_J")
    private BigDecimal testosteronSvobodnJ;
    @Size(max = 49)
    @Column(name = "ESTRADIOL")
    private String estradiol;
    @Column(name = "F_GH")
    private BigDecimal fGh;
    @Column(name = "DEGIDROEPIANDROSTERON")
    private BigDecimal degidroepiandrosteron;
    @Size(max = 49)
    @Column(name = "GOMOCISTEZIN")
    private String gomocistezin;
    @Column(name = "SHBG")
    private BigDecimal shbg;
    @Size(max = 49)
    @Column(name = "AKTG")
    private String aktg;
    @Size(max = 49)
    @Column(name = "ADRENALIN_V_MOHE")
    private String adrenalinVMohe;
    @Size(max = 49)
    @Column(name = "NORSURENALIN_V_MOHE")
    private String norsurenalinVMohe;
    @Size(max = 49)
    @Column(name = "F17_OKS")
    private String f17Oks;
    @Size(max = 49)
    @Column(name = "F17_KS")
    private String f17Ks;
    @Column(name = "KORTIZOL")
    private BigDecimal kortizol;
    @Column(name = "SVOBODN_J_KORTIZOL_MOHI")
    private BigDecimal svobodnJKortizolMohi;
    @Size(max = 49)
    @Column(name = "INSULIN")
    private String insulin;
    @Size(max = 49)
    @Column(name = "KAL_CITONIN")
    private String kalCitonin;
    @Size(max = 49)
    @Column(name = "OSTEOKAL_CIN")
    private String osteokalCin;
    @Size(max = 49)
    @Column(name = "AL_DOSTERON")
    private String alDosteron;
    @Size(max = 49)
    @Column(name = "PARATGORMON")
    private String paratgormon;
    @Size(max = 49)
    @Column(name = "SOMATROPN_J_GORMON")
    private String somatropnJGormon;
    @Size(max = 49)
    @Column(name = "C_PEPTID")
    private String cPeptid;
    @Size(max = 49)
    @Column(name = "PSA")
    private String psa;
    @Size(max = 49)
    @Column(name = "PSA_SVOBODN_J")
    private String psaSvobodnJ;
    @Size(max = 49)
    @Column(name = "PSA_SVQZANN_J")
    private String psaSvqzannJ;
    @Size(max = 49)
    @Column(name = "PSA_PSA_SV")
    private String psaPsaSv;
    @Size(max = 49)
    @Column(name = "SA_15_3")
    private String sa153;
    @Size(max = 49)
    @Column(name = "SA_19_9")
    private String sa199;
    @Size(max = 49)
    @Column(name = "SA_72_4")
    private String sa724;
    @Size(max = 49)
    @Column(name = "SA_125")
    private String sa125;
    @Size(max = 49)
    @Column(name = "AFP")
    private String afp;
    @Size(max = 49)
    @Column(name = "REA")
    private String rea;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "KOMMENTARIJ")
    private String kommentarij;
    @Size(max = 49)
    @Column(name = "LABORATORIQ")
    private String laboratoriq;
    @Size(max = 19)
    @Column(name = "VRAH_LABORANT")
    private String vrahLaborant;
    @Size(max = 19)
    @Column(name = "REGISTRATOR")
    private String registrator;
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

    public Data146() {
    }

    public Data146(Integer data146Id) {
        this.data146Id = data146Id;
    }

    public Integer getData146Id() {
        return data146Id;
    }

    public void setData146Id(Integer data146Id) {
        this.data146Id = data146Id;
    }

    public Integer getPatientsId() {
        return patientsId;
    }

    public void setPatientsId(Integer patientsId) {
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
    
    public String getVedenieBeremennosti1() {
        return vedenieBeremennosti1;
    }

    public void setVedenieBeremennosti1(String vedenieBeremennosti1) {
        this.vedenieBeremennosti1 = vedenieBeremennosti1;
    }

    public Boolean getVedenieBeremennosti() {
        return vedenieBeremennosti;
    }

    public void setVedenieBeremennosti(Boolean vedenieBeremennosti) {
        this.vedenieBeremennosti = vedenieBeremennosti;
    }

    public Boolean getFt4() {
        return ft4;
    }

    public void setFt4(Boolean ft4) {
        this.ft4 = ft4;
    }

    public Boolean getFt3() {
        return ft3;
    }

    public void setFt3(Boolean ft3) {
        this.ft3 = ft3;
    }

    public Boolean getSa1251() {
        return sa1251;
    }

    public void setSa1251(Boolean sa1251) {
        this.sa1251 = sa1251;
    }

    public Boolean getKortizol1() {
        return kortizol1;
    }

    public void setKortizol1(Boolean kortizol1) {
        this.kortizol1 = kortizol1;
    }

    public Boolean getTestosteron1() {
        return testosteron1;
    }

    public void setTestosteron1(Boolean testosteron1) {
        this.testosteron1 = testosteron1;
    }

    public Boolean getDgeaS() {
        return dgeaS;
    }

    public void setDgeaS(Boolean dgeaS) {
        this.dgeaS = dgeaS;
    }

    public Boolean getEstradiol1() {
        return estradiol1;
    }

    public void setEstradiol1(Boolean estradiol1) {
        this.estradiol1 = estradiol1;
    }

    public Boolean getProgesteron1() {
        return progesteron1;
    }

    public void setProgesteron1(Boolean progesteron1) {
        this.progesteron1 = progesteron1;
    }

    public Boolean getFsg1() {
        return fsg1;
    }

    public void setFsg1(Boolean fsg1) {
        this.fsg1 = fsg1;
    }

    public Boolean getLg1() {
        return lg1;
    }

    public void setLg1(Boolean lg1) {
        this.lg1 = lg1;
    }

    public Boolean getProlaktin1() {
        return prolaktin1;
    }

    public void setProlaktin1(Boolean prolaktin1) {
        this.prolaktin1 = prolaktin1;
    }

    public Boolean getAtKTg1() {
        return atKTg1;
    }

    public void setAtKTg1(Boolean atKTg1) {
        this.atKTg1 = atKTg1;
    }

    public Boolean getAtKTpo() {
        return atKTpo;
    }

    public void setAtKTpo(Boolean atKTpo) {
        this.atKTpo = atKTpo;
    }

    public Boolean getT4SvobodnJ1() {
        return t4SvobodnJ1;
    }

    public void setT4SvobodnJ1(Boolean t4SvobodnJ1) {
        this.t4SvobodnJ1 = t4SvobodnJ1;
    }

    public Boolean getT4Obhij1() {
        return t4Obhij1;
    }

    public void setT4Obhij1(Boolean t4Obhij1) {
        this.t4Obhij1 = t4Obhij1;
    }

    public Boolean getT3SvobodnJ1() {
        return t3SvobodnJ1;
    }

    public void setT3SvobodnJ1(Boolean t3SvobodnJ1) {
        this.t3SvobodnJ1 = t3SvobodnJ1;
    }

    public Boolean getT3Obhij1() {
        return t3Obhij1;
    }

    public void setT3Obhij1(Boolean t3Obhij1) {
        this.t3Obhij1 = t3Obhij1;
    }

    public Boolean getTtg1() {
        return ttg1;
    }

    public void setTtg1(Boolean ttg1) {
        this.ttg1 = ttg1;
    }

    public Boolean getAsa1() {
        return asa1;
    }

    public void setAsa1(Boolean asa1) {
        this.asa1 = asa1;
    }

    public Boolean getAntiMyllervskijGormon1() {
        return antiMyllervskijGormon1;
    }

    public void setAntiMyllervskijGormon1(Boolean antiMyllervskijGormon1) {
        this.antiMyllervskijGormon1 = antiMyllervskijGormon1;
    }

    public Boolean getSvobodnJTestosteron1() {
        return svobodnJTestosteron1;
    }

    public void setSvobodnJTestosteron1(Boolean svobodnJTestosteron1) {
        this.svobodnJTestosteron1 = svobodnJTestosteron1;
    }

    public String getSvobodnJTestosteron() {
        return svobodnJTestosteron;
    }

    public void setSvobodnJTestosteron(String svobodnJTestosteron) {
        this.svobodnJTestosteron = svobodnJTestosteron;
    }

    public String getAntiMyllervskijGormon() {
        return antiMyllervskijGormon;
    }

    public void setAntiMyllervskijGormon(String antiMyllervskijGormon) {
        this.antiMyllervskijGormon = antiMyllervskijGormon;
    }

    public String getFBeremen() {
        return fBeremen;
    }

    public void setFBeremen(String fBeremen) {
        this.fBeremen = fBeremen;
    }

    public BigDecimal getFAnaliza() {
        return fAnaliza;
    }

    public void setFAnaliza(BigDecimal fAnaliza) {
        this.fAnaliza = fAnaliza;
    }

    public String getDiagnoz() {
        return diagnoz;
    }

    public void setDiagnoz(String diagnoz) {
        this.diagnoz = diagnoz;
    }

    public String getAsa() {
        return asa;
    }

    public void setAsa(String asa) {
        this.asa = asa;
    }

    public String getLehahijVrah() {
        return lehahijVrah;
    }

    public void setLehahijVrah(String lehahijVrah) {
        this.lehahijVrah = lehahijVrah;
    }

    public Date getDataZabora() {
        return dataZabora;
    }

    public void setDataZabora(Date dataZabora) {
        this.dataZabora = dataZabora;
    }

    public Date getDataOtpravleniq() {
        return dataOtpravleniq;
    }

    public void setDataOtpravleniq(Date dataOtpravleniq) {
        this.dataOtpravleniq = dataOtpravleniq;
    }

    public String getTtg() {
        return ttg;
    }

    public void setTtg(String ttg) {
        this.ttg = ttg;
    }

    public String getT3Obhij() {
        return t3Obhij;
    }

    public void setT3Obhij(String t3Obhij) {
        this.t3Obhij = t3Obhij;
    }

    public String getT3SvobodnJ() {
        return t3SvobodnJ;
    }

    public void setT3SvobodnJ(String t3SvobodnJ) {
        this.t3SvobodnJ = t3SvobodnJ;
    }

    public String getT4Obhij() {
        return t4Obhij;
    }

    public void setT4Obhij(String t4Obhij) {
        this.t4Obhij = t4Obhij;
    }

    public String getT4SvobodnJ() {
        return t4SvobodnJ;
    }

    public void setT4SvobodnJ(String t4SvobodnJ) {
        this.t4SvobodnJ = t4SvobodnJ;
    }

    public String getTiroksinsvqzGlobulin() {
        return tiroksinsvqzGlobulin;
    }

    public void setTiroksinsvqzGlobulin(String tiroksinsvqzGlobulin) {
        this.tiroksinsvqzGlobulin = tiroksinsvqzGlobulin;
    }

    public BigDecimal getTiroksinsvqzSposobnost() {
        return tiroksinsvqzSposobnost;
    }

    public void setTiroksinsvqzSposobnost(BigDecimal tiroksinsvqzSposobnost) {
        this.tiroksinsvqzSposobnost = tiroksinsvqzSposobnost;
    }

    public String getTireoglobulin() {
        return tireoglobulin;
    }

    public void setTireoglobulin(String tireoglobulin) {
        this.tireoglobulin = tireoglobulin;
    }

    public String getaTKHG() {
        return aTKHG;
    }

    public void setaTKHG(String aTKHitovidnojGeleze) {
        this.aTKHG = aTKHitovidnojGeleze;
    }

    public String getAtKTg() {
        return atKTg;
    }

    public void setAtKTg(String atKTg) {
        this.atKTg = atKTg;
    }

    public String getDenCikla() {
        return denCikla;
    }

    public void setDenCikla(String denCikla) {
        this.denCikla = denCikla;
    }

    public String getProlaktin() {
        return prolaktin;
    }

    public void setProlaktin(String prolaktin) {
        this.prolaktin = prolaktin;
    }

    public String getLg() {
        return lg;
    }

    public void setLg(String lg) {
        this.lg = lg;
    }

    public String getFsg() {
        return fsg;
    }

    public void setFsg(String fsg) {
        this.fsg = fsg;
    }

    public BigDecimal getProgesteron() {
        return progesteron;
    }

    public void setProgesteron(BigDecimal progesteron) {
        this.progesteron = progesteron;
    }

    public BigDecimal getOhProgesteron() {
        return ohProgesteron;
    }

    public void setOhProgesteron(BigDecimal ohProgesteron) {
        this.ohProgesteron = ohProgesteron;
    }

    public BigDecimal getTestosteron() {
        return testosteron;
    }

    public void setTestosteron(BigDecimal testosteron) {
        this.testosteron = testosteron;
    }

    public BigDecimal getTestosteronSvobodnJ() {
        return testosteronSvobodnJ;
    }

    public void setTestosteronSvobodnJ(BigDecimal testosteronSvobodnJ) {
        this.testosteronSvobodnJ = testosteronSvobodnJ;
    }

    public String getEstradiol() {
        return estradiol;
    }

    public void setEstradiol(String estradiol) {
        this.estradiol = estradiol;
    }

    public BigDecimal getFGh() {
        return fGh;
    }

    public void setFGh(BigDecimal fGh) {
        this.fGh = fGh;
    }

    public BigDecimal getDegidroepiandrosteron() {
        return degidroepiandrosteron;
    }

    public void setDegidroepiandrosteron(BigDecimal degidroepiandrosteron) {
        this.degidroepiandrosteron = degidroepiandrosteron;
    }

    public String getGomocistezin() {
        return gomocistezin;
    }

    public void setGomocistezin(String gomocistezin) {
        this.gomocistezin = gomocistezin;
    }

    public BigDecimal getShbg() {
        return shbg;
    }

    public void setShbg(BigDecimal shbg) {
        this.shbg = shbg;
    }

    public String getAktg() {
        return aktg;
    }

    public void setAktg(String aktg) {
        this.aktg = aktg;
    }

    public String getAdrenalinVMohe() {
        return adrenalinVMohe;
    }

    public void setAdrenalinVMohe(String adrenalinVMohe) {
        this.adrenalinVMohe = adrenalinVMohe;
    }

    public String getNorsurenalinVMohe() {
        return norsurenalinVMohe;
    }

    public void setNorsurenalinVMohe(String norsurenalinVMohe) {
        this.norsurenalinVMohe = norsurenalinVMohe;
    }

    public String getF17Oks() {
        return f17Oks;
    }

    public void setF17Oks(String f17Oks) {
        this.f17Oks = f17Oks;
    }

    public String getF17Ks() {
        return f17Ks;
    }

    public void setF17Ks(String f17Ks) {
        this.f17Ks = f17Ks;
    }

    public BigDecimal getKortizol() {
        return kortizol;
    }

    public void setKortizol(BigDecimal kortizol) {
        this.kortizol = kortizol;
    }

    public BigDecimal getSvobodnJKortizolMohi() {
        return svobodnJKortizolMohi;
    }

    public void setSvobodnJKortizolMohi(BigDecimal svobodnJKortizolMohi) {
        this.svobodnJKortizolMohi = svobodnJKortizolMohi;
    }

    public String getInsulin() {
        return insulin;
    }

    public void setInsulin(String insulin) {
        this.insulin = insulin;
    }

    public String getKalCitonin() {
        return kalCitonin;
    }

    public void setKalCitonin(String kalCitonin) {
        this.kalCitonin = kalCitonin;
    }

    public String getOsteokalCin() {
        return osteokalCin;
    }

    public void setOsteokalCin(String osteokalCin) {
        this.osteokalCin = osteokalCin;
    }

    public String getAlDosteron() {
        return alDosteron;
    }

    public void setAlDosteron(String alDosteron) {
        this.alDosteron = alDosteron;
    }

    public String getParatgormon() {
        return paratgormon;
    }

    public void setParatgormon(String paratgormon) {
        this.paratgormon = paratgormon;
    }

    public String getSomatropnJGormon() {
        return somatropnJGormon;
    }

    public void setSomatropnJGormon(String somatropnJGormon) {
        this.somatropnJGormon = somatropnJGormon;
    }

    public String getCPeptid() {
        return cPeptid;
    }

    public void setCPeptid(String cPeptid) {
        this.cPeptid = cPeptid;
    }

    public String getPsa() {
        return psa;
    }

    public void setPsa(String psa) {
        this.psa = psa;
    }

    public String getPsaSvobodnJ() {
        return psaSvobodnJ;
    }

    public void setPsaSvobodnJ(String psaSvobodnJ) {
        this.psaSvobodnJ = psaSvobodnJ;
    }

    public String getPsaSvqzannJ() {
        return psaSvqzannJ;
    }

    public void setPsaSvqzannJ(String psaSvqzannJ) {
        this.psaSvqzannJ = psaSvqzannJ;
    }

    public String getPsaPsaSv() {
        return psaPsaSv;
    }

    public void setPsaPsaSv(String psaPsaSv) {
        this.psaPsaSv = psaPsaSv;
    }

    public String getSa153() {
        return sa153;
    }

    public void setSa153(String sa153) {
        this.sa153 = sa153;
    }

    public String getSa199() {
        return sa199;
    }

    public void setSa199(String sa199) {
        this.sa199 = sa199;
    }

    public String getSa724() {
        return sa724;
    }

    public void setSa724(String sa724) {
        this.sa724 = sa724;
    }

    public String getSa125() {
        return sa125;
    }

    public void setSa125(String sa125) {
        this.sa125 = sa125;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public String getRea() {
        return rea;
    }

    public void setRea(String rea) {
        this.rea = rea;
    }

    public String getKommentarij() {
        return kommentarij;
    }

    public void setKommentarij(String kommentarij) {
        this.kommentarij = kommentarij;
    }

    public String getLaboratoriq() {
        return laboratoriq;
    }

    public void setLaboratoriq(String laboratoriq) {
        this.laboratoriq = laboratoriq;
    }

    public String getVrahLaborant() {
        return vrahLaborant;
    }

    public void setVrahLaborant(String vrahLaborant) {
        this.vrahLaborant = vrahLaborant;
    }

    public String getRegistrator() {
        return registrator;
    }

    public void setRegistrator(String registrator) {
        this.registrator = registrator;
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
        hash += (data146Id != null ? data146Id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data146)) {
            return false;
        }
        Data146 other = (Data146) object;
        if ((this.data146Id == null && other.data146Id != null) || (this.data146Id != null && !this.data146Id.equals(other.data146Id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.Data146[ data146Id=" + data146Id + " ]";
    }
    
}
