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
@Table(name = "IMG_INFO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImgInfo.findAll", query = "SELECT i FROM ImgInfo i"),
    @NamedQuery(name = "ImgInfo.findByImgInfoId", query = "SELECT i FROM ImgInfo i WHERE i.imgInfoId = :imgInfoId"),
    @NamedQuery(name = "ImgInfo.findByKrnCreateDate", query = "SELECT i FROM ImgInfo i WHERE i.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "ImgInfo.findByKrnCreateUserId", query = "SELECT i FROM ImgInfo i WHERE i.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "ImgInfo.findByKrnModifyDate", query = "SELECT i FROM ImgInfo i WHERE i.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "ImgInfo.findByKrnModifyUserId", query = "SELECT i FROM ImgInfo i WHERE i.krnModifyUserId = :krnModifyUserId")})
public class ImgInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IMG_INFO_ID")
    private Integer imgInfoId;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "PARAMS")
    private String params;
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

    public ImgInfo() {
    }

    public ImgInfo(Integer imgInfoId) {
        this.imgInfoId = imgInfoId;
    }

    public Integer getImgInfoId() {
        return imgInfoId;
    }

    public void setImgInfoId(Integer imgInfoId) {
        this.imgInfoId = imgInfoId;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
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
        hash += (imgInfoId != null ? imgInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImgInfo)) {
            return false;
        }
        ImgInfo other = (ImgInfo) object;
        if ((this.imgInfoId == null && other.imgInfoId != null) || (this.imgInfoId != null && !this.imgInfoId.equals(other.imgInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.ImgInfo[ imgInfoId=" + imgInfoId + " ]";
    }
    
}
