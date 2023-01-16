package com.example.demo.daoImpl;

import org.springframework.stereotype.Repository;
import com.example.demo.dao.ReportDAO;

@Repository
public class ReportImpl implements ReportDAO {

	
	public ReportImpl() {
		System.out.println("DAO impl");
	}

	@Override
	public String getReport() {
		System.out.println("Fetching report data from DB");
		return "repostData";
	}

}
