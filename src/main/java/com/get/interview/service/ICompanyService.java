package com.get.interview.service;

import java.util.List;

import com.get.interview.model.BusinessType;
import com.get.interview.model.Company;

public interface ICompanyService {
	
	Company save(Company company);
	
	void delete(long id);
	
	Company findByName(String name);
	
	Company find(long id);
	
	List<Company> findAll();
	
	List<Company> findByBusinessType(BusinessType businessType);
}
