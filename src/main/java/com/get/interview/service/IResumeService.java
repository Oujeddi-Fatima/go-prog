package com.get.interview.service;

import java.util.List;

import com.get.interview.model.Address;
import com.get.interview.model.Certification;
import com.get.interview.model.Degree;
import com.get.interview.model.Resume;
import com.get.interview.model.WorkExperience;

public interface IResumeService {

	Resume save(Resume resume);
	
	void delete(Resume resume);
	
	Resume find(long id);
	
	List<Resume> findByKey(String keyString);
	
	Resume findByUser(long userId);
	
}
