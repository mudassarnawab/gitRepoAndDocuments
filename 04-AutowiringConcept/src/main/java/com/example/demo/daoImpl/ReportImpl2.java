package com.example.demo.daoImpl;

import org.springframework.stereotype.Repository;
import com.example.demo.dao.ReportDAO;

@Repository("report2")
public class ReportImpl2 implements ReportDAO {

	public ReportImpl2() 
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getReport() 
	{
		return "report2";
	}

}
