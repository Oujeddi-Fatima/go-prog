package com.get.interview.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.JobPost;
import com.get.interview.model.Skill;

@Repository
public interface ISkillDao extends CrudRepository<Skill, Long> {

	
	@Query("From Skill WHERE Skill like :skill")
	Iterable<Skill> findAllBySkill(String skill);

}
