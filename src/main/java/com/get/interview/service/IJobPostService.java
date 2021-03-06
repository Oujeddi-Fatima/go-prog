package com.get.interview.service;

import java.util.List;

import com.get.interview.model.Address;
import com.get.interview.model.JobPost;
import com.get.interview.model.Skill;

public interface IJobPostService {

	JobPost save(JobPost jobPost);
	
	void delete(Long id);
	
	Iterable<JobPost> findAll();
	
	List<JobPost> findByAddress(Address address);
	
	List<JobPost> findByTitle(String keyString);
	
	Iterable<JobPost> findByUserId(long id);

	JobPost findById(Long id);

	Iterable<JobPost> findAllBySkill(List<Skill> skill);
}
