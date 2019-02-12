package com.get.interview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.get.interview.model.BusinessType;
import com.get.interview.model.Company;
import com.get.interview.repository.ICompanyDao;

@Service
public class CompanyService implements ICompanyService{
	
	@Autowired
	private ICompanyDao companyDao;
	

	@Override
	public Company save(Company company) {	
		return companyDao.save(company);
	}

	@Override
	public void delete(long id) {	
		companyDao.deleteById(id);
	}

	@Override
	public Company findByName(String name) {
		return companyDao.findByName(name);
	}

	@Override
	public Company find(long id) {
		return companyDao.find(id);
	}

	@Override
	public List<Company> findAll() {
		return (List<Company>) companyDao.findAll();
	}

	@Override
	public List<Company> findByBusinessType(BusinessType businessType) {
		return companyDao.findByBusinessType(businessType);
	}	

	public ICompanyDao getCompanyDao() {
		return companyDao;
	}

	public void setCompanyDao(ICompanyDao companyDao) {
		this.companyDao = companyDao;
	}

}
