package com.cloud.jpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cloud.jpa.dtos.AuthResponse;
import com.cloud.jpa.dtos.LoginRequest;
import com.cloud.jpa.dtos.RegisterRequest;
import com.cloud.jpa.entities.User;
import com.cloud.jpa.repositories.UserRepository;
import com.cloud.jpa.security.JwtUtils;

@Service
public class AuthService {
	@Autowired
	private  UserRepository userRepository;
	
	@Autowired
    private  PasswordEncoder passwordEncoder;
	
	@Autowired
    private  AuthenticationManager authenticationManager;
	
	@Autowired
    private  JwtUtils jwtUtil;

    
    public String registerUser(RegisterRequest request) {

        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new RuntimeException("Email already registered");
        }

        User user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .age(request.getAge())
                .role(request.getRole())
                .build();

        userRepository.save(user);

//        String token = jwtUtil.generateToken(user.getEmail());
//
//        return AuthResponse.builder()
//                .token(token)
//                .message("User registered successfully")
//                .build();
        if(user!=null) {
        	return "user registered successfully";
        }
        return "user not registered";
    }

    
    public AuthResponse loginUser(LoginRequest request) {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );

        String token = jwtUtil.generateToken(request.getEmail());

        return AuthResponse.builder()
                .token(token)
                .message("Login successful")
                .build();
    }
}
