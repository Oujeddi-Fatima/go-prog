package com.get.interview.service;

import java.util.List;

import com.get.interview.model.Company;
import com.get.interview.model.Employer;

public interface IEmployerService {

	void save(Employer employer) ;
	
	void delete(Employer employer) ;
	
	Employer find(String job) ;
	
	List<Employer> findbyCompany(Company company) ;

	Iterable<Employer> findAll();
}
