package com.get.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.get.interview.model.JobPost;
import com.get.interview.model.Skill;
import com.get.interview.model.User;
import com.get.interview.service.ISkillService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("skill")
public class SkillController {
	
	@Autowired
	private ISkillService skillService;

	@RequestMapping(params = { "skill" }, method = RequestMethod.GET)
	public @ResponseBody Iterable<Skill> findAllBySkill(@RequestParam String skill) {
		return skillService.findAllBySkill(skill);
	}
	
	
	public ISkillService getSkillService() {
		return skillService;
	}

	public void setSkillService(ISkillService skillService) {
		this.skillService = skillService;
	}
}
