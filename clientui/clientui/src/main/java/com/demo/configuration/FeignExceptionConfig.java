package com.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.exception.CustomErreur;

@Configuration
public class FeignExceptionConfig {
	
	@Bean
	public CustomErreur custom() {
		return new CustomErreur();
	}

}
