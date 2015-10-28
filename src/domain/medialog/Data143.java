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
@Table(name = "DATA143")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Data143.findAll", query = "SELECT d FROM Data143 d"),
    @NamedQuery(name = "Data143.findByData143Id", query = "SELECT d FROM Data143 d WHERE d.data143Id = :data143Id"),
    @NamedQuery(name = "Data143.findByPatientsId", query = "SELECT d FROM Data143 d WHERE d.patientsId = :patientsId"),
    @NamedQuery(name = "Data143.findByDateConsultation", query = "SELECT d FROM Data143 d WHERE d.dateConsultation = :dateConsultation"),
    @NamedQuery(name = "Data143.findByMotconsuId", query = "SELECT d FROM Data143 d WHERE d.motconsuId = :motconsuId"),
    @NamedQuery(name = "Data143.findByFlora", query = "SELECT d FROM Data143 d WHERE d.flora = :flora"),
    @NamedQuery(name = "Data143.findByGardnarell", query = "SELECT d FROM Data143 d WHERE d.gardnarell = :gardnarell"),
    @NamedQuery(name = "Data143.findByTriOmonad", query = "SELECT d FROM Data143 d WHERE d.triOmonad = :triOmonad"),
    @NamedQuery(name = "Data143.findByGonokokk", query = "SELECT d FROM Data143 d WHERE d.gonokokk = :gonokokk"),
    @NamedQuery(name = "Data143.findBySliz", query = "SELECT d FROM Data143 d WHERE d.sliz = :sliz"),
    @NamedQuery(name = "Data143.findByLehahijVrah", query = "SELECT d FROM Data143 d WHERE d.lehahijVrah = :lehahijVrah"),
    @NamedQuery(name = "Data143.findByDataZabora", query = "SELECT d FROM Data143 d WHERE d.dataZabora = :dataZabora"),
    @NamedQuery(name = "Data143.findByDataOtpravleniq", query = "SELECT d FROM Data143 d WHERE d.dataOtpravleniq = :dataOtpravleniq"),
    @NamedQuery(name = "Data143.findByLejkocit", query = "SELECT d FROM Data143 d WHERE d.lejkocit = :lejkocit"),
    @NamedQuery(name = "Data143.findByEritrocit", query = "SELECT d FROM Data143 d WHERE d.eritrocit = :eritrocit"),
    @NamedQuery(name = "Data143.findByEpitelialNEKletki", query = "SELECT d FROM Data143 d WHERE d.epitelialNEKletki = :epitelialNEKletki"),
    @NamedQuery(name = "Data143.findByAmiloidnETelCa", query = "SELECT d FROM Data143 d WHERE d.amiloidnETelCa = :amiloidnETelCa"),
    @NamedQuery(name = "Data143.findByLecitinovEZerna", query = "SELECT d FROM Data143 d WHERE d.lecitinovEZerna = :lecitinovEZerna"),
    @NamedQuery(name = "Data143.findByBakterii", query = "SELECT d FROM Data143 d WHERE d.bakterii = :bakterii"),
    @NamedQuery(name = "Data143.findByLaboratoriq", query = "SELECT d FROM Data143 d WHERE d.laboratoriq = :laboratoriq"),
    @NamedQuery(name = "Data143.findByVrahLaborant", query = "SELECT d FROM Data143 d WHERE d.vrahLaborant = :vrahLaborant"),
    @NamedQuery(name = "Data143.findByRegistrator", query = "SELECT d FROM Data143 d WHERE d.registrator = :registrator"),
    @NamedQuery(name = "Data143.findByOtpravitNapohtu", query = "SELECT d FROM Data143 d WHERE d.otpravitNapohtu = :otpravitNapohtu"),
    @NamedQuery(name = "Data143.findByKrnCreateDate", query = "SELECT d FROM Data143 d WHERE d.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Data143.findByKrnCreateUserId", query = "SELECT d FROM Data143 d WHERE d.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Data143.findByKrnModifyDate", query = "SELECT d FROM Data143 d WHERE d.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Data143.findByKrnModifyUserId", query = "SELECT d FROM Data143 d WHERE d.krnModifyUserId = :krnModifyUserId")})
public class Data143 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA143_ID")
    private Integer data143Id;
    @Column(name = "PATIENTS_ID")
    private Integer patientsId;
    @Column(name = "DATE_CONSULTATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateConsultation;
    @Column(name = "MOTCONSU_ID")
    private Integer motconsuId;
    @Size(max = 14)
    @Column(name = "FLORA")
    private String flora;
    @Size(max = 14)
    @Column(name = "GARDNARELL")
    private String gardnarell;
    @Size(max = 39)
    @Column(name = "TRI_OMONAD")
    private String triOmonad;
    @Size(max = 39)
    @Column(name = "GONOKOKK")
    private String gonokokk;
    @Size(max = 9)
    @Column(name = "SLIZ")
    private String sliz;
    @Size(max = 19)
    @Column(name = "LEHAHIJ_VRAH")
    private String lehahijVrah;
    @Column(name = "DATA_ZABORA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataZabora;
    @Column(name = "DATA_OTPRAVLENIQ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataOtpravleniq;
    @Size(max = 102)
    @Column(name = "LEJKOCIT")
    private String lejkocit;
    @Size(max = 102)
    @Column(name = "ERITROCIT")
    private String eritrocit;
    @Size(max = 102)
    @Column(name = "EPITELIAL_N_E_KLETKI")
    private String epitelialNEKletki;
    @Size(max = 102)
    @Column(name = "AMILOIDN_E_TEL_CA")
    private String amiloidnETelCa;
    @Size(max = 102)
    @Column(name = "LECITINOV_E_ZERNA")
    private String lecitinovEZerna;
    @Size(max = 102)
    @Column(name = "BAKTERII")
    private String bakterii;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "PRIMEHANIE")
    private String primehanie;
    @Size(max = 49)
    @Column(name = "LABORATORIQ")
    private String laboratoriq;
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

    public Data143() {
    }

    public Data143(Integer data143Id) {
        this.data143Id = data143Id;
    }

    public Integer getData143Id() {
        return data143Id;
    }

    public void setData143Id(Integer data143Id) {
        this.data143Id = data143Id;
    }

    public Integer getPatientsId() {
        return patientsId;
    }

    public void setPatientsId(Integer patientsId) {
        this.patientsId = patientsId;
    }

    public Date getDateConsultation() {
        return dateConsultation;
    }

    public void setDateConsultation(Date dateConsultation) {
        this.dateConsultation = dateConsultation;
    }

    public Integer getMotconsuId() {
        return motconsuId;
    }

    public void setMotconsuId(Integer motconsuId) {
        this.motconsuId = motconsuId;
    }

    public String getFlora() {
        return flora;
    }

    public void setFlora(String flora) {
        this.flora = flora;
    }

    public String getGardnarell() {
        return gardnarell;
    }

    public void setGardnarell(String gardnarell) {
        this.gardnarell = gardnarell;
    }

    public String getTriOmonad() {
        return triOmonad;
    }

    public void setTriOmonad(String triOmonad) {
        this.triOmonad = triOmonad;
    }

    public String getGonokokk() {
        return gonokokk;
    }

    public void setGonokokk(String gonokokk) {
        this.gonokokk = gonokokk;
    }

    public String getSliz() {
        return sliz;
    }

    public void setSliz(String sliz) {
        this.sliz = sliz;
    }

    public String getLehahijVrah() {
        return lehahijVrah;
    }

    public void setLehahijVrah(String lehahijVrah) {
        this.lehahijVrah = lehahijVrah;
    }

    public Date getDataZabora() {
        return dataZabora;
    }

    public void setDataZabora(Date dataZabora) {
        this.dataZabora = dataZabora;
    }

    public Date getDataOtpravleniq() {
        return dataOtpravleniq;
    }

    public void setDataOtpravleniq(Date dataOtpravleniq) {
        this.dataOtpravleniq = dataOtpravleniq;
    }

    public String getLejkocit() {
        return lejkocit;
    }

    public void setLejkocit(String lejkocit) {
        this.lejkocit = lejkocit;
    }

    public String getEritrocit() {
        return eritrocit;
    }

    public void setEritrocit(String eritrocit) {
        this.eritrocit = eritrocit;
    }

    public String getEpitelialNEKletki() {
        return epitelialNEKletki;
    }

    public void setEpitelialNEKletki(String epitelialNEKletki) {
        this.epitelialNEKletki = epitelialNEKletki;
    }

    public String getAmiloidnETelCa() {
        return amiloidnETelCa;
    }

    public void setAmiloidnETelCa(String amiloidnETelCa) {
        this.amiloidnETelCa = amiloidnETelCa;
    }

    public String getLecitinovEZerna() {
        return lecitinovEZerna;
    }

    public void setLecitinovEZerna(String lecitinovEZerna) {
        this.lecitinovEZerna = lecitinovEZerna;
    }

    public String getBakterii() {
        return bakterii;
    }

    public void setBakterii(String bakterii) {
        this.bakterii = bakterii;
    }

    public String getPrimehanie() {
        return primehanie;
    }

    public void setPrimehanie(String primehanie) {
        this.primehanie = primehanie;
    }

    public String getLaboratoriq() {
        return laboratoriq;
    }

    public void setLaboratoriq(String laboratoriq) {
        this.laboratoriq = laboratoriq;
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
        hash += (data143Id != null ? data143Id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data143)) {
            return false;
        }
        Data143 other = (Data143) object;
        if ((this.data143Id == null && other.data143Id != null) || (this.data143Id != null && !this.data143Id.equals(other.data143Id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.Data143[ data143Id=" + data143Id + " ]";
    }
    
}
