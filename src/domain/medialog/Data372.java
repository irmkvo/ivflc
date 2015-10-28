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
 * ГОРМОН ИНФЕКЦИИ
 * @author kvo
 */
@Entity
@Table(name = "DATA372")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Data372.findAll", query = "SELECT d FROM Data372 d"),
    @NamedQuery(name = "Data372.findByData372Id", query = "SELECT d FROM Data372 d WHERE d.data372Id = :data372Id"),
    @NamedQuery(name = "Data372.findByPatientsId", query = "SELECT d FROM Data372 d WHERE d.patientsId = :patientsId"),
    @NamedQuery(name = "Data372.findByDateConsultation", query = "SELECT d FROM Data372 d WHERE d.dateConsultation = :dateConsultation"),
    @NamedQuery(name = "Data372.findByMotconsuId", query = "SELECT d FROM Data372 d WHERE d.motconsuId = :motconsuId"),
    @NamedQuery(name = "Data372.findByListereozG2", query = "SELECT d FROM Data372 d WHERE d.listereozG2 = :listereozG2"),
    @NamedQuery(name = "Data372.findByListereozG1", query = "SELECT d FROM Data372 d WHERE d.listereozG1 = :listereozG1"),
    @NamedQuery(name = "Data372.findByListereozG", query = "SELECT d FROM Data372 d WHERE d.listereozG = :listereozG"),
    @NamedQuery(name = "Data372.findByListereozG12", query = "SELECT d FROM Data372 d WHERE d.listereozG12 = :listereozG12"),
    @NamedQuery(name = "Data372.findByBrucelezG2", query = "SELECT d FROM Data372 d WHERE d.brucelezG2 = :brucelezG2"),
    @NamedQuery(name = "Data372.findByBrucelezG1", query = "SELECT d FROM Data372 d WHERE d.brucelezG1 = :brucelezG1"),
    @NamedQuery(name = "Data372.findByBrucelezG", query = "SELECT d FROM Data372 d WHERE d.brucelezG = :brucelezG"),
    @NamedQuery(name = "Data372.findByBrucelezG12", query = "SELECT d FROM Data372 d WHERE d.brucelezG12 = :brucelezG12"),
    @NamedQuery(name = "Data372.findByMikoplazmaG1", query = "SELECT d FROM Data372 d WHERE d.mikoplazmaG1 = :mikoplazmaG1"),
    @NamedQuery(name = "Data372.findByMikoplazmaG2", query = "SELECT d FROM Data372 d WHERE d.mikoplazmaG2 = :mikoplazmaG2"),
    @NamedQuery(name = "Data372.findByMikoplazmaG", query = "SELECT d FROM Data372 d WHERE d.mikoplazmaG = :mikoplazmaG"),
    @NamedQuery(name = "Data372.findByMikoplazmaG12", query = "SELECT d FROM Data372 d WHERE d.mikoplazmaG12 = :mikoplazmaG12"),
    @NamedQuery(name = "Data372.findByMikoplazmaM2", query = "SELECT d FROM Data372 d WHERE d.mikoplazmaM2 = :mikoplazmaM2"),
    @NamedQuery(name = "Data372.findByMikoplazmaM1", query = "SELECT d FROM Data372 d WHERE d.mikoplazmaM1 = :mikoplazmaM1"),
    @NamedQuery(name = "Data372.findByMikoplazmaM", query = "SELECT d FROM Data372 d WHERE d.mikoplazmaM = :mikoplazmaM"),
    @NamedQuery(name = "Data372.findByMikoplazmaM12", query = "SELECT d FROM Data372 d WHERE d.mikoplazmaM12 = :mikoplazmaM12"),
    @NamedQuery(name = "Data372.findByToOM", query = "SELECT d FROM Data372 d WHERE d.toOM = :toOM"),
    @NamedQuery(name = "Data372.findByToOM1", query = "SELECT d FROM Data372 d WHERE d.toOM1 = :toOM1"),
    @NamedQuery(name = "Data372.findByToOM11", query = "SELECT d FROM Data372 d WHERE d.toOM11 = :toOM11"),
    @NamedQuery(name = "Data372.findByToOM2", query = "SELECT d FROM Data372 d WHERE d.toOM2 = :toOM2"),
    @NamedQuery(name = "Data372.findByToOG", query = "SELECT d FROM Data372 d WHERE d.toOG = :toOG"),
    @NamedQuery(name = "Data372.findByToOG1", query = "SELECT d FROM Data372 d WHERE d.toOG1 = :toOG1"),
    @NamedQuery(name = "Data372.findByToOG11", query = "SELECT d FROM Data372 d WHERE d.toOG11 = :toOG11"),
    @NamedQuery(name = "Data372.findByToOG2", query = "SELECT d FROM Data372 d WHERE d.toOG2 = :toOG2"),
    @NamedQuery(name = "Data372.findByVpgM", query = "SELECT d FROM Data372 d WHERE d.vpgM = :vpgM"),
    @NamedQuery(name = "Data372.findByVpgM1", query = "SELECT d FROM Data372 d WHERE d.vpgM1 = :vpgM1"),
    @NamedQuery(name = "Data372.findByVpgM11", query = "SELECT d FROM Data372 d WHERE d.vpgM11 = :vpgM11"),
    @NamedQuery(name = "Data372.findByVpgM2", query = "SELECT d FROM Data372 d WHERE d.vpgM2 = :vpgM2"),
    @NamedQuery(name = "Data372.findByUreaplazmaG", query = "SELECT d FROM Data372 d WHERE d.ureaplazmaG = :ureaplazmaG"),
    @NamedQuery(name = "Data372.findByUreaplazmaG1", query = "SELECT d FROM Data372 d WHERE d.ureaplazmaG1 = :ureaplazmaG1"),
    @NamedQuery(name = "Data372.findByUreaplazmaG11", query = "SELECT d FROM Data372 d WHERE d.ureaplazmaG11 = :ureaplazmaG11"),
    @NamedQuery(name = "Data372.findByUreaplazmaG2", query = "SELECT d FROM Data372 d WHERE d.ureaplazmaG2 = :ureaplazmaG2"),
    @NamedQuery(name = "Data372.findByVedenieBeremennosti1", query = "SELECT d FROM Data372 d WHERE d.vedenieBeremennosti1 = :vedenieBeremennosti1"),
    @NamedQuery(name = "Data372.findByVedenieBeremennosti", query = "SELECT d FROM Data372 d WHERE d.vedenieBeremennosti = :vedenieBeremennosti"),
    @NamedQuery(name = "Data372.findByVpgIgm12", query = "SELECT d FROM Data372 d WHERE d.vpgIgm12 = :vpgIgm12"),
    @NamedQuery(name = "Data372.findByVpgIiIgg12", query = "SELECT d FROM Data372 d WHERE d.vpgIiIgg12 = :vpgIiIgg12"),
    @NamedQuery(name = "Data372.findByVpgIIgg12", query = "SELECT d FROM Data372 d WHERE d.vpgIIgg12 = :vpgIIgg12"),
    @NamedQuery(name = "Data372.findByToksoplazmaIgm1", query = "SELECT d FROM Data372 d WHERE d.toksoplazmaIgm1 = :toksoplazmaIgm1"),
    @NamedQuery(name = "Data372.findByToksoplazmaIgg1", query = "SELECT d FROM Data372 d WHERE d.toksoplazmaIgg1 = :toksoplazmaIgg1"),
    @NamedQuery(name = "Data372.findByCitomegalovirusIgg12", query = "SELECT d FROM Data372 d WHERE d.citomegalovirusIgg12 = :citomegalovirusIgg12"),
    @NamedQuery(name = "Data372.findByCitomegalovirusIgm12", query = "SELECT d FROM Data372 d WHERE d.citomegalovirusIgm12 = :citomegalovirusIgm12"),
    @NamedQuery(name = "Data372.findByKrasnuAIgm12", query = "SELECT d FROM Data372 d WHERE d.krasnuAIgm12 = :krasnuAIgm12"),
    @NamedQuery(name = "Data372.findByKrasnuAIgg12", query = "SELECT d FROM Data372 d WHERE d.krasnuAIgg12 = :krasnuAIgg12"),
    @NamedQuery(name = "Data372.findByFHeka", query = "SELECT d FROM Data372 d WHERE d.fHeka = :fHeka"),
    @NamedQuery(name = "Data372.findByVrahLaborant", query = "SELECT d FROM Data372 d WHERE d.vrahLaborant = :vrahLaborant"),
    @NamedQuery(name = "Data372.findByCitomegalovirusIgg2", query = "SELECT d FROM Data372 d WHERE d.citomegalovirusIgg2 = :citomegalovirusIgg2"),
    @NamedQuery(name = "Data372.findByCitomegalovirusIgg1", query = "SELECT d FROM Data372 d WHERE d.citomegalovirusIgg1 = :citomegalovirusIgg1"),
    @NamedQuery(name = "Data372.findByCitomegalovirusIgg", query = "SELECT d FROM Data372 d WHERE d.citomegalovirusIgg = :citomegalovirusIgg"),
    @NamedQuery(name = "Data372.findByCitomegalovirusIgm1", query = "SELECT d FROM Data372 d WHERE d.citomegalovirusIgm1 = :citomegalovirusIgm1"),
    @NamedQuery(name = "Data372.findByCitomegalovirusIgm2", query = "SELECT d FROM Data372 d WHERE d.citomegalovirusIgm2 = :citomegalovirusIgm2"),
    @NamedQuery(name = "Data372.findByCitomegalovirusIgm", query = "SELECT d FROM Data372 d WHERE d.citomegalovirusIgm = :citomegalovirusIgm"),
    @NamedQuery(name = "Data372.findByKrasnuAIgg2", query = "SELECT d FROM Data372 d WHERE d.krasnuAIgg2 = :krasnuAIgg2"),
    @NamedQuery(name = "Data372.findByKrasnuAIgg1", query = "SELECT d FROM Data372 d WHERE d.krasnuAIgg1 = :krasnuAIgg1"),
    @NamedQuery(name = "Data372.findByKrasnuAIgg", query = "SELECT d FROM Data372 d WHERE d.krasnuAIgg = :krasnuAIgg"),
    @NamedQuery(name = "Data372.findByKrasnuAIgm1", query = "SELECT d FROM Data372 d WHERE d.krasnuAIgm1 = :krasnuAIgm1"),
    @NamedQuery(name = "Data372.findByKrasnuAIgm11", query = "SELECT d FROM Data372 d WHERE d.krasnuAIgm11 = :krasnuAIgm11"),
    @NamedQuery(name = "Data372.findByKrasnuAIgm", query = "SELECT d FROM Data372 d WHERE d.krasnuAIgm = :krasnuAIgm"),
    @NamedQuery(name = "Data372.findByVpgIiIgg2", query = "SELECT d FROM Data372 d WHERE d.vpgIiIgg2 = :vpgIiIgg2"),
    @NamedQuery(name = "Data372.findByVpgIiIgg1", query = "SELECT d FROM Data372 d WHERE d.vpgIiIgg1 = :vpgIiIgg1"),
    @NamedQuery(name = "Data372.findByVpgIiIgg", query = "SELECT d FROM Data372 d WHERE d.vpgIiIgg = :vpgIiIgg"),
    @NamedQuery(name = "Data372.findByVpgIIgg2", query = "SELECT d FROM Data372 d WHERE d.vpgIIgg2 = :vpgIIgg2"),
    @NamedQuery(name = "Data372.findByVpgIIgg1", query = "SELECT d FROM Data372 d WHERE d.vpgIIgg1 = :vpgIIgg1"),
    @NamedQuery(name = "Data372.findByVpgIIgg", query = "SELECT d FROM Data372 d WHERE d.vpgIIgg = :vpgIIgg"),
    @NamedQuery(name = "Data372.findByVpgIgm2", query = "SELECT d FROM Data372 d WHERE d.vpgIgm2 = :vpgIgm2"),
    @NamedQuery(name = "Data372.findByVpgIgm1", query = "SELECT d FROM Data372 d WHERE d.vpgIgm1 = :vpgIgm1"),
    @NamedQuery(name = "Data372.findByVpgIgm", query = "SELECT d FROM Data372 d WHERE d.vpgIgm = :vpgIgm"),
    @NamedQuery(name = "Data372.findByToksoplazmaIgg11", query = "SELECT d FROM Data372 d WHERE d.toksoplazmaIgg11 = :toksoplazmaIgg11"),
    @NamedQuery(name = "Data372.findByToksoplazmaIgg2", query = "SELECT d FROM Data372 d WHERE d.toksoplazmaIgg2 = :toksoplazmaIgg2"),
    @NamedQuery(name = "Data372.findByToksoplazmaIgg", query = "SELECT d FROM Data372 d WHERE d.toksoplazmaIgg = :toksoplazmaIgg"),
    @NamedQuery(name = "Data372.findByToksoplazmaIgm2", query = "SELECT d FROM Data372 d WHERE d.toksoplazmaIgm2 = :toksoplazmaIgm2"),
    @NamedQuery(name = "Data372.findByToksoplazmaIgm11", query = "SELECT d FROM Data372 d WHERE d.toksoplazmaIgm11 = :toksoplazmaIgm11"),
    @NamedQuery(name = "Data372.findByToksoplazmaIgm", query = "SELECT d FROM Data372 d WHERE d.toksoplazmaIgm = :toksoplazmaIgm"),
    @NamedQuery(name = "Data372.findByHbsag1", query = "SELECT d FROM Data372 d WHERE d.hbsag1 = :hbsag1"),
    @NamedQuery(name = "Data372.findByHbsag2", query = "SELECT d FROM Data372 d WHERE d.hbsag2 = :hbsag2"),
    @NamedQuery(name = "Data372.findByHbsag", query = "SELECT d FROM Data372 d WHERE d.hbsag = :hbsag"),
    @NamedQuery(name = "Data372.findByLehahijVrah", query = "SELECT d FROM Data372 d WHERE d.lehahijVrah = :lehahijVrah"),
    @NamedQuery(name = "Data372.findByDataZaboaKrovi", query = "SELECT d FROM Data372 d WHERE d.dataZaboaKrovi = :dataZaboaKrovi"),
    @NamedQuery(name = "Data372.findByOtpravitNapohtu", query = "SELECT d FROM Data372 d WHERE d.otpravitNapohtu = :otpravitNapohtu"),
    @NamedQuery(name = "Data372.findByKrnCreateDate", query = "SELECT d FROM Data372 d WHERE d.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Data372.findByKrnCreateUserId", query = "SELECT d FROM Data372 d WHERE d.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Data372.findByKrnModifyDate", query = "SELECT d FROM Data372 d WHERE d.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Data372.findByKrnModifyUserId", query = "SELECT d FROM Data372 d WHERE d.krnModifyUserId = :krnModifyUserId")})
public class Data372 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA372_ID")
    private Integer data372Id;
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
    @Column(name = "LISTEREOZ_G2")
    private BigDecimal listereozG2;
    @Column(name = "LISTEREOZ_G1")
    private BigDecimal listereozG1;
    @Size(max = 13)
    @Column(name = "LISTEREOZ_G")
    private String listereozG;
    @Column(name = "LISTEREOZ_G12")
    private Boolean listereozG12;
    @Column(name = "BRUCELEZ_G2")
    private BigDecimal brucelezG2;
    @Column(name = "BRUCELEZ_G1")
    private BigDecimal brucelezG1;
    @Size(max = 13)
    @Column(name = "BRUCELEZ_G")
    private String brucelezG;
    @Column(name = "BRUCELEZ_G12")
    private Boolean brucelezG12;
    @Column(name = "MIKOPLAZMA_G1")
    private BigDecimal mikoplazmaG1;
    @Column(name = "MIKOPLAZMA_G2")
    private BigDecimal mikoplazmaG2;
    @Size(max = 13)
    @Column(name = "MIKOPLAZMA_G")
    private String mikoplazmaG;
    @Column(name = "MIKOPLAZMA_G12")
    private Boolean mikoplazmaG12;
    @Column(name = "MIKOPLAZMA_M2")
    private BigDecimal mikoplazmaM2;
    @Column(name = "MIKOPLAZMA_M1")
    private BigDecimal mikoplazmaM1;
    @Size(max = 13)
    @Column(name = "MIKOPLAZMA_M")
    private String mikoplazmaM;
    @Column(name = "MIKOPLAZMA_M12")
    private Boolean mikoplazmaM12;
    @Column(name = "TO_O_M")
    private Boolean toOM;
    @Size(max = 13)
    @Column(name = "TO_O_M1")
    private String toOM1;
    @Column(name = "TO_O_M11")
    private BigDecimal toOM11;
    @Column(name = "TO_O_M2")
    private BigDecimal toOM2;
    @Column(name = "TO_O_G")
    private Boolean toOG;
    @Size(max = 13)
    @Column(name = "TO_O_G1")
    private String toOG1;
    @Column(name = "TO_O_G11")
    private BigDecimal toOG11;
    @Column(name = "TO_O_G2")
    private BigDecimal toOG2;
    @Column(name = "VPG_M")
    private Boolean vpgM;
    @Size(max = 13)
    @Column(name = "VPG_M1")
    private String vpgM1;
    @Column(name = "VPG_M11")
    private BigDecimal vpgM11;
    @Column(name = "VPG_M2")
    private BigDecimal vpgM2;
    @Column(name = "UREAPLAZMA_G")
    private Boolean ureaplazmaG;
    @Size(max = 99)
    @Column(name = "UREAPLAZMA_G1")
    private String ureaplazmaG1;
    @Column(name = "UREAPLAZMA_G11")
    private BigDecimal ureaplazmaG11;
    @Column(name = "UREAPLAZMA_G2")
    private BigDecimal ureaplazmaG2;
    @Size(max = 49)
    @Column(name = "VEDENIE_BEREMENNOSTI1")
    private String vedenieBeremennosti1;
    @Column(name = "VEDENIE_BEREMENNOSTI")
    private Boolean vedenieBeremennosti;
    @Column(name = "VPG_IGM12")
    private Boolean vpgIgm12;
    @Column(name = "VPG_II_IGG12")
    private Boolean vpgIiIgg12;
    @Column(name = "VPG_I_IGG12")
    private Boolean vpgIIgg12;
    @Column(name = "TOKSOPLAZMA_IGM1")
    private Boolean toksoplazmaIgm1;
    @Column(name = "TOKSOPLAZMA_IGG1")
    private Boolean toksoplazmaIgg1;
    @Column(name = "CITOMEGALOVIRUS_IGG12")
    private Boolean citomegalovirusIgg12;
    @Column(name = "CITOMEGALOVIRUS_IGM12")
    private Boolean citomegalovirusIgm12;
    @Column(name = "KRASNU_A_IGM12")
    private Boolean krasnuAIgm12;
    @Column(name = "KRASNU_A_IGG12")
    private Boolean krasnuAIgg12;
    @Size(max = 8)
    @Column(name = "F_HEKA")
    private String fHeka;
    @Size(max = 17)
    @Column(name = "VRAH_LABORANT")
    private String vrahLaborant;
    @Column(name = "CITOMEGALOVIRUS_IGG2")
    private BigDecimal citomegalovirusIgg2;
    @Column(name = "CITOMEGALOVIRUS_IGG1")
    private BigDecimal citomegalovirusIgg1;
    @Size(max = 13)
    @Column(name = "CITOMEGALOVIRUS_IGG")
    private String citomegalovirusIgg;
    @Column(name = "CITOMEGALOVIRUS_IGM1")
    private BigDecimal citomegalovirusIgm1;
    @Column(name = "CITOMEGALOVIRUS_IGM_2")
    private BigDecimal citomegalovirusIgm2;
    @Size(max = 13)
    @Column(name = "CITOMEGALOVIRUS_IGM")
    private String citomegalovirusIgm;
    @Column(name = "KRASNU_A_IGG2")
    private BigDecimal krasnuAIgg2;
    @Column(name = "KRASNU_A_IGG1")
    private BigDecimal krasnuAIgg1;
    @Size(max = 13)
    @Column(name = "KRASNU_A_IGG")
    private String krasnuAIgg;
    @Column(name = "KRASNU_A_IGM1")
    private BigDecimal krasnuAIgm1;
    @Column(name = "KRASNU_A_IGM11")
    private BigDecimal krasnuAIgm11;
    @Size(max = 13)
    @Column(name = "KRASNU_A_IGM")
    private String krasnuAIgm;
    @Column(name = "VPG_II_IGG2")
    private BigDecimal vpgIiIgg2;
    @Column(name = "VPG_II_IGG1")
    private BigDecimal vpgIiIgg1;
    @Size(max = 13)
    @Column(name = "VPG_II_IGG")
    private String vpgIiIgg;
    @Column(name = "VPG_I_IGG2")
    private BigDecimal vpgIIgg2;
    @Column(name = "VPG_I_IGG1")
    private BigDecimal vpgIIgg1;
    @Size(max = 13)
    @Column(name = "VPG_I_IGG")
    private String vpgIIgg;
    @Column(name = "VPG_IGM2")
    private BigDecimal vpgIgm2;
    @Column(name = "VPG_IGM1")
    private BigDecimal vpgIgm1;
    @Size(max = 13)
    @Column(name = "VPG_IGM")
    private String vpgIgm;
    @Column(name = "TOKSOPLAZMA_IGG_1")
    private BigDecimal toksoplazmaIgg11;
    @Column(name = "TOKSOPLAZMA_IGG_2")
    private BigDecimal toksoplazmaIgg2;
    @Size(max = 13)
    @Column(name = "TOKSOPLAZMA_IGG")
    private String toksoplazmaIgg;
    @Column(name = "TOKSOPLAZMA_IGM_2")
    private BigDecimal toksoplazmaIgm2;
    @Column(name = "TOKSOPLAZMA_IGM_1")
    private BigDecimal toksoplazmaIgm11;
    @Size(max = 13)
    @Column(name = "TOKSOPLAZMA_IGM")
    private String toksoplazmaIgm;
    @Column(name = "HBSAG1")
    private BigDecimal hbsag1;
    @Column(name = "HBSAG2")
    private BigDecimal hbsag2;
    @Size(max = 13)
    @Column(name = "HBSAG")
    private String hbsag;
    @Size(max = 17)
    @Column(name = "LEHAHIJ_VRAH")
    private String lehahijVrah;
    @Column(name = "DATA_ZABOA_KROVI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataZaboaKrovi;
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

    public Data372() {
    }

    public Data372(Integer data372Id) {
        this.data372Id = data372Id;
    }

    public Data372(Integer data372Id, int patientsId, Date dateConsultation, int motconsuId) {
        this.data372Id = data372Id;
        this.patientsId = patientsId;
        this.dateConsultation = dateConsultation;
        this.motconsuId = motconsuId;
    }

    public Integer getData372Id() {
        return data372Id;
    }

    public void setData372Id(Integer data372Id) {
        this.data372Id = data372Id;
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

    public BigDecimal getListereozG2() {
        return listereozG2;
    }

    public void setListereozG2(BigDecimal listereozG2) {
        this.listereozG2 = listereozG2;
    }

    public BigDecimal getListereozG1() {
        return listereozG1;
    }

    public void setListereozG1(BigDecimal listereozG1) {
        this.listereozG1 = listereozG1;
    }

    public String getListereozG() {
        return listereozG;
    }

    public void setListereozG(String listereozG) {
        this.listereozG = listereozG;
    }

    public Boolean getListereozG12() {
        return listereozG12;
    }

    public void setListereozG12(Boolean listereozG12) {
        this.listereozG12 = listereozG12;
    }

    public BigDecimal getBrucelezG2() {
        return brucelezG2;
    }

    public void setBrucelezG2(BigDecimal brucelezG2) {
        this.brucelezG2 = brucelezG2;
    }

    public BigDecimal getBrucelezG1() {
        return brucelezG1;
    }

    public void setBrucelezG1(BigDecimal brucelezG1) {
        this.brucelezG1 = brucelezG1;
    }

    public String getBrucelezG() {
        return brucelezG;
    }

    public void setBrucelezG(String brucelezG) {
        this.brucelezG = brucelezG;
    }

    public Boolean getBrucelezG12() {
        return brucelezG12;
    }

    public void setBrucelezG12(Boolean brucelezG12) {
        this.brucelezG12 = brucelezG12;
    }

    public BigDecimal getMikoplazmaG1() {
        return mikoplazmaG1;
    }

    public void setMikoplazmaG1(BigDecimal mikoplazmaG1) {
        this.mikoplazmaG1 = mikoplazmaG1;
    }

    public BigDecimal getMikoplazmaG2() {
        return mikoplazmaG2;
    }

    public void setMikoplazmaG2(BigDecimal mikoplazmaG2) {
        this.mikoplazmaG2 = mikoplazmaG2;
    }

    public String getMikoplazmaG() {
        return mikoplazmaG;
    }

    public void setMikoplazmaG(String mikoplazmaG) {
        this.mikoplazmaG = mikoplazmaG;
    }

    public Boolean getMikoplazmaG12() {
        return mikoplazmaG12;
    }

    public void setMikoplazmaG12(Boolean mikoplazmaG12) {
        this.mikoplazmaG12 = mikoplazmaG12;
    }

    public BigDecimal getMikoplazmaM2() {
        return mikoplazmaM2;
    }

    public void setMikoplazmaM2(BigDecimal mikoplazmaM2) {
        this.mikoplazmaM2 = mikoplazmaM2;
    }

    public BigDecimal getMikoplazmaM1() {
        return mikoplazmaM1;
    }

    public void setMikoplazmaM1(BigDecimal mikoplazmaM1) {
        this.mikoplazmaM1 = mikoplazmaM1;
    }

    public String getMikoplazmaM() {
        return mikoplazmaM;
    }

    public void setMikoplazmaM(String mikoplazmaM) {
        this.mikoplazmaM = mikoplazmaM;
    }

    public Boolean getMikoplazmaM12() {
        return mikoplazmaM12;
    }

    public void setMikoplazmaM12(Boolean mikoplazmaM12) {
        this.mikoplazmaM12 = mikoplazmaM12;
    }

    public Boolean getToOM() {
        return toOM;
    }

    public void setToOM(Boolean toOM) {
        this.toOM = toOM;
    }

    public String getToOM1() {
        return toOM1;
    }

    public void setToOM1(String toOM1) {
        this.toOM1 = toOM1;
    }

    public BigDecimal getToOM11() {
        return toOM11;
    }

    public void setToOM11(BigDecimal toOM11) {
        this.toOM11 = toOM11;
    }

    public BigDecimal getToOM2() {
        return toOM2;
    }

    public void setToOM2(BigDecimal toOM2) {
        this.toOM2 = toOM2;
    }

    public Boolean getToOG() {
        return toOG;
    }

    public void setToOG(Boolean toOG) {
        this.toOG = toOG;
    }

    public String getToOG1() {
        return toOG1;
    }

    public void setToOG1(String toOG1) {
        this.toOG1 = toOG1;
    }

    public BigDecimal getToOG11() {
        return toOG11;
    }

    public void setToOG11(BigDecimal toOG11) {
        this.toOG11 = toOG11;
    }

    public BigDecimal getToOG2() {
        return toOG2;
    }

    public void setToOG2(BigDecimal toOG2) {
        this.toOG2 = toOG2;
    }

    public Boolean getVpgM() {
        return vpgM;
    }

    public void setVpgM(Boolean vpgM) {
        this.vpgM = vpgM;
    }

    public String getVpgM1() {
        return vpgM1;
    }

    public void setVpgM1(String vpgM1) {
        this.vpgM1 = vpgM1;
    }

    public BigDecimal getVpgM11() {
        return vpgM11;
    }

    public void setVpgM11(BigDecimal vpgM11) {
        this.vpgM11 = vpgM11;
    }

    public BigDecimal getVpgM2() {
        return vpgM2;
    }

    public void setVpgM2(BigDecimal vpgM2) {
        this.vpgM2 = vpgM2;
    }

    public Boolean getUreaplazmaG() {
        return ureaplazmaG;
    }

    public void setUreaplazmaG(Boolean ureaplazmaG) {
        this.ureaplazmaG = ureaplazmaG;
    }

    public String getUreaplazmaG1() {
        return ureaplazmaG1;
    }

    public void setUreaplazmaG1(String ureaplazmaG1) {
        this.ureaplazmaG1 = ureaplazmaG1;
    }

    public BigDecimal getUreaplazmaG11() {
        return ureaplazmaG11;
    }

    public void setUreaplazmaG11(BigDecimal ureaplazmaG11) {
        this.ureaplazmaG11 = ureaplazmaG11;
    }

    public BigDecimal getUreaplazmaG2() {
        return ureaplazmaG2;
    }

    public void setUreaplazmaG2(BigDecimal ureaplazmaG2) {
        this.ureaplazmaG2 = ureaplazmaG2;
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

    public Boolean getVpgIgm12() {
        return vpgIgm12;
    }

    public void setVpgIgm12(Boolean vpgIgm12) {
        this.vpgIgm12 = vpgIgm12;
    }

    public Boolean getVpgIiIgg12() {
        return vpgIiIgg12;
    }

    public void setVpgIiIgg12(Boolean vpgIiIgg12) {
        this.vpgIiIgg12 = vpgIiIgg12;
    }

    public Boolean getVpgIIgg12() {
        return vpgIIgg12;
    }

    public void setVpgIIgg12(Boolean vpgIIgg12) {
        this.vpgIIgg12 = vpgIIgg12;
    }

    public Boolean getToksoplazmaIgm1() {
        return toksoplazmaIgm1;
    }

    public void setToksoplazmaIgm1(Boolean toksoplazmaIgm1) {
        this.toksoplazmaIgm1 = toksoplazmaIgm1;
    }

    public Boolean getToksoplazmaIgg1() {
        return toksoplazmaIgg1;
    }

    public void setToksoplazmaIgg1(Boolean toksoplazmaIgg1) {
        this.toksoplazmaIgg1 = toksoplazmaIgg1;
    }

    public Boolean getCitomegalovirusIgg12() {
        return citomegalovirusIgg12;
    }

    public void setCitomegalovirusIgg12(Boolean citomegalovirusIgg12) {
        this.citomegalovirusIgg12 = citomegalovirusIgg12;
    }

    public Boolean getCitomegalovirusIgm12() {
        return citomegalovirusIgm12;
    }

    public void setCitomegalovirusIgm12(Boolean citomegalovirusIgm12) {
        this.citomegalovirusIgm12 = citomegalovirusIgm12;
    }

    public Boolean getKrasnuAIgm12() {
        return krasnuAIgm12;
    }

    public void setKrasnuAIgm12(Boolean krasnuAIgm12) {
        this.krasnuAIgm12 = krasnuAIgm12;
    }

    public Boolean getKrasnuAIgg12() {
        return krasnuAIgg12;
    }

    public void setKrasnuAIgg12(Boolean krasnuAIgg12) {
        this.krasnuAIgg12 = krasnuAIgg12;
    }

    public String getFHeka() {
        return fHeka;
    }

    public void setFHeka(String fHeka) {
        this.fHeka = fHeka;
    }

    public String getVrahLaborant() {
        return vrahLaborant;
    }

    public void setVrahLaborant(String vrahLaborant) {
        this.vrahLaborant = vrahLaborant;
    }

    public BigDecimal getCitomegalovirusIgg2() {
        return citomegalovirusIgg2;
    }

    public void setCitomegalovirusIgg2(BigDecimal citomegalovirusIgg2) {
        this.citomegalovirusIgg2 = citomegalovirusIgg2;
    }

    public BigDecimal getCitomegalovirusIgg1() {
        return citomegalovirusIgg1;
    }

    public void setCitomegalovirusIgg1(BigDecimal citomegalovirusIgg1) {
        this.citomegalovirusIgg1 = citomegalovirusIgg1;
    }

    public String getCitomegalovirusIgg() {
        return citomegalovirusIgg;
    }

    public void setCitomegalovirusIgg(String citomegalovirusIgg) {
        this.citomegalovirusIgg = citomegalovirusIgg;
    }

    public BigDecimal getCitomegalovirusIgm1() {
        return citomegalovirusIgm1;
    }

    public void setCitomegalovirusIgm1(BigDecimal citomegalovirusIgm1) {
        this.citomegalovirusIgm1 = citomegalovirusIgm1;
    }

    public BigDecimal getCitomegalovirusIgm2() {
        return citomegalovirusIgm2;
    }

    public void setCitomegalovirusIgm2(BigDecimal citomegalovirusIgm2) {
        this.citomegalovirusIgm2 = citomegalovirusIgm2;
    }

    public String getCitomegalovirusIgm() {
        return citomegalovirusIgm;
    }

    public void setCitomegalovirusIgm(String citomegalovirusIgm) {
        this.citomegalovirusIgm = citomegalovirusIgm;
    }

    public BigDecimal getKrasnuAIgg2() {
        return krasnuAIgg2;
    }

    public void setKrasnuAIgg2(BigDecimal krasnuAIgg2) {
        this.krasnuAIgg2 = krasnuAIgg2;
    }

    public BigDecimal getKrasnuAIgg1() {
        return krasnuAIgg1;
    }

    public void setKrasnuAIgg1(BigDecimal krasnuAIgg1) {
        this.krasnuAIgg1 = krasnuAIgg1;
    }

    public String getKrasnuAIgg() {
        return krasnuAIgg;
    }

    public void setKrasnuAIgg(String krasnuAIgg) {
        this.krasnuAIgg = krasnuAIgg;
    }

    public BigDecimal getKrasnuAIgm1() {
        return krasnuAIgm1;
    }

    public void setKrasnuAIgm1(BigDecimal krasnuAIgm1) {
        this.krasnuAIgm1 = krasnuAIgm1;
    }

    public BigDecimal getKrasnuAIgm11() {
        return krasnuAIgm11;
    }

    public void setKrasnuAIgm11(BigDecimal krasnuAIgm11) {
        this.krasnuAIgm11 = krasnuAIgm11;
    }

    public String getKrasnuAIgm() {
        return krasnuAIgm;
    }

    public void setKrasnuAIgm(String krasnuAIgm) {
        this.krasnuAIgm = krasnuAIgm;
    }

    public BigDecimal getVpgIiIgg2() {
        return vpgIiIgg2;
    }

    public void setVpgIiIgg2(BigDecimal vpgIiIgg2) {
        this.vpgIiIgg2 = vpgIiIgg2;
    }

    public BigDecimal getVpgIiIgg1() {
        return vpgIiIgg1;
    }

    public void setVpgIiIgg1(BigDecimal vpgIiIgg1) {
        this.vpgIiIgg1 = vpgIiIgg1;
    }

    public String getVpgIiIgg() {
        return vpgIiIgg;
    }

    public void setVpgIiIgg(String vpgIiIgg) {
        this.vpgIiIgg = vpgIiIgg;
    }

    public BigDecimal getVpgIIgg2() {
        return vpgIIgg2;
    }

    public void setVpgIIgg2(BigDecimal vpgIIgg2) {
        this.vpgIIgg2 = vpgIIgg2;
    }

    public BigDecimal getVpgIIgg1() {
        return vpgIIgg1;
    }

    public void setVpgIIgg1(BigDecimal vpgIIgg1) {
        this.vpgIIgg1 = vpgIIgg1;
    }

    public String getVpgIIgg() {
        return vpgIIgg;
    }

    public void setVpgIIgg(String vpgIIgg) {
        this.vpgIIgg = vpgIIgg;
    }

    public BigDecimal getVpgIgm2() {
        return vpgIgm2;
    }

    public void setVpgIgm2(BigDecimal vpgIgm2) {
        this.vpgIgm2 = vpgIgm2;
    }

    public BigDecimal getVpgIgm1() {
        return vpgIgm1;
    }

    public void setVpgIgm1(BigDecimal vpgIgm1) {
        this.vpgIgm1 = vpgIgm1;
    }

    public String getVpgIgm() {
        return vpgIgm;
    }

    public void setVpgIgm(String vpgIgm) {
        this.vpgIgm = vpgIgm;
    }

    public BigDecimal getToksoplazmaIgg11() {
        return toksoplazmaIgg11;
    }

    public void setToksoplazmaIgg11(BigDecimal toksoplazmaIgg11) {
        this.toksoplazmaIgg11 = toksoplazmaIgg11;
    }

    public BigDecimal getToksoplazmaIgg2() {
        return toksoplazmaIgg2;
    }

    public void setToksoplazmaIgg2(BigDecimal toksoplazmaIgg2) {
        this.toksoplazmaIgg2 = toksoplazmaIgg2;
    }

    public String getToksoplazmaIgg() {
        return toksoplazmaIgg;
    }

    public void setToksoplazmaIgg(String toksoplazmaIgg) {
        this.toksoplazmaIgg = toksoplazmaIgg;
    }

    public BigDecimal getToksoplazmaIgm2() {
        return toksoplazmaIgm2;
    }

    public void setToksoplazmaIgm2(BigDecimal toksoplazmaIgm2) {
        this.toksoplazmaIgm2 = toksoplazmaIgm2;
    }

    public BigDecimal getToksoplazmaIgm11() {
        return toksoplazmaIgm11;
    }

    public void setToksoplazmaIgm11(BigDecimal toksoplazmaIgm11) {
        this.toksoplazmaIgm11 = toksoplazmaIgm11;
    }

    public String getToksoplazmaIgm() {
        return toksoplazmaIgm;
    }

    public void setToksoplazmaIgm(String toksoplazmaIgm) {
        this.toksoplazmaIgm = toksoplazmaIgm;
    }

    public BigDecimal getHbsag1() {
        return hbsag1;
    }

    public void setHbsag1(BigDecimal hbsag1) {
        this.hbsag1 = hbsag1;
    }

    public BigDecimal getHbsag2() {
        return hbsag2;
    }

    public void setHbsag2(BigDecimal hbsag2) {
        this.hbsag2 = hbsag2;
    }

    public String getHbsag() {
        return hbsag;
    }

    public void setHbsag(String hbsag) {
        this.hbsag = hbsag;
    }

    public String getLehahijVrah() {
        return lehahijVrah;
    }

    public void setLehahijVrah(String lehahijVrah) {
        this.lehahijVrah = lehahijVrah;
    }

    public Date getDataZaboaKrovi() {
        return dataZaboaKrovi;
    }

    public void setDataZaboaKrovi(Date dataZaboaKrovi) {
        this.dataZaboaKrovi = dataZaboaKrovi;
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
        hash += (data372Id != null ? data372Id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data372)) {
            return false;
        }
        Data372 other = (Data372) object;
        if ((this.data372Id == null && other.data372Id != null) || (this.data372Id != null && !this.data372Id.equals(other.data372Id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.Data372[ data372Id=" + data372Id + " ]";
    }
    
}
