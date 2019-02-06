package com.get.interview.service;

import java.util.List;

import com.get.interview.model.Application;

public interface IApplicationService {

	Application save(Application application);
	
	void delete(Long id);
	
	List<Application> findAll();
	
	List<Application> findByJobPost(Long jobPostId);
	
	List<Application> findByUser(Long userId);
	
	
}
