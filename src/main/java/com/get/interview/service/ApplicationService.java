package com.get.interview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.get.interview.model.Application;
import com.get.interview.repository.IApplicationDao;

@Service
public class ApplicationService implements IApplicationService{

	@Autowired
	private IApplicationDao applicationDao;
	
	@Override
	public void delete(Long id) {	
		applicationDao.deleteById(id);
	}

	@Override
	public List<Application> findByJobPost(Long jobPostId) {	
		return applicationDao.findByJobPost(jobPostId);
	}

	@Override
	public Application findByUser(Long userId) {
		return applicationDao.findByUser(userId);
	}

	@Override
	public Application save(Application application) {
		return applicationDao.save(application);
	}

	@Override
	public List<Application> findAll() {
		return (List<Application>) applicationDao.findAll();
	}

	public IApplicationDao getApplicationDao() {
		return applicationDao;
	}

	public void setApplicationDao(IApplicationDao applicationDao) {
		this.applicationDao = applicationDao;
	}

	
}
