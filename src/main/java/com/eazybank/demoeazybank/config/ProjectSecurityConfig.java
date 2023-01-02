package com.eazybank.demoeazybank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {


   /*
        SecurityFilterChain defaultSecurityFilterChain (HttpSecurity http) throws Exception{
        http.authorizeHttpRequests().anyRequest().authenticated();
        http.formLogin();
        http.httpBasic();
        return http.build();
    }
    */



    @Bean
    SecurityFilterChain defaultSecurityFilterChain (HttpSecurity http) throws Exception{
        http.authorizeHttpRequests().requestMatchers("/api/v1/cards/details","/api/v1/accounts","/api/v1/balances/details").authenticated()
                                    .requestMatchers("/api/v1/loans/details","/api/v1/notices/","/api/v1/contacts/").permitAll()
                                    .and().httpBasic().and().formLogin();

              return http.build();
    }
}
