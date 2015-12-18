package domain.postgres;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.*;

/**
 *
 * @author Администратор
 */
@Entity
@Table(name = "p_user")
public class Puser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Basic(optional = false)
    @Column(unique = true, nullable = false)
    private String userLogin;
    
    @Basic(optional = false)
    private String userPassword;
    
    @Basic(optional = false)
    private String userFname;
    
    @Basic(optional = false)
    private String userLname;
    
    @Basic(optional = false)
    private String userMname;
    
    @Basic(optional = false)
    private String userMail;
    
    @Basic(optional = false)
    private String userPhone;
    
    @Basic(optional = true)
    private String IIN;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private Roles role;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brdc_id")
    private Broadcasts brdc;
    
    @Basic(optional = true)
    private String phone;
  
    @Basic(optional = true)
    private Integer patientId;
    
    private Integer plSubId;
    
    private Integer plAgendId;
    
    private Boolean accountNonExpired = true;
    private Boolean accountNonLocked = true;
    private Boolean credentialsNonExpired = true;
    private Boolean enabled = true;

    public Puser() {
        super();
        UUID uid = UUID.randomUUID();
    }

    public Puser(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserFname() {
        return userFname;
    }

    public void setUserFname(String userFname) {
        this.userFname = userFname;
    }

    public String getUserLname() {
        return userLname;
    }

    public void setUserLname(String userLname) {
        this.userLname = userLname;
    }

    public String getUserMname() {
        return userMname;
    }

    public void setUserMname(String userMname) {
        this.userMname = userMname;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getIIN() {
        return IIN;
    }

    public void setIIN(String IIN) {
        this.IIN = IIN;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }
    
    public Boolean getAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(Boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public Boolean getAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(Boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public Boolean getCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(Boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getPlSubId() {
        return plSubId;
    }

    public void setPlSubId(Integer plSubId) {
        this.plSubId = plSubId;
    }

    public Broadcasts getBrdc() {
        return brdc;
    }

    public void setBrdc(Broadcasts brdc) {
        this.brdc = brdc;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    public Integer getPlAgendId() {
        return plAgendId;
    }

    public void setPlAgendId(Integer plAgendId) {
        this.plAgendId = plAgendId;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Puser)) {
            return false;
        }
        Puser other = (Puser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.userFname + " " + this.userLname + " " + this.userMname;
    }
    
}

