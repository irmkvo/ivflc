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
@Table(name = "PL_CONFL_REPORT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlConflReport.findAll", query = "SELECT p FROM PlConflReport p"),
    @NamedQuery(name = "PlConflReport.findByPlConflReportId", query = "SELECT p FROM PlConflReport p WHERE p.plConflReportId = :plConflReportId"),
    @NamedQuery(name = "PlConflReport.findByPlSubjId", query = "SELECT p FROM PlConflReport p WHERE p.plSubjId = :plSubjId"),
    @NamedQuery(name = "PlConflReport.findByGridPlanningId", query = "SELECT p FROM PlConflReport p WHERE p.gridPlanningId = :gridPlanningId"),
    @NamedQuery(name = "PlConflReport.findByMedecinsId", query = "SELECT p FROM PlConflReport p WHERE p.medecinsId = :medecinsId"),
    @NamedQuery(name = "PlConflReport.findByPatientsId", query = "SELECT p FROM PlConflReport p WHERE p.patientsId = :patientsId"),
    @NamedQuery(name = "PlConflReport.findByGridDateTime", query = "SELECT p FROM PlConflReport p WHERE p.gridDateTime = :gridDateTime"),
    @NamedQuery(name = "PlConflReport.findByDeclinePat", query = "SELECT p FROM PlConflReport p WHERE p.declinePat = :declinePat"),
    @NamedQuery(name = "PlConflReport.findByDeclineMed", query = "SELECT p FROM PlConflReport p WHERE p.declineMed = :declineMed"),
    @NamedQuery(name = "PlConflReport.findByMedName", query = "SELECT p FROM PlConflReport p WHERE p.medName = :medName"),
    @NamedQuery(name = "PlConflReport.findByNom", query = "SELECT p FROM PlConflReport p WHERE p.nom = :nom"),
    @NamedQuery(name = "PlConflReport.findByPrenom", query = "SELECT p FROM PlConflReport p WHERE p.prenom = :prenom"),
    @NamedQuery(name = "PlConflReport.findByPatronyme", query = "SELECT p FROM PlConflReport p WHERE p.patronyme = :patronyme"),
    @NamedQuery(name = "PlConflReport.findByMotif", query = "SELECT p FROM PlConflReport p WHERE p.motif = :motif"),
    @NamedQuery(name = "PlConflReport.findByExamName", query = "SELECT p FROM PlConflReport p WHERE p.examName = :examName"),
    @NamedQuery(name = "PlConflReport.findByKrnCreateDate", query = "SELECT p FROM PlConflReport p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "PlConflReport.findByKrnCreateUserId", query = "SELECT p FROM PlConflReport p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "PlConflReport.findByKrnModifyDate", query = "SELECT p FROM PlConflReport p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "PlConflReport.findByKrnModifyUserId", query = "SELECT p FROM PlConflReport p WHERE p.krnModifyUserId = :krnModifyUserId")})
public class PlConflReport implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_CONFL_REPORT_ID")
    private Integer plConflReportId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_SUBJ_ID")
    private int plSubjId;
    @Column(name = "GRID_PLANNING_ID")
    private Integer gridPlanningId;
    @Column(name = "MEDECINS_ID")
    private Integer medecinsId;
    @Column(name = "PATIENTS_ID")
    private Integer patientsId;
    @Column(name = "GRID_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gridDateTime;
    @Size(max = 255)
    @Column(name = "DECLINE_PAT")
    private String declinePat;
    @Size(max = 255)
    @Column(name = "DECLINE_MED")
    private String declineMed;
    @Size(max = 100)
    @Column(name = "MED_NAME")
    private String medName;
    @Size(max = 100)
    @Column(name = "NOM")
    private String nom;
    @Size(max = 100)
    @Column(name = "PRENOM")
    private String prenom;
    @Size(max = 100)
    @Column(name = "PATRONYME")
    private String patronyme;
    @Size(max = 100)
    @Column(name = "MOTIF")
    private String motif;
    @Size(max = 100)
    @Column(name = "EXAM_NAME")
    private String examName;
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

    public PlConflReport() {
    }

    public PlConflReport(Integer plConflReportId) {
        this.plConflReportId = plConflReportId;
    }

    public PlConflReport(Integer plConflReportId, int plSubjId) {
        this.plConflReportId = plConflReportId;
        this.plSubjId = plSubjId;
    }

    public Integer getPlConflReportId() {
        return plConflReportId;
    }

    public void setPlConflReportId(Integer plConflReportId) {
        this.plConflReportId = plConflReportId;
    }

    public int getPlSubjId() {
        return plSubjId;
    }

    public void setPlSubjId(int plSubjId) {
        this.plSubjId = plSubjId;
    }

    public Integer getGridPlanningId() {
        return gridPlanningId;
    }

    public void setGridPlanningId(Integer gridPlanningId) {
        this.gridPlanningId = gridPlanningId;
    }

    public Integer getMedecinsId() {
        return medecinsId;
    }

    public void setMedecinsId(Integer medecinsId) {
        this.medecinsId = medecinsId;
    }

    public Integer getPatientsId() {
        return patientsId;
    }

    public void setPatientsId(Integer patientsId) {
        this.patientsId = patientsId;
    }

    public Date getGridDateTime() {
        return gridDateTime;
    }

    public void setGridDateTime(Date gridDateTime) {
        this.gridDateTime = gridDateTime;
    }

    public String getDeclinePat() {
        return declinePat;
    }

    public void setDeclinePat(String declinePat) {
        this.declinePat = declinePat;
    }

    public String getDeclineMed() {
        return declineMed;
    }

    public void setDeclineMed(String declineMed) {
        this.declineMed = declineMed;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
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

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
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
        hash += (plConflReportId != null ? plConflReportId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlConflReport)) {
            return false;
        }
        PlConflReport other = (PlConflReport) object;
        if ((this.plConflReportId == null && other.plConflReportId != null) || (this.plConflReportId != null && !this.plConflReportId.equals(other.plConflReportId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.PlConflReport[ plConflReportId=" + plConflReportId + " ]";
    }
    
}
