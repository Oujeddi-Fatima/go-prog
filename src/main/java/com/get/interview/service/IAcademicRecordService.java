package com.get.interview.service;

import java.util.List;

import com.get.interview.model.AcademicRecord;

public interface IAcademicRecordService {

	
	void save(AcademicRecord academicRecord);
	
	void delete(AcademicRecord academicRecord);
	
	List<AcademicRecord> findAll();
	
	List<AcademicRecord> findByResume(Long resumeId);
}