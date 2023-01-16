package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RunInternalsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(RunInternalsApplication.class, args);
		
		
		//System.out.print("Mudassar"+run);
		
		
		
		
	}

}
