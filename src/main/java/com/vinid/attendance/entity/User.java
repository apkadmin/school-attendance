package com.vinid.attendance.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.util.Date;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name= "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "username")
    @Max(value = 30,message = "user name max length 30")
    private String username;

    @Column(name = "password")
    private String password;


    @Column(name="uid")
    private String uid;


    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @Column(name="create_at")
    private Date create_at;

    @Column(name="update_at")
    private Date update_at;

    public User() {
    }

    public User(Integer id, String username, String password, String uid, Role role, Date create_at, Date update_at) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.uid = uid;
        this.role = role;
        this.create_at = create_at;
        this.update_at = update_at;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
