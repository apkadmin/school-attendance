package com.vinid.attendance.controller;

import com.vinid.attendance.entity.Student;
import com.vinid.attendance.model.StudentDto;
import com.vinid.attendance.reponsitory.UserRepository;
import com.vinid.attendance.service.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImpl userService;

//    @PostMapping(name="/register")
//    @RequestMapping(value = "/registration", method = RequestMethod.POST)
//    public String registration(@ModelAttribute("userForm") User userForm,
//                               BindingResult bindingResult, Model model) {
//        userValidator.validate(userForm, bindingResult);
//
//        if (bindingResult.hasErrors()) {
//            return "registration";
//        }


    @PostMapping("/registerStudent")
    @ApiOperation(value = "Find student by id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = String.class),
            @ApiResponse(code = 422, message = "Student not found"),
            @ApiResponse(code = 417, message = "Exception failed")
    })
    public String showRegistrationForm(@RequestBody Student student) {
        userService.registerStudent(student);
        return "accept";
    }
    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/";
    }
}
