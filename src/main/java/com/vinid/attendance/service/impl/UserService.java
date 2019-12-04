package com.vinid.attendance.service.impl;
import com.vinid.attendance.entity.User;
import com.vinid.attendance.model.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Component
public interface UserService extends UserDetailsService {

    Boolean findStudentByEmail(String email);
//
//    User save(UserRegistrationDto registration);
//    @Autowired
//    private UserRepository userRepository;
//
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        User user = userRepository.findByUsername(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found with username: " + username);
//        }
//        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
//        for (Role role : user.getRoles()){
//            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
//        }
//
//        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
//                new ArrayList<>());
//    }
}
