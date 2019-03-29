package com.get.interview.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.Course;

@Repository
public interface ICourseDao extends CrudRepository<Course, Long>{
	

	List<Course>  findByTitle(String tilte);

}
