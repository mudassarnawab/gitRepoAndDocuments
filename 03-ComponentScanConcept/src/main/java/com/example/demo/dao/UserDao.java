package com.example.demo.dao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao 
{
	public UserDao() 
	{
		System.out.println("User DAO using Repository");
	}

}
