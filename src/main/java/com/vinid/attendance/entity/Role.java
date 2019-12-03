package com.vinid.attendance.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Null;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Collection;

@Entity
@Table(name = "roles")
@ApiModel(description = "Table roles")
public class Role {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "Id of the Role",name="id",required=true,value="ADMIN,STUDENT,TEACHER",access = "NULL")
    private Integer id;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private Collection<User> users;


    @Column(name = "description")
    @Max(value = 255,message ="Max length is 255")
    @ApiModelProperty(notes = "Description Role for action user",name="description",required=false,value = "NULL")
    private String description;

    @Column(name = "name")
    @Max(value = 255,message = "Max length is 255")
    @ApiModelProperty(notes = "Description Role for action user",name="name",required=false,value = "NULL")
    private String name;


    public Role() {
    }

    public Role(Collection<User> users,String description, String name) {
        this.users = users;
        this.description = description;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }

}

