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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Shah
 */
@Entity
@Table(name = "MenuAcces")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MenuAcces.findAll", query = "SELECT m FROM MenuAcces m"),
    @NamedQuery(name = "MenuAcces.findByMenuAccesid", query = "SELECT m FROM MenuAcces m WHERE m.menuAccesid = :menuAccesid"),
    @NamedQuery(name = "MenuAcces.findByMenuAccesmenuid", query = "SELECT m FROM MenuAcces m WHERE m.menuAccesmenuid = :menuAccesmenuid"),
    @NamedQuery(name = "MenuAcces.findByMenuAccesroleid", query = "SELECT m FROM MenuAcces m WHERE m.menuAccesroleid = :menuAccesroleid"),
    @NamedQuery(name = "MenuAcces.findByMenuAccesdescription", query = "SELECT m FROM MenuAcces m WHERE m.menuAccesdescription = :menuAccesdescription"),
    @NamedQuery(name = "MenuAcces.findByMenuAccestitle", query = "SELECT m FROM MenuAcces m WHERE m.menuAccestitle = :menuAccestitle")})
public class MenuAcces implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MenuAcces_id")
    private Integer menuAccesid;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menuacces_menu_id")
    private Menu menu;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menuacces_role_id")
    private Roles role;
    @Size(max = 255)
    @Column(name = "MenuAcces_description")
    private String menuAccesdescription;
    @Size(max = 255)
    @Column(name = "MenuAcces_title")
    private String menuAccesTitle;

    public MenuAcces() {
    }

    public MenuAcces(Integer menuAccesid) {
        this.menuAccesid = menuAccesid;
    }

    public Integer getMenuAccesid() {
        return menuAccesid;
    }

    public void setMenuAccesid(Integer menuAccesid) {
        this.menuAccesid = menuAccesid;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
    
    public String getMenuAccesdescription() {
        return menuAccesdescription;
    }

    public void setMenuAccesdescription(String menuAccesdescription) {
        this.menuAccesdescription = menuAccesdescription;
    }

    public String getMenuAccesacces() {
        return menuAccesTitle;
    }

    public void setMenuAccesacces(String menuAccesTitle) {
        this.menuAccesTitle = menuAccesTitle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (menuAccesid != null ? menuAccesid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MenuAcces)) {
            return false;
        }
        MenuAcces other = (MenuAcces) object;
        if ((this.menuAccesid == null && other.menuAccesid != null) || (this.menuAccesid != null && !this.menuAccesid.equals(other.menuAccesid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.MenuAcces[ menuAccesid=" + menuAccesid + " ]";
    }
    
}
