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
@Table(name = "MEDECINS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medecins.findAll", query = "SELECT m FROM Medecins m"),
    @NamedQuery(name = "Medecins.findByMedecinsId", query = "SELECT m FROM Medecins m WHERE m.medecinsId = :medecinsId"),
    @NamedQuery(name = "Medecins.findBySystemFlags", query = "SELECT m FROM Medecins m WHERE m.systemFlags = :systemFlags"),
    @NamedQuery(name = "Medecins.findByMedecinsComptableId", query = "SELECT m FROM Medecins m WHERE m.medecinsComptableId = :medecinsComptableId"),
    @NamedQuery(name = "Medecins.findByNAgenda", query = "SELECT m FROM Medecins m WHERE m.nAgenda = :nAgenda"),
    @NamedQuery(name = "Medecins.findByNModele", query = "SELECT m FROM Medecins m WHERE m.nModele = :nModele"),
    @NamedQuery(name = "Medecins.findByNUsePlan", query = "SELECT m FROM Medecins m WHERE m.nUsePlan = :nUsePlan"),
    @NamedQuery(name = "Medecins.findByNDefaultExam", query = "SELECT m FROM Medecins m WHERE m.nDefaultExam = :nDefaultExam"),
    @NamedQuery(name = "Medecins.findByAg2035Dir", query = "SELECT m FROM Medecins m WHERE m.ag2035Dir = :ag2035Dir"),
    @NamedQuery(name = "Medecins.findByAg2035Compte", query = "SELECT m FROM Medecins m WHERE m.ag2035Compte = :ag2035Compte"),
    @NamedQuery(name = "Medecins.findByForcerModele", query = "SELECT m FROM Medecins m WHERE m.forcerModele = :forcerModele"),
    @NamedQuery(name = "Medecins.findByFmDepId", query = "SELECT m FROM Medecins m WHERE m.fmDepId = :fmDepId"),
    @NamedQuery(name = "Medecins.findByFmOrgId", query = "SELECT m FROM Medecins m WHERE m.fmOrgId = :fmOrgId"),
    @NamedQuery(name = "Medecins.findByFmRoleId", query = "SELECT m FROM Medecins m WHERE m.fmRoleId = :fmRoleId"),
    @NamedQuery(name = "Medecins.findByFmPricetypeId", query = "SELECT m FROM Medecins m WHERE m.fmPricetypeId = :fmPricetypeId"),
    @NamedQuery(name = "Medecins.findByLoginAction", query = "SELECT m FROM Medecins m WHERE m.loginAction = :loginAction"),
    @NamedQuery(name = "Medecins.findByLogin", query = "SELECT m FROM Medecins m WHERE m.login = :login"),
    @NamedQuery(name = "Medecins.findByLogin2", query = "SELECT m FROM Medecins m WHERE m.login2 = :login2"),
    @NamedQuery(name = "Medecins.findByRmDatabasesId", query = "SELECT m FROM Medecins m WHERE m.rmDatabasesId = :rmDatabasesId"),
    @NamedQuery(name = "Medecins.findByOpenServInBill", query = "SELECT m FROM Medecins m WHERE m.openServInBill = :openServInBill"),
    @NamedQuery(name = "Medecins.findByAllOrgs", query = "SELECT m FROM Medecins m WHERE m.allOrgs = :allOrgs"),
    @NamedQuery(name = "Medecins.findByNom", query = "SELECT m FROM Medecins m WHERE m.nom = :nom"),
    @NamedQuery(name = "Medecins.findByPrenom", query = "SELECT m FROM Medecins m WHERE m.prenom = :prenom"),
    @NamedQuery(name = "Medecins.findBySpecialisation", query = "SELECT m FROM Medecins m WHERE m.specialisation = :specialisation"),
    @NamedQuery(name = "Medecins.findByUhenaqStepen", query = "SELECT m FROM Medecins m WHERE m.uhenaqStepen = :uhenaqStepen"),
    @NamedQuery(name = "Medecins.findByUhenoeZvanie", query = "SELECT m FROM Medecins m WHERE m.uhenoeZvanie = :uhenoeZvanie"),
    @NamedQuery(name = "Medecins.findByTelefon", query = "SELECT m FROM Medecins m WHERE m.telefon = :telefon"),
    @NamedQuery(name = "Medecins.findByMobilNJTel", query = "SELECT m FROM Medecins m WHERE m.mobilNJTel = :mobilNJTel"),
    @NamedQuery(name = "Medecins.findByKod1", query = "SELECT m FROM Medecins m WHERE m.kod1 = :kod1"),
    @NamedQuery(name = "Medecins.findByKod2", query = "SELECT m FROM Medecins m WHERE m.kod2 = :kod2"),
    @NamedQuery(name = "Medecins.findByKod3", query = "SELECT m FROM Medecins m WHERE m.kod3 = :kod3"),
    @NamedQuery(name = "Medecins.findByKod4", query = "SELECT m FROM Medecins m WHERE m.kod4 = :kod4"),
    @NamedQuery(name = "Medecins.findByKod5", query = "SELECT m FROM Medecins m WHERE m.kod5 = :kod5"),
    @NamedQuery(name = "Medecins.findByAccesstosv", query = "SELECT m FROM Medecins m WHERE m.accesstosv = :accesstosv"),
    @NamedQuery(name = "Medecins.findByGorod", query = "SELECT m FROM Medecins m WHERE m.gorod = :gorod"),
    @NamedQuery(name = "Medecins.findByIndeks", query = "SELECT m FROM Medecins m WHERE m.indeks = :indeks"),
    @NamedQuery(name = "Medecins.findByKabinet", query = "SELECT m FROM Medecins m WHERE m.kabinet = :kabinet"),
    @NamedQuery(name = "Medecins.findByDateEurostart", query = "SELECT m FROM Medecins m WHERE m.dateEurostart = :dateEurostart"),
    @NamedQuery(name = "Medecins.findByArchive", query = "SELECT m FROM Medecins m WHERE m.archive = :archive"),
    @NamedQuery(name = "Medecins.findByNoemie", query = "SELECT m FROM Medecins m WHERE m.noemie = :noemie"),
    @NamedQuery(name = "Medecins.findBySecteur2", query = "SELECT m FROM Medecins m WHERE m.secteur2 = :secteur2"),
    @NamedQuery(name = "Medecins.findByActiverEntentePrealable", query = "SELECT m FROM Medecins m WHERE m.activerEntentePrealable = :activerEntentePrealable"),
    @NamedQuery(name = "Medecins.findByType", query = "SELECT m FROM Medecins m WHERE m.type = :type"),
    @NamedQuery(name = "Medecins.findByOtobragatVSpiske", query = "SELECT m FROM Medecins m WHERE m.otobragatVSpiske = :otobragatVSpiske"),
    @NamedQuery(name = "Medecins.findByIin", query = "SELECT m FROM Medecins m WHERE m.iin = :iin"),
    @NamedQuery(name = "Medecins.findByKod1s", query = "SELECT m FROM Medecins m WHERE m.kod1s = :kod1s"),
    @NamedQuery(name = "Medecins.findByAccessCode", query = "SELECT m FROM Medecins m WHERE m.accessCode = :accessCode"),
    @NamedQuery(name = "Medecins.findByKrnCreateDate", query = "SELECT m FROM Medecins m WHERE m.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Medecins.findByKrnCreateUserId", query = "SELECT m FROM Medecins m WHERE m.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Medecins.findByKrnModifyDate", query = "SELECT m FROM Medecins m WHERE m.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Medecins.findByKrnModifyUserId", query = "SELECT m FROM Medecins m WHERE m.krnModifyUserId = :krnModifyUserId")})
public class Medecins implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MEDECINS_ID")
    private Integer medecinsId;
    @Size(max = 254)
    @Column(name = "SYSTEM_FLAGS")
    private String systemFlags;
    @Column(name = "MEDECINS_COMPTABLE_ID")
    private Integer medecinsComptableId;
    @Column(name = "N_AGENDA")
    private Integer nAgenda;
    @Column(name = "N_MODELE")
    private Integer nModele;
    @Column(name = "N_USE_PLAN")
    private Boolean nUsePlan;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "SV_LPS")
    private String svLps;
    @Column(name = "N_DEFAULT_EXAM")
    private Integer nDefaultExam;
    @Size(max = 8)
    @Column(name = "AG2035_DIR")
    private String ag2035Dir;
    @Size(max = 4)
    @Column(name = "AG2035_COMPTE")
    private String ag2035Compte;
    @Column(name = "FORCER_MODELE")
    private Boolean forcerModele;
    @Column(name = "FM_DEP_ID")
    private Integer fmDepId;
    @Column(name = "FM_ORG_ID")
    private Integer fmOrgId;
    @Column(name = "FM_ROLE_ID")
    private Integer fmRoleId;
    @Column(name = "FM_PRICETYPE_ID")
    private Integer fmPricetypeId;
    @Column(name = "LOGIN_ACTION")
    private Integer loginAction;
    @Size(max = 80)
    @Column(name = "LOGIN")
    private String login;
    @Size(max = 32)
    @Column(name = "LOGIN2")
    private String login2;
    @Column(name = "RM_DATABASES_ID")
    private Integer rmDatabasesId;
    @Column(name = "OPEN_SERV_IN_BILL")
    private Boolean openServInBill;
    @Column(name = "ALL_ORGS")
    private Boolean allOrgs;
    @Size(max = 50)
    @Column(name = "NOM")
    private String nom;
    @Size(max = 50)
    @Column(name = "PRENOM")
    private String prenom;
    @Size(max = 49)
    @Column(name = "SPECIALISATION")
    private String specialisation;
    @Size(max = 9)
    @Column(name = "UHENAQ_STEPEN")
    private String uhenaqStepen;
    @Size(max = 19)
    @Column(name = "UHENOE_ZVANIE")
    private String uhenoeZvanie;
    @Size(max = 19)
    @Column(name = "TELEFON")
    private String telefon;
    @Size(max = 19)
    @Column(name = "MOBIL_N_J_TEL")
    private String mobilNJTel;
    @Size(max = 9)
    @Column(name = "KOD1")
    private String kod1;
    @Size(max = 9)
    @Column(name = "KOD2")
    private String kod2;
    @Size(max = 9)
    @Column(name = "KOD3")
    private String kod3;
    @Size(max = 9)
    @Column(name = "KOD4")
    private String kod4;
    @Size(max = 9)
    @Column(name = "KOD5")
    private String kod5;
    @Column(name = "ACCESSTOSV")
    private Boolean accesstosv;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "ADRES")
    private String adres;
    @Size(max = 49)
    @Column(name = "GOROD")
    private String gorod;
    @Size(max = 9)
    @Column(name = "INDEKS")
    private String indeks;
    @Size(max = 200)
    @Column(name = "KABINET")
    private String kabinet;
    @Column(name = "DATE_EUROSTART")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEurostart;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "RASPISANIE_KONTROL")
    private String raspisanieKontrol;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "FOTOGRAFIQ")
    private String fotografiq;
    @Column(name = "ARCHIVE")
    private Boolean archive;
    @Column(name = "NOEMIE")
    private Boolean noemie;
    @Column(name = "SECTEUR2")
    private Boolean secteur2;
    @Column(name = "ActiverEntentePrealable")
    private Boolean activerEntentePrealable;
    @Column(name = "TYPE")
    private Integer type;
    @Column(name = "OTOBRAGAT_V_SPISKE")
    private Boolean otobragatVSpiske;
    @Size(max = 99)
    @Column(name = "IIN")
    private String iin;
    @Size(max = 99)
    @Column(name = "KOD_1S")
    private String kod1s;
    @Size(max = 24)
    @Column(name = "ACCESS_CODE")
    private String accessCode;
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

    public Medecins() {
    }

    public Medecins(Integer medecinsId) {
        this.medecinsId = medecinsId;
    }

    public Integer getMedecinsId() {
        return medecinsId;
    }

    public void setMedecinsId(Integer medecinsId) {
        this.medecinsId = medecinsId;
    }

    public String getSystemFlags() {
        return systemFlags;
    }

    public void setSystemFlags(String systemFlags) {
        this.systemFlags = systemFlags;
    }

    public Integer getMedecinsComptableId() {
        return medecinsComptableId;
    }

    public void setMedecinsComptableId(Integer medecinsComptableId) {
        this.medecinsComptableId = medecinsComptableId;
    }

    public Integer getNAgenda() {
        return nAgenda;
    }

    public void setNAgenda(Integer nAgenda) {
        this.nAgenda = nAgenda;
    }

    public Integer getNModele() {
        return nModele;
    }

    public void setNModele(Integer nModele) {
        this.nModele = nModele;
    }

    public Boolean getNUsePlan() {
        return nUsePlan;
    }

    public void setNUsePlan(Boolean nUsePlan) {
        this.nUsePlan = nUsePlan;
    }

    public String getSvLps() {
        return svLps;
    }

    public void setSvLps(String svLps) {
        this.svLps = svLps;
    }

    public Integer getNDefaultExam() {
        return nDefaultExam;
    }

    public void setNDefaultExam(Integer nDefaultExam) {
        this.nDefaultExam = nDefaultExam;
    }

    public String getAg2035Dir() {
        return ag2035Dir;
    }

    public void setAg2035Dir(String ag2035Dir) {
        this.ag2035Dir = ag2035Dir;
    }

    public String getAg2035Compte() {
        return ag2035Compte;
    }

    public void setAg2035Compte(String ag2035Compte) {
        this.ag2035Compte = ag2035Compte;
    }

    public Boolean getForcerModele() {
        return forcerModele;
    }

    public void setForcerModele(Boolean forcerModele) {
        this.forcerModele = forcerModele;
    }

    public Integer getFmDepId() {
        return fmDepId;
    }

    public void setFmDepId(Integer fmDepId) {
        this.fmDepId = fmDepId;
    }

    public Integer getFmOrgId() {
        return fmOrgId;
    }

    public void setFmOrgId(Integer fmOrgId) {
        this.fmOrgId = fmOrgId;
    }

    public Integer getFmRoleId() {
        return fmRoleId;
    }

    public void setFmRoleId(Integer fmRoleId) {
        this.fmRoleId = fmRoleId;
    }

    public Integer getFmPricetypeId() {
        return fmPricetypeId;
    }

    public void setFmPricetypeId(Integer fmPricetypeId) {
        this.fmPricetypeId = fmPricetypeId;
    }

    public Integer getLoginAction() {
        return loginAction;
    }

    public void setLoginAction(Integer loginAction) {
        this.loginAction = loginAction;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin2() {
        return login2;
    }

    public void setLogin2(String login2) {
        this.login2 = login2;
    }

    public Integer getRmDatabasesId() {
        return rmDatabasesId;
    }

    public void setRmDatabasesId(Integer rmDatabasesId) {
        this.rmDatabasesId = rmDatabasesId;
    }

    public Boolean getOpenServInBill() {
        return openServInBill;
    }

    public void setOpenServInBill(Boolean openServInBill) {
        this.openServInBill = openServInBill;
    }

    public Boolean getAllOrgs() {
        return allOrgs;
    }

    public void setAllOrgs(Boolean allOrgs) {
        this.allOrgs = allOrgs;
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

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String getUhenaqStepen() {
        return uhenaqStepen;
    }

    public void setUhenaqStepen(String uhenaqStepen) {
        this.uhenaqStepen = uhenaqStepen;
    }

    public String getUhenoeZvanie() {
        return uhenoeZvanie;
    }

    public void setUhenoeZvanie(String uhenoeZvanie) {
        this.uhenoeZvanie = uhenoeZvanie;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getMobilNJTel() {
        return mobilNJTel;
    }

    public void setMobilNJTel(String mobilNJTel) {
        this.mobilNJTel = mobilNJTel;
    }

    public String getKod1() {
        return kod1;
    }

    public void setKod1(String kod1) {
        this.kod1 = kod1;
    }

    public String getKod2() {
        return kod2;
    }

    public void setKod2(String kod2) {
        this.kod2 = kod2;
    }

    public String getKod3() {
        return kod3;
    }

    public void setKod3(String kod3) {
        this.kod3 = kod3;
    }

    public String getKod4() {
        return kod4;
    }

    public void setKod4(String kod4) {
        this.kod4 = kod4;
    }

    public String getKod5() {
        return kod5;
    }

    public void setKod5(String kod5) {
        this.kod5 = kod5;
    }

    public Boolean getAccesstosv() {
        return accesstosv;
    }

    public void setAccesstosv(Boolean accesstosv) {
        this.accesstosv = accesstosv;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getGorod() {
        return gorod;
    }

    public void setGorod(String gorod) {
        this.gorod = gorod;
    }

    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }

    public String getKabinet() {
        return kabinet;
    }

    public void setKabinet(String kabinet) {
        this.kabinet = kabinet;
    }

    public Date getDateEurostart() {
        return dateEurostart;
    }

    public void setDateEurostart(Date dateEurostart) {
        this.dateEurostart = dateEurostart;
    }

    public String getRaspisanieKontrol() {
        return raspisanieKontrol;
    }

    public void setRaspisanieKontrol(String raspisanieKontrol) {
        this.raspisanieKontrol = raspisanieKontrol;
    }

    public String getFotografiq() {
        return fotografiq;
    }

    public void setFotografiq(String fotografiq) {
        this.fotografiq = fotografiq;
    }

    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

    public Boolean getNoemie() {
        return noemie;
    }

    public void setNoemie(Boolean noemie) {
        this.noemie = noemie;
    }

    public Boolean getSecteur2() {
        return secteur2;
    }

    public void setSecteur2(Boolean secteur2) {
        this.secteur2 = secteur2;
    }

    public Boolean getActiverEntentePrealable() {
        return activerEntentePrealable;
    }

    public void setActiverEntentePrealable(Boolean activerEntentePrealable) {
        this.activerEntentePrealable = activerEntentePrealable;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getOtobragatVSpiske() {
        return otobragatVSpiske;
    }

    public void setOtobragatVSpiske(Boolean otobragatVSpiske) {
        this.otobragatVSpiske = otobragatVSpiske;
    }

    public String getIin() {
        return iin;
    }

    public void setIin(String iin) {
        this.iin = iin;
    }

    public String getKod1s() {
        return kod1s;
    }

    public void setKod1s(String kod1s) {
        this.kod1s = kod1s;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
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
        hash += (medecinsId != null ? medecinsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medecins)) {
            return false;
        }
        Medecins other = (Medecins) object;
        if ((this.medecinsId == null && other.medecinsId != null) || (this.medecinsId != null && !this.medecinsId.equals(other.medecinsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.Medecins[ medecinsId=" + medecinsId + " ]";
    }
    
}
