/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.postgres;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kvo
 */
@Entity
@Table(name = "BroadcastRegistration")
@XmlRootElement
public class BroadcastRegistration implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date crationDate;
    
    private String login;
    private String pass;
    
    private String fname;
    private String lname;
    private String mname;
    
    private String email;
    private String phone;
    
    private String description;
    
    private Boolean block;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brdc_id")
    private Broadcasts brdc;

    public BroadcastRegistration() {
    }

    public BroadcastRegistration(Integer id, String login, String pass, String fname, String lname, String mname, String email, String phone, String description, Broadcasts brdc) {
        this.id = id;
        this.login = login;
        this.pass = pass;
        this.fname = fname;
        this.lname = lname;
        this.mname = mname;
        this.email = email;
        this.phone = phone;
        this.description = description;
        this.brdc = brdc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCrationDate() {
        return crationDate;
    }

    public void setCrationDate(Date crationDate) {
        this.crationDate = crationDate;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Broadcasts getBrdc() {
        return brdc;
    }

    public void setBrdc(Broadcasts brdc) {
        this.brdc = brdc;
    }

    public Boolean getBlock() {
        return block;
    }

    public void setBlock(Boolean block) {
        this.block = block;
    }
    
    
}
