package com.demo.customer;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class CustomerSecurityConfig extends WebSecurityConfigurerAdapter {
	
//	@Autowired
//	DataSource datasource;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http
			.authorizeRequests()
			.antMatchers("/customer")
			.permitAll()
			.antMatchers("/update**")
			.hasRole("USER")
			.antMatchers("/delete**")
			.hasRole("USER")
			.and()
			.httpBasic()
			.and()
			.csrf()
			.disable();
	}
	
	@Autowired
	public void configureGLobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication().withUser("Faraaz").password(passwordEncoder().encode("welcome1")).roles("USER");
		auth.inMemoryAuthentication().withUser("Pavan").password(passwordEncoder().encode("welcome1")).roles("ADMIN");
		auth.inMemoryAuthentication().withUser("Scott").password(passwordEncoder().encode("welcome1")).roles("USER");
		auth.inMemoryAuthentication().withUser("Alex").password(passwordEncoder().encode("welcome1")).roles("USER").disabled(true);
	}
	
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
//		auth.jdbcAuthentication().dataSource(datasource).usersByUsernameQuery("select username, password, enabled from userd where username=?")
//		.authorotiesByUsernameQuery("select username, suthority from authorities where username = ?");
//	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
