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
 * Спермограмма FISH
 * @author kvo
 */
@Entity
@Table(name = "DATA364")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Data364.findAll", query = "SELECT d FROM Data364 d"),
    @NamedQuery(name = "Data364.findByData364Id", query = "SELECT d FROM Data364 d WHERE d.data364Id = :data364Id"),
    @NamedQuery(name = "Data364.findByPatientsId", query = "SELECT d FROM Data364 d WHERE d.patientsId = :patientsId"),
    @NamedQuery(name = "Data364.findByDateConsultation", query = "SELECT d FROM Data364 d WHERE d.dateConsultation = :dateConsultation"),
    @NamedQuery(name = "Data364.findByMotconsuId", query = "SELECT d FROM Data364 d WHERE d.motconsuId = :motconsuId"),
    @NamedQuery(name = "Data364.findByNomerAnaliza", query = "SELECT d FROM Data364 d WHERE d.nomerAnaliza = :nomerAnaliza"),
    @NamedQuery(name = "Data364.findByObhpqAneuplodiq", query = "SELECT d FROM Data364 d WHERE d.obhpqAneuplodiq = :obhpqAneuplodiq"),
    @NamedQuery(name = "Data364.findByObhpqAneuplodiqAutosom", query = "SELECT d FROM Data364 d WHERE d.obhpqAneuplodiqAutosom = :obhpqAneuplodiqAutosom"),
    @NamedQuery(name = "Data364.findByObhaqAneuplodiqPoXy", query = "SELECT d FROM Data364 d WHERE d.obhaqAneuplodiqPoXy = :obhaqAneuplodiqPoXy"),
    @NamedQuery(name = "Data364.findByXyNulSomiq", query = "SELECT d FROM Data364 d WHERE d.xyNulSomiq = :xyNulSomiq"),
    @NamedQuery(name = "Data364.findByYy", query = "SELECT d FROM Data364 d WHERE d.yy = :yy"),
    @NamedQuery(name = "Data364.findByXx", query = "SELECT d FROM Data364 d WHERE d.xx = :xx"),
    @NamedQuery(name = "Data364.findByXy", query = "SELECT d FROM Data364 d WHERE d.xy = :xy"),
    @NamedQuery(name = "Data364.findByNormaVsego", query = "SELECT d FROM Data364 d WHERE d.normaVsego = :normaVsego"),
    @NamedQuery(name = "Data364.findByDiagnozSperm", query = "SELECT d FROM Data364 d WHERE d.diagnozSperm = :diagnozSperm"),
    @NamedQuery(name = "Data364.findByKoncentraciq", query = "SELECT d FROM Data364 d WHERE d.koncentraciq = :koncentraciq"),
    @NamedQuery(name = "Data364.findByPokazateliSpermogramm", query = "SELECT d FROM Data364 d WHERE d.pokazateliSpermogramm = :pokazateliSpermogramm"),
    @NamedQuery(name = "Data364.findByGenetik", query = "SELECT d FROM Data364 d WHERE d.genetik = :genetik"),
    @NamedQuery(name = "Data364.findByZaklyhenie", query = "SELECT d FROM Data364 d WHERE d.zaklyhenie = :zaklyhenie"),
    @NamedQuery(name = "Data364.findByVariantAnaliza", query = "SELECT d FROM Data364 d WHERE d.variantAnaliza = :variantAnaliza"),
    @NamedQuery(name = "Data364.findByIssleduemJMaterial", query = "SELECT d FROM Data364 d WHERE d.issleduemJMaterial = :issleduemJMaterial"),
    @NamedQuery(name = "Data364.findByDataZaboraMateriala", query = "SELECT d FROM Data364 d WHERE d.dataZaboraMateriala = :dataZaboraMateriala"),
    @NamedQuery(name = "Data364.findByDataVDahiAnaliza", query = "SELECT d FROM Data364 d WHERE d.dataVDahiAnaliza = :dataVDahiAnaliza"),
    @NamedQuery(name = "Data364.findByNormaXSpermatozoid", query = "SELECT d FROM Data364 d WHERE d.normaXSpermatozoid = :normaXSpermatozoid"),
    @NamedQuery(name = "Data364.findByNormaYSpermatozoid", query = "SELECT d FROM Data364 d WHERE d.normaYSpermatozoid = :normaYSpermatozoid"),
    @NamedQuery(name = "Data364.findByNormaVsegoy", query = "SELECT d FROM Data364 d WHERE d.normaVsegoy = :normaVsegoy"),
    @NamedQuery(name = "Data364.findByDisomiqAutosom1", query = "SELECT d FROM Data364 d WHERE d.disomiqAutosom1 = :disomiqAutosom1"),
    @NamedQuery(name = "Data364.findByNulSomiqAutosom1", query = "SELECT d FROM Data364 d WHERE d.nulSomiqAutosom1 = :nulSomiqAutosom1"),
    @NamedQuery(name = "Data364.findByStepenDiplodii", query = "SELECT d FROM Data364 d WHERE d.stepenDiplodii = :stepenDiplodii"),
    @NamedQuery(name = "Data364.findByOtpravitNapohtu", query = "SELECT d FROM Data364 d WHERE d.otpravitNapohtu = :otpravitNapohtu"),
    @NamedQuery(name = "Data364.findByKrnCreateDate", query = "SELECT d FROM Data364 d WHERE d.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Data364.findByKrnCreateUserId", query = "SELECT d FROM Data364 d WHERE d.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Data364.findByKrnModifyDate", query = "SELECT d FROM Data364 d WHERE d.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Data364.findByKrnModifyUserId", query = "SELECT d FROM Data364 d WHERE d.krnModifyUserId = :krnModifyUserId")})
public class Data364 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA364_ID")
    private Integer data364Id;
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
    @Size(max = 11)
    @Column(name = "NOMER_ANALIZA")
    private String nomerAnaliza;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "OBHPQ_ANEUPLODIQ")
    private BigDecimal obhpqAneuplodiq;
    @Column(name = "OBHPQ_ANEUPLODIQ_AUTOSOM")
    private BigDecimal obhpqAneuplodiqAutosom;
    @Column(name = "OBHAQ_ANEUPLODIQ_PO_XY")
    private BigDecimal obhaqAneuplodiqPoXy;
    @Column(name = "XY_NUL_SOMIQ")
    private BigDecimal xyNulSomiq;
    @Column(name = "YY")
    private BigDecimal yy;
    @Column(name = "XX")
    private BigDecimal xx;
    @Column(name = "XY")
    private BigDecimal xy;
    @Column(name = "NORMA_VSEGO")
    private BigDecimal normaVsego;
    @Size(max = 27)
    @Column(name = "DIAGNOZ_SPERM")
    private String diagnozSperm;
    @Column(name = "KONCENTRACIQ")
    private BigDecimal koncentraciq;
    @Column(name = "POKAZATELI_SPERMOGRAMM")
    private BigDecimal pokazateliSpermogramm;
    @Size(max = 15)
    @Column(name = "GENETIK")
    private String genetik;
    @Size(max = 79)
    @Column(name = "ZAKLYHENIE")
    private String zaklyhenie;
    @Size(max = 49)
    @Column(name = "VARIANT_ANALIZA")
    private String variantAnaliza;
    @Size(max = 49)
    @Column(name = "ISSLEDUEM_J_MATERIAL")
    private String issleduemJMaterial;
    @Column(name = "DATA_ZABORA_MATERIALA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataZaboraMateriala;
    @Column(name = "DATA_V_DAHI_ANALIZA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataVDahiAnaliza;
    @Column(name = "NORMA_X_SPERMATOZOID")
    private BigDecimal normaXSpermatozoid;
    @Column(name = "NORMA_Y_SPERMATOZOID")
    private BigDecimal normaYSpermatozoid;
    @Column(name = "NORMA_VSEGOY")
    private BigDecimal normaVsegoy;
    @Column(name = "DISOMIQ_AUTOSOM1")
    private BigDecimal disomiqAutosom1;
    @Column(name = "NUL_SOMIQ_AUTOSOM1")
    private BigDecimal nulSomiqAutosom1;
    @Size(max = 5)
    @Column(name = "STEPEN_DIPLODII")
    private String stepenDiplodii;
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

    public Data364() {
    }

    public Data364(Integer data364Id) {
        this.data364Id = data364Id;
    }

    public Data364(Integer data364Id, int patientsId, Date dateConsultation, int motconsuId) {
        this.data364Id = data364Id;
        this.patientsId = patientsId;
        this.dateConsultation = dateConsultation;
        this.motconsuId = motconsuId;
    }

    public Integer getData364Id() {
        return data364Id;
    }

    public void setData364Id(Integer data364Id) {
        this.data364Id = data364Id;
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

    public String getNomerAnaliza() {
        return nomerAnaliza;
    }

    public void setNomerAnaliza(String nomerAnaliza) {
        this.nomerAnaliza = nomerAnaliza;
    }

    public BigDecimal getObhpqAneuplodiq() {
        return obhpqAneuplodiq;
    }

    public void setObhpqAneuplodiq(BigDecimal obhpqAneuplodiq) {
        this.obhpqAneuplodiq = obhpqAneuplodiq;
    }

    public BigDecimal getObhpqAneuplodiqAutosom() {
        return obhpqAneuplodiqAutosom;
    }

    public void setObhpqAneuplodiqAutosom(BigDecimal obhpqAneuplodiqAutosom) {
        this.obhpqAneuplodiqAutosom = obhpqAneuplodiqAutosom;
    }

    public BigDecimal getObhaqAneuplodiqPoXy() {
        return obhaqAneuplodiqPoXy;
    }

    public void setObhaqAneuplodiqPoXy(BigDecimal obhaqAneuplodiqPoXy) {
        this.obhaqAneuplodiqPoXy = obhaqAneuplodiqPoXy;
    }

    public BigDecimal getXyNulSomiq() {
        return xyNulSomiq;
    }

    public void setXyNulSomiq(BigDecimal xyNulSomiq) {
        this.xyNulSomiq = xyNulSomiq;
    }

    public BigDecimal getYy() {
        return yy;
    }

    public void setYy(BigDecimal yy) {
        this.yy = yy;
    }

    public BigDecimal getXx() {
        return xx;
    }

    public void setXx(BigDecimal xx) {
        this.xx = xx;
    }

    public BigDecimal getXy() {
        return xy;
    }

    public void setXy(BigDecimal xy) {
        this.xy = xy;
    }

    public BigDecimal getNormaVsego() {
        return normaVsego;
    }

    public void setNormaVsego(BigDecimal normaVsego) {
        this.normaVsego = normaVsego;
    }

    public String getDiagnozSperm() {
        return diagnozSperm;
    }

    public void setDiagnozSperm(String diagnozSperm) {
        this.diagnozSperm = diagnozSperm;
    }

    public BigDecimal getKoncentraciq() {
        return koncentraciq;
    }

    public void setKoncentraciq(BigDecimal koncentraciq) {
        this.koncentraciq = koncentraciq;
    }

    public BigDecimal getPokazateliSpermogramm() {
        return pokazateliSpermogramm;
    }

    public void setPokazateliSpermogramm(BigDecimal pokazateliSpermogramm) {
        this.pokazateliSpermogramm = pokazateliSpermogramm;
    }

    public String getGenetik() {
        return genetik;
    }

    public void setGenetik(String genetik) {
        this.genetik = genetik;
    }

    public String getZaklyhenie() {
        return zaklyhenie;
    }

    public void setZaklyhenie(String zaklyhenie) {
        this.zaklyhenie = zaklyhenie;
    }

    public String getVariantAnaliza() {
        return variantAnaliza;
    }

    public void setVariantAnaliza(String variantAnaliza) {
        this.variantAnaliza = variantAnaliza;
    }

    public String getIssleduemJMaterial() {
        return issleduemJMaterial;
    }

    public void setIssleduemJMaterial(String issleduemJMaterial) {
        this.issleduemJMaterial = issleduemJMaterial;
    }

    public Date getDataZaboraMateriala() {
        return dataZaboraMateriala;
    }

    public void setDataZaboraMateriala(Date dataZaboraMateriala) {
        this.dataZaboraMateriala = dataZaboraMateriala;
    }

    public Date getDataVDahiAnaliza() {
        return dataVDahiAnaliza;
    }

    public void setDataVDahiAnaliza(Date dataVDahiAnaliza) {
        this.dataVDahiAnaliza = dataVDahiAnaliza;
    }

    public BigDecimal getNormaXSpermatozoid() {
        return normaXSpermatozoid;
    }

    public void setNormaXSpermatozoid(BigDecimal normaXSpermatozoid) {
        this.normaXSpermatozoid = normaXSpermatozoid;
    }

    public BigDecimal getNormaYSpermatozoid() {
        return normaYSpermatozoid;
    }

    public void setNormaYSpermatozoid(BigDecimal normaYSpermatozoid) {
        this.normaYSpermatozoid = normaYSpermatozoid;
    }

    public BigDecimal getNormaVsegoy() {
        return normaVsegoy;
    }

    public void setNormaVsegoy(BigDecimal normaVsegoy) {
        this.normaVsegoy = normaVsegoy;
    }

    public BigDecimal getDisomiqAutosom1() {
        return disomiqAutosom1;
    }

    public void setDisomiqAutosom1(BigDecimal disomiqAutosom1) {
        this.disomiqAutosom1 = disomiqAutosom1;
    }

    public BigDecimal getNulSomiqAutosom1() {
        return nulSomiqAutosom1;
    }

    public void setNulSomiqAutosom1(BigDecimal nulSomiqAutosom1) {
        this.nulSomiqAutosom1 = nulSomiqAutosom1;
    }

    public String getStepenDiplodii() {
        return stepenDiplodii;
    }

    public void setStepenDiplodii(String stepenDiplodii) {
        this.stepenDiplodii = stepenDiplodii;
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
        hash += (data364Id != null ? data364Id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data364)) {
            return false;
        }
        Data364 other = (Data364) object;
        if ((this.data364Id == null && other.data364Id != null) || (this.data364Id != null && !this.data364Id.equals(other.data364Id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.Data364[ data364Id=" + data364Id + " ]";
    }
    
}
