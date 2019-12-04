package com.vinid.attendance.service;


import com.vinid.attendance.entity.Role;
import com.vinid.attendance.entity.Student;
import com.vinid.attendance.entity.User;
import com.vinid.attendance.model.StudentDto;
import com.vinid.attendance.model.UserRegistrationDto;
import com.vinid.attendance.reponsitory.StudentRepository;
import com.vinid.attendance.reponsitory.TeacherRepository;
import com.vinid.attendance.reponsitory.UserRepository;
import com.vinid.attendance.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        Role role = user.getRole();
        grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                new ArrayList<>());
    }

    @Transactional()
    public String registerStudent(Student student){
        System.out.println(student);
        if(!this.findStudentByEmail(student.getEmail())){
            studentRepository.save(student);
            User temp = new User();
            String username = student.getFirst_name().toUpperCase() + student.getLast_name().toLowerCase();
            temp.setUsername(username);
            temp.setPassword(passwordEncoder.encode(student.getDate_of_birth().toString()));
            userRepository.save(temp);
        };
        return "Accept";
    }

//    @Override
//    public findByUserName(String email) {
//        return null;
//    }
//
//    @Override
//    public com.vinid.attendance.entity.User save(UserRegistrationDto registration) {
//        return null;
//    }

    public Boolean findStudentByEmail(String email){
            Student students = studentRepository.findByEmail(email);

        if(students == null){
            return false;
        }
        return true;
    }
//
//    public User save(UserRegistrationDto registration){
//        User user = new User();
//        user.setFirstName(registration.getFirstName());
//        user.setLastName(registration.getLastName());
//        user.setEmail(registration.getEmail());
//        user.setPassword(passwordEncoder.encode(registration.getPassword()));
//        user.setRoles(Arrays.asList(new Role("ROLE_USER")));
//        return userRepository.save(user);
//    }
//
//    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
//        return roles.stream()
//                .map(role -> new SimpleGrantedAuthority(role.getName()))
//                .collect(Collectors.toList());
//    }
}