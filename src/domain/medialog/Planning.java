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
@Table(name = "PLANNING")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Planning.findAll", query = "SELECT p FROM Planning p"),
    @NamedQuery(name = "Planning.findByPlanningId", query = "SELECT p FROM Planning p WHERE p.planningId = :planningId"),
    @NamedQuery(name = "Planning.findByPlSubjId", query = "SELECT p FROM Planning p WHERE p.plSubjId = :plSubjId"),
    @NamedQuery(name = "Planning.findByDateCons", query = "SELECT p FROM Planning p WHERE p.dateCons = :dateCons"),
    @NamedQuery(name = "Planning.findByHeure", query = "SELECT p FROM Planning p WHERE p.heure = :heure"),
    @NamedQuery(name = "Planning.findByDuree", query = "SELECT p FROM Planning p WHERE p.duree = :duree"),
    @NamedQuery(name = "Planning.findByPatientsId", query = "SELECT p FROM Planning p WHERE p.patientsId = :patientsId"),
    @NamedQuery(name = "Planning.findByNom", query = "SELECT p FROM Planning p WHERE p.nom = :nom"),
    @NamedQuery(name = "Planning.findByPrenom", query = "SELECT p FROM Planning p WHERE p.prenom = :prenom"),
    @NamedQuery(name = "Planning.findByColor", query = "SELECT p FROM Planning p WHERE p.color = :color"),
    @NamedQuery(name = "Planning.findByFont", query = "SELECT p FROM Planning p WHERE p.font = :font"),
    @NamedQuery(name = "Planning.findByDureeText", query = "SELECT p FROM Planning p WHERE p.dureeText = :dureeText"),
    @NamedQuery(name = "Planning.findByPatientArrivee", query = "SELECT p FROM Planning p WHERE p.patientArrivee = :patientArrivee"),
    @NamedQuery(name = "Planning.findByPlGenerId", query = "SELECT p FROM Planning p WHERE p.plGenerId = :plGenerId"),
    @NamedQuery(name = "Planning.findByPlExamId", query = "SELECT p FROM Planning p WHERE p.plExamId = :plExamId"),
    @NamedQuery(name = "Planning.findByPatronyme", query = "SELECT p FROM Planning p WHERE p.patronyme = :patronyme"),
    @NamedQuery(name = "Planning.findByMedecinsCreatorId", query = "SELECT p FROM Planning p WHERE p.medecinsCreatorId = :medecinsCreatorId"),
    @NamedQuery(name = "Planning.findByModifyDateTime", query = "SELECT p FROM Planning p WHERE p.modifyDateTime = :modifyDateTime"),
    @NamedQuery(name = "Planning.findByFmPatientstypeId", query = "SELECT p FROM Planning p WHERE p.fmPatientstypeId = :fmPatientstypeId"),
    @NamedQuery(name = "Planning.findByCreateDateTime", query = "SELECT p FROM Planning p WHERE p.createDateTime = :createDateTime"),
    @NamedQuery(name = "Planning.findByMedecinsModifyId", query = "SELECT p FROM Planning p WHERE p.medecinsModifyId = :medecinsModifyId"),
    @NamedQuery(name = "Planning.findByCouleurMacro", query = "SELECT p FROM Planning p WHERE p.couleurMacro = :couleurMacro"),
    @NamedQuery(name = "Planning.findByCallsId", query = "SELECT p FROM Planning p WHERE p.callsId = :callsId"),
    @NamedQuery(name = "Planning.findByHl7AccessionNumber", query = "SELECT p FROM Planning p WHERE p.hl7AccessionNumber = :hl7AccessionNumber"),
    @NamedQuery(name = "Planning.findByKrnCreateDate", query = "SELECT p FROM Planning p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Planning.findByKrnCreateUserId", query = "SELECT p FROM Planning p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Planning.findByKrnModifyDate", query = "SELECT p FROM Planning p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Planning.findByKrnModifyUserId", query = "SELECT p FROM Planning p WHERE p.krnModifyUserId = :krnModifyUserId")})
public class Planning implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PLANNING_ID")
    private Integer planningId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_SUBJ_ID")
    private int plSubjId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_CONS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCons;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HEURE")
    private int heure;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DUREE")
    private int duree;
    @Column(name = "PATIENTS_ID")
    private Integer patientsId;
    @Size(max = 100)
    @Column(name = "NOM")
    private String nom;
    @Size(max = 100)
    @Column(name = "PRENOM")
    private String prenom;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "MOTIF")
    private String motif;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "COMMENTAIRE")
    private String commentaire;
    @Column(name = "COLOR")
    private Integer color;
    @Column(name = "FONT")
    private Integer font;
    @Size(max = 64)
    @Column(name = "DUREE_TEXT")
    private String dureeText;
    @Column(name = "PATIENT_ARRIVEE")
    private Boolean patientArrivee;
    @Column(name = "PL_GENER_ID")
    private Integer plGenerId;
    @Column(name = "PL_EXAM_ID")
    private Integer plExamId;
    @Size(max = 100)
    @Column(name = "PATRONYME")
    private String patronyme;
    @Column(name = "MEDECINS_CREATOR_ID")
    private Integer medecinsCreatorId;
    @Column(name = "MODIFY_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDateTime;
    @Column(name = "FM_PATIENTSTYPE_ID")
    private Integer fmPatientstypeId;
    @Column(name = "CREATE_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;
    @Column(name = "MEDECINS_MODIFY_ID")
    private Integer medecinsModifyId;
    @Column(name = "COULEUR_MACRO")
    private Integer couleurMacro;
    @Column(name = "CALLS_ID")
    private Integer callsId;
    @Size(max = 16)
    @Column(name = "HL7_ACCESSION_NUMBER")
    private String hl7AccessionNumber;
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

    public Planning() {
    }

    public Planning(Integer planningId) {
        this.planningId = planningId;
    }

    public Planning(Integer planningId, int plSubjId, Date dateCons, int heure, int duree) {
        this.planningId = planningId;
        this.plSubjId = plSubjId;
        this.dateCons = dateCons;
        this.heure = heure;
        this.duree = duree;
    }

    public Integer getPlanningId() {
        return planningId;
    }

    public void setPlanningId(Integer planningId) {
        this.planningId = planningId;
    }

    public int getPlSubjId() {
        return plSubjId;
    }

    public void setPlSubjId(int plSubjId) {
        this.plSubjId = plSubjId;
    }

    public Date getDateCons() {
        return dateCons;
    }

    public void setDateCons(Date dateCons) {
        this.dateCons = dateCons;
    }

    public int getHeure() {
        return heure;
    }

    public void setHeure(int heure) {
        this.heure = heure;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public Integer getPatientsId() {
        return patientsId;
    }

    public void setPatientsId(Integer patientsId) {
        this.patientsId = patientsId;
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

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public Integer getFont() {
        return font;
    }

    public void setFont(Integer font) {
        this.font = font;
    }

    public String getDureeText() {
        return dureeText;
    }

    public void setDureeText(String dureeText) {
        this.dureeText = dureeText;
    }

    public Boolean getPatientArrivee() {
        return patientArrivee;
    }

    public void setPatientArrivee(Boolean patientArrivee) {
        this.patientArrivee = patientArrivee;
    }

    public Integer getPlGenerId() {
        return plGenerId;
    }

    public void setPlGenerId(Integer plGenerId) {
        this.plGenerId = plGenerId;
    }

    public Integer getPlExamId() {
        return plExamId;
    }

    public void setPlExamId(Integer plExamId) {
        this.plExamId = plExamId;
    }

    public String getPatronyme() {
        return patronyme;
    }

    public void setPatronyme(String patronyme) {
        this.patronyme = patronyme;
    }

    public Integer getMedecinsCreatorId() {
        return medecinsCreatorId;
    }

    public void setMedecinsCreatorId(Integer medecinsCreatorId) {
        this.medecinsCreatorId = medecinsCreatorId;
    }

    public Date getModifyDateTime() {
        return modifyDateTime;
    }

    public void setModifyDateTime(Date modifyDateTime) {
        this.modifyDateTime = modifyDateTime;
    }

    public Integer getFmPatientstypeId() {
        return fmPatientstypeId;
    }

    public void setFmPatientstypeId(Integer fmPatientstypeId) {
        this.fmPatientstypeId = fmPatientstypeId;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Integer getMedecinsModifyId() {
        return medecinsModifyId;
    }

    public void setMedecinsModifyId(Integer medecinsModifyId) {
        this.medecinsModifyId = medecinsModifyId;
    }

    public Integer getCouleurMacro() {
        return couleurMacro;
    }

    public void setCouleurMacro(Integer couleurMacro) {
        this.couleurMacro = couleurMacro;
    }

    public Integer getCallsId() {
        return callsId;
    }

    public void setCallsId(Integer callsId) {
        this.callsId = callsId;
    }

    public String getHl7AccessionNumber() {
        return hl7AccessionNumber;
    }

    public void setHl7AccessionNumber(String hl7AccessionNumber) {
        this.hl7AccessionNumber = hl7AccessionNumber;
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
        hash += (planningId != null ? planningId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Planning)) {
            return false;
        }
        Planning other = (Planning) object;
        if ((this.planningId == null && other.planningId != null) || (this.planningId != null && !this.planningId.equals(other.planningId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.Planning[ planningId=" + planningId + " ]";
    }
    
}
