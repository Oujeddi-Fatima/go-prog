package com.get.interview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.get.interview.model.Company;
import com.get.interview.model.Employer;
import com.get.interview.repository.IEmployerDao;

@Service
public class EmployerService implements IEmployerService {

	@Autowired
	private IEmployerDao employerDao;

	@Override
	public void save(Employer employer) {
		if(employer.getCompany() != null)
		employer.getCompany().stream().forEach((company) -> {
			company.setEmployer(employer);
		});
		employerDao.save(employer);
	}

	@Override
	public void delete(Employer employer) {
		employerDao.delete(employer);
	}

	@Override
	public Employer find(String job) {
		return employerDao.find(job);
	}

	@Override
	public List<Employer> findbyCompany(Company company) {
		return employerDao.findbyCompany(company);
	}

	public IEmployerDao getEmployerDao() {
		return employerDao;
	}

	public void setEmployerDao(IEmployerDao employerDao) {
		this.employerDao = employerDao;
	}

	@Override
	public Iterable<Employer> findAll() {
		// TODO Auto-generated method stub
		return employerDao.findAll();
	}

	@Override
	public Employer findById(long id) {
		if (employerDao.findById(id).isPresent())
			return employerDao.findById(id).get();
		else
			return null;
	}

}
