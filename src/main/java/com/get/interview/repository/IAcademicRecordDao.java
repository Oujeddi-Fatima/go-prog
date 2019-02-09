package com.get.interview.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.AcademicRecord;

@Repository
public interface IAcademicRecordDao extends CrudRepository<AcademicRecord, Long>{

}
