package com.vinid.attendance.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Date;


public class TeacherDto {

    private Integer id;

    private String first_name;

    private String last_name;

    private String department;

    private String regency;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private String date_of_birth;

    private String country;

    private String city;

    private String district;

    private Date create_at;

    private Date update_at;

    @Min(message = "min phone is 10", value = 10)
    @Max(message = "max phone is 14", value = 14)
    private String telephone;

    @Email
    private String email;

    public TeacherDto(Integer id, String first_name, String last_name, String department, String regency, String date_of_birth, String country, String city, String district, Date create_at, Date update_at, @Min(message = "min phone is 10", value = 10) @Max(message = "max phone is 14", value = 14) String telephone, @Email String email) {
        this.id = id;
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
    }

    public TeacherDto() {
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
}
