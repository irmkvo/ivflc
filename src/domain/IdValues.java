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
@Table(name = "ID_VALUES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IdValues.findAll", query = "SELECT i FROM IdValues i"),
    @NamedQuery(name = "IdValues.findByKeyName", query = "SELECT i FROM IdValues i WHERE i.keyName = :keyName"),
    @NamedQuery(name = "IdValues.findByLastValue", query = "SELECT i FROM IdValues i WHERE i.lastValue = :lastValue")})
public class IdValues implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "KEY_NAME")
    private String keyName;
    @Column(name = "LAST_VALUE")
    private Integer lastValue;

    public IdValues() {
    }

    public IdValues(String keyName) {
        this.keyName = keyName;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public Integer getLastValue() {
        return lastValue;
    }

    public void setLastValue(Integer lastValue) {
        this.lastValue = lastValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (keyName != null ? keyName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IdValues)) {
            return false;
        }
        IdValues other = (IdValues) object;
        if ((this.keyName == null && other.keyName != null) || (this.keyName != null && !this.keyName.equals(other.keyName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.IdValues[ keyName=" + keyName + " ]";
    }
    
}
