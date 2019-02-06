package com.get.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.get.interview.model.Address;
import com.get.interview.model.JobPost;
import com.get.interview.service.IJobPostService;

@RestController
@RequestMapping("JobPost")
public class JobPostController {
	
	@Autowired
	private IJobPostService jobpostService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void saveUser(@RequestBody JobPost jobPost){
		
		jobpostService.save(jobPost);
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public void deleteUser(@RequestBody Long id) {
		
		jobpostService.delete(id);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<JobPost> getUsers(@PathVariable JobPost jobpost){
		
		return jobpostService.findAll();	
	}
	
	@RequestMapping(value = "{address}", method = RequestMethod.GET)
	public @ResponseBody List<JobPost> getUsers(@PathVariable Address address){
		
		return jobpostService.findByAddress(address);
	}
	
	@RequestMapping(value = "{keyString}", method = RequestMethod.GET)
	public @ResponseBody List<JobPost> getUsers(@PathVariable String keyString){
		
		return jobpostService.findByKey(keyString);
	}

	public IJobPostService getJobpostService() {
		return jobpostService;
	}

	public void setJobpostService(IJobPostService jobpostService) {
		this.jobpostService = jobpostService;
	}
	
	

}
