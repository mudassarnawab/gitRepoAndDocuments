package com.example.demo.daoImpl;

import org.springframework.stereotype.Repository;
import com.example.demo.dao.ReportDAO;

@Repository("report1")
public class ReportImpl implements ReportDAO {

	
	public ReportImpl() 
	{
		System.out.println("DAO impl");
	}

	@Override
	public String getReport() {
		System.out.println("report1");
		return "report1";
	}

}
