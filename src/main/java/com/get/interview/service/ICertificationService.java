package com.get.interview.service;

import java.util.Date;
import java.util.List;

import com.get.interview.model.Certification;

public interface ICertificationService {
	
	Certification save(Certification certification);
	
	void delete(long id);
	
	Certification findById(long id);
	
	List<Certification> findAll();
	
	Certification findByexpirationDate(Date date);
	
	

}
