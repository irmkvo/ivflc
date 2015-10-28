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
@Table(name = "DATA331")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Data331.findAll", query = "SELECT d FROM Data331 d"),
    @NamedQuery(name = "Data331.findByData331Id", query = "SELECT d FROM Data331 d WHERE d.data331Id = :data331Id"),
    @NamedQuery(name = "Data331.findByPatientsId", query = "SELECT d FROM Data331 d WHERE d.patientsId = :patientsId"),
    @NamedQuery(name = "Data331.findByDateConsultation", query = "SELECT d FROM Data331 d WHERE d.dateConsultation = :dateConsultation"),
    @NamedQuery(name = "Data331.findByMotconsuId", query = "SELECT d FROM Data331 d WHERE d.motconsuId = :motconsuId"),
    @NamedQuery(name = "Data331.findByFHek", query = "SELECT d FROM Data331 d WHERE d.fHek = :fHek"),
    @NamedQuery(name = "Data331.findByRezulTat", query = "SELECT d FROM Data331 d WHERE d.rezulTat = :rezulTat"),
    @NamedQuery(name = "Data331.findByVrahLaborant", query = "SELECT d FROM Data331 d WHERE d.vrahLaborant = :vrahLaborant"),
    @NamedQuery(name = "Data331.findByDataAnaliza", query = "SELECT d FROM Data331 d WHERE d.dataAnaliza = :dataAnaliza"),
    @NamedQuery(name = "Data331.findByLehahijVrah", query = "SELECT d FROM Data331 d WHERE d.lehahijVrah = :lehahijVrah"),
    @NamedQuery(name = "Data331.findByNomer", query = "SELECT d FROM Data331 d WHERE d.nomer = :nomer"),
    @NamedQuery(name = "Data331.findByOtpravitNapohtu", query = "SELECT d FROM Data331 d WHERE d.otpravitNapohtu = :otpravitNapohtu"),
    @NamedQuery(name = "Data331.findByKrnCreateDate", query = "SELECT d FROM Data331 d WHERE d.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Data331.findByKrnCreateUserId", query = "SELECT d FROM Data331 d WHERE d.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Data331.findByKrnModifyDate", query = "SELECT d FROM Data331 d WHERE d.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Data331.findByKrnModifyUserId", query = "SELECT d FROM Data331 d WHERE d.krnModifyUserId = :krnModifyUserId")})
public class Data331 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA331_ID")
    private Integer data331Id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PATIENTS_ID")
    private int patientsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_CONSULTATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateConsultation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MOTCONSU_ID")
    private int motconsuId;
    @Size(max = 13)
    @Column(name = "F_HEK")
    private String fHek;
    @Size(max = 13)
    @Column(name = "REZUL_TAT")
    private String rezulTat;
    @Size(max = 13)
    @Column(name = "VRAH_LABORANT")
    private String vrahLaborant;
    @Column(name = "DATA_ANALIZA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAnaliza;
    @Size(max = 13)
    @Column(name = "LEHAHIJ_VRAH")
    private String lehahijVrah;
    @Size(max = 6)
    @Column(name = "NOMER")
    private String nomer;
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

    public Data331() {
    }

    public Data331(Integer data331Id) {
        this.data331Id = data331Id;
    }

    public Data331(Integer data331Id, int patientsId, Date dateConsultation, int motconsuId) {
        this.data331Id = data331Id;
        this.patientsId = patientsId;
        this.dateConsultation = dateConsultation;
        this.motconsuId = motconsuId;
    }

    public Integer getData331Id() {
        return data331Id;
    }

    public void setData331Id(Integer data331Id) {
        this.data331Id = data331Id;
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

    public String getFHek() {
        return fHek;
    }

    public void setFHek(String fHek) {
        this.fHek = fHek;
    }

    public String getRezulTat() {
        return rezulTat;
    }

    public void setRezulTat(String rezulTat) {
        this.rezulTat = rezulTat;
    }

    public String getVrahLaborant() {
        return vrahLaborant;
    }

    public void setVrahLaborant(String vrahLaborant) {
        this.vrahLaborant = vrahLaborant;
    }

    public Date getDataAnaliza() {
        return dataAnaliza;
    }

    public void setDataAnaliza(Date dataAnaliza) {
        this.dataAnaliza = dataAnaliza;
    }

    public String getLehahijVrah() {
        return lehahijVrah;
    }

    public void setLehahijVrah(String lehahijVrah) {
        this.lehahijVrah = lehahijVrah;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
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
        hash += (data331Id != null ? data331Id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data331)) {
            return false;
        }
        Data331 other = (Data331) object;
        if ((this.data331Id == null && other.data331Id != null) || (this.data331Id != null && !this.data331Id.equals(other.data331Id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.Data331[ data331Id=" + data331Id + " ]";
    }
    
}
