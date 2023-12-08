package com.nowon.cho.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

	@Bean
	UserDetailsService userDetailsService() {
		return new HUserDetailsService();
	}
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(13);
	}
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf((csrf)->csrf.disable())
			.authorizeHttpRequests((authorize)->authorize
					.antMatchers("/css/**", "/img/**", "/js/**").permitAll()
					.antMatchers("/", "/signup", "/login","/signupagree","/cart").permitAll()
					.anyRequest().permitAll()
					)
			.formLogin(formlogin->formlogin
					.loginPage("/login")
					.loginProcessingUrl("/login")
					.usernameParameter("email")
					.passwordParameter("pass")
					.permitAll()
					);
		
		return http.build();
		
	}
}
