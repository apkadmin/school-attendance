package com.vinid.attendance.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "students")
@ApiModel(description = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @ApiModelProperty(dataType = "id")
    private Integer id;

    @Column(name = "first_name", nullable = false)
    private String first_name;

    @Column(name = "last_name",nullable = false)
    private String last_name;

    @Column(name = "sex")
    private Boolean sex;

    @Column(name = "date_of_birth" , nullable = false)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern="dd/MM/yyyy")
    private String date_of_birth;

    @Column(name = "contry")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "wards")
    private String wards;

    @Column(name = "street")
    private String street;

    @Column(name = "district")
    private String district;

    @Column(name="learn_start")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date learn_start;

    @Column(name = "learn_end")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date learn_end;

    @Column(name = "create_at")
    private Date create_at;

    @Column(name = "update_at")
    private Date update_at;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "email")
    @Email
    private String email;

    @Column(name = "identification")
    private String identification;

    @Column(name = "image")
    private String image;

    @ManyToMany
    @JoinTable(
            name = "subject_students",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id"))
    Set<Subject> subjects;

    public Student() {
    }

    public Student(String first_name, String last_name, Boolean sex, String date_of_birth, String country, String city, String wards, String street, String district, Date learn_start, Date learn_end, Date create_at, Date update_at, String telephone, @Email String email, String identification, String image, Set<Subject> subjects) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.sex = sex;
        this.date_of_birth = date_of_birth;
        this.country = country;
        this.city = city;
        this.wards = wards;
        this.street = street;
        this.district = district;
        this.learn_start = learn_start;
        this.learn_end = learn_end;
        this.create_at = create_at;
        this.update_at = update_at;
        this.telephone = telephone;
        this.email = email;
        this.identification = identification;
        this.image = image;
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

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
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

    public String getWards() {
        return wards;
    }

    public void setWards(String wards) {
        this.wards = wards;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Date getLearn_start() {
        return learn_start;
    }

    public void setLearn_start(Date learn_start) {
        this.learn_start = learn_start;
    }

    public Date getLearn_end() {
        return learn_end;
    }

    public void setLearn_end(Date learn_end) {
        this.learn_end = learn_end;
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

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", sex=" + sex +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", wards='" + wards + '\'' +
                ", street='" + street + '\'' +
                ", district='" + district + '\'' +
                ", learn_start=" + learn_start +
                ", learn_end=" + learn_end +
                ", create_at=" + create_at +
                ", update_at=" + update_at +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", identification='" + identification + '\'' +
                ", image='" + image + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}

