package com.get.interview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.get.interview.model.AcademicRecord;
import com.get.interview.repository.IAcademicRecordDao;

@Service
public class AcademicRecordService implements IAcademicRecordService{
	
	@Autowired
	private IAcademicRecordDao academicRecordDao;

	@Override
	public void save(AcademicRecord academicRecord) {
		academicRecordDao.save(academicRecord);
	}

	@Override
	public void delete(AcademicRecord academicRecord) {
		academicRecordDao.delete(academicRecord);
	}

	@Override
	public List<AcademicRecord> findByGpa(float gpa) {
		return academicRecordDao.findByGpa(gpa);
	}



	public IAcademicRecordDao getAcademicRecordDao() {
		return academicRecordDao;
	}

	public void setAcademicRecordDao(IAcademicRecordDao academicRecordDao) {
		this.academicRecordDao = academicRecordDao;
	}
	

}
