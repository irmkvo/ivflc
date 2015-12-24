
package domain.postgres;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kvo
 */

@Entity
@Table(name = "broadcasts")
@XmlRootElement
public class Broadcasts implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "image")
    private String image;
    @Column(name = "author")
    private String author;
    @Column(name = "title")
    private String title;
    
    @Column(name = "personal")
    private Boolean personal;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Puser user;
    @Column(name = "patient_id")
    private Integer patientId;
    
    @Column(name = "description")
    private String description;
    @Column(name = "creationDate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date creationDate;
    @Column(name = "startDate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date startDate;
    @Column(name = "endDate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date endDate;

    @Column(name = "startURL")
    private String startURL;
    @Column(name = "joinURL")
    private String joinURL;
    @Column(name = "loginURL")
    private String loginURL;
    @Column(name = "meetingID")
    private String meetingID;
    
    @OneToMany(mappedBy = "brdc", fetch = FetchType.LAZY)
    private List<BroadcastRegistration> brdcReg;
    
    @OneToMany(mappedBy = "brdc", fetch = FetchType.LAZY)
    private List<BroadcastRecords> brdcRec;
    
    public Broadcasts() {
    }

    public Broadcasts(Integer id, String image, String author, String title, String description, Date creationDate, Date startDate, Date endDate, String startURL, String joinURL, String loginURL, String meetingID) {
        this.id = id;
        this.image = image;
        this.author = author;
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startURL = startURL;
        this.joinURL = joinURL;
        this.loginURL = loginURL;
        this.meetingID = meetingID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStartURL() {
        return startURL;
    }

    public void setStartURL(String startURL) {
        this.startURL = startURL;
    }

    public String getJoinURL() {
        return joinURL;
    }

    public void setJoinURL(String joinURL) {
        this.joinURL = joinURL;
    }

    public String getLoginURL() {
        return loginURL;
    }

    public void setLoginURL(String loginURL) {
        this.loginURL = loginURL;
    }
    
    public String getMeetingID() {
        return meetingID;
    }

    public void setMeetingID(String meetingID) {
        this.meetingID = meetingID;
    }

    public List<BroadcastRegistration> getBrdcReg() {
        return brdcReg;
    }

    public void setBrdcReg(List<BroadcastRegistration> brdcReg) {
        this.brdcReg = brdcReg;
    }    

    public Boolean getPersonal() {
        return personal;
    }

    public void setPersonal(Boolean personal) {
        this.personal = personal;
    }

    public List<BroadcastRecords> getBrdcRec() {
        return brdcRec;
    }

    public void setBrdcRec(List<BroadcastRecords> brdcRec) {
        this.brdcRec = brdcRec;
    }

    public Puser getUser() {
        return user;
    }

    public void setUser(Puser user) {
        this.user = user;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    @Override
    public String toString() {
        return this.title; //To change body of generated methods, choose Tools | Templates.
    }

    
        
}
