package com.vinid.attendance.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentInClass {
    @Id
    private String id;
    private String student_id;
    private String subject_id;

    public StudentInClass() {
    }

    public StudentInClass(String id, String student_id, String subject_id) {
        this.id = id;
        this.student_id = student_id;
        this.subject_id = subject_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }
}
