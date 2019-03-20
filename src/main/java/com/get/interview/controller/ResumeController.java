package com.get.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.get.interview.model.Resume;
import com.get.interview.service.IResumeService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("resume")
public class ResumeController {
	
	@Autowired
	private IResumeService resumeService;

	@RequestMapping(method = RequestMethod.POST)
	public long saveResume(@RequestBody Resume resume) {
		return resumeService.save(resume).getId();
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public void deleteResume(@RequestBody long id) {
		resumeService.delete(id);
	}
	
	@RequestMapping(value="{id}", method = RequestMethod.GET)
	public @ResponseBody Resume getResume(@PathVariable long id) {
		return resumeService.find(id);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Iterable<Resume> getResumes() {
		return resumeService.find();
	}
	
	
	
	public IResumeService getResumeService() {
		return resumeService;
	}

	public void setResumeService(IResumeService resumeService) {
		this.resumeService = resumeService;
	}

	
}
