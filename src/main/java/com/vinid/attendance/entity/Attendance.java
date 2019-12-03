package com.vinid.attendance.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "attendances")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "create_at")
    private Date create_at;

    @Column(name = "subject_id")
    private Integer subject_id;

    @Column(name = "attendance_status")
    private Boolean attendance_status;

    @Column(name = "student_id")
    private Integer student_id;

    @Column(name = "lat")
    private Double lat;

    @Column(name = "lng")
    private Double lng;

    public Attendance() {
    }

    public Attendance(Date create_at, Integer subject_id, Boolean attendance_status, Integer student_id, Double lat, Double lng) {
        this.create_at = create_at;
        this.subject_id = subject_id;
        this.attendance_status = attendance_status;
        this.student_id = student_id;
        this.lat = lat;
        this.lng = lng;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public Integer getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(Integer subject_id) {
        this.subject_id = subject_id;
    }

    public Boolean getAttendance_status() {
        return attendance_status;
    }

    public void setAttendance_status(Boolean attendance_status) {
        this.attendance_status = attendance_status;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

}
