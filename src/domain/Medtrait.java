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
@Table(name = "MEDTRAIT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medtrait.findAll", query = "SELECT m FROM Medtrait m"),
    @NamedQuery(name = "Medtrait.findByMedtraitId", query = "SELECT m FROM Medtrait m WHERE m.medtraitId = :medtraitId"),
    @NamedQuery(name = "Medtrait.findByNom", query = "SELECT m FROM Medtrait m WHERE m.nom = :nom"),
    @NamedQuery(name = "Medtrait.findByPrenom", query = "SELECT m FROM Medtrait m WHERE m.prenom = :prenom"),
    @NamedQuery(name = "Medtrait.findBySpecialisation", query = "SELECT m FROM Medtrait m WHERE m.specialisation = :specialisation"),
    @NamedQuery(name = "Medtrait.findByCp", query = "SELECT m FROM Medtrait m WHERE m.cp = :cp"),
    @NamedQuery(name = "Medtrait.findByVille", query = "SELECT m FROM Medtrait m WHERE m.ville = :ville"),
    @NamedQuery(name = "Medtrait.findByPays", query = "SELECT m FROM Medtrait m WHERE m.pays = :pays"),
    @NamedQuery(name = "Medtrait.findByTel", query = "SELECT m FROM Medtrait m WHERE m.tel = :tel"),
    @NamedQuery(name = "Medtrait.findByFax", query = "SELECT m FROM Medtrait m WHERE m.fax = :fax"),
    @NamedQuery(name = "Medtrait.findByTelportable", query = "SELECT m FROM Medtrait m WHERE m.telportable = :telportable"),
    @NamedQuery(name = "Medtrait.findByTelbureau", query = "SELECT m FROM Medtrait m WHERE m.telbureau = :telbureau"),
    @NamedQuery(name = "Medtrait.findByEmail", query = "SELECT m FROM Medtrait m WHERE m.email = :email"),
    @NamedQuery(name = "Medtrait.findByTitre", query = "SELECT m FROM Medtrait m WHERE m.titre = :titre"),
    @NamedQuery(name = "Medtrait.findByTelsecr", query = "SELECT m FROM Medtrait m WHERE m.telsecr = :telsecr"),
    @NamedQuery(name = "Medtrait.findByFmOrgId", query = "SELECT m FROM Medtrait m WHERE m.fmOrgId = :fmOrgId"),
    @NamedQuery(name = "Medtrait.findByKrnCreateDate", query = "SELECT m FROM Medtrait m WHERE m.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Medtrait.findByKrnCreateUserId", query = "SELECT m FROM Medtrait m WHERE m.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Medtrait.findByKrnModifyDate", query = "SELECT m FROM Medtrait m WHERE m.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Medtrait.findByKrnModifyUserId", query = "SELECT m FROM Medtrait m WHERE m.krnModifyUserId = :krnModifyUserId")})
public class Medtrait implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MEDTRAIT_ID")
    private Integer medtraitId;
    @Size(max = 100)
    @Column(name = "NOM")
    private String nom;
    @Size(max = 100)
    @Column(name = "PRENOM")
    private String prenom;
    @Size(max = 100)
    @Column(name = "SPECIALISATION")
    private String specialisation;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "ADRESSE")
    private String adresse;
    @Size(max = 10)
    @Column(name = "CP")
    private String cp;
    @Size(max = 100)
    @Column(name = "VILLE")
    private String ville;
    @Size(max = 50)
    @Column(name = "PAYS")
    private String pays;
    @Size(max = 50)
    @Column(name = "TEL")
    private String tel;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Недопустимый формат номера телефона/факса (должен иметь формат xxx-xxx-xxxx)")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "FAX")
    private String fax;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "COMMENTAIRE")
    private String commentaire;
    @Size(max = 50)
    @Column(name = "TELPORTABLE")
    private String telportable;
    @Size(max = 50)
    @Column(name = "TELBUREAU")
    private String telbureau;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Недопустимый адрес электронной почты")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 40)
    @Column(name = "TITRE")
    private String titre;
    @Size(max = 50)
    @Column(name = "TELSECR")
    private String telsecr;
    @Column(name = "FM_ORG_ID")
    private Integer fmOrgId;
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

    public Medtrait() {
    }

    public Medtrait(Integer medtraitId) {
        this.medtraitId = medtraitId;
    }

    public Integer getMedtraitId() {
        return medtraitId;
    }

    public void setMedtraitId(Integer medtraitId) {
        this.medtraitId = medtraitId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getTelportable() {
        return telportable;
    }

    public void setTelportable(String telportable) {
        this.telportable = telportable;
    }

    public String getTelbureau() {
        return telbureau;
    }

    public void setTelbureau(String telbureau) {
        this.telbureau = telbureau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTelsecr() {
        return telsecr;
    }

    public void setTelsecr(String telsecr) {
        this.telsecr = telsecr;
    }

    public Integer getFmOrgId() {
        return fmOrgId;
    }

    public void setFmOrgId(Integer fmOrgId) {
        this.fmOrgId = fmOrgId;
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
        hash += (medtraitId != null ? medtraitId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medtrait)) {
            return false;
        }
        Medtrait other = (Medtrait) object;
        if ((this.medtraitId == null && other.medtraitId != null) || (this.medtraitId != null && !this.medtraitId.equals(other.medtraitId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Medtrait[ medtraitId=" + medtraitId + " ]";
    }
    
}
