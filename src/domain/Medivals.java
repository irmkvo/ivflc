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
@Table(name = "MEDIVALS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medivals.findAll", query = "SELECT m FROM Medivals m"),
    @NamedQuery(name = "Medivals.findByMedivalsID", query = "SELECT m FROM Medivals m WHERE m.medivalsID = :medivalsID"),
    @NamedQuery(name = "Medivals.findByColOrRow", query = "SELECT m FROM Medivals m WHERE m.colOrRow = :colOrRow"),
    @NamedQuery(name = "Medivals.findByKeyVal", query = "SELECT m FROM Medivals m WHERE m.keyVal = :keyVal"),
    @NamedQuery(name = "Medivals.findByNomVal", query = "SELECT m FROM Medivals m WHERE m.nomVal = :nomVal"),
    @NamedQuery(name = "Medivals.findByType", query = "SELECT m FROM Medivals m WHERE m.type = :type"),
    @NamedQuery(name = "Medivals.findByCalc", query = "SELECT m FROM Medivals m WHERE m.calc = :calc"),
    @NamedQuery(name = "Medivals.findByBreezeID", query = "SELECT m FROM Medivals m WHERE m.breezeID = :breezeID"),
    @NamedQuery(name = "Medivals.findByJaegerLabel", query = "SELECT m FROM Medivals m WHERE m.jaegerLabel = :jaegerLabel"),
    @NamedQuery(name = "Medivals.findByTableau", query = "SELECT m FROM Medivals m WHERE m.tableau = :tableau"),
    @NamedQuery(name = "Medivals.findByLigne", query = "SELECT m FROM Medivals m WHERE m.ligne = :ligne"),
    @NamedQuery(name = "Medivals.findByTableName", query = "SELECT m FROM Medivals m WHERE m.tableName = :tableName"),
    @NamedQuery(name = "Medivals.findByDinLabel", query = "SELECT m FROM Medivals m WHERE m.dinLabel = :dinLabel"),
    @NamedQuery(name = "Medivals.findByBreeze3Label", query = "SELECT m FROM Medivals m WHERE m.breeze3Label = :breeze3Label"),
    @NamedQuery(name = "Medivals.findByGDSLabel", query = "SELECT m FROM Medivals m WHERE m.gDSLabel = :gDSLabel"),
    @NamedQuery(name = "Medivals.findByBRSLabel", query = "SELECT m FROM Medivals m WHERE m.bRSLabel = :bRSLabel"),
    @NamedQuery(name = "Medivals.findByKrnCreateDate", query = "SELECT m FROM Medivals m WHERE m.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Medivals.findByKrnCreateUserId", query = "SELECT m FROM Medivals m WHERE m.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Medivals.findByKrnModifyDate", query = "SELECT m FROM Medivals m WHERE m.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Medivals.findByKrnModifyUserId", query = "SELECT m FROM Medivals m WHERE m.krnModifyUserId = :krnModifyUserId")})
public class Medivals implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Medivals_ID")
    private Integer medivalsID;
    @Column(name = "ColOrRow")
    private Integer colOrRow;
    @Column(name = "KeyVal")
    private Integer keyVal;
    @Size(max = 100)
    @Column(name = "NomVal")
    private String nomVal;
    @Column(name = "Type")
    private Integer type;
    @Size(max = 255)
    @Column(name = "Calc")
    private String calc;
    @Size(max = 20)
    @Column(name = "BreezeID")
    private String breezeID;
    @Size(max = 255)
    @Column(name = "JaegerLabel")
    private String jaegerLabel;
    @Column(name = "Tableau")
    private Integer tableau;
    @Column(name = "Ligne")
    private Integer ligne;
    @Size(max = 15)
    @Column(name = "TableName")
    private String tableName;
    @Size(max = 30)
    @Column(name = "DinLabel")
    private String dinLabel;
    @Size(max = 30)
    @Column(name = "Breeze3Label")
    private String breeze3Label;
    @Size(max = 30)
    @Column(name = "GDSLabel")
    private String gDSLabel;
    @Size(max = 30)
    @Column(name = "BRSLabel")
    private String bRSLabel;
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

    public Medivals() {
    }

    public Medivals(Integer medivalsID) {
        this.medivalsID = medivalsID;
    }

    public Integer getMedivalsID() {
        return medivalsID;
    }

    public void setMedivalsID(Integer medivalsID) {
        this.medivalsID = medivalsID;
    }

    public Integer getColOrRow() {
        return colOrRow;
    }

    public void setColOrRow(Integer colOrRow) {
        this.colOrRow = colOrRow;
    }

    public Integer getKeyVal() {
        return keyVal;
    }

    public void setKeyVal(Integer keyVal) {
        this.keyVal = keyVal;
    }

    public String getNomVal() {
        return nomVal;
    }

    public void setNomVal(String nomVal) {
        this.nomVal = nomVal;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCalc() {
        return calc;
    }

    public void setCalc(String calc) {
        this.calc = calc;
    }

    public String getBreezeID() {
        return breezeID;
    }

    public void setBreezeID(String breezeID) {
        this.breezeID = breezeID;
    }

    public String getJaegerLabel() {
        return jaegerLabel;
    }

    public void setJaegerLabel(String jaegerLabel) {
        this.jaegerLabel = jaegerLabel;
    }

    public Integer getTableau() {
        return tableau;
    }

    public void setTableau(Integer tableau) {
        this.tableau = tableau;
    }

    public Integer getLigne() {
        return ligne;
    }

    public void setLigne(Integer ligne) {
        this.ligne = ligne;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getDinLabel() {
        return dinLabel;
    }

    public void setDinLabel(String dinLabel) {
        this.dinLabel = dinLabel;
    }

    public String getBreeze3Label() {
        return breeze3Label;
    }

    public void setBreeze3Label(String breeze3Label) {
        this.breeze3Label = breeze3Label;
    }

    public String getGDSLabel() {
        return gDSLabel;
    }

    public void setGDSLabel(String gDSLabel) {
        this.gDSLabel = gDSLabel;
    }

    public String getBRSLabel() {
        return bRSLabel;
    }

    public void setBRSLabel(String bRSLabel) {
        this.bRSLabel = bRSLabel;
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
        hash += (medivalsID != null ? medivalsID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medivals)) {
            return false;
        }
        Medivals other = (Medivals) object;
        if ((this.medivalsID == null && other.medivalsID != null) || (this.medivalsID != null && !this.medivalsID.equals(other.medivalsID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Medivals[ medivalsID=" + medivalsID + " ]";
    }
    
}
