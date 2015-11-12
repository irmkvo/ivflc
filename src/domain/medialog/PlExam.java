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
@Table(name = "PL_EXAM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlExam.findAll", query = "SELECT p FROM PlExam p"),
    @NamedQuery(name = "PlExam.findByPlExamId", query = "SELECT p FROM PlExam p WHERE p.plExamId = :plExamId"),
    @NamedQuery(name = "PlExam.findByExamOrder", query = "SELECT p FROM PlExam p WHERE p.examOrder = :examOrder"),
    @NamedQuery(name = "PlExam.findByName", query = "SELECT p FROM PlExam p WHERE p.name = :name"),
    @NamedQuery(name = "PlExam.findByDuree", query = "SELECT p FROM PlExam p WHERE p.duree = :duree"),
    @NamedQuery(name = "PlExam.findByColor", query = "SELECT p FROM PlExam p WHERE p.color = :color"),
    @NamedQuery(name = "PlExam.findByFont", query = "SELECT p FROM PlExam p WHERE p.font = :font"),
    @NamedQuery(name = "PlExam.findByPrintLabel", query = "SELECT p FROM PlExam p WHERE p.printLabel = :printLabel"),
    @NamedQuery(name = "PlExam.findByShowWorkdays", query = "SELECT p FROM PlExam p WHERE p.showWorkdays = :showWorkdays"),
    @NamedQuery(name = "PlExam.findByShowPlace", query = "SELECT p FROM PlExam p WHERE p.showPlace = :showPlace"),
    @NamedQuery(name = "PlExam.findByTuneManual", query = "SELECT p FROM PlExam p WHERE p.tuneManual = :tuneManual"),
    @NamedQuery(name = "PlExam.findByTitleVertical", query = "SELECT p FROM PlExam p WHERE p.titleVertical = :titleVertical"),
    @NamedQuery(name = "PlExam.findByTitleMinwidth", query = "SELECT p FROM PlExam p WHERE p.titleMinwidth = :titleMinwidth"),
    @NamedQuery(name = "PlExam.findByTitleHeight", query = "SELECT p FROM PlExam p WHERE p.titleHeight = :titleHeight"),
    @NamedQuery(name = "PlExam.findByCode", query = "SELECT p FROM PlExam p WHERE p.code = :code"),
    @NamedQuery(name = "PlExam.findByModelsId", query = "SELECT p FROM PlExam p WHERE p.modelsId = :modelsId"),
    @NamedQuery(name = "PlExam.findByNeedConfirm", query = "SELECT p FROM PlExam p WHERE p.needConfirm = :needConfirm"),
    @NamedQuery(name = "PlExam.findByNeedMaterial", query = "SELECT p FROM PlExam p WHERE p.needMaterial = :needMaterial"),
    @NamedQuery(name = "PlExam.findByPlExGrId", query = "SELECT p FROM PlExam p WHERE p.plExGrId = :plExGrId"),
    @NamedQuery(name = "PlExam.findByTemplateId", query = "SELECT p FROM PlExam p WHERE p.templateId = :templateId"),
    @NamedQuery(name = "PlExam.findByPrintSep", query = "SELECT p FROM PlExam p WHERE p.printSep = :printSep"),
    @NamedQuery(name = "PlExam.findByBioIdExpr", query = "SELECT p FROM PlExam p WHERE p.bioIdExpr = :bioIdExpr"),
    @NamedQuery(name = "PlExam.findByCodeAk", query = "SELECT p FROM PlExam p WHERE p.codeAk = :codeAk"),
    @NamedQuery(name = "PlExam.findByConflictMode", query = "SELECT p FROM PlExam p WHERE p.conflictMode = :conflictMode"),
    @NamedQuery(name = "PlExam.findByExtSysId", query = "SELECT p FROM PlExam p WHERE p.extSysId = :extSysId"),
    @NamedQuery(name = "PlExam.findByCountersBcodeId", query = "SELECT p FROM PlExam p WHERE p.countersBcodeId = :countersBcodeId"),
    @NamedQuery(name = "PlExam.findByTemplateLabelId", query = "SELECT p FROM PlExam p WHERE p.templateLabelId = :templateLabelId"),
    @NamedQuery(name = "PlExam.findByNeedEdit", query = "SELECT p FROM PlExam p WHERE p.needEdit = :needEdit"),
    @NamedQuery(name = "PlExam.findByAutoBioCode", query = "SELECT p FROM PlExam p WHERE p.autoBioCode = :autoBioCode"),
    @NamedQuery(name = "PlExam.findByWarnActiveDirExists", query = "SELECT p FROM PlExam p WHERE p.warnActiveDirExists = :warnActiveDirExists"),
    @NamedQuery(name = "PlExam.findByWarnDirWithoutServ", query = "SELECT p FROM PlExam p WHERE p.warnDirWithoutServ = :warnDirWithoutServ"),
    @NamedQuery(name = "PlExam.findByWarnDirPatPayed", query = "SELECT p FROM PlExam p WHERE p.warnDirPatPayed = :warnDirPatPayed"),
    @NamedQuery(name = "PlExam.findByResultTablename", query = "SELECT p FROM PlExam p WHERE p.resultTablename = :resultTablename"),
    @NamedQuery(name = "PlExam.findByCommentFlags", query = "SELECT p FROM PlExam p WHERE p.commentFlags = :commentFlags"),
    @NamedQuery(name = "PlExam.findByAutoCreateBill", query = "SELECT p FROM PlExam p WHERE p.autoCreateBill = :autoCreateBill"),
    @NamedQuery(name = "PlExam.findByKrnCreateDate", query = "SELECT p FROM PlExam p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "PlExam.findByKrnCreateUserId", query = "SELECT p FROM PlExam p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "PlExam.findByKrnModifyDate", query = "SELECT p FROM PlExam p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "PlExam.findByKrnModifyUserId", query = "SELECT p FROM PlExam p WHERE p.krnModifyUserId = :krnModifyUserId"),
    @NamedQuery(name = "PlExam.findByDenyAddServ", query = "SELECT p FROM PlExam p WHERE p.denyAddServ = :denyAddServ"),
    @NamedQuery(name = "PlExam.findByActivePreiod", query = "SELECT p FROM PlExam p WHERE p.activePreiod = :activePreiod"),
    @NamedQuery(name = "PlExam.findBySomeDirections", query = "SELECT p FROM PlExam p WHERE p.someDirections = :someDirections"),
    @NamedQuery(name = "PlExam.findByAutoCreateDirBill", query = "SELECT p FROM PlExam p WHERE p.autoCreateDirBill = :autoCreateDirBill"),
    @NamedQuery(name = "PlExam.findByPlModalityId", query = "SELECT p FROM PlExam p WHERE p.plModalityId = :plModalityId")})
public class PlExam implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_EXAM_ID")
    private Integer plExamId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EXAM_ORDER")
    private int examOrder;
    @Size(max = 255)
    @Column(name = "NAME")
    private String name;
    @Size(max = 64)
    @Column(name = "DUREE")
    private String duree;
    @Column(name = "COLOR")
    private Integer color;
    @Column(name = "FONT")
    private Integer font;
    @Size(max = 100)
    @Column(name = "PRINT_LABEL")
    private String printLabel;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "PRINT_MEMO")
    private String printMemo;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "MEDSEL_IDS")
    private String medselIds;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "PARAMS")
    private String params;
    @Column(name = "SHOW_WORKDAYS")
    private Boolean showWorkdays;
    @Column(name = "SHOW_PLACE")
    private Boolean showPlace;
    @Column(name = "TUNE_MANUAL")
    private Boolean tuneManual;
    @Column(name = "TITLE_VERTICAL")
    private Boolean titleVertical;
    @Column(name = "TITLE_MINWIDTH")
    private Integer titleMinwidth;
    @Column(name = "TITLE_HEIGHT")
    private Integer titleHeight;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "CONTROL_EXPR")
    private String controlExpr;
    @Size(max = 32)
    @Column(name = "CODE")
    private String code;
    @Column(name = "MODELS_ID")
    private Integer modelsId;
    @Column(name = "NEED_CONFIRM")
    private Boolean needConfirm;
    @Column(name = "NEED_MATERIAL")
    private Boolean needMaterial;
    @Column(name = "PL_EX_GR_ID")
    private Integer plExGrId;
    @Column(name = "TEMPLATE_ID")
    private Integer templateId;
    @Column(name = "PRINT_SEP")
    private Boolean printSep;
    @Size(max = 255)
    @Column(name = "BIO_ID_EXPR")
    private String bioIdExpr;
    @Size(max = 100)
    @Column(name = "CODE_AK")
    private String codeAk;
    @Column(name = "CONFLICT_MODE")
    private Integer conflictMode;
    @Column(name = "EXT_SYS_ID")
    private Integer extSysId;
    @Column(name = "COUNTERS_BCODE_ID")
    private Integer countersBcodeId;
    @Column(name = "TEMPLATE_LABEL_ID")
    private Integer templateLabelId;
    @Column(name = "NEED_EDIT")
    private Boolean needEdit;
    @Column(name = "AUTO_BIO_CODE")
    private Boolean autoBioCode;
    @Column(name = "WARN_ACTIVE_DIR_EXISTS")
    private Boolean warnActiveDirExists;
    @Column(name = "WARN_DIR_WITHOUT_SERV")
    private Boolean warnDirWithoutServ;
    @Column(name = "WARN_DIR_PAT_PAYED")
    private Boolean warnDirPatPayed;
    @Size(max = 80)
    @Column(name = "RESULT_TABLENAME")
    private String resultTablename;
    @Size(max = 10)
    @Column(name = "COMMENT_FLAGS")
    private String commentFlags;
    @Column(name = "AUTO_CREATE_BILL")
    private Boolean autoCreateBill;
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
    @Column(name = "DENY_ADD_SERV")
    private Boolean denyAddServ;
    @Column(name = "ACTIVE_PREIOD")
    private Integer activePreiod;
    @Column(name = "SOME_DIRECTIONS")
    private Boolean someDirections;
    @Column(name = "AUTO_CREATE_DIR_BILL")
    private Boolean autoCreateDirBill;
    @Column(name = "PL_MODALITY_ID")
    private Integer plModalityId;

    public PlExam() {
    }

    public PlExam(Integer plExamId) {
        this.plExamId = plExamId;
    }

    public PlExam(Integer plExamId, int examOrder) {
        this.plExamId = plExamId;
        this.examOrder = examOrder;
    }

    public Integer getPlExamId() {
        return plExamId;
    }

    public void setPlExamId(Integer plExamId) {
        this.plExamId = plExamId;
    }

    public int getExamOrder() {
        return examOrder;
    }

    public void setExamOrder(int examOrder) {
        this.examOrder = examOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
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

    public String getPrintLabel() {
        return printLabel;
    }

    public void setPrintLabel(String printLabel) {
        this.printLabel = printLabel;
    }

    public String getPrintMemo() {
        return printMemo;
    }

    public void setPrintMemo(String printMemo) {
        this.printMemo = printMemo;
    }

    public String getMedselIds() {
        return medselIds;
    }

    public void setMedselIds(String medselIds) {
        this.medselIds = medselIds;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public Boolean getShowWorkdays() {
        return showWorkdays;
    }

    public void setShowWorkdays(Boolean showWorkdays) {
        this.showWorkdays = showWorkdays;
    }

    public Boolean getShowPlace() {
        return showPlace;
    }

    public void setShowPlace(Boolean showPlace) {
        this.showPlace = showPlace;
    }

    public Boolean getTuneManual() {
        return tuneManual;
    }

    public void setTuneManual(Boolean tuneManual) {
        this.tuneManual = tuneManual;
    }

    public Boolean getTitleVertical() {
        return titleVertical;
    }

    public void setTitleVertical(Boolean titleVertical) {
        this.titleVertical = titleVertical;
    }

    public Integer getTitleMinwidth() {
        return titleMinwidth;
    }

    public void setTitleMinwidth(Integer titleMinwidth) {
        this.titleMinwidth = titleMinwidth;
    }

    public Integer getTitleHeight() {
        return titleHeight;
    }

    public void setTitleHeight(Integer titleHeight) {
        this.titleHeight = titleHeight;
    }

    public String getControlExpr() {
        return controlExpr;
    }

    public void setControlExpr(String controlExpr) {
        this.controlExpr = controlExpr;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getModelsId() {
        return modelsId;
    }

    public void setModelsId(Integer modelsId) {
        this.modelsId = modelsId;
    }

    public Boolean getNeedConfirm() {
        return needConfirm;
    }

    public void setNeedConfirm(Boolean needConfirm) {
        this.needConfirm = needConfirm;
    }

    public Boolean getNeedMaterial() {
        return needMaterial;
    }

    public void setNeedMaterial(Boolean needMaterial) {
        this.needMaterial = needMaterial;
    }

    public Integer getPlExGrId() {
        return plExGrId;
    }

    public void setPlExGrId(Integer plExGrId) {
        this.plExGrId = plExGrId;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Boolean getPrintSep() {
        return printSep;
    }

    public void setPrintSep(Boolean printSep) {
        this.printSep = printSep;
    }

    public String getBioIdExpr() {
        return bioIdExpr;
    }

    public void setBioIdExpr(String bioIdExpr) {
        this.bioIdExpr = bioIdExpr;
    }

    public String getCodeAk() {
        return codeAk;
    }

    public void setCodeAk(String codeAk) {
        this.codeAk = codeAk;
    }

    public Integer getConflictMode() {
        return conflictMode;
    }

    public void setConflictMode(Integer conflictMode) {
        this.conflictMode = conflictMode;
    }

    public Integer getExtSysId() {
        return extSysId;
    }

    public void setExtSysId(Integer extSysId) {
        this.extSysId = extSysId;
    }

    public Integer getCountersBcodeId() {
        return countersBcodeId;
    }

    public void setCountersBcodeId(Integer countersBcodeId) {
        this.countersBcodeId = countersBcodeId;
    }

    public Integer getTemplateLabelId() {
        return templateLabelId;
    }

    public void setTemplateLabelId(Integer templateLabelId) {
        this.templateLabelId = templateLabelId;
    }

    public Boolean getNeedEdit() {
        return needEdit;
    }

    public void setNeedEdit(Boolean needEdit) {
        this.needEdit = needEdit;
    }

    public Boolean getAutoBioCode() {
        return autoBioCode;
    }

    public void setAutoBioCode(Boolean autoBioCode) {
        this.autoBioCode = autoBioCode;
    }

    public Boolean getWarnActiveDirExists() {
        return warnActiveDirExists;
    }

    public void setWarnActiveDirExists(Boolean warnActiveDirExists) {
        this.warnActiveDirExists = warnActiveDirExists;
    }

    public Boolean getWarnDirWithoutServ() {
        return warnDirWithoutServ;
    }

    public void setWarnDirWithoutServ(Boolean warnDirWithoutServ) {
        this.warnDirWithoutServ = warnDirWithoutServ;
    }

    public Boolean getWarnDirPatPayed() {
        return warnDirPatPayed;
    }

    public void setWarnDirPatPayed(Boolean warnDirPatPayed) {
        this.warnDirPatPayed = warnDirPatPayed;
    }

    public String getResultTablename() {
        return resultTablename;
    }

    public void setResultTablename(String resultTablename) {
        this.resultTablename = resultTablename;
    }

    public String getCommentFlags() {
        return commentFlags;
    }

    public void setCommentFlags(String commentFlags) {
        this.commentFlags = commentFlags;
    }

    public Boolean getAutoCreateBill() {
        return autoCreateBill;
    }

    public void setAutoCreateBill(Boolean autoCreateBill) {
        this.autoCreateBill = autoCreateBill;
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

    public Boolean getDenyAddServ() {
        return denyAddServ;
    }

    public void setDenyAddServ(Boolean denyAddServ) {
        this.denyAddServ = denyAddServ;
    }

    public Integer getActivePreiod() {
        return activePreiod;
    }

    public void setActivePreiod(Integer activePreiod) {
        this.activePreiod = activePreiod;
    }

    public Boolean getSomeDirections() {
        return someDirections;
    }

    public void setSomeDirections(Boolean someDirections) {
        this.someDirections = someDirections;
    }

    public Boolean getAutoCreateDirBill() {
        return autoCreateDirBill;
    }

    public void setAutoCreateDirBill(Boolean autoCreateDirBill) {
        this.autoCreateDirBill = autoCreateDirBill;
    }

    public Integer getPlModalityId() {
        return plModalityId;
    }

    public void setPlModalityId(Integer plModalityId) {
        this.plModalityId = plModalityId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (plExamId != null ? plExamId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlExam)) {
            return false;
        }
        PlExam other = (PlExam) object;
        if ((this.plExamId == null && other.plExamId != null) || (this.plExamId != null && !this.plExamId.equals(other.plExamId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.PlExam[ plExamId=" + plExamId + " ]";
    }
    
}
