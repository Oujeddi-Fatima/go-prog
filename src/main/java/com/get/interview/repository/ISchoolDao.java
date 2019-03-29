package com.get.interview.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.School;

@Repository
public interface ISchoolDao extends CrudRepository<School, Long>{

}
