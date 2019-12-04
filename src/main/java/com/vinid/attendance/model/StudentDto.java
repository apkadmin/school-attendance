package com.vinid.attendance.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import java.util.Date;

public class StudentDto {

    private String first_name;

    private String last_name;

    private Boolean sex;

    @JsonFormat(pattern="dd/MM/yyyy")
    private Date date_of_birth;

    private String country;

    private String city;

    private String wards;

    private String street;

    private String district;

    @JsonFormat(pattern="dd/MM/yyyy")
    private Date learn_start;

    @JsonFormat(pattern="dd/MM/yyyy")
    private Date learn_end;

    private Date create_at;

    private Date update_at;

    private String telephone;

    @Email
    private String email;

    private String identification;

    private String image;

    public StudentDto(String first_name, String last_name, Boolean sex, Date date_of_birth, String country, String city, String wards, String street, String district, Date learn_start, Date learn_end, Date create_at, Date update_at, String telephone,String email, String identification, String image) {
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
    }

    public StudentDto() {
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

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
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

    @Override
    public String toString() {
        return "StudentDto{" +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", sex=" + sex +
                ", date_of_birth=" + date_of_birth +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", wards='" + wards + '\'' +
                ", street='" + street + '\'' +
                ", district='" + district + '\'' +
                ", learn_start='" + learn_start + '\'' +
                ", learn_end='" + learn_end + '\'' +
                ", create_at=" + create_at +
                ", update_at=" + update_at +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", identification='" + identification + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
