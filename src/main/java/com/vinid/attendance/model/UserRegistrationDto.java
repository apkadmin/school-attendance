package com.vinid.attendance.model;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

//@FieldMatch.List({
//        @FieldMatch(first = "password", second = "confirmPassword", message = "The password fields must match"),
//        @FieldMatch(first = "email", second = "confirmEmail", message = "The email fields must match")
//})
public class UserRegistrationDto {

    @NotEmpty
    private String username;

    @NotEmpty
    private String password;

    @NotEmpty
    private String confirmPassword;


    public UserRegistrationDto(@NotEmpty String username, @NotEmpty String password, @NotEmpty String confirmPassword) {
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public UserRegistrationDto() {
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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}