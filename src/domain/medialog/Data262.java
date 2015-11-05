/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.medialog;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * MODELS_ID = 181
 * Гормон ХГЧ
 * @author kvo
 */
@Entity
@Table(name = "DATA262")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Data262.findAll", query = "SELECT d FROM Data262 d"),
    @NamedQuery(name = "Data262.findByData262Id", query = "SELECT d FROM Data262 d WHERE d.data262Id = :data262Id"),
    @NamedQuery(name = "Data262.findByPatientsId", query = "SELECT d FROM Data262 d WHERE d.patientsId = :patientsId"),
    @NamedQuery(name = "Data262.findByDateConsultation", query = "SELECT d FROM Data262 d WHERE d.dateConsultation = :dateConsultation"),
    @NamedQuery(name = "Data262.findByMotconsuId", query = "SELECT d FROM Data262 d WHERE d.motconsuId = :motconsuId"),
    @NamedQuery(name = "Data262.findByVedenieBeremennosti2", query = "SELECT d FROM Data262 d WHERE d.vedenieBeremennosti2 = :vedenieBeremennosti2"),
    @NamedQuery(name = "Data262.findByVedenieBeremennosti", query = "SELECT d FROM Data262 d WHERE d.vedenieBeremennosti = :vedenieBeremennosti"),
    @NamedQuery(name = "Data262.findByNomer", query = "SELECT d FROM Data262 d WHERE d.nomer = :nomer"),
    @NamedQuery(name = "Data262.findByHek", query = "SELECT d FROM Data262 d WHERE d.hek = :hek"),
    @NamedQuery(name = "Data262.findByLehahijVrah", query = "SELECT d FROM Data262 d WHERE d.lehahijVrah = :lehahijVrah"),
    @NamedQuery(name = "Data262.findByDataZabra", query = "SELECT d FROM Data262 d WHERE d.dataZabra = :dataZabra"),
    @NamedQuery(name = "Data262.findByDataOtpravleniq", query = "SELECT d FROM Data262 d WHERE d.dataOtpravleniq = :dataOtpravleniq"),
    @NamedQuery(name = "Data262.findByFGh", query = "SELECT d FROM Data262 d WHERE d.fGh = :fGh"),
    @NamedQuery(name = "Data262.findByLabratoriq", query = "SELECT d FROM Data262 d WHERE d.labratoriq = :labratoriq"),
    @NamedQuery(name = "Data262.findByVrahLaborant", query = "SELECT d FROM Data262 d WHERE d.vrahLaborant = :vrahLaborant"),
    @NamedQuery(name = "Data262.findByRegistrator", query = "SELECT d FROM Data262 d WHERE d.registrator = :registrator"),
    @NamedQuery(name = "Data262.findByOtpravitNapohtu", query = "SELECT d FROM Data262 d WHERE d.otpravitNapohtu = :otpravitNapohtu"),
    @NamedQuery(name = "Data262.findByKrnCreateDate", query = "SELECT d FROM Data262 d WHERE d.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Data262.findByKrnCreateUserId", query = "SELECT d FROM Data262 d WHERE d.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Data262.findByKrnModifyDate", query = "SELECT d FROM Data262 d WHERE d.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Data262.findByKrnModifyUserId", query = "SELECT d FROM Data262 d WHERE d.krnModifyUserId = :krnModifyUserId")})
public class Data262 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA262_ID")
    private Integer data262Id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PATIENTS_ID")
    private int patientsId;
    @Column(name = "DATE_CONSULTATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateConsultation;
    @Basic(optional = false)
    
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MOTCONSU_ID")
    private Motconsu motconsuId;
    
    @Size(max = 19)
    @Column(name = "VEDENIE_BEREMENNOSTI2")
    private String vedenieBeremennosti2;
    @Column(name = "VEDENIE_BEREMENNOSTI")
    private Boolean vedenieBeremennosti;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "NOMER")
    private BigDecimal nomer;
    @Size(max = 25)
    @Column(name = "HEK")
    private String hek;
    @Size(max = 19)
    @Column(name = "LEHAHIJ_VRAH")
    private String lehahijVrah;
    @Column(name = "DATA_ZABRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataZabra;
    @Column(name = "DATA_OTPRAVLENIQ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataOtpravleniq;
    @Column(name = "F_GH")
    private BigDecimal fGh;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "KOMMENTARIJ")
    private String kommentarij;
    @Size(max = 49)
    @Column(name = "LABRATORIQ")
    private String labratoriq;
    @Size(max = 19)
    @Column(name = "VRAH_LABORANT")
    private String vrahLaborant;
    @Size(max = 19)
    @Column(name = "REGISTRATOR")
    private String registrator;
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

    public Data262() {
    }

    public Data262(Integer data262Id) {
        this.data262Id = data262Id;
    }

    public Data262(Integer data262Id, int patientsId) {
        this.data262Id = data262Id;
        this.patientsId = patientsId;
    }

    public Integer getData262Id() {
        return data262Id;
    }

    public void setData262Id(Integer data262Id) {
        this.data262Id = data262Id;
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

    public Motconsu getMotconsuId() {
        return motconsuId;
    }

    public void setMotconsuId(Motconsu motconsuId) {
        this.motconsuId = motconsuId;
    }

    
    public String getVedenieBeremennosti2() {
        return vedenieBeremennosti2;
    }

    public void setVedenieBeremennosti2(String vedenieBeremennosti2) {
        this.vedenieBeremennosti2 = vedenieBeremennosti2;
    }

    public Boolean getVedenieBeremennosti() {
        return vedenieBeremennosti;
    }

    public void setVedenieBeremennosti(Boolean vedenieBeremennosti) {
        this.vedenieBeremennosti = vedenieBeremennosti;
    }

    public BigDecimal getNomer() {
        return nomer;
    }

    public void setNomer(BigDecimal nomer) {
        this.nomer = nomer;
    }

    public String getHek() {
        return hek;
    }

    public void setHek(String hek) {
        this.hek = hek;
    }

    public String getLehahijVrah() {
        return lehahijVrah;
    }

    public void setLehahijVrah(String lehahijVrah) {
        this.lehahijVrah = lehahijVrah;
    }

    public Date getDataZabra() {
        return dataZabra;
    }

    public void setDataZabra(Date dataZabra) {
        this.dataZabra = dataZabra;
    }

    public Date getDataOtpravleniq() {
        return dataOtpravleniq;
    }

    public void setDataOtpravleniq(Date dataOtpravleniq) {
        this.dataOtpravleniq = dataOtpravleniq;
    }

    public BigDecimal getFGh() {
        return fGh;
    }

    public void setFGh(BigDecimal fGh) {
        this.fGh = fGh;
    }

    public String getKommentarij() {
        return kommentarij;
    }

    public void setKommentarij(String kommentarij) {
        this.kommentarij = kommentarij;
    }

    public String getLabratoriq() {
        return labratoriq;
    }

    public void setLabratoriq(String labratoriq) {
        this.labratoriq = labratoriq;
    }

    public String getVrahLaborant() {
        return vrahLaborant;
    }

    public void setVrahLaborant(String vrahLaborant) {
        this.vrahLaborant = vrahLaborant;
    }

    public String getRegistrator() {
        return registrator;
    }

    public void setRegistrator(String registrator) {
        this.registrator = registrator;
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
        hash += (data262Id != null ? data262Id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data262)) {
            return false;
        }
        Data262 other = (Data262) object;
        if ((this.data262Id == null && other.data262Id != null) || (this.data262Id != null && !this.data262Id.equals(other.data262Id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.Data262[ data262Id=" + data262Id + " ]";
    }
    
}
