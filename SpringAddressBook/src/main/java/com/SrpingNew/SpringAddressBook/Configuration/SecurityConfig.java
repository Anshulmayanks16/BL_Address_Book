package com.SrpingNew.SpringAddressBook.Configuration;

import org.springframework.context.annotation.Bean;

public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) thorws Exception{
        http
                .csrf(csrf ->csrf.disable())//Disable CSRF protection
                .authorizationHttpRequests(auth -> auth
                        .anyRequest().permitAll())
                .headers(headers -> headers.frameOptions(frame -> frame.disable()))
                .httpBasic(basic -> basic.disable())
                .formLogin(form -> form.disable());

        return http.build();
    }
}
