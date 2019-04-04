package com.get.interview.service;

import com.get.interview.model.JobPost;
import com.get.interview.model.Skill;

public interface ISkillService {

	Iterable<Skill> findAllBySkill(String skill);

}
