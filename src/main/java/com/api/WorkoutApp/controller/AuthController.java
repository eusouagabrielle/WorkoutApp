package com.api.WorkoutApp.controller;


import com.api.WorkoutApp.repository.RoleRepository;
import com.api.WorkoutApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
//        User user = new User();
//        user.setUsername(dto.getUsername());
//        user.setPassword(passwordEncoder.encode(dto.getPassword()));
//
//        List<String> strRoles = dto.getAuthorities();
//        List<Authority> roles = new ArrayList<>();
//
//        strRoles.forEach(role -> {
//            switch (role) {
//                case "athlete":
//                    Authority athleteRole = roleRepository.findByName(String.valueOf(Roles.ROLE_ATHLETE))
//                            .orElseThrow(() -> new RuntimeException("Error: Authority is not found."));
//                    roles.add(athleteRole);
//                    break;
//                case "trainer":
//                    Authority trainerRole = roleRepository.findByName(String.valueOf(Roles.ROLE_TRAINER))
//                            .orElseThrow(() -> new RuntimeException("Error: Authority is not found."));
//                    roles.add(trainerRole);
//            }
//        });
//
//        user.setAuthorities(roles);
//        userRepository.save(user);
//        return new ResponseEntity<>("User registered success!", HttpStatus.OK);
//    }

//    @PostMapping("/register")
//    public ResponseEntity<String> register(@RequestBody RegisterDto dto) {
//        if (userRepository.existsByUsername(dto.getUsername())) {
//            return new ResponseEntity<>("Username is already in use!", HttpStatus.BAD_REQUEST);
//        }
//
//        User user = new User();
//        user.setUsername(dto.getUsername());
//        user.setPassword(passwordEncoder.encode((dto.getPassword())));
//
//        Authority roles = roleRepository.findByName("").get();
//        user.setAuthorities(Collections.singletonList(roles));
//
//        userRepository.save(user);
//
//        return new ResponseEntity<>("User registered success!", HttpStatus.OK);
//    }


}
