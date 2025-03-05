package com.nt.config;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig {
	
	@Bean(name="itime")
	public LocalTime createLTime() {
		return LocalTime.now();
	}
	@Bean(name="Idate")
	public LocalDate createDate() {
		return LocalDate.now();
	}
}
