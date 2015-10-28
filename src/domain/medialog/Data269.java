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
@Table(name = "DATA269")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Data269.findAll", query = "SELECT d FROM Data269 d"),
    @NamedQuery(name = "Data269.findByData269Id", query = "SELECT d FROM Data269 d WHERE d.data269Id = :data269Id"),
    @NamedQuery(name = "Data269.findByPatientsId", query = "SELECT d FROM Data269 d WHERE d.patientsId = :patientsId"),
    @NamedQuery(name = "Data269.findByDateConsultation", query = "SELECT d FROM Data269 d WHERE d.dateConsultation = :dateConsultation"),
    @NamedQuery(name = "Data269.findByMotconsuId", query = "SELECT d FROM Data269 d WHERE d.motconsuId = :motconsuId"),
    @NamedQuery(name = "Data269.findByLehahijVrah", query = "SELECT d FROM Data269 d WHERE d.lehahijVrah = :lehahijVrah"),
    @NamedQuery(name = "Data269.findByDataIssledovaniq", query = "SELECT d FROM Data269 d WHERE d.dataIssledovaniq = :dataIssledovaniq"),
    @NamedQuery(name = "Data269.findByMaterial", query = "SELECT d FROM Data269 d WHERE d.material = :material"),
    @NamedQuery(name = "Data269.findByKariotip", query = "SELECT d FROM Data269 d WHERE d.kariotip = :kariotip"),
    @NamedQuery(name = "Data269.findByGenetik", query = "SELECT d FROM Data269 d WHERE d.genetik = :genetik"),
    @NamedQuery(name = "Data269.findByLaboratoriq", query = "SELECT d FROM Data269 d WHERE d.laboratoriq = :laboratoriq"),
    @NamedQuery(name = "Data269.findByOtpravitNapohtu", query = "SELECT d FROM Data269 d WHERE d.otpravitNapohtu = :otpravitNapohtu"),
    @NamedQuery(name = "Data269.findByKrnCreateDate", query = "SELECT d FROM Data269 d WHERE d.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Data269.findByKrnCreateUserId", query = "SELECT d FROM Data269 d WHERE d.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Data269.findByKrnModifyDate", query = "SELECT d FROM Data269 d WHERE d.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Data269.findByKrnModifyUserId", query = "SELECT d FROM Data269 d WHERE d.krnModifyUserId = :krnModifyUserId")})
public class Data269 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA269_ID")
    private Integer data269Id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PATIENTS_ID")
    private int patientsId;
    @Column(name = "DATE_CONSULTATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateConsultation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOTCONSU_ID")
    private int motconsuId;
    @Size(max = 19)
    @Column(name = "LEHAHIJ_VRAH")
    private String lehahijVrah;
    @Column(name = "DATA_ISSLEDOVANIQ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataIssledovaniq;
    @Size(max = 99)
    @Column(name = "MATERIAL")
    private String material;
    @Size(max = 149)
    @Column(name = "KARIOTIP")
    private String kariotip;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "DOPOLNITEL_NOE_ISSLEDOVAN")
    private String dopolnitelNoeIssledovan;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "ZAKLYHENIE")
    private String zaklyhenie;
    @Size(max = 19)
    @Column(name = "GENETIK")
    private String genetik;
    @Size(max = 49)
    @Column(name = "LABORATORIQ")
    private String laboratoriq;
    @Column(name = "OTPRAVIT_NAPOHTU")
    private Boolean otpravitNapohtu;
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

    public Data269() {
    }

    public Data269(Integer data269Id) {
        this.data269Id = data269Id;
    }

    public Data269(Integer data269Id, int patientsId, int motconsuId) {
        this.data269Id = data269Id;
        this.patientsId = patientsId;
        this.motconsuId = motconsuId;
    }

    public Integer getData269Id() {
        return data269Id;
    }

    public void setData269Id(Integer data269Id) {
        this.data269Id = data269Id;
    }

    public int getPatientsId() {
        return patientsId;
    }

    public void setPatientsId(int patientsId) {
        this.patientsId = patientsId;
    }

    public Date getDateConsultation() {
        return dateConsultation;
    }

    public void setDateConsultation(Date dateConsultation) {
        this.dateConsultation = dateConsultation;
    }

    public int getMotconsuId() {
        return motconsuId;
    }

    public void setMotconsuId(int motconsuId) {
        this.motconsuId = motconsuId;
    }

    public String getLehahijVrah() {
        return lehahijVrah;
    }

    public void setLehahijVrah(String lehahijVrah) {
        this.lehahijVrah = lehahijVrah;
    }

    public Date getDataIssledovaniq() {
        return dataIssledovaniq;
    }

    public void setDataIssledovaniq(Date dataIssledovaniq) {
        this.dataIssledovaniq = dataIssledovaniq;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getKariotip() {
        return kariotip;
    }

    public void setKariotip(String kariotip) {
        this.kariotip = kariotip;
    }

    public String getDopolnitelNoeIssledovan() {
        return dopolnitelNoeIssledovan;
    }

    public void setDopolnitelNoeIssledovan(String dopolnitelNoeIssledovan) {
        this.dopolnitelNoeIssledovan = dopolnitelNoeIssledovan;
    }

    public String getZaklyhenie() {
        return zaklyhenie;
    }

    public void setZaklyhenie(String zaklyhenie) {
        this.zaklyhenie = zaklyhenie;
    }

    public String getGenetik() {
        return genetik;
    }

    public void setGenetik(String genetik) {
        this.genetik = genetik;
    }

    public String getLaboratoriq() {
        return laboratoriq;
    }

    public void setLaboratoriq(String laboratoriq) {
        this.laboratoriq = laboratoriq;
    }

    public Boolean getOtpravitNapohtu() {
        return otpravitNapohtu;
    }

    public void setOtpravitNapohtu(Boolean otpravitNapohtu) {
        this.otpravitNapohtu = otpravitNapohtu;
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
        hash += (data269Id != null ? data269Id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data269)) {
            return false;
        }
        Data269 other = (Data269) object;
        if ((this.data269Id == null && other.data269Id != null) || (this.data269Id != null && !this.data269Id.equals(other.data269Id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.Data269[ data269Id=" + data269Id + " ]";
    }
    
}
