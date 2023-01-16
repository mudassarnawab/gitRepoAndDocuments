package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	public UserService() 
	{
		System.out.println("User Service from @Service Annotation");
	}

}
