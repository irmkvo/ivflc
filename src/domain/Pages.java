/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Shah
 */
@Entity
@Table(name = "Pages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pages.findAll", query = "SELECT p FROM Pages p"),
    @NamedQuery(name = "Pages.findByPageid", query = "SELECT p FROM Pages p WHERE p.pageid = :pageid"),
    @NamedQuery(name = "Pages.findByPagetitle", query = "SELECT p FROM Pages p WHERE p.pagetitle = :pagetitle"),
    @NamedQuery(name = "Pages.findByPagedescription", query = "SELECT p FROM Pages p WHERE p.pagedescription = :pagedescription"),
    @NamedQuery(name = "Pages.findByPageurl", query = "SELECT p FROM Pages p WHERE p.pageurl = :pageurl"),
    @NamedQuery(name = "Pages.findByPagemainpage", query = "SELECT p FROM Pages p WHERE p.pagemainpage = :pagemainpage")})
public class Pages implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Page_id")
    private Integer pageid;
    @Size(max = 255)
    @Column(name = "Page_title")
    private String pagetitle;
    @Size(max = 255)
    @Column(name = "Page_description")
    private String pagedescription;
    @Size(max = 255)
    @Column(name = "Page_url")
    private String pageurl;
    @Column(name = "Page_main_page")
    private Boolean pagemainpage;
    @Column(name = "Page_login_page")
    private Boolean loginPage;
    @OneToMany(mappedBy = "page", fetch = FetchType.LAZY)
    private List<MenuItem> menuItems;
    
    public Pages() {
    }

    public Pages(Integer pageid) {
        this.pageid = pageid;
    }

    public Integer getPageid() {
        return pageid;
    }

    public void setPageid(Integer pageid) {
        this.pageid = pageid;
    }

    public String getPagetitle() {
        return pagetitle;
    }

    public void setPagetitle(String pagetitle) {
        this.pagetitle = pagetitle;
    }

    public String getPagedescription() {
        return pagedescription;
    }

    public void setPagedescription(String pagedescription) {
        this.pagedescription = pagedescription;
    }

    public String getPageurl() {
        return pageurl;
    }

    public void setPageurl(String pageurl) {
        this.pageurl = pageurl;
    }

    public Boolean getPagemainpage() {
        return pagemainpage;
    }

    public void setPagemainpage(Boolean pagemainpage) {
        this.pagemainpage = pagemainpage;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Boolean getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(Boolean loginPage) {
        this.loginPage = loginPage;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pageid != null ? pageid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pages)) {
            return false;
        }
        Pages other = (Pages) object;
        if ((this.pageid == null && other.pageid != null) || (this.pageid != null && !this.pageid.equals(other.pageid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Pages[ pageid=" + pageid + " ]";
    }
    
}
