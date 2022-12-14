package com.api.WorkoutApp.controller;


import com.api.WorkoutApp.dto.RegisterDto;
import com.api.WorkoutApp.model.Role;
import com.api.WorkoutApp.model.UserModel;
import com.api.WorkoutApp.repository.RoleRepository;
import com.api.WorkoutApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("workout/auth")
public class AuthController {
    private AuthenticationManager authenticationManager;
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public AuthController(AuthenticationManager authenticationManager, UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

//    @PostMapping("/register")
//    public ResponseEntity<String> register(@RequestBody RegisterDto dto) {
//        if (userRepository.existsByUsername(dto.getUsername())) {
//            return new ResponseEntity<>("Username already in use", HttpStatus.BAD_REQUEST);
//        }
//
//        UserModel user = new UserModel();
//        user.setUsername(dto.getUsername());
//        user.setPassword(passwordEncoder.encode(dto.getPassword()));
//
//        List<String> strRoles = dto.getRoles();
//        List<Role> roles = new ArrayList<>();
//
//        strRoles.forEach(role -> {
//            switch (role) {
//                case "athlete":
//                    Role athleteRole = roleRepository.findByName(String.valueOf(Roles.ROLE_ATHLETE))
//                            .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
//                    roles.add(athleteRole);
//                    break;
//                case "trainer":
//                    Role trainerRole = roleRepository.findByName(String.valueOf(Roles.ROLE_TRAINER))
//                            .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
//                    roles.add(trainerRole);
//            }
//        });
//
//        user.setRoles(roles);
//        userRepository.save(user);
//        return new ResponseEntity<>("User registered success!", HttpStatus.OK);
//    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterDto dto) {
        if (userRepository.existsByUsername(dto.getUsername())) {
            return new ResponseEntity<>("Username is already in use!", HttpStatus.BAD_REQUEST);
        }

        UserModel user = new UserModel();
        user.setUsername(dto.getUsername());
        user.setPassword(passwordEncoder.encode((dto.getPassword())));

        Role roles = roleRepository.findByName("").get();
        user.setRoles(Collections.singletonList(roles));

        userRepository.save(user);

        return new ResponseEntity<>("User registered success!", HttpStatus.OK);
    }


}
