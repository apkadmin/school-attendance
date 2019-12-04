//package com.vinid.attendance.validator;
//
//
//import javax.validation.Validator;
//
//import com.vinid.attendance.entity.User;
//import com.vinid.attendance.model.UserRegistrationDto;
//import com.vinid.attendance.service.impl.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.validation.Errors;
//import org.springframework.validation.ValidationUtils;
//
//@Component
//public class UserValidator implements Validator {
//    @Autowired
//    private UserService userService;
//
//
//
//    @Override
//    public void validate(Object o, Errors errors) {
//
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
//        if (user.getUsername().length() < 6 || user.getUsername().length() > 32) {
//            errors.rejectValue("username", "Size.userForm.username");
//        }
//        if (userService.findByUserName(user.getUsername()) != null) {
//            errors.rejectValue("username", "Duplicate.userForm.username");
//        }
//
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
//        if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
//            errors.rejectValue("password", "Size.userForm.password");
//        }
//
//        if (!user.getPasswordConfirm().equals(user.getPassword())) {
//            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
//        }
//    }
//}