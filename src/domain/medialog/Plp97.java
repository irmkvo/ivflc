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
@Table(name = "PLP97")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Plp97.findAll", query = "SELECT p FROM Plp97 p"),
    @NamedQuery(name = "Plp97.findByPlp97Id", query = "SELECT p FROM Plp97 p WHERE p.plp97Id = :plp97Id"),
    @NamedQuery(name = "Plp97.findByParent", query = "SELECT p FROM Plp97 p WHERE p.parent = :parent"),
    @NamedQuery(name = "Plp97.findByLevel1", query = "SELECT p FROM Plp97 p WHERE p.level1 = :level1"),
    @NamedQuery(name = "Plp97.findByLevel2", query = "SELECT p FROM Plp97 p WHERE p.level2 = :level2"),
    @NamedQuery(name = "Plp97.findByLevel3", query = "SELECT p FROM Plp97 p WHERE p.level3 = :level3"),
    @NamedQuery(name = "Plp97.findByLevel4", query = "SELECT p FROM Plp97 p WHERE p.level4 = :level4"),
    @NamedQuery(name = "Plp97.findByLevel5", query = "SELECT p FROM Plp97 p WHERE p.level5 = :level5"),
    @NamedQuery(name = "Plp97.findByLevel6", query = "SELECT p FROM Plp97 p WHERE p.level6 = :level6"),
    @NamedQuery(name = "Plp97.findByLevel7", query = "SELECT p FROM Plp97 p WHERE p.level7 = :level7"),
    @NamedQuery(name = "Plp97.findByLevel8", query = "SELECT p FROM Plp97 p WHERE p.level8 = :level8"),
    @NamedQuery(name = "Plp97.findByCode", query = "SELECT p FROM Plp97 p WHERE p.code = :code"),
    @NamedQuery(name = "Plp97.findByDescription", query = "SELECT p FROM Plp97 p WHERE p.description = :description"),
    @NamedQuery(name = "Plp97.findByKrnCreateDate", query = "SELECT p FROM Plp97 p WHERE p.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "Plp97.findByKrnCreateUserId", query = "SELECT p FROM Plp97 p WHERE p.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "Plp97.findByKrnModifyDate", query = "SELECT p FROM Plp97 p WHERE p.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "Plp97.findByKrnModifyUserId", query = "SELECT p FROM Plp97 p WHERE p.krnModifyUserId = :krnModifyUserId")})
public class Plp97 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PLP97_ID")
    private Integer plp97Id;
    @Column(name = "PARENT")
    private Integer parent;
    @Column(name = "LEVEL1")
    private Integer level1;
    @Column(name = "LEVEL2")
    private Integer level2;
    @Column(name = "LEVEL3")
    private Integer level3;
    @Column(name = "LEVEL4")
    private Integer level4;
    @Column(name = "LEVEL5")
    private Integer level5;
    @Column(name = "LEVEL6")
    private Integer level6;
    @Column(name = "LEVEL7")
    private Integer level7;
    @Column(name = "LEVEL8")
    private Integer level8;
    @Size(max = 32)
    @Column(name = "CODE")
    private String code;
    @Size(max = 255)
    @Column(name = "DESCRIPTION")
    private String description;
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

    public Plp97() {
    }

    public Plp97(Integer plp97Id) {
        this.plp97Id = plp97Id;
    }

    public Integer getPlp97Id() {
        return plp97Id;
    }

    public void setPlp97Id(Integer plp97Id) {
        this.plp97Id = plp97Id;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Integer getLevel1() {
        return level1;
    }

    public void setLevel1(Integer level1) {
        this.level1 = level1;
    }

    public Integer getLevel2() {
        return level2;
    }

    public void setLevel2(Integer level2) {
        this.level2 = level2;
    }

    public Integer getLevel3() {
        return level3;
    }

    public void setLevel3(Integer level3) {
        this.level3 = level3;
    }

    public Integer getLevel4() {
        return level4;
    }

    public void setLevel4(Integer level4) {
        this.level4 = level4;
    }

    public Integer getLevel5() {
        return level5;
    }

    public void setLevel5(Integer level5) {
        this.level5 = level5;
    }

    public Integer getLevel6() {
        return level6;
    }

    public void setLevel6(Integer level6) {
        this.level6 = level6;
    }

    public Integer getLevel7() {
        return level7;
    }

    public void setLevel7(Integer level7) {
        this.level7 = level7;
    }

    public Integer getLevel8() {
        return level8;
    }

    public void setLevel8(Integer level8) {
        this.level8 = level8;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        hash += (plp97Id != null ? plp97Id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Plp97)) {
            return false;
        }
        Plp97 other = (Plp97) object;
        if ((this.plp97Id == null && other.plp97Id != null) || (this.plp97Id != null && !this.plp97Id.equals(other.plp97Id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.medialog.Plp97[ plp97Id=" + plp97Id + " ]";
    }
    
}
