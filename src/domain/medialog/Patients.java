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
import javax.persistence.Lob;
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
@Table(name = "PATIENTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Patients.findAll", query = "SELECT p FROM Patients p"),
    @NamedQuery(name = "Patients.findByPatientsId", query = "SELECT p FROM Patients p WHERE p.patientsId = :patientsId"),
    @NamedQuery(name = "Patients.findByImc", query = "SELECT p FROM Patients p WHERE p.imc = :imc"),
    @NamedQuery(name = "Patients.findByAge", query = "SELECT p FROM Patients p WHERE p.age = :age"),
    @NamedQuery(name = "Patients.findByDernCons", query = "SELECT p FROM Patients p WHERE p.dernCons = :dernCons"),
    @NamedQuery(name = "Patients.findByNOmon", query = "SELECT p FROM Patients p WHERE p.nOmon = :nOmon"),
    @NamedQuery(name = "Patients.findByCComp", query = "SELECT p FROM Patients p WHERE p.cComp = :cComp"),
    @NamedQuery(name = "Patients.findByFPerc", query = "SELECT p FROM Patients p WHERE p.fPerc = :fPerc"),
    @NamedQuery(name = "Patients.findByFPrincperc", query = "SELECT p FROM Patients p WHERE p.fPrincperc = :fPrincperc"),
    @NamedQuery(name = "Patients.findByPlPatgrId", query = "SELECT p FROM Patients p WHERE p.plPatgrId = :plPatgrId"),
    @NamedQuery(name = "Patients.findByPlSubjId", query = "SELECT p FROM Patients p WHERE p.plSubjId = :plSubjId"),
    @NamedQuery(name = "Patients.findByMedecinsModifyId", query = "SELECT p FROM Patients p WHERE p.medecinsModifyId = :medecinsModifyId"),
    @NamedQuery(name = "Patients.findByModifyDateTime", query = "SELECT p FROM Patients p WHERE p.modifyDateTime = :modifyDateTime"),
    @NamedQuery(name = "Patients.findByCreateDateTime", query = "SELECT p FROM Patients p WHERE p.createDateTime = :createDateTime"),
    @NamedQuery(name = "Patients.findByEmkSinhro", query = "SELECT p FROM Patients p WHERE p.emkSinhro = :emkSinhro"),
    @NamedQuery(name = "Patients.findBySigemsIpp", query = "SELECT p FROM Patients p WHERE p.sigemsIpp = :sigemsIpp"),
    @NamedQuery(name = "Patients.findByMedecinReferent", query = "SELECT p FROM Patients p WHERE p.medecinReferent = :medecinReferent"),
    @NamedQuery(name = "Patients.findByDonor", query = "SELECT p FROM Patients p WHERE p.donor = :donor"),
    @NamedQuery(name = "Patients.findByDonorMug", query = "SELECT p FROM Patients p WHERE p.donorMug = :donorMug"),
    @NamedQuery(name = "Patients.findByPolnLetDo", query = "SELECT p FROM Patients p WHERE p.polnLetDo = :polnLetDo"),
    @NamedQuery(name = "Patients.findByDonorOocitov", query = "SELECT p FROM Patients p WHERE p.donorOocitov = :donorOocitov"),
    @NamedQuery(name = "Patients.findByNomerKart", query = "SELECT p FROM Patients p WHERE p.nomerKart = :nomerKart"),
    @NamedQuery(name = "Patients.findByRezulTat", query = "SELECT p FROM Patients p WHERE p.rezulTat = :rezulTat"),
    @NamedQuery(name = "Patients.findByDeti", query = "SELECT p FROM Patients p WHERE p.deti = :deti"),
    @NamedQuery(name = "Patients.findBySemejnoePologenie", query = "SELECT p FROM Patients p WHERE p.semejnoePologenie = :semejnoePologenie"),
    @NamedQuery(name = "Patients.findByMestoRabotVEko", query = "SELECT p FROM Patients p WHERE p.mestoRabotVEko = :mestoRabotVEko"),
    @NamedQuery(name = "Patients.findBySKakogoVremeniRabotaet", query = "SELECT p FROM Patients p WHERE p.sKakogoVremeniRabotaet = :sKakogoVremeniRabotaet"),
    @NamedQuery(name = "Patients.findBySpecialNost", query = "SELECT p FROM Patients p WHERE p.specialNost = :specialNost"),
    @NamedQuery(name = "Patients.findByZanimaemaqDolgnost", query = "SELECT p FROM Patients p WHERE p.zanimaemaqDolgnost = :zanimaemaqDolgnost"),
    @NamedQuery(name = "Patients.findBySikvEheNeVSLaliOroh", query = "SELECT p FROM Patients p WHERE p.sikvEheNeVSLaliOroh = :sikvEheNeVSLaliOroh"),
    @NamedQuery(name = "Patients.findByRnn", query = "SELECT p FROM Patients p WHERE p.rnn = :rnn"),
    @NamedQuery(name = "Patients.findByTelefonCalcenter", query = "SELECT p FROM Patients p WHERE p.telefonCalcenter = :telefonCalcenter"),
    @NamedQuery(name = "Patients.findByTest", query = "SELECT p FROM Patients p WHERE p.test = :test"),
    @NamedQuery(name = "Patients.findByOblast1", query = "SELECT p FROM Patients p WHERE p.oblast1 = :oblast1"),
    @NamedQuery(name = "Patients.findByMedicinskaqKarta", query = "SELECT p FROM Patients p WHERE p.medicinskaqKarta = :medicinskaqKarta"),
    @NamedQuery(name = "Patients.findByDataOformleniq", query = "SELECT p FROM Patients p WHERE p.dataOformleniq = :dataOformleniq"),
    @NamedQuery(name = "Patients.findByPacientDonor", query = "SELECT p FROM Patients p WHERE p.pacientDonor = :pacientDonor"),
    @NamedQuery(name = "Patients.findByLihnJDonor", query = "SELECT p FROM Patients p WHERE p.lihnJDonor = :lihnJDonor"),
    @NamedQuery(name = "Patients.findByRecipient", query = "SELECT p FROM Patients p WHERE p.recipient = :recipient"),
    @NamedQuery(name = "Patients.findByNom", query = "SELECT p FROM Patients p WHERE p.nom = :nom"),
    @NamedQuery(name = "Patients.findByPrenom", query = "SELECT p FROM Patients p WHERE p.prenom = :prenom"),
    @NamedQuery(name = "Patients.findByPatronyme", query = "SELECT p FROM Patients p WHERE p.patronyme = :patronyme"),
    @NamedQuery(name = "Patients.findByPodEzd", query = "SELECT p FROM Patients p WHERE p.podEzd = :podEzd"),
    @NamedQuery(name = "Patients.findBySokrahennJVvodDann", query = "SELECT p FROM Patients p WHERE p.sokrahennJVvodDann = :sokrahennJVvodDann"),
    @NamedQuery(name = "Patients.findByBankDe", query = "SELECT p FROM Patients p WHERE p.bankDe = :bankDe"),
    @NamedQuery(name = "Patients.findByProisOgdenie", query = "SELECT p FROM Patients p WHERE p.proisOgdenie = :proisOgdenie"),
    @NamedQuery(name = "Patients.findByVDonorstveOtkazat", query = "SELECT p FROM Patients p WHERE p.vDonorstveOtkazat = :vDonorstveOtkazat"),
    @NamedQuery(name = "Patients.findByKodDonora", query = "SELECT p FROM Patients p WHERE p.kodDonora = :kodDonora"),
    @NamedQuery(name = "Patients.findByNomerDonora", query = "SELECT p FROM Patients p WHERE p.nomerDonora = :nomerDonora"),
    @NamedQuery(name = "Patients.findByFio", query = "SELECT p FROM Patients p WHERE p.fio = :fio"),
    @NamedQuery(name = "Patients.findByNomerFio", query = "SELECT p FROM Patients p WHERE p.nomerFio = :nomerFio"),
    @NamedQuery(name = "Patients.findByKodFio", query = "SELECT p FROM Patients p WHERE p.kodFio = :kodFio"),
    @NamedQuery(name = "Patients.findByPol", query = "SELECT p FROM Patients p WHERE p.pol = :pol"),
    @NamedQuery(name = "Patients.findByNeLe", query = "SELECT p FROM Patients p WHERE p.neLe = :neLe"),
    @NamedQuery(name = "Patients.findByPolnLet", query = "SELECT p FROM Patients p WHERE p.polnLet = :polnLet"),
    @NamedQuery(name = "Patients.findByGodRogdeniq", query = "SELECT p FROM Patients p WHERE p.godRogdeniq = :godRogdeniq"),
    @NamedQuery(name = "Patients.findByReg", query = "SELECT p FROM Patients p WHERE p.reg = :reg"),
    @NamedQuery(name = "Patients.findByStrana", query = "SELECT p FROM Patients p WHERE p.strana = :strana"),
    @NamedQuery(name = "Patients.findByGorod", query = "SELECT p FROM Patients p WHERE p.gorod = :gorod"),
    @NamedQuery(name = "Patients.findByOblast", query = "SELECT p FROM Patients p WHERE p.oblast = :oblast"),
    @NamedQuery(name = "Patients.findByUlica", query = "SELECT p FROM Patients p WHERE p.ulica = :ulica"),
    @NamedQuery(name = "Patients.findByDom", query = "SELECT p FROM Patients p WHERE p.dom = :dom"),
    @NamedQuery(name = "Patients.findByKorpus", query = "SELECT p FROM Patients p WHERE p.korpus = :korpus"),
    @NamedQuery(name = "Patients.findByKvartira", query = "SELECT p FROM Patients p WHERE p.kvartira = :kvartira"),
    @NamedQuery(name = "Patients.findByEtag", query = "SELECT p FROM Patients p WHERE p.etag = :etag"),
    @NamedQuery(name = "Patients.findByKodDomofon", query = "SELECT p FROM Patients p WHERE p.kodDomofon = :kodDomofon"),
    @NamedQuery(name = "Patients.findByTel", query = "SELECT p FROM Patients p WHERE p.tel = :tel"),
    @NamedQuery(name = "Patients.findByDokument", query = "SELECT p FROM Patients p WHERE p.dokument = :dokument"),
    @NamedQuery(name = "Patients.findByPasportN", query = "SELECT p FROM Patients p WHERE p.pasportN = :pasportN"),
    @NamedQuery(name = "Patients.findByKogdaVDan", query = "SELECT p FROM Patients p WHERE p.kogdaVDan = :kogdaVDan"),
    @NamedQuery(name = "Patients.findByKemVDan", query = "SELECT p FROM Patients p WHERE p.kemVDan = :kemVDan"),
    @NamedQuery(name = "Patients.findByRabota", query = "SELECT p FROM Patients p WHERE p.rabota = :rabota"),
    @NamedQuery(name = "Patients.findByProfessiq", query = "SELECT p FROM Patients p WHERE p.professiq = :professiq"),
    @NamedQuery(name = "Patients.findByDolgnost", query = "SELECT p FROM Patients p WHERE p.dolgnost = :dolgnost"),
    @NamedQuery(name = "Patients.findByRabTel", query = "SELECT p FROM Patients p WHERE p.rabTel = :rabTel"),
    @NamedQuery(name = "Patients.findBySuprug", query = "SELECT p FROM Patients p WHERE p.suprug = :suprug"),
    @NamedQuery(name = "Patients.findByLehahijVrah", query = "SELECT p FROM Patients p WHERE p.lehahijVrah = :lehahijVrah"),
    @NamedQuery(name = "Patients.findByMedUhregdeniqNapravivha", query = "SELECT p FROM Patients p WHERE p.medUhregdeniqNapravivha = :medUhregdeniqNapravivha"),
    @NamedQuery(name = "Patients.findByNozologiq", query = "SELECT p FROM Patients p WHERE p.nozologiq = :nozologiq"),
    @NamedQuery(name = "Patients.findByNacionalNost", query = "SELECT p FROM Patients p WHERE p.nacionalNost = :nacionalNost"),
    @NamedQuery(name = "Patients.findByObrazovanie1", query = "SELECT p FROM Patients p WHERE p.obrazovanie1 = :obrazovanie1"),
    @NamedQuery(name = "Patients.findBySemPologenieG", query = "SELECT p FROM Patients p WHERE p.semPologenieG = :semPologenieG"),
    @NamedQuery(name = "Patients.findBySemPologenieM", query = "SELECT p FROM Patients p WHERE p.semPologenieM = :semPologenieM"),
    @NamedQuery(name = "Patients.findByStraOvaqKompaniq", query = "SELECT p FROM Patients p WHERE p.straOvaqKompaniq = :straOvaqKompaniq"),
    @NamedQuery(name = "Patients.findByDispether", query = "SELECT p FROM Patients p WHERE p.dispether = :dispether"),
    @NamedQuery(name = "Patients.findByPatBeginDate", query = "SELECT p FROM Patients p WHERE p.patBeginDate = :patBeginDate"),
    @NamedQuery(name = "Patients.findByPatEndDate", query = "SELECT p FROM Patients p WHERE p.patEndDate = :patEndDate"),
    @NamedQuery(name = "Patients.findByPatCancelDate", query = "SELECT p FROM Patients p WHERE p.patCancelDate = :patCancelDate"),
    @NamedQuery(name = "Patients.findByDataArIvacii", query = "SELECT p FROM Patients p WHERE p.dataArIvacii = :dataArIvacii"),
    @NamedQuery(name = "Patients.findByKartaVArIve", query = "SELECT p FROM Patients p WHERE p.kartaVArIve = :kartaVArIve"),
    @NamedQuery(name = "Patients.findByIndeks", query = "SELECT p FROM Patients p WHERE p.indeks = :indeks"),
    @NamedQuery(name = "Patients.findByIin", query = "SELECT p FROM Patients p WHERE p.iin = :iin"),
    @NamedQuery(name = "Patients.findByInn", query = "SELECT p FROM Patients p WHERE p.inn = :inn"),
    @NamedQuery(name = "Patients.findByEMail", query = "SELECT p FROM Patients p WHERE p.eMail = :eMail"),
    @NamedQuery(name = "Patients.findByNomerMediciskojKart", query = "SELECT p FROM Patients p WHERE p.nomerMediciskojKart = :nomerMediciskojKart"),
    @NamedQuery(name = "Patients.findByMediciskaqKartaStaciona", query = "SELECT p FROM Patients p WHERE p.mediciskaqKartaStaciona = :mediciskaqKartaStaciona"),
    @NamedQuery(name = "Patients.findByDossierExit", query = "SELECT p FROM Patients p WHERE p.dossierExit = :dossierExit"),
    @NamedQuery(name = "Patients.findByRajon", query = "SELECT p FROM Patients p WHERE p.rajon = :rajon"),
    @NamedQuery(name = "Patients.findByDokumentUdLihnosti", query = "SELECT p FROM Patients p WHERE p.dokumentUdLihnosti = :dokumentUdLihnosti"),
    @NamedQuery(name = "Patients.findByDataSmerti", query = "SELECT p FROM Patients p WHERE p.dataSmerti = :dataSmerti"),
    @NamedQuery(name = "Patients.findByMedecinsCreateId", query = "SELECT p FROM Patients p WHERE p.medecinsCreateId = :medecinsCreateId"),
    @NamedQuery(name = "Patients.findByAlsac", query = "SELECT p FROM Patients p WHERE p.alsac = :alsac"),
    @NamedQuery(name = "Patients.findByArchive", query = "SELECT p FROM Patients p WHERE p.archive = :archive"),
    @NamedQuery(name = "Patients.findByNomerIstoriiBolezni", query = "SELECT p FROM Patients p WHERE p.nomerIstoriiBolezni = :nomerIstoriiBolezni"),
    @NamedQuery(name = "Patients.findByNumeroMedtr", query = "SELECT p FROM Patients p WHERE p.numeroMedtr = :numeroMedtr"),
    @NamedQuery(name = "Patients.findByCPrinc", query = "SELECT p FROM Patients p WHERE p.cPrinc = :cPrinc"),
    @NamedQuery(name = "Patients.findByAgeAuto", query = "SELECT p FROM Patients p WHERE p.ageAuto = :ageAuto"),
    @NamedQuery(name = "Patients.findByMedecinsId", query = "SELECT p FROM Patients p WHERE p.medecinsId = :medecinsId"),
    @NamedQuery(name = "Patients.findByKrnCreateDate", query = "SELECT p FROM Patients p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Patients.findByKrnCreateUserId", query = "SELECT p FROM Patients p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Patients.findByKrnModifyDate", query = "SELECT p FROM Patients p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Patients.findByKrnModifyUserId", query = "SELECT p FROM Patients p WHERE p.krnModifyUserId = :krnModifyUserId")})
public class Patients implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PATIENTS_ID")
    private Integer patientsId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "IMC")
    private BigDecimal imc;
    @Column(name = "AGE")
    private BigDecimal age;
    @Column(name = "DERN_CONS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dernCons;
    @Size(max = 10)
    @Column(name = "N_OMON")
    private String nOmon;
    @Column(name = "C_COMP")
    private Integer cComp;
    @Column(name = "F_PERC")
    private BigDecimal fPerc;
    @Column(name = "F_PRINCPERC")
    private BigDecimal fPrincperc;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "SV_LAF")
    private String svLaf;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "SV_LAB")
    private String svLab;
    @Column(name = "PL_PATGR_ID")
    private Integer plPatgrId;
    @Column(name = "PL_SUBJ_ID")
    private Integer plSubjId;
    @Column(name = "MEDECINS_MODIFY_ID")
    private Integer medecinsModifyId;
    @Column(name = "MODIFY_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDateTime;
    @Column(name = "CREATE_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;
    @Column(name = "EMK_SINHRO")
    private Boolean emkSinhro;
    @Column(name = "SIGEMS_IPP")
    private Integer sigemsIpp;
    @Column(name = "MEDECIN_REFERENT")
    private Boolean medecinReferent;
    @Column(name = "DONOR")
    private Integer donor;
    @Column(name = "DONOR_MUG")
    private Integer donorMug;
    @Column(name = "POLN_LET_DO")
    private BigDecimal polnLetDo;
    @Column(name = "DONOR_OOCITOV")
    private Integer donorOocitov;
    @Column(name = "NOMER_KART")
    private BigDecimal nomerKart;
    @Column(name = "REZUL_TAT")
    private Integer rezulTat;
    @Column(name = "DETI")
    private BigDecimal deti;
    @Size(max = 11)
    @Column(name = "SEMEJNOE_POLOGENIE")
    private String semejnoePologenie;
    @Size(max = 34)
    @Column(name = "MESTO_RABOT_V_EKO")
    private String mestoRabotVEko;
    @Column(name = "S_KAKOGO_VREMENI_RABOTAET")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sKakogoVremeniRabotaet;
    @Size(max = 24)
    @Column(name = "SPECIAL_NOST")
    private String specialNost;
    @Size(max = 24)
    @Column(name = "ZANIMAEMAQ_DOLGNOST")
    private String zanimaemaqDolgnost;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "UHEBNOE_ZAVEDENIE")
    private String uhebnoeZavedenie;
    @Size(max = 13)
    @Column(name = "SIKV_EHE_NE_V_S_LALI_OROH")
    private String sikvEheNeVSLaliOroh;
    @Column(name = "RNN")
    private BigDecimal rnn;
    @Size(max = 19)
    @Column(name = "TELEFON_CALCENTER")
    private String telefonCalcenter;
    @Column(name = "TEST")
    private Integer test;
    @Size(max = 49)
    @Column(name = "OBLAST1")
    private String oblast1;
    @Size(max = 49)
    @Column(name = "MEDICINSKAQ_KARTA")
    private String medicinskaqKarta;
    @Column(name = "DATA_OFORMLENIQ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataOformleniq;
    @Column(name = "PACIENT_DONOR")
    private Integer pacientDonor;
    @Column(name = "LIHN_J_DONOR")
    private Boolean lihnJDonor;
    @Column(name = "RECIPIENT")
    private Integer recipient;
    @Size(max = 50)
    @Column(name = "NOM")
    private String nom;
    @Size(max = 50)
    @Column(name = "PRENOM")
    private String prenom;
    @Size(max = 50)
    @Column(name = "PATRONYME")
    private String patronyme;
    @Size(max = 29)
    @Column(name = "POD_EZD")
    private String podEzd;
    @Column(name = "SOKRAHENN_J_VVOD_DANN")
    private Boolean sokrahennJVvodDann;
    @Column(name = "BANK_DE")
    private Boolean bankDe;
    @Column(name = "PROIS_OGDENIE")
    private Integer proisOgdenie;
    @Column(name = "V_DONORSTVE_OTKAZAT")
    private Boolean vDonorstveOtkazat;
    @Size(max = 9)
    @Column(name = "KOD_DONORA")
    private String kodDonora;
    @Size(max = 9)
    @Column(name = "NOMER_DONORA")
    private String nomerDonora;
    @Size(max = 29)
    @Column(name = "FIO")
    private String fio;
    @Size(max = 10)
    @Column(name = "NOMER_FIO")
    private String nomerFio;
    @Size(max = 49)
    @Column(name = "KOD_FIO")
    private String kodFio;
    @Column(name = "POL")
    private Integer pol;
    @Column(name = "NE_LE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date neLe;
    @Column(name = "POLN_LET")
    private BigDecimal polnLet;
    @Size(max = 99)
    @Column(name = "GOD_ROGDENIQ")
    private String godRogdeniq;
    @Size(max = 6)
    @Column(name = "REG")
    private String reg;
    @Size(max = 99)
    @Column(name = "STRANA")
    private String strana;
    @Size(max = 49)
    @Column(name = "GOROD")
    private String gorod;
    @Size(max = 99)
    @Column(name = "OBLAST")
    private String oblast;
    @Size(max = 99)
    @Column(name = "ULICA")
    private String ulica;
    @Size(max = 9)
    @Column(name = "DOM")
    private String dom;
    @Size(max = 9)
    @Column(name = "KORPUS")
    private String korpus;
    @Size(max = 9)
    @Column(name = "KVARTIRA")
    private String kvartira;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "ADRES")
    private String adres;
    @Size(max = 9)
    @Column(name = "ETAG")
    private String etag;
    @Size(max = 9)
    @Column(name = "KOD_DOMOFON")
    private String kodDomofon;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "FAKTIHESKIJ_ADRES")
    private String faktiheskijAdres;
    @Size(max = 99)
    @Column(name = "TEL")
    private String tel;
    @Size(max = 99)
    @Column(name = "DOKUMENT")
    private String dokument;
    @Size(max = 49)
    @Column(name = "PASPORT_N")
    private String pasportN;
    @Column(name = "KOGDA_V_DAN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kogdaVDan;
    @Size(max = 49)
    @Column(name = "KEM_V_DAN")
    private String kemVDan;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "UD_LIHNOSTI")
    private String udLihnosti;
    @Size(max = 99)
    @Column(name = "RABOTA")
    private String rabota;
    @Size(max = 49)
    @Column(name = "PROFESSIQ")
    private String professiq;
    @Size(max = 99)
    @Column(name = "DOLGNOST")
    private String dolgnost;
    @Size(max = 29)
    @Column(name = "RAB_TEL")
    private String rabTel;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "PRIMEHANIE")
    private String primehanie;
    @Column(name = "SUPRUG")
    private Integer suprug;
    @Size(max = 49)
    @Column(name = "LEHAHIJ_VRAH")
    private String lehahijVrah;
    @Size(max = 24)
    @Column(name = "MED_UHREGDENIQ_NAPRAVIVHA")
    private String medUhregdeniqNapravivha;
    @Column(name = "NOZOLOGIQ")
    private Integer nozologiq;
    @Size(max = 19)
    @Column(name = "NACIONAL_NOST")
    private String nacionalNost;
    @Column(name = "OBRAZOVANIE1")
    private Integer obrazovanie1;
    @Column(name = "SEM_POLOGENIE_G")
    private Integer semPologenieG;
    @Column(name = "SEM_POLOGENIE_M")
    private Integer semPologenieM;
    @Size(max = 19)
    @Column(name = "STRA_OVAQ_KOMPANIQ")
    private String straOvaqKompaniq;
    @Size(max = 49)
    @Column(name = "DISPETHER")
    private String dispether;
    @Column(name = "PAT_BEGIN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date patBeginDate;
    @Column(name = "PAT_END_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date patEndDate;
    @Column(name = "PAT_CANCEL_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date patCancelDate;
    @Column(name = "DATA_AR_IVACII")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataArIvacii;
    @Column(name = "KARTA_V_AR_IVE")
    private Boolean kartaVArIve;
    @Size(max = 9)
    @Column(name = "INDEKS")
    private String indeks;
    @Size(max = 12)
    @Column(name = "IIN")
    private String iin;
    @Size(max = 99)
    @Column(name = "INN")
    private String inn;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 99)
    @Column(name = "E_MAIL")
    private String eMail;
    @Size(max = 10)
    @Column(name = "NOMER_MEDICISKOJ_KART")
    private String nomerMediciskojKart;
    @Size(max = 9)
    @Column(name = "MEDICISKAQ_KARTA_STACIONA")
    private String mediciskaqKartaStaciona;
    @Column(name = "DOSSIER_EXIT")
    private Boolean dossierExit;
    @Size(max = 52)
    @Column(name = "RAJON")
    private String rajon;
    @Size(max = 100)
    @Column(name = "DOKUMENT_UD_LIHNOSTI")
    private String dokumentUdLihnosti;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "UDOSTOVERENIE_LIHNOSTI")
    private String udostoverenieLihnosti;
    @Column(name = "DATA_SMERTI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataSmerti;
    @Column(name = "MEDECINS_CREATE_ID")
    private Integer medecinsCreateId;
    @Column(name = "ALSAC")
    private Boolean alsac;
    @Column(name = "ARCHIVE")
    private Boolean archive;
    @Column(name = "NOMER_ISTORII_BOLEZNI")
    private BigDecimal nomerIstoriiBolezni;
    @Lob
    @Column(name = "DYN_STR")
    private byte[] dynStr;
    @Size(max = 10)
    @Column(name = "NUMERO_MEDTR")
    private String numeroMedtr;
    @Column(name = "C_PRINC")
    private Integer cPrinc;
    @Column(name = "AGE_AUTO")
    private BigDecimal ageAuto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MEDECINS_ID")
    private int medecinsId;
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

    public Patients() {
    }

    public Patients(Integer patientsId) {
        this.patientsId = patientsId;
    }

    public Patients(Integer patientsId, int medecinsId) {
        this.patientsId = patientsId;
        this.medecinsId = medecinsId;
    }

    public Integer getPatientsId() {
        return patientsId;
    }

    public void setPatientsId(Integer patientsId) {
        this.patientsId = patientsId;
    }

    public BigDecimal getImc() {
        return imc;
    }

    public void setImc(BigDecimal imc) {
        this.imc = imc;
    }

    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public Date getDernCons() {
        return dernCons;
    }

    public void setDernCons(Date dernCons) {
        this.dernCons = dernCons;
    }

    public String getNOmon() {
        return nOmon;
    }

    public void setNOmon(String nOmon) {
        this.nOmon = nOmon;
    }

    public Integer getCComp() {
        return cComp;
    }

    public void setCComp(Integer cComp) {
        this.cComp = cComp;
    }

    public BigDecimal getFPerc() {
        return fPerc;
    }

    public void setFPerc(BigDecimal fPerc) {
        this.fPerc = fPerc;
    }

    public BigDecimal getFPrincperc() {
        return fPrincperc;
    }

    public void setFPrincperc(BigDecimal fPrincperc) {
        this.fPrincperc = fPrincperc;
    }

    public String getSvLaf() {
        return svLaf;
    }

    public void setSvLaf(String svLaf) {
        this.svLaf = svLaf;
    }

    public String getSvLab() {
        return svLab;
    }

    public void setSvLab(String svLab) {
        this.svLab = svLab;
    }

    public Integer getPlPatgrId() {
        return plPatgrId;
    }

    public void setPlPatgrId(Integer plPatgrId) {
        this.plPatgrId = plPatgrId;
    }

    public Integer getPlSubjId() {
        return plSubjId;
    }

    public void setPlSubjId(Integer plSubjId) {
        this.plSubjId = plSubjId;
    }

    public Integer getMedecinsModifyId() {
        return medecinsModifyId;
    }

    public void setMedecinsModifyId(Integer medecinsModifyId) {
        this.medecinsModifyId = medecinsModifyId;
    }

    public Date getModifyDateTime() {
        return modifyDateTime;
    }

    public void setModifyDateTime(Date modifyDateTime) {
        this.modifyDateTime = modifyDateTime;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Boolean getEmkSinhro() {
        return emkSinhro;
    }

    public void setEmkSinhro(Boolean emkSinhro) {
        this.emkSinhro = emkSinhro;
    }

    public Integer getSigemsIpp() {
        return sigemsIpp;
    }

    public void setSigemsIpp(Integer sigemsIpp) {
        this.sigemsIpp = sigemsIpp;
    }

    public Boolean getMedecinReferent() {
        return medecinReferent;
    }

    public void setMedecinReferent(Boolean medecinReferent) {
        this.medecinReferent = medecinReferent;
    }

    public Integer getDonor() {
        return donor;
    }

    public void setDonor(Integer donor) {
        this.donor = donor;
    }

    public Integer getDonorMug() {
        return donorMug;
    }

    public void setDonorMug(Integer donorMug) {
        this.donorMug = donorMug;
    }

    public BigDecimal getPolnLetDo() {
        return polnLetDo;
    }

    public void setPolnLetDo(BigDecimal polnLetDo) {
        this.polnLetDo = polnLetDo;
    }

    public Integer getDonorOocitov() {
        return donorOocitov;
    }

    public void setDonorOocitov(Integer donorOocitov) {
        this.donorOocitov = donorOocitov;
    }

    public BigDecimal getNomerKart() {
        return nomerKart;
    }

    public void setNomerKart(BigDecimal nomerKart) {
        this.nomerKart = nomerKart;
    }

    public Integer getRezulTat() {
        return rezulTat;
    }

    public void setRezulTat(Integer rezulTat) {
        this.rezulTat = rezulTat;
    }

    public BigDecimal getDeti() {
        return deti;
    }

    public void setDeti(BigDecimal deti) {
        this.deti = deti;
    }

    public String getSemejnoePologenie() {
        return semejnoePologenie;
    }

    public void setSemejnoePologenie(String semejnoePologenie) {
        this.semejnoePologenie = semejnoePologenie;
    }

    public String getMestoRabotVEko() {
        return mestoRabotVEko;
    }

    public void setMestoRabotVEko(String mestoRabotVEko) {
        this.mestoRabotVEko = mestoRabotVEko;
    }

    public Date getSKakogoVremeniRabotaet() {
        return sKakogoVremeniRabotaet;
    }

    public void setSKakogoVremeniRabotaet(Date sKakogoVremeniRabotaet) {
        this.sKakogoVremeniRabotaet = sKakogoVremeniRabotaet;
    }

    public String getSpecialNost() {
        return specialNost;
    }

    public void setSpecialNost(String specialNost) {
        this.specialNost = specialNost;
    }

    public String getZanimaemaqDolgnost() {
        return zanimaemaqDolgnost;
    }

    public void setZanimaemaqDolgnost(String zanimaemaqDolgnost) {
        this.zanimaemaqDolgnost = zanimaemaqDolgnost;
    }

    public String getUhebnoeZavedenie() {
        return uhebnoeZavedenie;
    }

    public void setUhebnoeZavedenie(String uhebnoeZavedenie) {
        this.uhebnoeZavedenie = uhebnoeZavedenie;
    }

    public String getSikvEheNeVSLaliOroh() {
        return sikvEheNeVSLaliOroh;
    }

    public void setSikvEheNeVSLaliOroh(String sikvEheNeVSLaliOroh) {
        this.sikvEheNeVSLaliOroh = sikvEheNeVSLaliOroh;
    }

    public BigDecimal getRnn() {
        return rnn;
    }

    public void setRnn(BigDecimal rnn) {
        this.rnn = rnn;
    }

    public String getTelefonCalcenter() {
        return telefonCalcenter;
    }

    public void setTelefonCalcenter(String telefonCalcenter) {
        this.telefonCalcenter = telefonCalcenter;
    }

    public Integer getTest() {
        return test;
    }

    public void setTest(Integer test) {
        this.test = test;
    }

    public String getOblast1() {
        return oblast1;
    }

    public void setOblast1(String oblast1) {
        this.oblast1 = oblast1;
    }

    public String getMedicinskaqKarta() {
        return medicinskaqKarta;
    }

    public void setMedicinskaqKarta(String medicinskaqKarta) {
        this.medicinskaqKarta = medicinskaqKarta;
    }

    public Date getDataOformleniq() {
        return dataOformleniq;
    }

    public void setDataOformleniq(Date dataOformleniq) {
        this.dataOformleniq = dataOformleniq;
    }

    public Integer getPacientDonor() {
        return pacientDonor;
    }

    public void setPacientDonor(Integer pacientDonor) {
        this.pacientDonor = pacientDonor;
    }

    public Boolean getLihnJDonor() {
        return lihnJDonor;
    }

    public void setLihnJDonor(Boolean lihnJDonor) {
        this.lihnJDonor = lihnJDonor;
    }

    public Integer getRecipient() {
        return recipient;
    }

    public void setRecipient(Integer recipient) {
        this.recipient = recipient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPatronyme() {
        return patronyme;
    }

    public void setPatronyme(String patronyme) {
        this.patronyme = patronyme;
    }

    public String getPodEzd() {
        return podEzd;
    }

    public void setPodEzd(String podEzd) {
        this.podEzd = podEzd;
    }

    public Boolean getSokrahennJVvodDann() {
        return sokrahennJVvodDann;
    }

    public void setSokrahennJVvodDann(Boolean sokrahennJVvodDann) {
        this.sokrahennJVvodDann = sokrahennJVvodDann;
    }

    public Boolean getBankDe() {
        return bankDe;
    }

    public void setBankDe(Boolean bankDe) {
        this.bankDe = bankDe;
    }

    public Integer getProisOgdenie() {
        return proisOgdenie;
    }

    public void setProisOgdenie(Integer proisOgdenie) {
        this.proisOgdenie = proisOgdenie;
    }

    public Boolean getVDonorstveOtkazat() {
        return vDonorstveOtkazat;
    }

    public void setVDonorstveOtkazat(Boolean vDonorstveOtkazat) {
        this.vDonorstveOtkazat = vDonorstveOtkazat;
    }

    public String getKodDonora() {
        return kodDonora;
    }

    public void setKodDonora(String kodDonora) {
        this.kodDonora = kodDonora;
    }

    public String getNomerDonora() {
        return nomerDonora;
    }

    public void setNomerDonora(String nomerDonora) {
        this.nomerDonora = nomerDonora;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getNomerFio() {
        return nomerFio;
    }

    public void setNomerFio(String nomerFio) {
        this.nomerFio = nomerFio;
    }

    public String getKodFio() {
        return kodFio;
    }

    public void setKodFio(String kodFio) {
        this.kodFio = kodFio;
    }

    public Integer getPol() {
        return pol;
    }

    public void setPol(Integer pol) {
        this.pol = pol;
    }

    public Date getNeLe() {
        return neLe;
    }

    public void setNeLe(Date neLe) {
        this.neLe = neLe;
    }

    public BigDecimal getPolnLet() {
        return polnLet;
    }

    public void setPolnLet(BigDecimal polnLet) {
        this.polnLet = polnLet;
    }

    public String getGodRogdeniq() {
        return godRogdeniq;
    }

    public void setGodRogdeniq(String godRogdeniq) {
        this.godRogdeniq = godRogdeniq;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getStrana() {
        return strana;
    }

    public void setStrana(String strana) {
        this.strana = strana;
    }

    public String getGorod() {
        return gorod;
    }

    public void setGorod(String gorod) {
        this.gorod = gorod;
    }

    public String getOblast() {
        return oblast;
    }

    public void setOblast(String oblast) {
        this.oblast = oblast;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }

    public String getKorpus() {
        return korpus;
    }

    public void setKorpus(String korpus) {
        this.korpus = korpus;
    }

    public String getKvartira() {
        return kvartira;
    }

    public void setKvartira(String kvartira) {
        this.kvartira = kvartira;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getKodDomofon() {
        return kodDomofon;
    }

    public void setKodDomofon(String kodDomofon) {
        this.kodDomofon = kodDomofon;
    }

    public String getFaktiheskijAdres() {
        return faktiheskijAdres;
    }

    public void setFaktiheskijAdres(String faktiheskijAdres) {
        this.faktiheskijAdres = faktiheskijAdres;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDokument() {
        return dokument;
    }

    public void setDokument(String dokument) {
        this.dokument = dokument;
    }

    public String getPasportN() {
        return pasportN;
    }

    public void setPasportN(String pasportN) {
        this.pasportN = pasportN;
    }

    public Date getKogdaVDan() {
        return kogdaVDan;
    }

    public void setKogdaVDan(Date kogdaVDan) {
        this.kogdaVDan = kogdaVDan;
    }

    public String getKemVDan() {
        return kemVDan;
    }

    public void setKemVDan(String kemVDan) {
        this.kemVDan = kemVDan;
    }

    public String getUdLihnosti() {
        return udLihnosti;
    }

    public void setUdLihnosti(String udLihnosti) {
        this.udLihnosti = udLihnosti;
    }

    public String getRabota() {
        return rabota;
    }

    public void setRabota(String rabota) {
        this.rabota = rabota;
    }

    public String getProfessiq() {
        return professiq;
    }

    public void setProfessiq(String professiq) {
        this.professiq = professiq;
    }

    public String getDolgnost() {
        return dolgnost;
    }

    public void setDolgnost(String dolgnost) {
        this.dolgnost = dolgnost;
    }

    public String getRabTel() {
        return rabTel;
    }

    public void setRabTel(String rabTel) {
        this.rabTel = rabTel;
    }

    public String getPrimehanie() {
        return primehanie;
    }

    public void setPrimehanie(String primehanie) {
        this.primehanie = primehanie;
    }

    public Integer getSuprug() {
        return suprug;
    }

    public void setSuprug(Integer suprug) {
        this.suprug = suprug;
    }

    public String getLehahijVrah() {
        return lehahijVrah;
    }

    public void setLehahijVrah(String lehahijVrah) {
        this.lehahijVrah = lehahijVrah;
    }

    public String getMedUhregdeniqNapravivha() {
        return medUhregdeniqNapravivha;
    }

    public void setMedUhregdeniqNapravivha(String medUhregdeniqNapravivha) {
        this.medUhregdeniqNapravivha = medUhregdeniqNapravivha;
    }

    public Integer getNozologiq() {
        return nozologiq;
    }

    public void setNozologiq(Integer nozologiq) {
        this.nozologiq = nozologiq;
    }

    public String getNacionalNost() {
        return nacionalNost;
    }

    public void setNacionalNost(String nacionalNost) {
        this.nacionalNost = nacionalNost;
    }

    public Integer getObrazovanie1() {
        return obrazovanie1;
    }

    public void setObrazovanie1(Integer obrazovanie1) {
        this.obrazovanie1 = obrazovanie1;
    }

    public Integer getSemPologenieG() {
        return semPologenieG;
    }

    public void setSemPologenieG(Integer semPologenieG) {
        this.semPologenieG = semPologenieG;
    }

    public Integer getSemPologenieM() {
        return semPologenieM;
    }

    public void setSemPologenieM(Integer semPologenieM) {
        this.semPologenieM = semPologenieM;
    }

    public String getStraOvaqKompaniq() {
        return straOvaqKompaniq;
    }

    public void setStraOvaqKompaniq(String straOvaqKompaniq) {
        this.straOvaqKompaniq = straOvaqKompaniq;
    }

    public String getDispether() {
        return dispether;
    }

    public void setDispether(String dispether) {
        this.dispether = dispether;
    }

    public Date getPatBeginDate() {
        return patBeginDate;
    }

    public void setPatBeginDate(Date patBeginDate) {
        this.patBeginDate = patBeginDate;
    }

    public Date getPatEndDate() {
        return patEndDate;
    }

    public void setPatEndDate(Date patEndDate) {
        this.patEndDate = patEndDate;
    }

    public Date getPatCancelDate() {
        return patCancelDate;
    }

    public void setPatCancelDate(Date patCancelDate) {
        this.patCancelDate = patCancelDate;
    }

    public Date getDataArIvacii() {
        return dataArIvacii;
    }

    public void setDataArIvacii(Date dataArIvacii) {
        this.dataArIvacii = dataArIvacii;
    }

    public Boolean getKartaVArIve() {
        return kartaVArIve;
    }

    public void setKartaVArIve(Boolean kartaVArIve) {
        this.kartaVArIve = kartaVArIve;
    }

    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }

    public String getIin() {
        return iin;
    }

    public void setIin(String iin) {
        this.iin = iin;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getNomerMediciskojKart() {
        return nomerMediciskojKart;
    }

    public void setNomerMediciskojKart(String nomerMediciskojKart) {
        this.nomerMediciskojKart = nomerMediciskojKart;
    }

    public String getMediciskaqKartaStaciona() {
        return mediciskaqKartaStaciona;
    }

    public void setMediciskaqKartaStaciona(String mediciskaqKartaStaciona) {
        this.mediciskaqKartaStaciona = mediciskaqKartaStaciona;
    }

    public Boolean getDossierExit() {
        return dossierExit;
    }

    public void setDossierExit(Boolean dossierExit) {
        this.dossierExit = dossierExit;
    }

    public String getRajon() {
        return rajon;
    }

    public void setRajon(String rajon) {
        this.rajon = rajon;
    }

    public String getDokumentUdLihnosti() {
        return dokumentUdLihnosti;
    }

    public void setDokumentUdLihnosti(String dokumentUdLihnosti) {
        this.dokumentUdLihnosti = dokumentUdLihnosti;
    }

    public String getUdostoverenieLihnosti() {
        return udostoverenieLihnosti;
    }

    public void setUdostoverenieLihnosti(String udostoverenieLihnosti) {
        this.udostoverenieLihnosti = udostoverenieLihnosti;
    }

    public Date getDataSmerti() {
        return dataSmerti;
    }

    public void setDataSmerti(Date dataSmerti) {
        this.dataSmerti = dataSmerti;
    }

    public Integer getMedecinsCreateId() {
        return medecinsCreateId;
    }

    public void setMedecinsCreateId(Integer medecinsCreateId) {
        this.medecinsCreateId = medecinsCreateId;
    }

    public Boolean getAlsac() {
        return alsac;
    }

    public void setAlsac(Boolean alsac) {
        this.alsac = alsac;
    }

    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

    public BigDecimal getNomerIstoriiBolezni() {
        return nomerIstoriiBolezni;
    }

    public void setNomerIstoriiBolezni(BigDecimal nomerIstoriiBolezni) {
        this.nomerIstoriiBolezni = nomerIstoriiBolezni;
    }

    public byte[] getDynStr() {
        return dynStr;
    }

    public void setDynStr(byte[] dynStr) {
        this.dynStr = dynStr;
    }

    public String getNumeroMedtr() {
        return numeroMedtr;
    }

    public void setNumeroMedtr(String numeroMedtr) {
        this.numeroMedtr = numeroMedtr;
    }

    public Integer getCPrinc() {
        return cPrinc;
    }

    public void setCPrinc(Integer cPrinc) {
        this.cPrinc = cPrinc;
    }

    public BigDecimal getAgeAuto() {
        return ageAuto;
    }

    public void setAgeAuto(BigDecimal ageAuto) {
        this.ageAuto = ageAuto;
    }

    public int getMedecinsId() {
        return medecinsId;
    }

    public void setMedecinsId(int medecinsId) {
        this.medecinsId = medecinsId;
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
        hash += (patientsId != null ? patientsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patients)) {
            return false;
        }
        Patients other = (Patients) object;
        if ((this.patientsId == null && other.patientsId != null) || (this.patientsId != null && !this.patientsId.equals(other.patientsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.Patients[ patientsId=" + patientsId + " ]";
    }
    
}
