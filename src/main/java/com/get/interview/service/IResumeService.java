package com.get.interview.service;

import java.util.List;

import com.get.interview.model.Address;
import com.get.interview.model.Certification;
import com.get.interview.model.Degree;
import com.get.interview.model.Resume;
import com.get.interview.model.WorkExperience;

public interface IResumeService {

	Resume save(Resume resume);
	
	void delete(long id);
	
	Resume find(long id);
	
	List<Resume> findByAddress(Address address);
	
	List<Resume> findByKey(String keyString);
	
	Resume findByUser(long userId);
	
	List<Resume> findByExperience(WorkExperience workExperience);
	
	List<Resume> findByDegree(Degree degree);
	
	List<Resume> findByCertification(Certification certification);
	
}
