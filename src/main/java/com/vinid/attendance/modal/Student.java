package com.vinid.attendance.modal;

import javax.persistence.*;

@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue()
    private String ma_sv;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    private String sex;

    private String date_of_birth;

    private String country;

    private String city;

    private String wards;

    private String street;

    private String district;

    private String learn_start;

    private String learn_end;

    private String create_at;

    private String update_at;

    private String telephone;

    private String email;

    private String identification;

    private String image;

    public Student(String first_name, String last_name, String sex, String date_of_birth, String country, String city, String wards, String street, String district, String learn_start, String learn_end, String create_at, String update_at, String telephone, String email, String identification, String image) {
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

    public String getMa_sv() {
        return ma_sv;
    }

    public void setMa_sv(String ma_sv) {
        this.ma_sv = ma_sv;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
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

    public String getLearn_start() {
        return learn_start;
    }

    public void setLearn_start(String learn_start) {
        this.learn_start = learn_start;
    }

    public String getLearn_end() {
        return learn_end;
    }

    public void setLearn_end(String learn_end) {
        this.learn_end = learn_end;
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    public String getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(String update_at) {
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
}

