package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.walamart.security.Authentication;

@SpringBootApplication
@ComponentScan(basePackages= {"com.walamart", "com.example.demo"})
public class Application {

	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class, args);
	}
	
	/*
	 * @Bean Authentication getObectForAClass(){ Authentication authenticationobj
	 * =new Authentication(); return authenticationobj; }
	 */

}
