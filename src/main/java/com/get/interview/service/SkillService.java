package com.get.interview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.get.interview.model.JobPost;
import com.get.interview.model.Skill;
import com.get.interview.repository.ISkillDao;

@Service
public class SkillService implements ISkillService {
	@Autowired
	private ISkillDao skillDao;
	
	public final ISkillDao getSkillDao() {
		return skillDao;
	}

	public final void setSkillDao(ISkillDao skillDao) {
		this.skillDao = skillDao;
	}

	@Override
	public Iterable<Skill> findAllBySkill(String skill) {
		return skillDao.findAllBySkill(skill);
	}
}
