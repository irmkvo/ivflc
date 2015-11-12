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
@Table(name = "PL_GRID_REPORT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlGridReport.findAll", query = "SELECT p FROM PlGridReport p"),
    @NamedQuery(name = "PlGridReport.findByPlGridReportId", query = "SELECT p FROM PlGridReport p WHERE p.plGridReportId = :plGridReportId"),
    @NamedQuery(name = "PlGridReport.findByPlSubjId", query = "SELECT p FROM PlGridReport p WHERE p.plSubjId = :plSubjId"),
    @NamedQuery(name = "PlGridReport.findByMedecinsId", query = "SELECT p FROM PlGridReport p WHERE p.medecinsId = :medecinsId"),
    @NamedQuery(name = "PlGridReport.findByGridDateTime", query = "SELECT p FROM PlGridReport p WHERE p.gridDateTime = :gridDateTime"),
    @NamedQuery(name = "PlGridReport.findByGridText", query = "SELECT p FROM PlGridReport p WHERE p.gridText = :gridText"),
    @NamedQuery(name = "PlGridReport.findByGridPlanningId", query = "SELECT p FROM PlGridReport p WHERE p.gridPlanningId = :gridPlanningId"),
    @NamedQuery(name = "PlGridReport.findByGridDureeText", query = "SELECT p FROM PlGridReport p WHERE p.gridDureeText = :gridDureeText"),
    @NamedQuery(name = "PlGridReport.findByGridHeureText", query = "SELECT p FROM PlGridReport p WHERE p.gridHeureText = :gridHeureText"),
    @NamedQuery(name = "PlGridReport.findByCellColor", query = "SELECT p FROM PlGridReport p WHERE p.cellColor = :cellColor"),
    @NamedQuery(name = "PlGridReport.findByFontColor", query = "SELECT p FROM PlGridReport p WHERE p.fontColor = :fontColor"),
    @NamedQuery(name = "PlGridReport.findByPlSubjIdOrPatient", query = "SELECT p FROM PlGridReport p WHERE p.plSubjIdOrPatient = :plSubjIdOrPatient"),
    @NamedQuery(name = "PlGridReport.findByKrnCreateDate", query = "SELECT p FROM PlGridReport p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "PlGridReport.findByKrnCreateUserId", query = "SELECT p FROM PlGridReport p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "PlGridReport.findByKrnModifyDate", query = "SELECT p FROM PlGridReport p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "PlGridReport.findByKrnModifyUserId", query = "SELECT p FROM PlGridReport p WHERE p.krnModifyUserId = :krnModifyUserId")})
public class PlGridReport implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_GRID_REPORT_ID")
    private Integer plGridReportId;
    @Column(name = "PL_SUBJ_ID")
    private Integer plSubjId;
    @Column(name = "MEDECINS_ID")
    private Integer medecinsId;
    @Column(name = "GRID_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gridDateTime;
    @Size(max = 255)
    @Column(name = "GRID_TEXT")
    private String gridText;
    @Column(name = "GRID_PLANNING_ID")
    private Integer gridPlanningId;
    @Size(max = 32)
    @Column(name = "GRID_DUREE_TEXT")
    private String gridDureeText;
    @Size(max = 32)
    @Column(name = "GRID_HEURE_TEXT")
    private String gridHeureText;
    @Column(name = "CELL_COLOR")
    private Integer cellColor;
    @Column(name = "FONT_COLOR")
    private Integer fontColor;
    @Column(name = "PL_SUBJ_ID_OR_PATIENT")
    private Integer plSubjIdOrPatient;
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

    public PlGridReport() {
    }

    public PlGridReport(Integer plGridReportId) {
        this.plGridReportId = plGridReportId;
    }

    public Integer getPlGridReportId() {
        return plGridReportId;
    }

    public void setPlGridReportId(Integer plGridReportId) {
        this.plGridReportId = plGridReportId;
    }

    public Integer getPlSubjId() {
        return plSubjId;
    }

    public void setPlSubjId(Integer plSubjId) {
        this.plSubjId = plSubjId;
    }

    public Integer getMedecinsId() {
        return medecinsId;
    }

    public void setMedecinsId(Integer medecinsId) {
        this.medecinsId = medecinsId;
    }

    public Date getGridDateTime() {
        return gridDateTime;
    }

    public void setGridDateTime(Date gridDateTime) {
        this.gridDateTime = gridDateTime;
    }

    public String getGridText() {
        return gridText;
    }

    public void setGridText(String gridText) {
        this.gridText = gridText;
    }

    public Integer getGridPlanningId() {
        return gridPlanningId;
    }

    public void setGridPlanningId(Integer gridPlanningId) {
        this.gridPlanningId = gridPlanningId;
    }

    public String getGridDureeText() {
        return gridDureeText;
    }

    public void setGridDureeText(String gridDureeText) {
        this.gridDureeText = gridDureeText;
    }

    public String getGridHeureText() {
        return gridHeureText;
    }

    public void setGridHeureText(String gridHeureText) {
        this.gridHeureText = gridHeureText;
    }

    public Integer getCellColor() {
        return cellColor;
    }

    public void setCellColor(Integer cellColor) {
        this.cellColor = cellColor;
    }

    public Integer getFontColor() {
        return fontColor;
    }

    public void setFontColor(Integer fontColor) {
        this.fontColor = fontColor;
    }

    public Integer getPlSubjIdOrPatient() {
        return plSubjIdOrPatient;
    }

    public void setPlSubjIdOrPatient(Integer plSubjIdOrPatient) {
        this.plSubjIdOrPatient = plSubjIdOrPatient;
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
        hash += (plGridReportId != null ? plGridReportId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlGridReport)) {
            return false;
        }
        PlGridReport other = (PlGridReport) object;
        if ((this.plGridReportId == null && other.plGridReportId != null) || (this.plGridReportId != null && !this.plGridReportId.equals(other.plGridReportId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.PlGridReport[ plGridReportId=" + plGridReportId + " ]";
    }
    
}
