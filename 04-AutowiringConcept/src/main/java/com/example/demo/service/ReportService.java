package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.demo.dao.ReportDAO;

@Service
public class ReportService 
{
	ReportDAO reportDAO;
	
	@Autowired
	@Qualifier("report2")
	public void setReportDAO(ReportDAO reportDAO) 
	{
		this.reportDAO = reportDAO;
	}
	
	public void getReportService() 
	{
		String report = reportDAO.getReport();
		System.out.println(report);
	}

}
