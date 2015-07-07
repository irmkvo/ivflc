/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

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
 * @author Shah
 */
@Entity
@Table(name = "MOTCONSU")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Motconsu.findAll", query = "SELECT m FROM Motconsu m"),
    @NamedQuery(name = "Motconsu.findByMotconsuId", query = "SELECT m FROM Motconsu m WHERE m.motconsuId = :motconsuId"),
    @NamedQuery(name = "Motconsu.findByDateConsultation", query = "SELECT m FROM Motconsu m WHERE m.dateConsultation = :dateConsultation"),
    @NamedQuery(name = "Motconsu.findByEvDateClose", query = "SELECT m FROM Motconsu m WHERE m.evDateClose = :evDateClose"),
    @NamedQuery(name = "Motconsu.findByModifyDateTime", query = "SELECT m FROM Motconsu m WHERE m.modifyDateTime = :modifyDateTime"),
    @NamedQuery(name = "Motconsu.findByModelsId", query = "SELECT m FROM Motconsu m WHERE m.modelsId = :modelsId"),
    @NamedQuery(name = "Motconsu.findByMotconsuEvId", query = "SELECT m FROM Motconsu m WHERE m.motconsuEvId = :motconsuEvId"),
    @NamedQuery(name = "Motconsu.findByMedecinsModifyId", query = "SELECT m FROM Motconsu m WHERE m.medecinsModifyId = :medecinsModifyId"),
    @NamedQuery(name = "Motconsu.findByPatientsId", query = "SELECT m FROM Motconsu m WHERE m.patientsId = :patientsId"),
    @NamedQuery(name = "Motconsu.findByPlanningId", query = "SELECT m FROM Motconsu m WHERE m.planningId = :planningId"),
    @NamedQuery(name = "Motconsu.findByFmBillId", query = "SELECT m FROM Motconsu m WHERE m.fmBillId = :fmBillId"),
    @NamedQuery(name = "Motconsu.findByRecStatus", query = "SELECT m FROM Motconsu m WHERE m.recStatus = :recStatus"),
    @NamedQuery(name = "Motconsu.findByFmDepId", query = "SELECT m FROM Motconsu m WHERE m.fmDepId = :fmDepId"),
    @NamedQuery(name = "Motconsu.findByCreateDateTime", query = "SELECT m FROM Motconsu m WHERE m.createDateTime = :createDateTime"),
    @NamedQuery(name = "Motconsu.findByMedecinsCreateId", query = "SELECT m FROM Motconsu m WHERE m.medecinsCreateId = :medecinsCreateId"),
    @NamedQuery(name = "Motconsu.findByRecName", query = "SELECT m FROM Motconsu m WHERE m.recName = :recName"),
    @NamedQuery(name = "Motconsu.findByEvName", query = "SELECT m FROM Motconsu m WHERE m.evName = :evName"),
    @NamedQuery(name = "Motconsu.findByEvClose", query = "SELECT m FROM Motconsu m WHERE m.evClose = :evClose"),
    @NamedQuery(name = "Motconsu.findByCiklZakrT", query = "SELECT m FROM Motconsu m WHERE m.ciklZakrT = :ciklZakrT"),
    @NamedQuery(name = "Motconsu.findByRashirennJStPraesens", query = "SELECT m FROM Motconsu m WHERE m.rashirennJStPraesens = :rashirennJStPraesens"),
    @NamedQuery(name = "Motconsu.findByBolNihnJList", query = "SELECT m FROM Motconsu m WHERE m.bolNihnJList = :bolNihnJList"),
    @NamedQuery(name = "Motconsu.findByPolMugskoj", query = "SELECT m FROM Motconsu m WHERE m.polMugskoj = :polMugskoj"),
    @NamedQuery(name = "Motconsu.findByEvGosp", query = "SELECT m FROM Motconsu m WHERE m.evGosp = :evGosp"),
    @NamedQuery(name = "Motconsu.findByVozrast", query = "SELECT m FROM Motconsu m WHERE m.vozrast = :vozrast"),
    @NamedQuery(name = "Motconsu.findByMotconsuEventTypesId", query = "SELECT m FROM Motconsu m WHERE m.motconsuEventTypesId = :motconsuEventTypesId"),
    @NamedQuery(name = "Motconsu.findByApprovedDateTime", query = "SELECT m FROM Motconsu m WHERE m.approvedDateTime = :approvedDateTime"),
    @NamedQuery(name = "Motconsu.findByMedecinsApprovedId", query = "SELECT m FROM Motconsu m WHERE m.medecinsApprovedId = :medecinsApprovedId"),
    @NamedQuery(name = "Motconsu.findByMedecinsId", query = "SELECT m FROM Motconsu m WHERE m.medecinsId = :medecinsId"),
    @NamedQuery(name = "Motconsu.findByNumMedecintr", query = "SELECT m FROM Motconsu m WHERE m.numMedecintr = :numMedecintr"),
    @NamedQuery(name = "Motconsu.findByKrnCreateDate", query = "SELECT m FROM Motconsu m WHERE m.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Motconsu.findByKrnCreateUserId", query = "SELECT m FROM Motconsu m WHERE m.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Motconsu.findByKrnModifyDate", query = "SELECT m FROM Motconsu m WHERE m.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Motconsu.findByKrnModifyUserId", query = "SELECT m FROM Motconsu m WHERE m.krnModifyUserId = :krnModifyUserId")})
public class Motconsu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOTCONSU_ID")
    private Integer motconsuId;
    @Column(name = "DATE_CONSULTATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateConsultation;
    @Column(name = "EV_DATE_CLOSE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date evDateClose;
    @Column(name = "MODIFY_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDateTime;
    @Column(name = "MODELS_ID")
    private Integer modelsId;
    @Column(name = "MOTCONSU_EV_ID")
    private Integer motconsuEvId;
    @Column(name = "MEDECINS_MODIFY_ID")
    private Integer medecinsModifyId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PATIENTS_ID")
    private int patientsId;
    @Column(name = "PLANNING_ID")
    private Integer planningId;
    @Column(name = "FM_BILL_ID")
    private Integer fmBillId;
    @Size(max = 1)
    @Column(name = "REC_STATUS")
    private String recStatus;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "REPRODUKTOLOGI_GALOB_PRI_")
    private String reproduktologiGalobPri;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "AN_MORBI")
    private String anMorbi;
    @Column(name = "FM_DEP_ID")
    private Integer fmDepId;
    @Column(name = "CREATE_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;
    @Column(name = "MEDECINS_CREATE_ID")
    private Integer medecinsCreateId;
    @Size(max = 100)
    @Column(name = "REC_NAME")
    private String recName;
    @Size(max = 100)
    @Column(name = "EV_NAME")
    private String evName;
    @Column(name = "EV_CLOSE")
    private Boolean evClose;
    @Size(max = 4)
    @Column(name = "CIKL_ZAKR_T")
    private String ciklZakrT;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "MOTIF_DE_CONSULTATION")
    private String motifDeConsultation;
    @Column(name = "RASHIRENN_J_ST_PRAESENS")
    private Boolean rashirennJStPraesens;
    @Column(name = "BOL_NIHN_J_LIST")
    private Boolean bolNihnJList;
    @Column(name = "POL_MUGSKOJ")
    private Boolean polMugskoj;
    @Column(name = "EV_GOSP")
    private Boolean evGosp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VOZRAST")
    private BigDecimal vozrast;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "TEKUHEE_SOSTOQNIE_BOL_NOG")
    private String tekuheeSostoqnieBolNog;
    @Column(name = "MOTCONSU_EVENT_TYPES_ID")
    private Integer motconsuEventTypesId;
    @Column(name = "APPROVED_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date approvedDateTime;
    @Column(name = "MEDECINS_APPROVED_ID")
    private Integer medecinsApprovedId;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "PATIENT_ALERTES")
    private String patientAlertes;
    @Column(name = "MEDECINS_ID")
    private Integer medecinsId;
    @Column(name = "NUM_MEDECINTR")
    private Integer numMedecintr;
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

    public Motconsu() {
    }

    public Motconsu(Integer motconsuId) {
        this.motconsuId = motconsuId;
    }

    public Motconsu(Integer motconsuId, int patientsId) {
        this.motconsuId = motconsuId;
        this.patientsId = patientsId;
    }

    public Integer getMotconsuId() {
        return motconsuId;
    }

    public void setMotconsuId(Integer motconsuId) {
        this.motconsuId = motconsuId;
    }

    public Date getDateConsultation() {
        return dateConsultation;
    }

    public void setDateConsultation(Date dateConsultation) {
        this.dateConsultation = dateConsultation;
    }

    public Date getEvDateClose() {
        return evDateClose;
    }

    public void setEvDateClose(Date evDateClose) {
        this.evDateClose = evDateClose;
    }

    public Date getModifyDateTime() {
        return modifyDateTime;
    }

    public void setModifyDateTime(Date modifyDateTime) {
        this.modifyDateTime = modifyDateTime;
    }

    public Integer getModelsId() {
        return modelsId;
    }

    public void setModelsId(Integer modelsId) {
        this.modelsId = modelsId;
    }

    public Integer getMotconsuEvId() {
        return motconsuEvId;
    }

    public void setMotconsuEvId(Integer motconsuEvId) {
        this.motconsuEvId = motconsuEvId;
    }

    public Integer getMedecinsModifyId() {
        return medecinsModifyId;
    }

    public void setMedecinsModifyId(Integer medecinsModifyId) {
        this.medecinsModifyId = medecinsModifyId;
    }

    public int getPatientsId() {
        return patientsId;
    }

    public void setPatientsId(int patientsId) {
        this.patientsId = patientsId;
    }

    public Integer getPlanningId() {
        return planningId;
    }

    public void setPlanningId(Integer planningId) {
        this.planningId = planningId;
    }

    public Integer getFmBillId() {
        return fmBillId;
    }

    public void setFmBillId(Integer fmBillId) {
        this.fmBillId = fmBillId;
    }

    public String getRecStatus() {
        return recStatus;
    }

    public void setRecStatus(String recStatus) {
        this.recStatus = recStatus;
    }

    public String getReproduktologiGalobPri() {
        return reproduktologiGalobPri;
    }

    public void setReproduktologiGalobPri(String reproduktologiGalobPri) {
        this.reproduktologiGalobPri = reproduktologiGalobPri;
    }

    public String getAnMorbi() {
        return anMorbi;
    }

    public void setAnMorbi(String anMorbi) {
        this.anMorbi = anMorbi;
    }

    public Integer getFmDepId() {
        return fmDepId;
    }

    public void setFmDepId(Integer fmDepId) {
        this.fmDepId = fmDepId;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Integer getMedecinsCreateId() {
        return medecinsCreateId;
    }

    public void setMedecinsCreateId(Integer medecinsCreateId) {
        this.medecinsCreateId = medecinsCreateId;
    }

    public String getRecName() {
        return recName;
    }

    public void setRecName(String recName) {
        this.recName = recName;
    }

    public String getEvName() {
        return evName;
    }

    public void setEvName(String evName) {
        this.evName = evName;
    }

    public Boolean getEvClose() {
        return evClose;
    }

    public void setEvClose(Boolean evClose) {
        this.evClose = evClose;
    }

    public String getCiklZakrT() {
        return ciklZakrT;
    }

    public void setCiklZakrT(String ciklZakrT) {
        this.ciklZakrT = ciklZakrT;
    }

    public String getMotifDeConsultation() {
        return motifDeConsultation;
    }

    public void setMotifDeConsultation(String motifDeConsultation) {
        this.motifDeConsultation = motifDeConsultation;
    }

    public Boolean getRashirennJStPraesens() {
        return rashirennJStPraesens;
    }

    public void setRashirennJStPraesens(Boolean rashirennJStPraesens) {
        this.rashirennJStPraesens = rashirennJStPraesens;
    }

    public Boolean getBolNihnJList() {
        return bolNihnJList;
    }

    public void setBolNihnJList(Boolean bolNihnJList) {
        this.bolNihnJList = bolNihnJList;
    }

    public Boolean getPolMugskoj() {
        return polMugskoj;
    }

    public void setPolMugskoj(Boolean polMugskoj) {
        this.polMugskoj = polMugskoj;
    }

    public Boolean getEvGosp() {
        return evGosp;
    }

    public void setEvGosp(Boolean evGosp) {
        this.evGosp = evGosp;
    }

    public BigDecimal getVozrast() {
        return vozrast;
    }

    public void setVozrast(BigDecimal vozrast) {
        this.vozrast = vozrast;
    }

    public String getTekuheeSostoqnieBolNog() {
        return tekuheeSostoqnieBolNog;
    }

    public void setTekuheeSostoqnieBolNog(String tekuheeSostoqnieBolNog) {
        this.tekuheeSostoqnieBolNog = tekuheeSostoqnieBolNog;
    }

    public Integer getMotconsuEventTypesId() {
        return motconsuEventTypesId;
    }

    public void setMotconsuEventTypesId(Integer motconsuEventTypesId) {
        this.motconsuEventTypesId = motconsuEventTypesId;
    }

    public Date getApprovedDateTime() {
        return approvedDateTime;
    }

    public void setApprovedDateTime(Date approvedDateTime) {
        this.approvedDateTime = approvedDateTime;
    }

    public Integer getMedecinsApprovedId() {
        return medecinsApprovedId;
    }

    public void setMedecinsApprovedId(Integer medecinsApprovedId) {
        this.medecinsApprovedId = medecinsApprovedId;
    }

    public String getPatientAlertes() {
        return patientAlertes;
    }

    public void setPatientAlertes(String patientAlertes) {
        this.patientAlertes = patientAlertes;
    }

    public Integer getMedecinsId() {
        return medecinsId;
    }

    public void setMedecinsId(Integer medecinsId) {
        this.medecinsId = medecinsId;
    }

    public Integer getNumMedecintr() {
        return numMedecintr;
    }

    public void setNumMedecintr(Integer numMedecintr) {
        this.numMedecintr = numMedecintr;
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
        hash += (motconsuId != null ? motconsuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Motconsu)) {
            return false;
        }
        Motconsu other = (Motconsu) object;
        if ((this.motconsuId == null && other.motconsuId != null) || (this.motconsuId != null && !this.motconsuId.equals(other.motconsuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Motconsu[ motconsuId=" + motconsuId + " ]";
    }
    
}
