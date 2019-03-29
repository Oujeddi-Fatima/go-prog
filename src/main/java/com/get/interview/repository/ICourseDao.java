package com.get.interview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.Course;

@Repository
public interface ICourseDao extends CrudRepository<Course, Long>{
	
	@Query(value ="FROM Course WHERE title =: title")
	public List<Course> find(String title);

}
