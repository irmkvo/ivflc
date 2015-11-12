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
@Table(name = "PL_PARAM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlParam.findAll", query = "SELECT p FROM PlParam p"),
    @NamedQuery(name = "PlParam.findByPlParamId", query = "SELECT p FROM PlParam p WHERE p.plParamId = :plParamId"),
    @NamedQuery(name = "PlParam.findByNom", query = "SELECT p FROM PlParam p WHERE p.nom = :nom"),
    @NamedQuery(name = "PlParam.findByDebutTranche", query = "SELECT p FROM PlParam p WHERE p.debutTranche = :debutTranche"),
    @NamedQuery(name = "PlParam.findByFinTranche", query = "SELECT p FROM PlParam p WHERE p.finTranche = :finTranche"),
    @NamedQuery(name = "PlParam.findByDureeTranche", query = "SELECT p FROM PlParam p WHERE p.dureeTranche = :dureeTranche"),
    @NamedQuery(name = "PlParam.findByShowWorkdays", query = "SELECT p FROM PlParam p WHERE p.showWorkdays = :showWorkdays"),
    @NamedQuery(name = "PlParam.findByShowPlace", query = "SELECT p FROM PlParam p WHERE p.showPlace = :showPlace"),
    @NamedQuery(name = "PlParam.findByTuneManual", query = "SELECT p FROM PlParam p WHERE p.tuneManual = :tuneManual"),
    @NamedQuery(name = "PlParam.findByTitleVertical", query = "SELECT p FROM PlParam p WHERE p.titleVertical = :titleVertical"),
    @NamedQuery(name = "PlParam.findByTitleMinwidth", query = "SELECT p FROM PlParam p WHERE p.titleMinwidth = :titleMinwidth"),
    @NamedQuery(name = "PlParam.findByTitleHeight", query = "SELECT p FROM PlParam p WHERE p.titleHeight = :titleHeight"),
    @NamedQuery(name = "PlParam.findByFmIntorgId", query = "SELECT p FROM PlParam p WHERE p.fmIntorgId = :fmIntorgId"),
    @NamedQuery(name = "PlParam.findByKrnCreateDate", query = "SELECT p FROM PlParam p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "PlParam.findByKrnCreateUserId", query = "SELECT p FROM PlParam p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "PlParam.findByKrnModifyDate", query = "SELECT p FROM PlParam p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "PlParam.findByKrnModifyUserId", query = "SELECT p FROM PlParam p WHERE p.krnModifyUserId = :krnModifyUserId")})
public class PlParam implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PL_PARAM_ID")
    private Integer plParamId;
    @Size(max = 100)
    @Column(name = "NOM")
    private String nom;
    @Column(name = "DEBUT_TRANCHE")
    private Integer debutTranche;
    @Column(name = "FIN_TRANCHE")
    private Integer finTranche;
    @Column(name = "DUREE_TRANCHE")
    private Integer dureeTranche;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "MEDECIN_IDS")
    private String medecinIds;
    @Column(name = "SHOW_WORKDAYS")
    private Boolean showWorkdays;
    @Column(name = "SHOW_PLACE")
    private Boolean showPlace;
    @Column(name = "TUNE_MANUAL")
    private Boolean tuneManual;
    @Column(name = "TITLE_VERTICAL")
    private Boolean titleVertical;
    @Column(name = "TITLE_MINWIDTH")
    private Integer titleMinwidth;
    @Column(name = "TITLE_HEIGHT")
    private Integer titleHeight;
    @Column(name = "FM_INTORG_ID")
    private Integer fmIntorgId;
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

    public PlParam() {
    }

    public PlParam(Integer plParamId) {
        this.plParamId = plParamId;
    }

    public Integer getPlParamId() {
        return plParamId;
    }

    public void setPlParamId(Integer plParamId) {
        this.plParamId = plParamId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getDebutTranche() {
        return debutTranche;
    }

    public void setDebutTranche(Integer debutTranche) {
        this.debutTranche = debutTranche;
    }

    public Integer getFinTranche() {
        return finTranche;
    }

    public void setFinTranche(Integer finTranche) {
        this.finTranche = finTranche;
    }

    public Integer getDureeTranche() {
        return dureeTranche;
    }

    public void setDureeTranche(Integer dureeTranche) {
        this.dureeTranche = dureeTranche;
    }

    public String getMedecinIds() {
        return medecinIds;
    }

    public void setMedecinIds(String medecinIds) {
        this.medecinIds = medecinIds;
    }

    public Boolean getShowWorkdays() {
        return showWorkdays;
    }

    public void setShowWorkdays(Boolean showWorkdays) {
        this.showWorkdays = showWorkdays;
    }

    public Boolean getShowPlace() {
        return showPlace;
    }

    public void setShowPlace(Boolean showPlace) {
        this.showPlace = showPlace;
    }

    public Boolean getTuneManual() {
        return tuneManual;
    }

    public void setTuneManual(Boolean tuneManual) {
        this.tuneManual = tuneManual;
    }

    public Boolean getTitleVertical() {
        return titleVertical;
    }

    public void setTitleVertical(Boolean titleVertical) {
        this.titleVertical = titleVertical;
    }

    public Integer getTitleMinwidth() {
        return titleMinwidth;
    }

    public void setTitleMinwidth(Integer titleMinwidth) {
        this.titleMinwidth = titleMinwidth;
    }

    public Integer getTitleHeight() {
        return titleHeight;
    }

    public void setTitleHeight(Integer titleHeight) {
        this.titleHeight = titleHeight;
    }

    public Integer getFmIntorgId() {
        return fmIntorgId;
    }

    public void setFmIntorgId(Integer fmIntorgId) {
        this.fmIntorgId = fmIntorgId;
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
        hash += (plParamId != null ? plParamId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlParam)) {
            return false;
        }
        PlParam other = (PlParam) object;
        if ((this.plParamId == null && other.plParamId != null) || (this.plParamId != null && !this.plParamId.equals(other.plParamId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.PlParam[ plParamId=" + plParamId + " ]";
    }
    
}
