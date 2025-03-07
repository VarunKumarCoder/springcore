package com.nt.config;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig {
	
	@Bean(name="itime")
	@Scope("singleton")
	@Lazy(true)
	public LocalTime createLTime() {
		return LocalTime.now();
	}
	@Bean(name="Idate")
	@Scope("singleton")
	public LocalDate createDate() {
		return LocalDate.now();
	}
}
