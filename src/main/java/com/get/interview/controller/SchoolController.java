package com.get.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.get.interview.service.ISchoolService;

@RestController
@RequestMapping("school")
public class SchoolController {

	@Autowired
	private ISchoolService schoolService;


	
	
	public ISchoolService getSchoolService() {
		return schoolService;
	}

	public void setSchoolService(ISchoolService schoolService) {
		this.schoolService = schoolService;
	}
}
