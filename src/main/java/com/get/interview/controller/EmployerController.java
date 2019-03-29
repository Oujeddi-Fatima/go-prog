package com.get.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.get.interview.model.Company;
import com.get.interview.model.Employer;
import com.get.interview.service.IEmployerService;

@RestController
@RequestMapping("employer")
public class EmployerController {
	
	@Autowired
	private IEmployerService employerService;
	
	@RequestMapping(method = RequestMethod.POST)
    public void save(@RequestBody Employer employer) {
		employerService.save(employer);
    }
	
	@RequestMapping(method = RequestMethod.DELETE)

	public void delete(@RequestBody Employer employer) {
		employerService.delete(employer);
	}
	
	@RequestMapping(value = "{job}",method = RequestMethod.GET)
	public @ResponseBody Employer find(@RequestBody String job) {
		return employerService.find(job);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Iterable<Employer> find() {
		return employerService.findAll();
	}
	

	@RequestMapping(value = "{company}",method = RequestMethod.GET)
	public @ResponseBody List<Employer> findbyCompany(@PathVariable Company company){
		return employerService.findbyCompany(company);	
	}

	public IEmployerService getEmployerService() {
		return employerService;
	}

	public void setEmployerService(IEmployerService employerService) {
		this.employerService = employerService;
	}
	
	

}
