package com.get.interview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.get.interview.model.Course;
import com.get.interview.repository.ICourseDao;

@Service
public class CourseService implements ICourseService{
	
	@Autowired
	private ICourseDao courseDao; 

	@Override
	public void save(Course course) {
		
		courseDao.save(course);
		
	}

	@Override
	public void delete(long id) {
		courseDao.deleteById(id);
	}

	@Override
	public List<Course> find(String title) {
		
		return null;
	}
	
	public ICourseDao getCourseDao() {
		return courseDao;
	}

	public void setCourseDao(ICourseDao courseDao) {
		this.courseDao = courseDao;
	}

}
