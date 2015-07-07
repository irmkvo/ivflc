/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Shah
 */
@Entity
@Table(name = "METATABLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Metatable.findAll", query = "SELECT m FROM Metatable m"),
    @NamedQuery(name = "Metatable.findByTableName", query = "SELECT m FROM Metatable m WHERE m.tableName = :tableName"),
    @NamedQuery(name = "Metatable.findByKeyFields", query = "SELECT m FROM Metatable m WHERE m.keyFields = :keyFields"),
    @NamedQuery(name = "Metatable.findBySystem", query = "SELECT m FROM Metatable m WHERE m.system = :system"),
    @NamedQuery(name = "Metatable.findByOwnerName", query = "SELECT m FROM Metatable m WHERE m.ownerName = :ownerName"),
    @NamedQuery(name = "Metatable.findByRepl", query = "SELECT m FROM Metatable m WHERE m.repl = :repl"),
    @NamedQuery(name = "Metatable.findByBaseTable", query = "SELECT m FROM Metatable m WHERE m.baseTable = :baseTable"),
    @NamedQuery(name = "Metatable.findByObjectKind", query = "SELECT m FROM Metatable m WHERE m.objectKind = :objectKind"),
    @NamedQuery(name = "Metatable.findByIslookup", query = "SELECT m FROM Metatable m WHERE m.islookup = :islookup"),
    @NamedQuery(name = "Metatable.findByTraceLog", query = "SELECT m FROM Metatable m WHERE m.traceLog = :traceLog")})
public class Metatable implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "TABLE_NAME")
    private String tableName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "KEY_FIELDS")
    private String keyFields;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SYSTEM")
    private boolean system;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "CUSTOM")
    private String custom;
    @Size(max = 30)
    @Column(name = "OWNER_NAME")
    private String ownerName;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "INSERT_HEAD")
    private String insertHead;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "INSERT_BODY")
    private String insertBody;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "UPDATE_HEAD")
    private String updateHead;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "UPDATE_BODY")
    private String updateBody;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "DELETE_HEAD")
    private String deleteHead;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "DELETE_BODY")
    private String deleteBody;
    @Column(name = "REPL")
    private Boolean repl;
    @Size(max = 30)
    @Column(name = "BASE_TABLE")
    private String baseTable;
    @Size(max = 1)
    @Column(name = "OBJECT_KIND")
    private String objectKind;
    @Column(name = "ISLOOKUP")
    private Integer islookup;
    @Size(max = 1)
    @Column(name = "TRACE_LOG")
    private String traceLog;

    public Metatable() {
    }

    public Metatable(String tableName) {
        this.tableName = tableName;
    }

    public Metatable(String tableName, String keyFields, boolean system) {
        this.tableName = tableName;
        this.keyFields = keyFields;
        this.system = system;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getKeyFields() {
        return keyFields;
    }

    public void setKeyFields(String keyFields) {
        this.keyFields = keyFields;
    }

    public boolean getSystem() {
        return system;
    }

    public void setSystem(boolean system) {
        this.system = system;
    }

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getInsertHead() {
        return insertHead;
    }

    public void setInsertHead(String insertHead) {
        this.insertHead = insertHead;
    }

    public String getInsertBody() {
        return insertBody;
    }

    public void setInsertBody(String insertBody) {
        this.insertBody = insertBody;
    }

    public String getUpdateHead() {
        return updateHead;
    }

    public void setUpdateHead(String updateHead) {
        this.updateHead = updateHead;
    }

    public String getUpdateBody() {
        return updateBody;
    }

    public void setUpdateBody(String updateBody) {
        this.updateBody = updateBody;
    }

    public String getDeleteHead() {
        return deleteHead;
    }

    public void setDeleteHead(String deleteHead) {
        this.deleteHead = deleteHead;
    }

    public String getDeleteBody() {
        return deleteBody;
    }

    public void setDeleteBody(String deleteBody) {
        this.deleteBody = deleteBody;
    }

    public Boolean getRepl() {
        return repl;
    }

    public void setRepl(Boolean repl) {
        this.repl = repl;
    }

    public String getBaseTable() {
        return baseTable;
    }

    public void setBaseTable(String baseTable) {
        this.baseTable = baseTable;
    }

    public String getObjectKind() {
        return objectKind;
    }

    public void setObjectKind(String objectKind) {
        this.objectKind = objectKind;
    }

    public Integer getIslookup() {
        return islookup;
    }

    public void setIslookup(Integer islookup) {
        this.islookup = islookup;
    }

    public String getTraceLog() {
        return traceLog;
    }

    public void setTraceLog(String traceLog) {
        this.traceLog = traceLog;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tableName != null ? tableName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Metatable)) {
            return false;
        }
        Metatable other = (Metatable) object;
        if ((this.tableName == null && other.tableName != null) || (this.tableName != null && !this.tableName.equals(other.tableName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Metatable[ tableName=" + tableName + " ]";
    }
    
}
