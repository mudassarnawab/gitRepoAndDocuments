package com.walamart.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Authentication {

	public Authentication() {
		System.out.println("Inside Autherntication class");
	}

	
	@Bean 
	Authentication getObectForAClass()
	{ 
		Authentication authenticationobj = new Authentication();
		return authenticationobj; 
	}
}
