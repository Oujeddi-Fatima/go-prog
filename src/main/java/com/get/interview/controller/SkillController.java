package com.get.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.get.interview.service.ISkillService;

@RestController
@RequestMapping("skill")
public class SkillController {
	
	@Autowired
	private ISkillService skillService;


	
	
	
	public ISkillService getSkillService() {
		return skillService;
	}

	public void setSkillService(ISkillService skillService) {
		this.skillService = skillService;
	}
}
