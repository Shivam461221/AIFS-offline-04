package com.cloud.jpa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/users/").permitAll()
                .requestMatchers("/api/users/**").authenticated()
                .anyRequest().authenticated()
            ) .httpBasic(customizer -> {})
            .formLogin(form -> form.disable());
        return http.build();
    }
	
}
