package com.get.interview.service;

import java.util.List;

import com.get.interview.model.Address;
import com.get.interview.model.JobPost;

public interface IJobPostService {

	JobPost save(JobPost jobPost);
	
	void delete(Long id);
	
	List<JobPost> findAll();
	
	List<JobPost> findByAddress(Address address);
	
	List<JobPost> findByKey(String keyString);
}
