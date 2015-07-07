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
@Table(name = "IMG_SCHEMES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImgSchemes.findAll", query = "SELECT i FROM ImgSchemes i"),
    @NamedQuery(name = "ImgSchemes.findByImgSchemesId", query = "SELECT i FROM ImgSchemes i WHERE i.imgSchemesId = :imgSchemesId"),
    @NamedQuery(name = "ImgSchemes.findBySchemeFile", query = "SELECT i FROM ImgSchemes i WHERE i.schemeFile = :schemeFile"),
    @NamedQuery(name = "ImgSchemes.findByKrnCreateDate", query = "SELECT i FROM ImgSchemes i WHERE i.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "ImgSchemes.findByKrnCreateUserId", query = "SELECT i FROM ImgSchemes i WHERE i.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "ImgSchemes.findByKrnModifyDate", query = "SELECT i FROM ImgSchemes i WHERE i.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "ImgSchemes.findByKrnModifyUserId", query = "SELECT i FROM ImgSchemes i WHERE i.krnModifyUserId = :krnModifyUserId")})
public class ImgSchemes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IMG_SCHEMES_ID")
    private Integer imgSchemesId;
    @Size(max = 100)
    @Column(name = "SCHEME_FILE")
    private String schemeFile;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "SCHEME_AOBJ")
    private String schemeAobj;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "SCHEME_OBJ_DATA")
    private String schemeObjData;
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

    public ImgSchemes() {
    }

    public ImgSchemes(Integer imgSchemesId) {
        this.imgSchemesId = imgSchemesId;
    }

    public Integer getImgSchemesId() {
        return imgSchemesId;
    }

    public void setImgSchemesId(Integer imgSchemesId) {
        this.imgSchemesId = imgSchemesId;
    }

    public String getSchemeFile() {
        return schemeFile;
    }

    public void setSchemeFile(String schemeFile) {
        this.schemeFile = schemeFile;
    }

    public String getSchemeAobj() {
        return schemeAobj;
    }

    public void setSchemeAobj(String schemeAobj) {
        this.schemeAobj = schemeAobj;
    }

    public String getSchemeObjData() {
        return schemeObjData;
    }

    public void setSchemeObjData(String schemeObjData) {
        this.schemeObjData = schemeObjData;
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
        hash += (imgSchemesId != null ? imgSchemesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImgSchemes)) {
            return false;
        }
        ImgSchemes other = (ImgSchemes) object;
        if ((this.imgSchemesId == null && other.imgSchemesId != null) || (this.imgSchemesId != null && !this.imgSchemesId.equals(other.imgSchemesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.ImgSchemes[ imgSchemesId=" + imgSchemesId + " ]";
    }
    
}
