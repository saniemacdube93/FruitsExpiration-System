/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nust.systems.workingcrud.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author busisani
 */
@Entity
@Table(name = "applicants")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Applicants.findAll", query = "SELECT a FROM Applicants a")
    , @NamedQuery(name = "Applicants.findByApplicantId", query = "SELECT a FROM Applicants a WHERE a.applicantId = :applicantId")
    , @NamedQuery(name = "Applicants.findByName", query = "SELECT a FROM Applicants a WHERE a.name = :name")
    , @NamedQuery(name = "Applicants.findBySurname", query = "SELECT a FROM Applicants a WHERE a.surname = :surname")
    , @NamedQuery(name = "Applicants.findByGender", query = "SELECT a FROM Applicants a WHERE a.gender = :gender")
    , @NamedQuery(name = "Applicants.findByEmail", query = "SELECT a FROM Applicants a WHERE a.email = :email")
    , @NamedQuery(name = "Applicants.findByPassword", query = "SELECT a FROM Applicants a WHERE a.password = :password")
    , @NamedQuery(name = "Applicants.findByTitle", query = "SELECT a FROM Applicants a WHERE a.title = :title")
    , @NamedQuery(name = "Applicants.findBySubmitted", query = "SELECT a FROM Applicants a WHERE a.submitted = :submitted")
    , @NamedQuery(name = "Applicants.findByNationalId", query = "SELECT a FROM Applicants a WHERE a.nationalId = :nationalId")
    , @NamedQuery(name = "Applicants.findByType", query = "SELECT a FROM Applicants a WHERE a.type = :type")
    , @NamedQuery(name = "Applicants.findByTimestamp", query = "SELECT a FROM Applicants a WHERE a.timestamp = :timestamp")
    , @NamedQuery(name = "Applicants.findByDob", query = "SELECT a FROM Applicants a WHERE a.dob = :dob")
    , @NamedQuery(name = "Applicants.findByNationality", query = "SELECT a FROM Applicants a WHERE a.nationality = :nationality")
    , @NamedQuery(name = "Applicants.findByCitizenship", query = "SELECT a FROM Applicants a WHERE a.citizenship = :citizenship")
    , @NamedQuery(name = "Applicants.findByNavApplicantId", query = "SELECT a FROM Applicants a WHERE a.navApplicantId = :navApplicantId")
    , @NamedQuery(name = "Applicants.findByApplicantId1", query = "SELECT a FROM Applicants a WHERE a.applicantId1 = :applicantId1")
    , @NamedQuery(name = "Applicants.findByNavApplicantId1", query = "SELECT a FROM Applicants a WHERE a.navApplicantId1 = :navApplicantId1")})
public class Applicants implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "applicantId")
    private Integer applicantId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "surname")
    private String surname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "gender")
    private String gender;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Column(name = "submitted")
    private boolean submitted;
    @Size(max = 50)
    @Column(name = "national_Id")
    private String nationalId;
    @Size(max = 100)
    @Column(name = "type")
    private String type;
    @Size(max = 100)
    @Column(name = "timestamp")
    private String timestamp;
    @Size(max = 255)
    @Column(name = "dob")
    private String dob;
    @Size(max = 50)
    @Column(name = "nationality")
    private String nationality;
    @Size(max = 50)
    @Column(name = "citizenship")
    private String citizenship;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "navApplicantId")
    private String navApplicantId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "applicant_id")
    private int applicantId1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "nav_applicant_id")
    private String navApplicantId1;

    public Applicants() {
    }

    public Applicants(Integer applicantId) {
        this.applicantId = applicantId;
    }

    public Applicants(Integer applicantId, String name, String surname, String gender, String email, String password, String title, boolean submitted, String navApplicantId, int applicantId1, String navApplicantId1) {
        this.applicantId = applicantId;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.title = title;
        this.submitted = submitted;
        this.navApplicantId = navApplicantId;
        this.applicantId1 = applicantId1;
        this.navApplicantId1 = navApplicantId1;
    }

    public Integer getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Integer applicantId) {
        this.applicantId = applicantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getSubmitted() {
        return submitted;
    }

    public void setSubmitted(boolean submitted) {
        this.submitted = submitted;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getNavApplicantId() {
        return navApplicantId;
    }

    public void setNavApplicantId(String navApplicantId) {
        this.navApplicantId = navApplicantId;
    }

    public int getApplicantId1() {
        return applicantId1;
    }

    public void setApplicantId1(int applicantId1) {
        this.applicantId1 = applicantId1;
    }

    public String getNavApplicantId1() {
        return navApplicantId1;
    }

    public void setNavApplicantId1(String navApplicantId1) {
        this.navApplicantId1 = navApplicantId1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applicantId != null ? applicantId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Applicants)) {
            return false;
        }
        Applicants other = (Applicants) object;
        if ((this.applicantId == null && other.applicantId != null) || (this.applicantId != null && !this.applicantId.equals(other.applicantId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "nust.systems.workingcrud.entities.Applicants[ applicantId=" + applicantId + " ]";
    }
    
}
