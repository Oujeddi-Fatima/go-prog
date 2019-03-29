package com.get.interview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.get.interview.model.Address;
import com.get.interview.model.JobPost;
import com.get.interview.repository.IJobPostDao;

@Service
public class JobPostService implements IJobPostService{
	
	@Autowired
	private IJobPostDao jobpostDao;

	@Override
	public JobPost save(JobPost jobPost) {	
		return jobpostDao.save(jobPost);
	}

	@Override
	public void delete(Long id) {	
		 jobpostDao.deleteById(id);	
	}

	@Override
	public List<JobPost> findAll() {
		return (List<JobPost>) jobpostDao.findAll();
	}

	@Override
	public List<JobPost> findByAddress(Address address) {
		return  jobpostDao.findByAddress(address);
	}

	@Override
	public List<JobPost> findByKey(String keyString) {
		return jobpostDao.findByKey(keyString);
	}

	public IJobPostDao getJobpostDao() {
		return jobpostDao;
	}

	public void setJobpostDao(IJobPostDao jobpostDao) {
		this.jobpostDao = jobpostDao;
	}

}
