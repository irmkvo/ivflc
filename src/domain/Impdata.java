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
@Table(name = "IMPDATA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Impdata.findAll", query = "SELECT i FROM Impdata i"),
    @NamedQuery(name = "Impdata.findByImpdataID", query = "SELECT i FROM Impdata i WHERE i.impdataID = :impdataID"),
    @NamedQuery(name = "Impdata.findByImpDeleted", query = "SELECT i FROM Impdata i WHERE i.impDeleted = :impDeleted"),
    @NamedQuery(name = "Impdata.findByImpType", query = "SELECT i FROM Impdata i WHERE i.impType = :impType"),
    @NamedQuery(name = "Impdata.findByEmfTypeId", query = "SELECT i FROM Impdata i WHERE i.emfTypeId = :emfTypeId"),
    @NamedQuery(name = "Impdata.findByNom", query = "SELECT i FROM Impdata i WHERE i.nom = :nom"),
    @NamedQuery(name = "Impdata.findByPrenom", query = "SELECT i FROM Impdata i WHERE i.prenom = :prenom"),
    @NamedQuery(name = "Impdata.findByDateConsultation", query = "SELECT i FROM Impdata i WHERE i.dateConsultation = :dateConsultation"),
    @NamedQuery(name = "Impdata.findByDateNaissance", query = "SELECT i FROM Impdata i WHERE i.dateNaissance = :dateNaissance"),
    @NamedQuery(name = "Impdata.findByMesure", query = "SELECT i FROM Impdata i WHERE i.mesure = :mesure"),
    @NamedQuery(name = "Impdata.findByPatientImported", query = "SELECT i FROM Impdata i WHERE i.patientImported = :patientImported"),
    @NamedQuery(name = "Impdata.findByKeycode", query = "SELECT i FROM Impdata i WHERE i.keycode = :keycode"),
    @NamedQuery(name = "Impdata.findByQcInfo", query = "SELECT i FROM Impdata i WHERE i.qcInfo = :qcInfo"),
    @NamedQuery(name = "Impdata.findByLmQcTestId", query = "SELECT i FROM Impdata i WHERE i.lmQcTestId = :lmQcTestId"),
    @NamedQuery(name = "Impdata.findByPatientsId", query = "SELECT i FROM Impdata i WHERE i.patientsId = :patientsId"),
    @NamedQuery(name = "Impdata.findByState", query = "SELECT i FROM Impdata i WHERE i.state = :state"),
    @NamedQuery(name = "Impdata.findByKrnCreateDate", query = "SELECT i FROM Impdata i WHERE i.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Impdata.findByKrnCreateUserId", query = "SELECT i FROM Impdata i WHERE i.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Impdata.findByKrnModifyDate", query = "SELECT i FROM Impdata i WHERE i.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Impdata.findByKrnModifyUserId", query = "SELECT i FROM Impdata i WHERE i.krnModifyUserId = :krnModifyUserId"),
    @NamedQuery(name = "Impdata.findBySeqnum", query = "SELECT i FROM Impdata i WHERE i.seqnum = :seqnum"),
    @NamedQuery(name = "Impdata.findByCarpos", query = "SELECT i FROM Impdata i WHERE i.carpos = :carpos"),
    @NamedQuery(name = "Impdata.findByMsgType", query = "SELECT i FROM Impdata i WHERE i.msgType = :msgType")})
public class Impdata implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Impdata_ID")
    private Integer impdataID;
    @Column(name = "ImpDeleted")
    private Integer impDeleted;
    @Column(name = "ImpType")
    private Integer impType;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "EMF_TYPE_ID")
    private BigDecimal emfTypeId;
    @Size(max = 100)
    @Column(name = "Nom")
    private String nom;
    @Size(max = 100)
    @Column(name = "Prenom")
    private String prenom;
    @Column(name = "Date_Consultation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateConsultation;
    @Lob
    @Column(name = "File_Data")
    private byte[] fileData;
    @Column(name = "Date_Naissance")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateNaissance;
    @Size(max = 64)
    @Column(name = "Mesure")
    private String mesure;
    @Column(name = "PatientImported")
    private Integer patientImported;
    @Size(max = 24)
    @Column(name = "KEYCODE")
    private String keycode;
    @Column(name = "QC_INFO")
    private Boolean qcInfo;
    @Column(name = "LM_QC_TEST_ID")
    private Integer lmQcTestId;
    @Column(name = "PATIENTS_ID")
    private Integer patientsId;
    @Column(name = "STATE")
    private Integer state;
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
    @Size(max = 20)
    @Column(name = "SEQNUM")
    private String seqnum;
    @Size(max = 30)
    @Column(name = "CARPOS")
    private String carpos;
    @Size(max = 1)
    @Column(name = "MSG_TYPE")
    private String msgType;

    public Impdata() {
    }

    public Impdata(Integer impdataID) {
        this.impdataID = impdataID;
    }

    public Integer getImpdataID() {
        return impdataID;
    }

    public void setImpdataID(Integer impdataID) {
        this.impdataID = impdataID;
    }

    public Integer getImpDeleted() {
        return impDeleted;
    }

    public void setImpDeleted(Integer impDeleted) {
        this.impDeleted = impDeleted;
    }

    public Integer getImpType() {
        return impType;
    }

    public void setImpType(Integer impType) {
        this.impType = impType;
    }

    public BigDecimal getEmfTypeId() {
        return emfTypeId;
    }

    public void setEmfTypeId(BigDecimal emfTypeId) {
        this.emfTypeId = emfTypeId;
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

    public Date getDateConsultation() {
        return dateConsultation;
    }

    public void setDateConsultation(Date dateConsultation) {
        this.dateConsultation = dateConsultation;
    }

    public byte[] getFileData() {
        return fileData;
    }

    public void setFileData(byte[] fileData) {
        this.fileData = fileData;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getMesure() {
        return mesure;
    }

    public void setMesure(String mesure) {
        this.mesure = mesure;
    }

    public Integer getPatientImported() {
        return patientImported;
    }

    public void setPatientImported(Integer patientImported) {
        this.patientImported = patientImported;
    }

    public String getKeycode() {
        return keycode;
    }

    public void setKeycode(String keycode) {
        this.keycode = keycode;
    }

    public Boolean getQcInfo() {
        return qcInfo;
    }

    public void setQcInfo(Boolean qcInfo) {
        this.qcInfo = qcInfo;
    }

    public Integer getLmQcTestId() {
        return lmQcTestId;
    }

    public void setLmQcTestId(Integer lmQcTestId) {
        this.lmQcTestId = lmQcTestId;
    }

    public Integer getPatientsId() {
        return patientsId;
    }

    public void setPatientsId(Integer patientsId) {
        this.patientsId = patientsId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    public String getSeqnum() {
        return seqnum;
    }

    public void setSeqnum(String seqnum) {
        this.seqnum = seqnum;
    }

    public String getCarpos() {
        return carpos;
    }

    public void setCarpos(String carpos) {
        this.carpos = carpos;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (impdataID != null ? impdataID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Impdata)) {
            return false;
        }
        Impdata other = (Impdata) object;
        if ((this.impdataID == null && other.impdataID != null) || (this.impdataID != null && !this.impdataID.equals(other.impdataID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Impdata[ impdataID=" + impdataID + " ]";
    }
    
}
