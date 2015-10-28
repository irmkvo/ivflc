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
 * БИО ОАМ
 * @author kvo
 */
@Entity
@Table(name = "DATA329")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Data329.findAll", query = "SELECT d FROM Data329 d"),
    @NamedQuery(name = "Data329.findByData329Id", query = "SELECT d FROM Data329 d WHERE d.data329Id = :data329Id"),
    @NamedQuery(name = "Data329.findByPatientsId", query = "SELECT d FROM Data329 d WHERE d.patientsId = :patientsId"),
    @NamedQuery(name = "Data329.findByDateConsultation", query = "SELECT d FROM Data329 d WHERE d.dateConsultation = :dateConsultation"),
    @NamedQuery(name = "Data329.findByMotconsuId", query = "SELECT d FROM Data329 d WHERE d.motconsuId = :motconsuId"),
    @NamedQuery(name = "Data329.findByPoZimnickomuUdVes8", query = "SELECT d FROM Data329 d WHERE d.poZimnickomuUdVes8 = :poZimnickomuUdVes8"),
    @NamedQuery(name = "Data329.findByPoZimnickomuUdVes7", query = "SELECT d FROM Data329 d WHERE d.poZimnickomuUdVes7 = :poZimnickomuUdVes7"),
    @NamedQuery(name = "Data329.findByPoZimnickomuUdVes6", query = "SELECT d FROM Data329 d WHERE d.poZimnickomuUdVes6 = :poZimnickomuUdVes6"),
    @NamedQuery(name = "Data329.findByPoZimnickomuUdVes5", query = "SELECT d FROM Data329 d WHERE d.poZimnickomuUdVes5 = :poZimnickomuUdVes5"),
    @NamedQuery(name = "Data329.findByPoZimnickomuUdVes4", query = "SELECT d FROM Data329 d WHERE d.poZimnickomuUdVes4 = :poZimnickomuUdVes4"),
    @NamedQuery(name = "Data329.findByPoZimnickomuUdVes3", query = "SELECT d FROM Data329 d WHERE d.poZimnickomuUdVes3 = :poZimnickomuUdVes3"),
    @NamedQuery(name = "Data329.findByPoZimnickomuUdVes2", query = "SELECT d FROM Data329 d WHERE d.poZimnickomuUdVes2 = :poZimnickomuUdVes2"),
    @NamedQuery(name = "Data329.findByPoZimnickomuUdVes1", query = "SELECT d FROM Data329 d WHERE d.poZimnickomuUdVes1 = :poZimnickomuUdVes1"),
    @NamedQuery(name = "Data329.findByPoZimnickomuKol8", query = "SELECT d FROM Data329 d WHERE d.poZimnickomuKol8 = :poZimnickomuKol8"),
    @NamedQuery(name = "Data329.findByPoZimnickomuKol7", query = "SELECT d FROM Data329 d WHERE d.poZimnickomuKol7 = :poZimnickomuKol7"),
    @NamedQuery(name = "Data329.findByPoZimnickomuKol6", query = "SELECT d FROM Data329 d WHERE d.poZimnickomuKol6 = :poZimnickomuKol6"),
    @NamedQuery(name = "Data329.findByPoZimnickomuKol5", query = "SELECT d FROM Data329 d WHERE d.poZimnickomuKol5 = :poZimnickomuKol5"),
    @NamedQuery(name = "Data329.findByPoZimnickomuKol4", query = "SELECT d FROM Data329 d WHERE d.poZimnickomuKol4 = :poZimnickomuKol4"),
    @NamedQuery(name = "Data329.findByPoZimnickomuKol3", query = "SELECT d FROM Data329 d WHERE d.poZimnickomuKol3 = :poZimnickomuKol3"),
    @NamedQuery(name = "Data329.findByPoZimnickomuKol2", query = "SELECT d FROM Data329 d WHERE d.poZimnickomuKol2 = :poZimnickomuKol2"),
    @NamedQuery(name = "Data329.findByPoZimnickomuKol1", query = "SELECT d FROM Data329 d WHERE d.poZimnickomuKol1 = :poZimnickomuKol1"),
    @NamedQuery(name = "Data329.findByPoZimnickomu", query = "SELECT d FROM Data329 d WHERE d.poZimnickomu = :poZimnickomu"),
    @NamedQuery(name = "Data329.findByPoZimnickomuPorcii", query = "SELECT d FROM Data329 d WHERE d.poZimnickomuPorcii = :poZimnickomuPorcii"),
    @NamedQuery(name = "Data329.findByPoZimnickomuLaborant", query = "SELECT d FROM Data329 d WHERE d.poZimnickomuLaborant = :poZimnickomuLaborant"),
    @NamedQuery(name = "Data329.findByPoZimnickomuLehahijVra", query = "SELECT d FROM Data329 d WHERE d.poZimnickomuLehahijVra = :poZimnickomuLehahijVra"),
    @NamedQuery(name = "Data329.findByPoZimnickomuData", query = "SELECT d FROM Data329 d WHERE d.poZimnickomuData = :poZimnickomuData"),
    @NamedQuery(name = "Data329.findByBakterii", query = "SELECT d FROM Data329 d WHERE d.bakterii = :bakterii"),
    @NamedQuery(name = "Data329.findBySliz", query = "SELECT d FROM Data329 d WHERE d.sliz = :sliz"),
    @NamedQuery(name = "Data329.findByCilindrZernistE", query = "SELECT d FROM Data329 d WHERE d.cilindrZernistE = :cilindrZernistE"),
    @NamedQuery(name = "Data329.findByEpitelijPereOdnJ", query = "SELECT d FROM Data329 d WHERE d.epitelijPereOdnJ = :epitelijPereOdnJ"),
    @NamedQuery(name = "Data329.findByEritrocitIzmenennE", query = "SELECT d FROM Data329 d WHERE d.eritrocitIzmenennE = :eritrocitIzmenennE"),
    @NamedQuery(name = "Data329.findByCilindr", query = "SELECT d FROM Data329 d WHERE d.cilindr = :cilindr"),
    @NamedQuery(name = "Data329.findByColi", query = "SELECT d FROM Data329 d WHERE d.coli = :coli"),
    @NamedQuery(name = "Data329.findByFBeremennosti", query = "SELECT d FROM Data329 d WHERE d.fBeremennosti = :fBeremennosti"),
    @NamedQuery(name = "Data329.findByKeton", query = "SELECT d FROM Data329 d WHERE d.keton = :keton"),
    @NamedQuery(name = "Data329.findByData", query = "SELECT d FROM Data329 d WHERE d.data = :data"),
    @NamedQuery(name = "Data329.findByVrahLaborant", query = "SELECT d FROM Data329 d WHERE d.vrahLaborant = :vrahLaborant"),
    @NamedQuery(name = "Data329.findByFAnaliza", query = "SELECT d FROM Data329 d WHERE d.fAnaliza = :fAnaliza"),
    @NamedQuery(name = "Data329.findByGlykoza", query = "SELECT d FROM Data329 d WHERE d.glykoza = :glykoza"),
    @NamedQuery(name = "Data329.findByEritrocit", query = "SELECT d FROM Data329 d WHERE d.eritrocit = :eritrocit"),
    @NamedQuery(name = "Data329.findByUrobilinoid", query = "SELECT d FROM Data329 d WHERE d.urobilinoid = :urobilinoid"),
    @NamedQuery(name = "Data329.findByOtnositelNaqPlotnost", query = "SELECT d FROM Data329 d WHERE d.otnositelNaqPlotnost = :otnositelNaqPlotnost"),
    @NamedQuery(name = "Data329.findByLejkocit", query = "SELECT d FROM Data329 d WHERE d.lejkocit = :lejkocit"),
    @NamedQuery(name = "Data329.findByPoloskiEpitelij", query = "SELECT d FROM Data329 d WHERE d.poloskiEpitelij = :poloskiEpitelij"),
    @NamedQuery(name = "Data329.findByBlirubin", query = "SELECT d FROM Data329 d WHERE d.blirubin = :blirubin"),
    @NamedQuery(name = "Data329.findByBelok", query = "SELECT d FROM Data329 d WHERE d.belok = :belok"),
    @NamedQuery(name = "Data329.findByCvet", query = "SELECT d FROM Data329 d WHERE d.cvet = :cvet"),
    @NamedQuery(name = "Data329.findByReakciq", query = "SELECT d FROM Data329 d WHERE d.reakciq = :reakciq"),
    @NamedQuery(name = "Data329.findByProzrahnost", query = "SELECT d FROM Data329 d WHERE d.prozrahnost = :prozrahnost"),
    @NamedQuery(name = "Data329.findByKolihestvo", query = "SELECT d FROM Data329 d WHERE d.kolihestvo = :kolihestvo"),
    @NamedQuery(name = "Data329.findByLehahijVrah", query = "SELECT d FROM Data329 d WHERE d.lehahijVrah = :lehahijVrah"),
    @NamedQuery(name = "Data329.findByOtpravitNapohtu", query = "SELECT d FROM Data329 d WHERE d.otpravitNapohtu = :otpravitNapohtu"),
    @NamedQuery(name = "Data329.findByKrnCreateDate", query = "SELECT d FROM Data329 d WHERE d.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Data329.findByKrnCreateUserId", query = "SELECT d FROM Data329 d WHERE d.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Data329.findByKrnModifyDate", query = "SELECT d FROM Data329 d WHERE d.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Data329.findByKrnModifyUserId", query = "SELECT d FROM Data329 d WHERE d.krnModifyUserId = :krnModifyUserId")})
public class Data329 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA329_ID")
    private Integer data329Id;
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
    @Column(name = "PO_ZIMNICKOMU_UD_VES_8")
    private BigDecimal poZimnickomuUdVes8;
    @Column(name = "PO_ZIMNICKOMU_UD_VES_7")
    private BigDecimal poZimnickomuUdVes7;
    @Column(name = "PO_ZIMNICKOMU_UD_VES_6")
    private BigDecimal poZimnickomuUdVes6;
    @Column(name = "PO_ZIMNICKOMU_UD_VES_5")
    private BigDecimal poZimnickomuUdVes5;
    @Column(name = "PO_ZIMNICKOMU_UD_VES_4")
    private BigDecimal poZimnickomuUdVes4;
    @Column(name = "PO_ZIMNICKOMU_UD_VES_3")
    private BigDecimal poZimnickomuUdVes3;
    @Column(name = "PO_ZIMNICKOMU_UD_VES_2")
    private BigDecimal poZimnickomuUdVes2;
    @Column(name = "PO_ZIMNICKOMU_UD_VES_1")
    private BigDecimal poZimnickomuUdVes1;
    @Column(name = "PO_ZIMNICKOMU_KOL_8")
    private BigDecimal poZimnickomuKol8;
    @Column(name = "PO_ZIMNICKOMU_KOL_7")
    private BigDecimal poZimnickomuKol7;
    @Column(name = "PO_ZIMNICKOMU_KOL_6")
    private BigDecimal poZimnickomuKol6;
    @Column(name = "PO_ZIMNICKOMU_KOL_5")
    private BigDecimal poZimnickomuKol5;
    @Column(name = "PO_ZIMNICKOMU_KOL_4")
    private BigDecimal poZimnickomuKol4;
    @Column(name = "PO_ZIMNICKOMU_KOL_3")
    private BigDecimal poZimnickomuKol3;
    @Column(name = "PO_ZIMNICKOMU_KOL_2")
    private BigDecimal poZimnickomuKol2;
    @Column(name = "PO_ZIMNICKOMU_KOL_1")
    private BigDecimal poZimnickomuKol1;
    @Size(max = 8)
    @Column(name = "PO_ZIMNICKOMU")
    private String poZimnickomu;
    @Column(name = "PO_ZIMNICKOMU_PORCII")
    private BigDecimal poZimnickomuPorcii;
    @Size(max = 17)
    @Column(name = "PO_ZIMNICKOMU_LABORANT")
    private String poZimnickomuLaborant;
    @Size(max = 17)
    @Column(name = "PO_ZIMNICKOMU_LEHAHIJ_VRA")
    private String poZimnickomuLehahijVra;
    @Column(name = "PO_ZIMNICKOMU_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date poZimnickomuData;
    @Size(max = 11)
    @Column(name = "BAKTERII")
    private String bakterii;
    @Size(max = 5)
    @Column(name = "SLIZ")
    private String sliz;
    @Size(max = 11)
    @Column(name = "CILINDR_ZERNIST_E")
    private String cilindrZernistE;
    @Size(max = 11)
    @Column(name = "EPITELIJ_PERE_ODN_J")
    private String epitelijPereOdnJ;
    @Size(max = 11)
    @Column(name = "ERITROCIT_IZMENENN_E")
    private String eritrocitIzmenennE;
    @Size(max = 11)
    @Column(name = "CILINDR")
    private String cilindr;
    @Size(max = 21)
    @Column(name = "COLI")
    private String coli;
    @Size(max = 21)
    @Column(name = "F_BEREMENNOSTI")
    private String fBeremennosti;
    @Size(max = 19)
    @Column(name = "KETON")
    private String keton;
    @Column(name = "DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @Size(max = 19)
    @Column(name = "VRAH_LABORANT")
    private String vrahLaborant;
    @Column(name = "F_ANALIZA")
    private BigDecimal fAnaliza;
    @Size(max = 19)
    @Column(name = "GLYKOZA")
    private String glykoza;
    @Size(max = 19)
    @Column(name = "ERITROCIT")
    private String eritrocit;
    @Size(max = 19)
    @Column(name = "UROBILINOID")
    private String urobilinoid;
    @Size(max = 11)
    @Column(name = "OTNOSITEL_NAQ_PLOTNOST")
    private String otnositelNaqPlotnost;
    @Size(max = 19)
    @Column(name = "LEJKOCIT")
    private String lejkocit;
    @Size(max = 19)
    @Column(name = "POLOSKI_EPITELIJ")
    private String poloskiEpitelij;
    @Size(max = 19)
    @Column(name = "BLIRUBIN")
    private String blirubin;
    @Size(max = 19)
    @Column(name = "BELOK")
    private String belok;
    @Size(max = 19)
    @Column(name = "CVET")
    private String cvet;
    @Size(max = 19)
    @Column(name = "REAKCIQ")
    private String reakciq;
    @Size(max = 19)
    @Column(name = "PROZRAHNOST")
    private String prozrahnost;
    @Size(max = 7)
    @Column(name = "KOLIHESTVO")
    private String kolihestvo;
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

    public Data329() {
    }

    public Data329(Integer data329Id) {
        this.data329Id = data329Id;
    }

    public Data329(Integer data329Id, int patientsId, Date dateConsultation, int motconsuId) {
        this.data329Id = data329Id;
        this.patientsId = patientsId;
        this.dateConsultation = dateConsultation;
        this.motconsuId = motconsuId;
    }

    public Integer getData329Id() {
        return data329Id;
    }

    public void setData329Id(Integer data329Id) {
        this.data329Id = data329Id;
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

    public BigDecimal getPoZimnickomuUdVes8() {
        return poZimnickomuUdVes8;
    }

    public void setPoZimnickomuUdVes8(BigDecimal poZimnickomuUdVes8) {
        this.poZimnickomuUdVes8 = poZimnickomuUdVes8;
    }

    public BigDecimal getPoZimnickomuUdVes7() {
        return poZimnickomuUdVes7;
    }

    public void setPoZimnickomuUdVes7(BigDecimal poZimnickomuUdVes7) {
        this.poZimnickomuUdVes7 = poZimnickomuUdVes7;
    }

    public BigDecimal getPoZimnickomuUdVes6() {
        return poZimnickomuUdVes6;
    }

    public void setPoZimnickomuUdVes6(BigDecimal poZimnickomuUdVes6) {
        this.poZimnickomuUdVes6 = poZimnickomuUdVes6;
    }

    public BigDecimal getPoZimnickomuUdVes5() {
        return poZimnickomuUdVes5;
    }

    public void setPoZimnickomuUdVes5(BigDecimal poZimnickomuUdVes5) {
        this.poZimnickomuUdVes5 = poZimnickomuUdVes5;
    }

    public BigDecimal getPoZimnickomuUdVes4() {
        return poZimnickomuUdVes4;
    }

    public void setPoZimnickomuUdVes4(BigDecimal poZimnickomuUdVes4) {
        this.poZimnickomuUdVes4 = poZimnickomuUdVes4;
    }

    public BigDecimal getPoZimnickomuUdVes3() {
        return poZimnickomuUdVes3;
    }

    public void setPoZimnickomuUdVes3(BigDecimal poZimnickomuUdVes3) {
        this.poZimnickomuUdVes3 = poZimnickomuUdVes3;
    }

    public BigDecimal getPoZimnickomuUdVes2() {
        return poZimnickomuUdVes2;
    }

    public void setPoZimnickomuUdVes2(BigDecimal poZimnickomuUdVes2) {
        this.poZimnickomuUdVes2 = poZimnickomuUdVes2;
    }

    public BigDecimal getPoZimnickomuUdVes1() {
        return poZimnickomuUdVes1;
    }

    public void setPoZimnickomuUdVes1(BigDecimal poZimnickomuUdVes1) {
        this.poZimnickomuUdVes1 = poZimnickomuUdVes1;
    }

    public BigDecimal getPoZimnickomuKol8() {
        return poZimnickomuKol8;
    }

    public void setPoZimnickomuKol8(BigDecimal poZimnickomuKol8) {
        this.poZimnickomuKol8 = poZimnickomuKol8;
    }

    public BigDecimal getPoZimnickomuKol7() {
        return poZimnickomuKol7;
    }

    public void setPoZimnickomuKol7(BigDecimal poZimnickomuKol7) {
        this.poZimnickomuKol7 = poZimnickomuKol7;
    }

    public BigDecimal getPoZimnickomuKol6() {
        return poZimnickomuKol6;
    }

    public void setPoZimnickomuKol6(BigDecimal poZimnickomuKol6) {
        this.poZimnickomuKol6 = poZimnickomuKol6;
    }

    public BigDecimal getPoZimnickomuKol5() {
        return poZimnickomuKol5;
    }

    public void setPoZimnickomuKol5(BigDecimal poZimnickomuKol5) {
        this.poZimnickomuKol5 = poZimnickomuKol5;
    }

    public BigDecimal getPoZimnickomuKol4() {
        return poZimnickomuKol4;
    }

    public void setPoZimnickomuKol4(BigDecimal poZimnickomuKol4) {
        this.poZimnickomuKol4 = poZimnickomuKol4;
    }

    public BigDecimal getPoZimnickomuKol3() {
        return poZimnickomuKol3;
    }

    public void setPoZimnickomuKol3(BigDecimal poZimnickomuKol3) {
        this.poZimnickomuKol3 = poZimnickomuKol3;
    }

    public BigDecimal getPoZimnickomuKol2() {
        return poZimnickomuKol2;
    }

    public void setPoZimnickomuKol2(BigDecimal poZimnickomuKol2) {
        this.poZimnickomuKol2 = poZimnickomuKol2;
    }

    public BigDecimal getPoZimnickomuKol1() {
        return poZimnickomuKol1;
    }

    public void setPoZimnickomuKol1(BigDecimal poZimnickomuKol1) {
        this.poZimnickomuKol1 = poZimnickomuKol1;
    }

    public String getPoZimnickomu() {
        return poZimnickomu;
    }

    public void setPoZimnickomu(String poZimnickomu) {
        this.poZimnickomu = poZimnickomu;
    }

    public BigDecimal getPoZimnickomuPorcii() {
        return poZimnickomuPorcii;
    }

    public void setPoZimnickomuPorcii(BigDecimal poZimnickomuPorcii) {
        this.poZimnickomuPorcii = poZimnickomuPorcii;
    }

    public String getPoZimnickomuLaborant() {
        return poZimnickomuLaborant;
    }

    public void setPoZimnickomuLaborant(String poZimnickomuLaborant) {
        this.poZimnickomuLaborant = poZimnickomuLaborant;
    }

    public String getPoZimnickomuLehahijVra() {
        return poZimnickomuLehahijVra;
    }

    public void setPoZimnickomuLehahijVra(String poZimnickomuLehahijVra) {
        this.poZimnickomuLehahijVra = poZimnickomuLehahijVra;
    }

    public Date getPoZimnickomuData() {
        return poZimnickomuData;
    }

    public void setPoZimnickomuData(Date poZimnickomuData) {
        this.poZimnickomuData = poZimnickomuData;
    }

    public String getBakterii() {
        return bakterii;
    }

    public void setBakterii(String bakterii) {
        this.bakterii = bakterii;
    }

    public String getSliz() {
        return sliz;
    }

    public void setSliz(String sliz) {
        this.sliz = sliz;
    }

    public String getCilindrZernistE() {
        return cilindrZernistE;
    }

    public void setCilindrZernistE(String cilindrZernistE) {
        this.cilindrZernistE = cilindrZernistE;
    }

    public String getEpitelijPereOdnJ() {
        return epitelijPereOdnJ;
    }

    public void setEpitelijPereOdnJ(String epitelijPereOdnJ) {
        this.epitelijPereOdnJ = epitelijPereOdnJ;
    }

    public String getEritrocitIzmenennE() {
        return eritrocitIzmenennE;
    }

    public void setEritrocitIzmenennE(String eritrocitIzmenennE) {
        this.eritrocitIzmenennE = eritrocitIzmenennE;
    }

    public String getCilindr() {
        return cilindr;
    }

    public void setCilindr(String cilindr) {
        this.cilindr = cilindr;
    }

    public String getColi() {
        return coli;
    }

    public void setColi(String coli) {
        this.coli = coli;
    }

    public String getFBeremennosti() {
        return fBeremennosti;
    }

    public void setFBeremennosti(String fBeremennosti) {
        this.fBeremennosti = fBeremennosti;
    }

    public String getKeton() {
        return keton;
    }

    public void setKeton(String keton) {
        this.keton = keton;
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

    public BigDecimal getFAnaliza() {
        return fAnaliza;
    }

    public void setFAnaliza(BigDecimal fAnaliza) {
        this.fAnaliza = fAnaliza;
    }

    public String getGlykoza() {
        return glykoza;
    }

    public void setGlykoza(String glykoza) {
        this.glykoza = glykoza;
    }

    public String getEritrocit() {
        return eritrocit;
    }

    public void setEritrocit(String eritrocit) {
        this.eritrocit = eritrocit;
    }

    public String getUrobilinoid() {
        return urobilinoid;
    }

    public void setUrobilinoid(String urobilinoid) {
        this.urobilinoid = urobilinoid;
    }

    public String getOtnositelNaqPlotnost() {
        return otnositelNaqPlotnost;
    }

    public void setOtnositelNaqPlotnost(String otnositelNaqPlotnost) {
        this.otnositelNaqPlotnost = otnositelNaqPlotnost;
    }

    public String getLejkocit() {
        return lejkocit;
    }

    public void setLejkocit(String lejkocit) {
        this.lejkocit = lejkocit;
    }

    public String getPoloskiEpitelij() {
        return poloskiEpitelij;
    }

    public void setPoloskiEpitelij(String poloskiEpitelij) {
        this.poloskiEpitelij = poloskiEpitelij;
    }

    public String getBlirubin() {
        return blirubin;
    }

    public void setBlirubin(String blirubin) {
        this.blirubin = blirubin;
    }

    public String getBelok() {
        return belok;
    }

    public void setBelok(String belok) {
        this.belok = belok;
    }

    public String getCvet() {
        return cvet;
    }

    public void setCvet(String cvet) {
        this.cvet = cvet;
    }

    public String getReakciq() {
        return reakciq;
    }

    public void setReakciq(String reakciq) {
        this.reakciq = reakciq;
    }

    public String getProzrahnost() {
        return prozrahnost;
    }

    public void setProzrahnost(String prozrahnost) {
        this.prozrahnost = prozrahnost;
    }

    public String getKolihestvo() {
        return kolihestvo;
    }

    public void setKolihestvo(String kolihestvo) {
        this.kolihestvo = kolihestvo;
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
        hash += (data329Id != null ? data329Id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data329)) {
            return false;
        }
        Data329 other = (Data329) object;
        if ((this.data329Id == null && other.data329Id != null) || (this.data329Id != null && !this.data329Id.equals(other.data329Id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.Data329[ data329Id=" + data329Id + " ]";
    }
    
}
