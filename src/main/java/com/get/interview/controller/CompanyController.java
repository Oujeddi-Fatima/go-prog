package com.get.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.get.interview.model.BusinessType;
import com.get.interview.model.Company;
import com.get.interview.service.ICompanyService;

@RestController
@RequestMapping("company")
public class CompanyController{
	
	@Autowired
	private ICompanyService companyService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void saveUser(@RequestBody Company company) {
		companyService.save(company);
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public void deleteUser(@RequestBody long id) {
		companyService.delete(id);
	}
	
	@RequestMapping(value ="{name}", method = RequestMethod.GET)
	public @ResponseBody Company getCompany(@PathVariable String name) {	
		return companyService.findByName(name);
	}
	
	@RequestMapping(value ="{id}", method = RequestMethod.GET)
	public @ResponseBody Company getCompany(@PathVariable long id) {	
		return companyService.find(id);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Company> getCompany(){
		return companyService.findAll();
	}
	
	@RequestMapping(value = "{businessType}", method = RequestMethod.GET)
	public  @ResponseBody List<Company> getBusiness(@PathVariable BusinessType businessType){
		return companyService.findByBusinessType(businessType);
	}

	public ICompanyService getCompanyService() {
		return companyService;
	}

	public void setCompanyService(ICompanyService companyService) {
		this.companyService = companyService;
	}
	
	

}
