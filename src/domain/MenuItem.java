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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Shah
 */
@Entity
@Table(name = "MenuItem")
@XmlRootElement
public class MenuItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MenuItem_id")
    private Integer menuItemid;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menuitem_menu_id")
    private Menu menu;
    @Size(max = 255)
    @Column(name = "MenuItem_title")
    private String menuItemtitle;
    @Size(max = 255)
    @Column(name = "MenuItem_description")
    private String menuItemdescription;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menuitem_page_id")
    private Pages page;
    
    public MenuItem() {
    }

    public MenuItem(Integer menuItemid) {
        this.menuItemid = menuItemid;
    }

    public Integer getMenuItemid() {
        return menuItemid;
    }

    public void setMenuItemid(Integer menuItemid) {
        this.menuItemid = menuItemid;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
        
    public String getMenuItemtitle() {
        return menuItemtitle;
    }

    public void setMenuItemtitle(String menuItemtitle) {
        this.menuItemtitle = menuItemtitle;
    }

    public String getMenuItemdescription() {
        return menuItemdescription;
    }

    public void setMenuItemdescription(String menuItemdescription) {
        this.menuItemdescription = menuItemdescription;
    }

    public Pages getPage() {
        return page;
    }

    public void setPage(Pages page) {
        this.page = page;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (menuItemid != null ? menuItemid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MenuItem)) {
            return false;
        }
        MenuItem other = (MenuItem) object;
        if ((this.menuItemid == null && other.menuItemid != null) || (this.menuItemid != null && !this.menuItemid.equals(other.menuItemid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.MenuItem[ menuItemid=" + menuItemid + " ]";
    }
    
}
