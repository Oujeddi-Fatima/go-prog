package com.get.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.get.interview.model.Application;
import com.get.interview.service.IApplicationService;

@RestController
@RequestMapping("application")
public class ApplicationController {
	
	@Autowired
	private IApplicationService applicationService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody Application application) {	
		applicationService.save(application);
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public void delete(@RequestBody Long id) {
		applicationService.delete(id);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Application> findAll(){		
		return applicationService.findAll();
	}
	
	@RequestMapping(value = "{jobPostId}", method = RequestMethod.GET)
	public @ResponseBody List<Application> findByJobPost(@PathVariable Long jobPostId){		
		return applicationService.findByJobPost(jobPostId);
	}
	
	@RequestMapping(value = "{userId}", method = RequestMethod.GET)
	public @ResponseBody Application findByUser(@PathVariable Long userId){		
		return applicationService.findByUser(userId);
	}

	public IApplicationService getApplicationService() {
		return applicationService;
	}

	public void setApplicationService(IApplicationService applicationService) {
		this.applicationService = applicationService;
	}
	
	

}
