package com.get.interview.service;

import java.util.List;

import com.get.interview.model.Course;

public interface ICourseService {

	void save(Course course);
	
	void delete(long id);
	
	List<Course> findByTitle(String title);
}
