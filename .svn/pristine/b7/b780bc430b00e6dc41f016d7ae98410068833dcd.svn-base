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
@Table(name = "IMAGES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Images.findAll", query = "SELECT i FROM Images i"),
    @NamedQuery(name = "Images.findByImagesID", query = "SELECT i FROM Images i WHERE i.imagesID = :imagesID"),
    @NamedQuery(name = "Images.findByPatientsId", query = "SELECT i FROM Images i WHERE i.patientsId = :patientsId"),
    @NamedQuery(name = "Images.findByRubricsID", query = "SELECT i FROM Images i WHERE i.rubricsID = :rubricsID"),
    @NamedQuery(name = "Images.findByDateConsultation", query = "SELECT i FROM Images i WHERE i.dateConsultation = :dateConsultation"),
    @NamedQuery(name = "Images.findByDescriptor", query = "SELECT i FROM Images i WHERE i.descriptor = :descriptor"),
    @NamedQuery(name = "Images.findByFileName", query = "SELECT i FROM Images i WHERE i.fileName = :fileName"),
    @NamedQuery(name = "Images.findByThumbFile", query = "SELECT i FROM Images i WHERE i.thumbFile = :thumbFile"),
    @NamedQuery(name = "Images.findByExternalFile", query = "SELECT i FROM Images i WHERE i.externalFile = :externalFile"),
    @NamedQuery(name = "Images.findByMotconsuId", query = "SELECT i FROM Images i WHERE i.motconsuId = :motconsuId"),
    @NamedQuery(name = "Images.findByImagesSrcId", query = "SELECT i FROM Images i WHERE i.imagesSrcId = :imagesSrcId"),
    @NamedQuery(name = "Images.findByVirtualDisksId", query = "SELECT i FROM Images i WHERE i.virtualDisksId = :virtualDisksId"),
    @NamedQuery(name = "Images.findByMedecinsCreateId", query = "SELECT i FROM Images i WHERE i.medecinsCreateId = :medecinsCreateId"),
    @NamedQuery(name = "Images.findByExtData1", query = "SELECT i FROM Images i WHERE i.extData1 = :extData1"),
    @NamedQuery(name = "Images.findByExtData2", query = "SELECT i FROM Images i WHERE i.extData2 = :extData2"),
    @NamedQuery(name = "Images.findByExtData3", query = "SELECT i FROM Images i WHERE i.extData3 = :extData3"),
    @NamedQuery(name = "Images.findByExtData4", query = "SELECT i FROM Images i WHERE i.extData4 = :extData4"),
    @NamedQuery(name = "Images.findByExtDataIdx", query = "SELECT i FROM Images i WHERE i.extDataIdx = :extDataIdx"),
    @NamedQuery(name = "Images.findByKrnCreateDate", query = "SELECT i FROM Images i WHERE i.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Images.findByKrnCreateUserId", query = "SELECT i FROM Images i WHERE i.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Images.findByKrnModifyDate", query = "SELECT i FROM Images i WHERE i.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Images.findByKrnModifyUserId", query = "SELECT i FROM Images i WHERE i.krnModifyUserId = :krnModifyUserId")})
public class Images implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Images_ID")
    private Integer imagesID;
    @Column(name = "PATIENTS_ID")
    private Integer patientsId;
    @Column(name = "Rubrics_ID")
    private Integer rubricsID;
    @Column(name = "Date_Consultation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateConsultation;
    @Size(max = 50)
    @Column(name = "Descriptor")
    private String descriptor;
    @Size(max = 80)
    @Column(name = "FileName")
    private String fileName;
    @Size(max = 12)
    @Column(name = "ThumbFile")
    private String thumbFile;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "AuxFileName")
    private String auxFileName;
    @Column(name = "ExternalFile")
    private Boolean externalFile;
    @Column(name = "MOTCONSU_ID")
    private Integer motconsuId;
    @Column(name = "IMAGES_SRC_ID")
    private Integer imagesSrcId;
    @Column(name = "VIRTUAL_DISKS_ID")
    private Integer virtualDisksId;
    @Column(name = "MEDECINS_CREATE_ID")
    private Integer medecinsCreateId;
    @Size(max = 255)
    @Column(name = "EXT_DATA1")
    private String extData1;
    @Size(max = 255)
    @Column(name = "EXT_DATA2")
    private String extData2;
    @Size(max = 255)
    @Column(name = "EXT_DATA3")
    private String extData3;
    @Size(max = 255)
    @Column(name = "EXT_DATA4")
    private String extData4;
    @Size(max = 100)
    @Column(name = "EXT_DATA_IDX")
    private String extDataIdx;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "OPTIONS")
    private String options;
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

    public Images() {
    }

    public Images(Integer imagesID) {
        this.imagesID = imagesID;
    }

    public Integer getImagesID() {
        return imagesID;
    }

    public void setImagesID(Integer imagesID) {
        this.imagesID = imagesID;
    }

    public Integer getPatientsId() {
        return patientsId;
    }

    public void setPatientsId(Integer patientsId) {
        this.patientsId = patientsId;
    }

    public Integer getRubricsID() {
        return rubricsID;
    }

    public void setRubricsID(Integer rubricsID) {
        this.rubricsID = rubricsID;
    }

    public Date getDateConsultation() {
        return dateConsultation;
    }

    public void setDateConsultation(Date dateConsultation) {
        this.dateConsultation = dateConsultation;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getThumbFile() {
        return thumbFile;
    }

    public void setThumbFile(String thumbFile) {
        this.thumbFile = thumbFile;
    }

    public String getAuxFileName() {
        return auxFileName;
    }

    public void setAuxFileName(String auxFileName) {
        this.auxFileName = auxFileName;
    }

    public Boolean getExternalFile() {
        return externalFile;
    }

    public void setExternalFile(Boolean externalFile) {
        this.externalFile = externalFile;
    }

    public Integer getMotconsuId() {
        return motconsuId;
    }

    public void setMotconsuId(Integer motconsuId) {
        this.motconsuId = motconsuId;
    }

    public Integer getImagesSrcId() {
        return imagesSrcId;
    }

    public void setImagesSrcId(Integer imagesSrcId) {
        this.imagesSrcId = imagesSrcId;
    }

    public Integer getVirtualDisksId() {
        return virtualDisksId;
    }

    public void setVirtualDisksId(Integer virtualDisksId) {
        this.virtualDisksId = virtualDisksId;
    }

    public Integer getMedecinsCreateId() {
        return medecinsCreateId;
    }

    public void setMedecinsCreateId(Integer medecinsCreateId) {
        this.medecinsCreateId = medecinsCreateId;
    }

    public String getExtData1() {
        return extData1;
    }

    public void setExtData1(String extData1) {
        this.extData1 = extData1;
    }

    public String getExtData2() {
        return extData2;
    }

    public void setExtData2(String extData2) {
        this.extData2 = extData2;
    }

    public String getExtData3() {
        return extData3;
    }

    public void setExtData3(String extData3) {
        this.extData3 = extData3;
    }

    public String getExtData4() {
        return extData4;
    }

    public void setExtData4(String extData4) {
        this.extData4 = extData4;
    }

    public String getExtDataIdx() {
        return extDataIdx;
    }

    public void setExtDataIdx(String extDataIdx) {
        this.extDataIdx = extDataIdx;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
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
        hash += (imagesID != null ? imagesID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Images)) {
            return false;
        }
        Images other = (Images) object;
        if ((this.imagesID == null && other.imagesID != null) || (this.imagesID != null && !this.imagesID.equals(other.imagesID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Images[ imagesID=" + imagesID + " ]";
    }
    
}
