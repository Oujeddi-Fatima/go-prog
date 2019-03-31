package com.get.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.get.interview.model.Address;
import com.get.interview.model.JobPost;
import com.get.interview.service.IJobPostService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("jobpost")
public class JobPostController {

	@Autowired
	private IJobPostService jobpostService;

	@RequestMapping(method = RequestMethod.POST)
	public void saveJobPost(@RequestBody JobPost jobPost) {
		jobpostService.save(jobPost);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	public void deleteJobPost(@PathVariable Long id) {
		jobpostService.delete(id);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public JobPost getJobPostById(@PathVariable Long id) {
		return jobpostService.findById(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Iterable<JobPost> getJobPosts() {
		return jobpostService.findAll();
	}

	@RequestMapping(value = "address", method = RequestMethod.POST)
	public @ResponseBody List<JobPost> getJobPosts(@RequestBody Address address) {
		return jobpostService.findByAddress(address);
	}

	@RequestMapping(value = "title/{title}", method = RequestMethod.GET)
	public @ResponseBody List<JobPost> findByTitle(@PathVariable String title) {
		return jobpostService.findByTitle(title);
	}

	public IJobPostService getJobpostService() {
		return jobpostService;
	}

	public void setJobpostService(IJobPostService jobpostService) {
		this.jobpostService = jobpostService;
	}

}
