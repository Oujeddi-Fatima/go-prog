package com.get.interview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.AcademicRecord;

@Repository
public interface IAcademicRecordDao extends CrudRepository<AcademicRecord, Long>{


	
	@Query(value="FROM AcademicRecord WHERE gpa= : gpa")
	public List<AcademicRecord> findByGpa(float gpa);
	
}
