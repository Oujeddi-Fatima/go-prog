package com.get.interview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.Skill;

@Repository
public interface ISkillDao extends CrudRepository<Skill, Long> {

	
	@Query("From Skill WHERE skill like :skill")
	List<Skill> findAllBySkill(String skill);
}
