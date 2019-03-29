package com.get.interview.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.Certification;

@Repository
public interface ICertificationDao extends CrudRepository<Certification, Long>{
	
	//@Query(value = "FROM Certification WHERE resume2.id=: id")
	//public List<Certification> findByReume(long id);
	
	@Query(value = "FROM Certification WHERE expirationDate= : date")
	public Certification findByexpirationDate(Date date);

}
