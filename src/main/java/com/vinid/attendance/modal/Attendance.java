package com.vinid.attendance.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Attendance {
    @Id
    private String id;

    private String create_at;
    private String scheule_id;
    private String attendance_status;
    private String image;
    private String student_id;
    private Double lat;
    private Double lng;

    public Attendance() {
    }

    public Attendance(String id, String create_at, String scheule_id, String attendance_status, String image, String student_id, Double lat, Double lng) {
        this.id = id;
        this.create_at = create_at;
        this.scheule_id = scheule_id;
        this.attendance_status = attendance_status;
        this.image = image;
        this.student_id = student_id;
        this.lat = lat;
        this.lng = lng;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    public String getScheule_id() {
        return scheule_id;
    }

    public void setScheule_id(String scheule_id) {
        this.scheule_id = scheule_id;
    }

    public String getAttendance_status() {
        return attendance_status;
    }

    public void setAttendance_status(String attendance_status) {
        this.attendance_status = attendance_status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
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
