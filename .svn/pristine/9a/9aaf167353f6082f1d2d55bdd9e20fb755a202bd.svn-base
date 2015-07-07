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
@Table(name = "MODEL_TEMPLATES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ModelTemplates.findAll", query = "SELECT m FROM ModelTemplates m"),
    @NamedQuery(name = "ModelTemplates.findByModelTemplatesId", query = "SELECT m FROM ModelTemplates m WHERE m.modelTemplatesId = :modelTemplatesId"),
    @NamedQuery(name = "ModelTemplates.findByModelsId", query = "SELECT m FROM ModelTemplates m WHERE m.modelsId = :modelsId"),
    @NamedQuery(name = "ModelTemplates.findByTemplateId", query = "SELECT m FROM ModelTemplates m WHERE m.templateId = :templateId"),
    @NamedQuery(name = "ModelTemplates.findByLang", query = "SELECT m FROM ModelTemplates m WHERE m.lang = :lang"),
    @NamedQuery(name = "ModelTemplates.findByKrnCreateDate", query = "SELECT m FROM ModelTemplates m WHERE m.krnCreateDate = :krnCreateDate"),
    @NamedQuery(name = "ModelTemplates.findByKrnCreateUserId", query = "SELECT m FROM ModelTemplates m WHERE m.krnCreateUserId = :krnCreateUserId"),
    @NamedQuery(name = "ModelTemplates.findByKrnModifyDate", query = "SELECT m FROM ModelTemplates m WHERE m.krnModifyDate = :krnModifyDate"),
    @NamedQuery(name = "ModelTemplates.findByKrnModifyUserId", query = "SELECT m FROM ModelTemplates m WHERE m.krnModifyUserId = :krnModifyUserId")})
public class ModelTemplates implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MODEL_TEMPLATES_ID")
    private Integer modelTemplatesId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MODELS_ID")
    private int modelsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TEMPLATE_ID")
    private int templateId;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "FORMULE")
    private String formule;
    @Size(max = 80)
    @Column(name = "LANG")
    private String lang;
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

    public ModelTemplates() {
    }

    public ModelTemplates(Integer modelTemplatesId) {
        this.modelTemplatesId = modelTemplatesId;
    }

    public ModelTemplates(Integer modelTemplatesId, int modelsId, int templateId) {
        this.modelTemplatesId = modelTemplatesId;
        this.modelsId = modelsId;
        this.templateId = templateId;
    }

    public Integer getModelTemplatesId() {
        return modelTemplatesId;
    }

    public void setModelTemplatesId(Integer modelTemplatesId) {
        this.modelTemplatesId = modelTemplatesId;
    }

    public int getModelsId() {
        return modelsId;
    }

    public void setModelsId(int modelsId) {
        this.modelsId = modelsId;
    }

    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public String getFormule() {
        return formule;
    }

    public void setFormule(String formule) {
        this.formule = formule;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
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
        hash += (modelTemplatesId != null ? modelTemplatesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModelTemplates)) {
            return false;
        }
        ModelTemplates other = (ModelTemplates) object;
        if ((this.modelTemplatesId == null && other.modelTemplatesId != null) || (this.modelTemplatesId != null && !this.modelTemplatesId.equals(other.modelTemplatesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.ModelTemplates[ modelTemplatesId=" + modelTemplatesId + " ]";
    }
    
}
