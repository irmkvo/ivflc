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
 * Мазки флоры
 * @author kvo
 */
@Entity
@Table(name = "DATA144")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Data144.findAll", query = "SELECT d FROM Data144 d"),
    @NamedQuery(name = "Data144.findByData144Id", query = "SELECT d FROM Data144 d WHERE d.data144Id = :data144Id"),
    @NamedQuery(name = "Data144.findByPatientsId", query = "SELECT d FROM Data144 d WHERE d.patientsId = :patientsId"),
    @NamedQuery(name = "Data144.findByDateConsultation", query = "SELECT d FROM Data144 d WHERE d.dateConsultation = :dateConsultation"),
    @NamedQuery(name = "Data144.findByMotconsuId", query = "SELECT d FROM Data144 d WHERE d.motconsuId = :motconsuId"),
    @NamedQuery(name = "Data144.findByFHek", query = "SELECT d FROM Data144 d WHERE d.fHek = :fHek"),
    @NamedQuery(name = "Data144.findByGardnarellCer", query = "SELECT d FROM Data144 d WHERE d.gardnarellCer = :gardnarellCer"),
    @NamedQuery(name = "Data144.findByGardnarellVag", query = "SELECT d FROM Data144 d WHERE d.gardnarellVag = :gardnarellVag"),
    @NamedQuery(name = "Data144.findByGardnarell", query = "SELECT d FROM Data144 d WHERE d.gardnarell = :gardnarell"),
    @NamedQuery(name = "Data144.findByDroggiFl", query = "SELECT d FROM Data144 d WHERE d.droggiFl = :droggiFl"),
    @NamedQuery(name = "Data144.findByDroggiCer", query = "SELECT d FROM Data144 d WHERE d.droggiCer = :droggiCer"),
    @NamedQuery(name = "Data144.findByDroggi", query = "SELECT d FROM Data144 d WHERE d.droggi = :droggi"),
    @NamedQuery(name = "Data144.findByLehahijVrah", query = "SELECT d FROM Data144 d WHERE d.lehahijVrah = :lehahijVrah"),
    @NamedQuery(name = "Data144.findByDataZabora", query = "SELECT d FROM Data144 d WHERE d.dataZabora = :dataZabora"),
    @NamedQuery(name = "Data144.findByDataOtpravleniq", query = "SELECT d FROM Data144 d WHERE d.dataOtpravleniq = :dataOtpravleniq"),
    @NamedQuery(name = "Data144.findByDyn11361290", query = "SELECT d FROM Data144 d WHERE d.dyn11361290 = :dyn11361290"),
    @NamedQuery(name = "Data144.findByDyn11361291", query = "SELECT d FROM Data144 d WHERE d.dyn11361291 = :dyn11361291"),
    @NamedQuery(name = "Data144.findByDyn11361292", query = "SELECT d FROM Data144 d WHERE d.dyn11361292 = :dyn11361292"),
    @NamedQuery(name = "Data144.findByDyn11361293", query = "SELECT d FROM Data144 d WHERE d.dyn11361293 = :dyn11361293"),
    @NamedQuery(name = "Data144.findByDyn11361294", query = "SELECT d FROM Data144 d WHERE d.dyn11361294 = :dyn11361294"),
    @NamedQuery(name = "Data144.findByDyn11361295", query = "SELECT d FROM Data144 d WHERE d.dyn11361295 = :dyn11361295"),
    @NamedQuery(name = "Data144.findByDyn11371290", query = "SELECT d FROM Data144 d WHERE d.dyn11371290 = :dyn11371290"),
    @NamedQuery(name = "Data144.findByDyn11371291", query = "SELECT d FROM Data144 d WHERE d.dyn11371291 = :dyn11371291"),
    @NamedQuery(name = "Data144.findByDyn11371292", query = "SELECT d FROM Data144 d WHERE d.dyn11371292 = :dyn11371292"),
    @NamedQuery(name = "Data144.findByDyn11371293", query = "SELECT d FROM Data144 d WHERE d.dyn11371293 = :dyn11371293"),
    @NamedQuery(name = "Data144.findByDyn11371294", query = "SELECT d FROM Data144 d WHERE d.dyn11371294 = :dyn11371294"),
    @NamedQuery(name = "Data144.findByDyn11371295", query = "SELECT d FROM Data144 d WHERE d.dyn11371295 = :dyn11371295"),
    @NamedQuery(name = "Data144.findByDyn11381290", query = "SELECT d FROM Data144 d WHERE d.dyn11381290 = :dyn11381290"),
    @NamedQuery(name = "Data144.findByDyn11381291", query = "SELECT d FROM Data144 d WHERE d.dyn11381291 = :dyn11381291"),
    @NamedQuery(name = "Data144.findByDyn11381292", query = "SELECT d FROM Data144 d WHERE d.dyn11381292 = :dyn11381292"),
    @NamedQuery(name = "Data144.findByDyn11381293", query = "SELECT d FROM Data144 d WHERE d.dyn11381293 = :dyn11381293"),
    @NamedQuery(name = "Data144.findByDyn11381294", query = "SELECT d FROM Data144 d WHERE d.dyn11381294 = :dyn11381294"),
    @NamedQuery(name = "Data144.findByDyn11381295", query = "SELECT d FROM Data144 d WHERE d.dyn11381295 = :dyn11381295"),
    @NamedQuery(name = "Data144.findByDyn11391290", query = "SELECT d FROM Data144 d WHERE d.dyn11391290 = :dyn11391290"),
    @NamedQuery(name = "Data144.findByDyn11391291", query = "SELECT d FROM Data144 d WHERE d.dyn11391291 = :dyn11391291"),
    @NamedQuery(name = "Data144.findByDyn11391292", query = "SELECT d FROM Data144 d WHERE d.dyn11391292 = :dyn11391292"),
    @NamedQuery(name = "Data144.findByDyn11391293", query = "SELECT d FROM Data144 d WHERE d.dyn11391293 = :dyn11391293"),
    @NamedQuery(name = "Data144.findByDyn11391294", query = "SELECT d FROM Data144 d WHERE d.dyn11391294 = :dyn11391294"),
    @NamedQuery(name = "Data144.findByDyn11391295", query = "SELECT d FROM Data144 d WHERE d.dyn11391295 = :dyn11391295"),
    @NamedQuery(name = "Data144.findByKommentarij", query = "SELECT d FROM Data144 d WHERE d.kommentarij = :kommentarij"),
    @NamedQuery(name = "Data144.findByLaboratoriq", query = "SELECT d FROM Data144 d WHERE d.laboratoriq = :laboratoriq"),
    @NamedQuery(name = "Data144.findByVrahLaborant", query = "SELECT d FROM Data144 d WHERE d.vrahLaborant = :vrahLaborant"),
    @NamedQuery(name = "Data144.findByRegistrator", query = "SELECT d FROM Data144 d WHERE d.registrator = :registrator"),
    @NamedQuery(name = "Data144.findByOtpravitNapohtu", query = "SELECT d FROM Data144 d WHERE d.otpravitNapohtu = :otpravitNapohtu"),
    @NamedQuery(name = "Data144.findByKrnCreateDate", query = "SELECT d FROM Data144 d WHERE d.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Data144.findByKrnCreateUserId", query = "SELECT d FROM Data144 d WHERE d.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Data144.findByKrnModifyDate", query = "SELECT d FROM Data144 d WHERE d.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Data144.findByKrnModifyUserId", query = "SELECT d FROM Data144 d WHERE d.krnModifyUserId = :krnModifyUserId")})
public class Data144 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA144_ID")
    private Integer data144Id;
    @Column(name = "PATIENTS_ID")
    private Integer patientsId;
    @Column(name = "DATE_CONSULTATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateConsultation;
    @Column(name = "MOTCONSU_ID")
    private Integer motconsuId;
    @Size(max = 19)
    @Column(name = "F_HEK")
    private String fHek;
    @Size(max = 11)
    @Column(name = "GARDNARELL_CER")
    private String gardnarellCer;
    @Size(max = 11)
    @Column(name = "GARDNARELL_VAG")
    private String gardnarellVag;
    @Size(max = 11)
    @Column(name = "GARDNARELL")
    private String gardnarell;
    @Size(max = 5)
    @Column(name = "DROGGI_FL")
    private String droggiFl;
    @Size(max = 5)
    @Column(name = "DROGGI_CER")
    private String droggiCer;
    @Size(max = 49)
    @Column(name = "DROGGI")
    private String droggi;
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
    @Column(name = "DYN_1136_1290")
    private String dyn11361290;
    @Size(max = 102)
    @Column(name = "DYN_1136_1291")
    private String dyn11361291;
    @Size(max = 102)
    @Column(name = "DYN_1136_1292")
    private String dyn11361292;
    @Size(max = 102)
    @Column(name = "DYN_1136_1293")
    private String dyn11361293;
    @Size(max = 102)
    @Column(name = "DYN_1136_1294")
    private String dyn11361294;
    @Size(max = 102)
    @Column(name = "DYN_1136_1295")
    private String dyn11361295;
    @Size(max = 102)
    @Column(name = "DYN_1137_1290")
    private String dyn11371290;
    @Size(max = 102)
    @Column(name = "DYN_1137_1291")
    private String dyn11371291;
    @Size(max = 102)
    @Column(name = "DYN_1137_1292")
    private String dyn11371292;
    @Size(max = 102)
    @Column(name = "DYN_1137_1293")
    private String dyn11371293;
    @Size(max = 102)
    @Column(name = "DYN_1137_1294")
    private String dyn11371294;
    @Size(max = 102)
    @Column(name = "DYN_1137_1295")
    private String dyn11371295;
    @Size(max = 102)
    @Column(name = "DYN_1138_1290")
    private String dyn11381290;
    @Size(max = 102)
    @Column(name = "DYN_1138_1291")
    private String dyn11381291;
    @Size(max = 102)
    @Column(name = "DYN_1138_1292")
    private String dyn11381292;
    @Size(max = 102)
    @Column(name = "DYN_1138_1293")
    private String dyn11381293;
    @Size(max = 102)
    @Column(name = "DYN_1138_1294")
    private String dyn11381294;
    @Size(max = 102)
    @Column(name = "DYN_1138_1295")
    private String dyn11381295;
    @Size(max = 102)
    @Column(name = "DYN_1139_1290")
    private String dyn11391290;
    @Size(max = 102)
    @Column(name = "DYN_1139_1291")
    private String dyn11391291;
    @Size(max = 102)
    @Column(name = "DYN_1139_1292")
    private String dyn11391292;
    @Size(max = 102)
    @Column(name = "DYN_1139_1293")
    private String dyn11391293;
    @Size(max = 102)
    @Column(name = "DYN_1139_1294")
    private String dyn11391294;
    @Size(max = 102)
    @Column(name = "DYN_1139_1295")
    private String dyn11391295;
    @Size(max = 149)
    @Column(name = "KOMMENTARIJ")
    private String kommentarij;
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
    @Lob
    @Column(name = "DYN_STR")
    private byte[] dynStr;
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

    public Data144() {
    }

    public Data144(Integer data144Id) {
        this.data144Id = data144Id;
    }

    public Integer getData144Id() {
        return data144Id;
    }

    public void setData144Id(Integer data144Id) {
        this.data144Id = data144Id;
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

    public String getFHek() {
        return fHek;
    }

    public void setFHek(String fHek) {
        this.fHek = fHek;
    }

    public String getGardnarellCer() {
        return gardnarellCer;
    }

    public void setGardnarellCer(String gardnarellCer) {
        this.gardnarellCer = gardnarellCer;
    }

    public String getGardnarellVag() {
        return gardnarellVag;
    }

    public void setGardnarellVag(String gardnarellVag) {
        this.gardnarellVag = gardnarellVag;
    }

    public String getGardnarell() {
        return gardnarell;
    }

    public void setGardnarell(String gardnarell) {
        this.gardnarell = gardnarell;
    }

    public String getDroggiFl() {
        return droggiFl;
    }

    public void setDroggiFl(String droggiFl) {
        this.droggiFl = droggiFl;
    }

    public String getDroggiCer() {
        return droggiCer;
    }

    public void setDroggiCer(String droggiCer) {
        this.droggiCer = droggiCer;
    }

    public String getDroggi() {
        return droggi;
    }

    public void setDroggi(String droggi) {
        this.droggi = droggi;
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

    public String getDyn11361290() {
        return dyn11361290;
    }

    public void setDyn11361290(String dyn11361290) {
        this.dyn11361290 = dyn11361290;
    }

    public String getDyn11361291() {
        return dyn11361291;
    }

    public void setDyn11361291(String dyn11361291) {
        this.dyn11361291 = dyn11361291;
    }

    public String getDyn11361292() {
        return dyn11361292;
    }

    public void setDyn11361292(String dyn11361292) {
        this.dyn11361292 = dyn11361292;
    }

    public String getDyn11361293() {
        return dyn11361293;
    }

    public void setDyn11361293(String dyn11361293) {
        this.dyn11361293 = dyn11361293;
    }

    public String getDyn11361294() {
        return dyn11361294;
    }

    public void setDyn11361294(String dyn11361294) {
        this.dyn11361294 = dyn11361294;
    }

    public String getDyn11361295() {
        return dyn11361295;
    }

    public void setDyn11361295(String dyn11361295) {
        this.dyn11361295 = dyn11361295;
    }

    public String getDyn11371290() {
        return dyn11371290;
    }

    public void setDyn11371290(String dyn11371290) {
        this.dyn11371290 = dyn11371290;
    }

    public String getDyn11371291() {
        return dyn11371291;
    }

    public void setDyn11371291(String dyn11371291) {
        this.dyn11371291 = dyn11371291;
    }

    public String getDyn11371292() {
        return dyn11371292;
    }

    public void setDyn11371292(String dyn11371292) {
        this.dyn11371292 = dyn11371292;
    }

    public String getDyn11371293() {
        return dyn11371293;
    }

    public void setDyn11371293(String dyn11371293) {
        this.dyn11371293 = dyn11371293;
    }

    public String getDyn11371294() {
        return dyn11371294;
    }

    public void setDyn11371294(String dyn11371294) {
        this.dyn11371294 = dyn11371294;
    }

    public String getDyn11371295() {
        return dyn11371295;
    }

    public void setDyn11371295(String dyn11371295) {
        this.dyn11371295 = dyn11371295;
    }

    public String getDyn11381290() {
        return dyn11381290;
    }

    public void setDyn11381290(String dyn11381290) {
        this.dyn11381290 = dyn11381290;
    }

    public String getDyn11381291() {
        return dyn11381291;
    }

    public void setDyn11381291(String dyn11381291) {
        this.dyn11381291 = dyn11381291;
    }

    public String getDyn11381292() {
        return dyn11381292;
    }

    public void setDyn11381292(String dyn11381292) {
        this.dyn11381292 = dyn11381292;
    }

    public String getDyn11381293() {
        return dyn11381293;
    }

    public void setDyn11381293(String dyn11381293) {
        this.dyn11381293 = dyn11381293;
    }

    public String getDyn11381294() {
        return dyn11381294;
    }

    public void setDyn11381294(String dyn11381294) {
        this.dyn11381294 = dyn11381294;
    }

    public String getDyn11381295() {
        return dyn11381295;
    }

    public void setDyn11381295(String dyn11381295) {
        this.dyn11381295 = dyn11381295;
    }

    public String getDyn11391290() {
        return dyn11391290;
    }

    public void setDyn11391290(String dyn11391290) {
        this.dyn11391290 = dyn11391290;
    }

    public String getDyn11391291() {
        return dyn11391291;
    }

    public void setDyn11391291(String dyn11391291) {
        this.dyn11391291 = dyn11391291;
    }

    public String getDyn11391292() {
        return dyn11391292;
    }

    public void setDyn11391292(String dyn11391292) {
        this.dyn11391292 = dyn11391292;
    }

    public String getDyn11391293() {
        return dyn11391293;
    }

    public void setDyn11391293(String dyn11391293) {
        this.dyn11391293 = dyn11391293;
    }

    public String getDyn11391294() {
        return dyn11391294;
    }

    public void setDyn11391294(String dyn11391294) {
        this.dyn11391294 = dyn11391294;
    }

    public String getDyn11391295() {
        return dyn11391295;
    }

    public void setDyn11391295(String dyn11391295) {
        this.dyn11391295 = dyn11391295;
    }

    public String getKommentarij() {
        return kommentarij;
    }

    public void setKommentarij(String kommentarij) {
        this.kommentarij = kommentarij;
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

    public byte[] getDynStr() {
        return dynStr;
    }

    public void setDynStr(byte[] dynStr) {
        this.dynStr = dynStr;
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
        hash += (data144Id != null ? data144Id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data144)) {
            return false;
        }
        Data144 other = (Data144) object;
        if ((this.data144Id == null && other.data144Id != null) || (this.data144Id != null && !this.data144Id.equals(other.data144Id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.Data144[ data144Id=" + data144Id + " ]";
    }
    
}
