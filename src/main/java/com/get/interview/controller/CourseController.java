package com.get.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.get.interview.model.Course;
import com.get.interview.service.ICourseService;

@RestController
@RequestMapping("course")
public class CourseController {
	
	@Autowired
	private ICourseService courseService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody Course course) {
		
		courseService.save(course);
	}
	@RequestMapping(method = RequestMethod.DELETE)
	public void delete(@RequestBody long id) {
		
		courseService.delete(id);
	}
	@RequestMapping(value ="{title}", method = RequestMethod.GET)
	public List<Course> find(@PathVariable String title){
		
		return courseService.find(title);
	}
	

	public ICourseService getCourseService() {
		return courseService;
	}

	public void setCourseService(ICourseService courseService) {
		this.courseService = courseService;
	}
	
	

}
