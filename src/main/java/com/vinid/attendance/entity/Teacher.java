package com.vinid.attendance.entity;

import com.vinid.attendance.entity.Subject;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Date;
import java.util.Set;

@Entity

@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Max(value = 50,message = "name max length 50")
    @Column(name = "first_name")
    private String first_name;

    @Max(value = 50,message = "name max length 50")
    @Column(name = "last_name")
    private String last_name;

    @Column(name="department")
    private String department;

    @Column(name = "regency")
    private String regency;

    @Column(name = "date_of_birth")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private String date_of_birth;

    @Column(name = "country")
    private String country;

    @Column(name="city")
    private String city;

    @Column(name="district")
    private String district;

    @Column(name="create_at")
    private Date create_at;

    @Column(name="update_at")
    private Date update_at;

    @Max(value = 12,message = "the phone is max length 12")
    @Min(value = 8, message = "the phone is min length 8")
    @Column(name = "telephone")
    private String telephone;

    @Column(name = "email")
    @Email
    private String email;


    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    private Set<Subject> subjects;


    public Teacher() {
    }

    public Teacher(String first_name, String last_name, String department, String regency, String date_of_birth, String country, String city, String district, Date create_at, Date update_at, @Max(value = 12, message = "the phone is max length 12") @Min(value = 8, message = "the phone is min length 8") String telephone, String email, Set<Subject> subjects) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.department = department;
        this.regency = regency;
        this.date_of_birth = date_of_birth;
        this.country = country;
        this.city = city;
        this.district = district;
        this.create_at = create_at;
        this.update_at = update_at;
        this.telephone = telephone;
        this.email = email;
        this.subjects = subjects;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRegency() {
        return regency;
    }

    public void setRegency(String regency) {
        this.regency = regency;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }
}
