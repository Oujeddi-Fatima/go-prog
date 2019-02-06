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
import com.get.interview.model.Certification;
import com.get.interview.model.Degree;
import com.get.interview.model.Resume;
import com.get.interview.model.WorkExperience;
import com.get.interview.service.IResumeService;

@RestController
@RequestMapping("Resume")
public class ResumeController {
	
	@Autowired
	private IResumeService resumeService;

	@RequestMapping(method = RequestMethod.POST)
	public void saveUser(@RequestBody Resume resume) {
		resumeService.save(resume);
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public void deleteUser(@RequestBody long id) {
		resumeService.delete(id);
	}
	
	@RequestMapping(value="{id}", method = RequestMethod.GET)
	public @ResponseBody Resume getUser(@PathVariable long id) {
		return resumeService.find(id);
	}
	
	@RequestMapping(value="{address}", method = RequestMethod.GET)
	public @ResponseBody List<Resume> getUsers(@PathVariable Address address) {
		return resumeService.findByAddress(address);
	}
	
	@RequestMapping(value="{keyString}", method = RequestMethod.GET)
	public @ResponseBody List<Resume> getUsers(@PathVariable String keyString) {
		return resumeService.findByKey(keyString);
	}
	
	@RequestMapping(value="{userId}", method = RequestMethod.GET)
	public @ResponseBody Resume getUsers(@PathVariable long userId) {
		return resumeService.findByUser(userId);
	}
	
	@RequestMapping(value="{workExperience}", method = RequestMethod.GET)
	public @ResponseBody List<Resume> getUsers(@PathVariable WorkExperience workExperience) {
		return resumeService.findByExperience(workExperience);
	}
	
	@RequestMapping(value="{degree}", method = RequestMethod.GET)
	public @ResponseBody List<Resume> getUsers(@PathVariable Degree degree) {
		return resumeService.findByDegree(degree);
	}
	
	@RequestMapping(value="{certification}", method = RequestMethod.GET)
	public @ResponseBody List<Resume> getUsers(@PathVariable Certification certification) {
		return resumeService.findByCertification(certification);
	}
	
	
	public IResumeService getResumeService() {
		return resumeService;
	}

	public void setResumeService(IResumeService resumeService) {
		this.resumeService = resumeService;
	}

	
}
