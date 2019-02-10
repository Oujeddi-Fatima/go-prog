package com.get.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.get.interview.model.AcademicRecord;
import com.get.interview.service.IAcademicRecordService;

@RestController
@RequestMapping("academicrecord")
public class AcademicRecordController {
	
	@Autowired
	private IAcademicRecordService academicRecordService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody AcademicRecord academicRecord) {
	
		academicRecordService.save(academicRecord);
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public void delete(@RequestBody AcademicRecord academicRecord) {
		academicRecordService.delete(academicRecord);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<AcademicRecord> findAll(){
	
		return academicRecordService.findAll();
	}

	@RequestMapping(value = "{resumeId}", method = RequestMethod.GET)
	public @ResponseBody List<AcademicRecord> findByResume(@PathVariable Long resumeId){
		return academicRecordService.findByResume(resumeId);
		
	}
	public IAcademicRecordService getAcademicRecordService() {
		return academicRecordService;
	}

	public void setAcademicRecordService(IAcademicRecordService academicRecordService) {
		this.academicRecordService = academicRecordService;
	}
	
	
	

}
