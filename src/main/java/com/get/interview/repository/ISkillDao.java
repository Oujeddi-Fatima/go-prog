package com.get.interview.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.get.interview.model.Skill;

@Repository
public interface ISkillDao extends CrudRepository<Skill, Long> {

}
