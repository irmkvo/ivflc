/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

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
 * @author Shah
 */
@Entity
@Table(name = "MODELS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Models.findAll", query = "SELECT m FROM Models m"),
    @NamedQuery(name = "Models.findByModelsID", query = "SELECT m FROM Models m WHERE m.modelsID = :modelsID"),
    @NamedQuery(name = "Models.findByModeleName", query = "SELECT m FROM Models m WHERE m.modeleName = :modeleName"),
    @NamedQuery(name = "Models.findByDMGlossaire", query = "SELECT m FROM Models m WHERE m.dMGlossaire = :dMGlossaire"),
    @NamedQuery(name = "Models.findByDMBoutons", query = "SELECT m FROM Models m WHERE m.dMBoutons = :dMBoutons"),
    @NamedQuery(name = "Models.findByFPGlossaire", query = "SELECT m FROM Models m WHERE m.fPGlossaire = :fPGlossaire"),
    @NamedQuery(name = "Models.findByFPBoutons", query = "SELECT m FROM Models m WHERE m.fPBoutons = :fPBoutons"),
    @NamedQuery(name = "Models.findByANTGlossaire", query = "SELECT m FROM Models m WHERE m.aNTGlossaire = :aNTGlossaire"),
    @NamedQuery(name = "Models.findByANTBoutons", query = "SELECT m FROM Models m WHERE m.aNTBoutons = :aNTBoutons"),
    @NamedQuery(name = "Models.findByDPFichePatient", query = "SELECT m FROM Models m WHERE m.dPFichePatient = :dPFichePatient"),
    @NamedQuery(name = "Models.findByDPAntecedents", query = "SELECT m FROM Models m WHERE m.dPAntecedents = :dPAntecedents"),
    @NamedQuery(name = "Models.findByDPConsultation", query = "SELECT m FROM Models m WHERE m.dPConsultation = :dPConsultation"),
    @NamedQuery(name = "Models.findByDPResumeCons", query = "SELECT m FROM Models m WHERE m.dPResumeCons = :dPResumeCons"),
    @NamedQuery(name = "Models.findByDPGlossaire", query = "SELECT m FROM Models m WHERE m.dPGlossaire = :dPGlossaire"),
    @NamedQuery(name = "Models.findByMinButtonWidth", query = "SELECT m FROM Models m WHERE m.minButtonWidth = :minButtonWidth"),
    @NamedQuery(name = "Models.findByFPTitle", query = "SELECT m FROM Models m WHERE m.fPTitle = :fPTitle"),
    @NamedQuery(name = "Models.findByANTTitle", query = "SELECT m FROM Models m WHERE m.aNTTitle = :aNTTitle"),
    @NamedQuery(name = "Models.findByDefGlossFont", query = "SELECT m FROM Models m WHERE m.defGlossFont = :defGlossFont"),
    @NamedQuery(name = "Models.findByGLAutoInsert", query = "SELECT m FROM Models m WHERE m.gLAutoInsert = :gLAutoInsert"),
    @NamedQuery(name = "Models.findByDPBoutons", query = "SELECT m FROM Models m WHERE m.dPBoutons = :dPBoutons"),
    @NamedQuery(name = "Models.findByExamensID", query = "SELECT m FROM Models m WHERE m.examensID = :examensID"),
    @NamedQuery(name = "Models.findByANTHideEmptyForms", query = "SELECT m FROM Models m WHERE m.aNTHideEmptyForms = :aNTHideEmptyForms"),
    @NamedQuery(name = "Models.findByFixedProfileExamens", query = "SELECT m FROM Models m WHERE m.fixedProfileExamens = :fixedProfileExamens"),
    @NamedQuery(name = "Models.findByCheckDublicateNewRecord", query = "SELECT m FROM Models m WHERE m.checkDublicateNewRecord = :checkDublicateNewRecord"),
    @NamedQuery(name = "Models.findByHideExamenForms", query = "SELECT m FROM Models m WHERE m.hideExamenForms = :hideExamenForms"),
    @NamedQuery(name = "Models.findByKrnCreateDate", query = "SELECT m FROM Models m WHERE m.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Models.findByKrnCreateUserId", query = "SELECT m FROM Models m WHERE m.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Models.findByKrnModifyDate", query = "SELECT m FROM Models m WHERE m.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Models.findByKrnModifyUserId", query = "SELECT m FROM Models m WHERE m.krnModifyUserId = :krnModifyUserId"),
    @NamedQuery(name = "Models.findByNeedApproving", query = "SELECT m FROM Models m WHERE m.needApproving = :needApproving")})
public class Models implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Models_ID")
    private Integer modelsID;
    @Size(max = 50)
    @Column(name = "ModeleName")
    private String modeleName;
    @Column(name = "DM_Glossaire")
    private Boolean dMGlossaire;
    @Column(name = "DM_Boutons")
    private Boolean dMBoutons;
    @Column(name = "FP_Glossaire")
    private Boolean fPGlossaire;
    @Column(name = "FP_Boutons")
    private Boolean fPBoutons;
    @Column(name = "ANT_Glossaire")
    private Boolean aNTGlossaire;
    @Column(name = "ANT_Boutons")
    private Boolean aNTBoutons;
    @Column(name = "DP_FichePatient")
    private Boolean dPFichePatient;
    @Column(name = "DP_Antecedents")
    private Boolean dPAntecedents;
    @Column(name = "DP_Consultation")
    private Boolean dPConsultation;
    @Column(name = "DP_ResumeCons")
    private Boolean dPResumeCons;
    @Column(name = "DP_Glossaire")
    private Boolean dPGlossaire;
    @Column(name = "MinButtonWidth")
    private Integer minButtonWidth;
    @Size(max = 100)
    @Column(name = "FPTitle")
    private String fPTitle;
    @Size(max = 100)
    @Column(name = "ANTTitle")
    private String aNTTitle;
    @Size(max = 100)
    @Column(name = "DefGlossFont")
    private String defGlossFont;
    @Column(name = "GL_AutoInsert")
    private Boolean gLAutoInsert;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "SERV_EXPR")
    private String servExpr;
    @Column(name = "DP_Boutons")
    private Boolean dPBoutons;
    @Column(name = "Examens_ID")
    private Integer examensID;
    @Column(name = "ANT_HideEmptyForms")
    private Boolean aNTHideEmptyForms;
    @Column(name = "FixedProfileExamens")
    private Boolean fixedProfileExamens;
    @Column(name = "CheckDublicateNewRecord")
    private Boolean checkDublicateNewRecord;
    @Column(name = "HideExamenForms")
    private Boolean hideExamenForms;
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
    @Column(name = "NEED_APPROVING")
    private Boolean needApproving;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "CONTROL_APPROVING")
    private String controlApproving;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "DIAG_APPROVING")
    private String diagApproving;

    public Models() {
    }

    public Models(Integer modelsID) {
        this.modelsID = modelsID;
    }

    public Integer getModelsID() {
        return modelsID;
    }

    public void setModelsID(Integer modelsID) {
        this.modelsID = modelsID;
    }

    public String getModeleName() {
        return modeleName;
    }

    public void setModeleName(String modeleName) {
        this.modeleName = modeleName;
    }

    public Boolean getDMGlossaire() {
        return dMGlossaire;
    }

    public void setDMGlossaire(Boolean dMGlossaire) {
        this.dMGlossaire = dMGlossaire;
    }

    public Boolean getDMBoutons() {
        return dMBoutons;
    }

    public void setDMBoutons(Boolean dMBoutons) {
        this.dMBoutons = dMBoutons;
    }

    public Boolean getFPGlossaire() {
        return fPGlossaire;
    }

    public void setFPGlossaire(Boolean fPGlossaire) {
        this.fPGlossaire = fPGlossaire;
    }

    public Boolean getFPBoutons() {
        return fPBoutons;
    }

    public void setFPBoutons(Boolean fPBoutons) {
        this.fPBoutons = fPBoutons;
    }

    public Boolean getANTGlossaire() {
        return aNTGlossaire;
    }

    public void setANTGlossaire(Boolean aNTGlossaire) {
        this.aNTGlossaire = aNTGlossaire;
    }

    public Boolean getANTBoutons() {
        return aNTBoutons;
    }

    public void setANTBoutons(Boolean aNTBoutons) {
        this.aNTBoutons = aNTBoutons;
    }

    public Boolean getDPFichePatient() {
        return dPFichePatient;
    }

    public void setDPFichePatient(Boolean dPFichePatient) {
        this.dPFichePatient = dPFichePatient;
    }

    public Boolean getDPAntecedents() {
        return dPAntecedents;
    }

    public void setDPAntecedents(Boolean dPAntecedents) {
        this.dPAntecedents = dPAntecedents;
    }

    public Boolean getDPConsultation() {
        return dPConsultation;
    }

    public void setDPConsultation(Boolean dPConsultation) {
        this.dPConsultation = dPConsultation;
    }

    public Boolean getDPResumeCons() {
        return dPResumeCons;
    }

    public void setDPResumeCons(Boolean dPResumeCons) {
        this.dPResumeCons = dPResumeCons;
    }

    public Boolean getDPGlossaire() {
        return dPGlossaire;
    }

    public void setDPGlossaire(Boolean dPGlossaire) {
        this.dPGlossaire = dPGlossaire;
    }

    public Integer getMinButtonWidth() {
        return minButtonWidth;
    }

    public void setMinButtonWidth(Integer minButtonWidth) {
        this.minButtonWidth = minButtonWidth;
    }

    public String getFPTitle() {
        return fPTitle;
    }

    public void setFPTitle(String fPTitle) {
        this.fPTitle = fPTitle;
    }

    public String getANTTitle() {
        return aNTTitle;
    }

    public void setANTTitle(String aNTTitle) {
        this.aNTTitle = aNTTitle;
    }

    public String getDefGlossFont() {
        return defGlossFont;
    }

    public void setDefGlossFont(String defGlossFont) {
        this.defGlossFont = defGlossFont;
    }

    public Boolean getGLAutoInsert() {
        return gLAutoInsert;
    }

    public void setGLAutoInsert(Boolean gLAutoInsert) {
        this.gLAutoInsert = gLAutoInsert;
    }

    public String getServExpr() {
        return servExpr;
    }

    public void setServExpr(String servExpr) {
        this.servExpr = servExpr;
    }

    public Boolean getDPBoutons() {
        return dPBoutons;
    }

    public void setDPBoutons(Boolean dPBoutons) {
        this.dPBoutons = dPBoutons;
    }

    public Integer getExamensID() {
        return examensID;
    }

    public void setExamensID(Integer examensID) {
        this.examensID = examensID;
    }

    public Boolean getANTHideEmptyForms() {
        return aNTHideEmptyForms;
    }

    public void setANTHideEmptyForms(Boolean aNTHideEmptyForms) {
        this.aNTHideEmptyForms = aNTHideEmptyForms;
    }

    public Boolean getFixedProfileExamens() {
        return fixedProfileExamens;
    }

    public void setFixedProfileExamens(Boolean fixedProfileExamens) {
        this.fixedProfileExamens = fixedProfileExamens;
    }

    public Boolean getCheckDublicateNewRecord() {
        return checkDublicateNewRecord;
    }

    public void setCheckDublicateNewRecord(Boolean checkDublicateNewRecord) {
        this.checkDublicateNewRecord = checkDublicateNewRecord;
    }

    public Boolean getHideExamenForms() {
        return hideExamenForms;
    }

    public void setHideExamenForms(Boolean hideExamenForms) {
        this.hideExamenForms = hideExamenForms;
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

    public Boolean getNeedApproving() {
        return needApproving;
    }

    public void setNeedApproving(Boolean needApproving) {
        this.needApproving = needApproving;
    }

    public String getControlApproving() {
        return controlApproving;
    }

    public void setControlApproving(String controlApproving) {
        this.controlApproving = controlApproving;
    }

    public String getDiagApproving() {
        return diagApproving;
    }

    public void setDiagApproving(String diagApproving) {
        this.diagApproving = diagApproving;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modelsID != null ? modelsID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Models)) {
            return false;
        }
        Models other = (Models) object;
        if ((this.modelsID == null && other.modelsID != null) || (this.modelsID != null && !this.modelsID.equals(other.modelsID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Models[ modelsID=" + modelsID + " ]";
    }
    
}
