/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.postgres;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Shah
 */
@Entity
@Table(name = "Menu")
@XmlRootElement
public class Menu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Menu_id")
    private Integer menuid;
    @Size(max = 255)
    @Column(name = "Menu_title")
    private String menutitle;
    @Size(max = 255)
    @Column(name = "Menu_position")
    private String menuposition;
    @Size(max = 255)
    @Column(name = "Menu_description")
    private String menudescription;
    @OneToMany(mappedBy = "menu", fetch = FetchType.LAZY)
    private List<MenuItem> items;
    @OneToOne(mappedBy = "menu", fetch = FetchType.LAZY)
    private MenuAcces menuAcces;
    
    public Menu() {
    }

    public Menu(Integer menuid) {
        this.menuid = menuid;
    }

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public String getMenutitle() {
        return menutitle;
    }

    public void setMenutitle(String menutitle) {
        this.menutitle = menutitle;
    }

    public String getMenuposition() {
        return menuposition;
    }

    public void setMenuposition(String menuposition) {
        this.menuposition = menuposition;
    }

    public String getMenudescription() {
        return menudescription;
    }

    public void setMenudescription(String menudescription) {
        this.menudescription = menudescription;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    public MenuAcces getMenuAcces() {
        return menuAcces;
    }

    public void setMenuAcces(MenuAcces menuAcces) {
        this.menuAcces = menuAcces;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (menuid != null ? menuid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.menuid == null && other.menuid != null) || (this.menuid != null && !this.menuid.equals(other.menuid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Menu[ menuid=" + menuid + " ]";
    }
    
}
