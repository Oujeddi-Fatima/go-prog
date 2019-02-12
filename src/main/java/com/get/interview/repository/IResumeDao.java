package com.get.interview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.Resume;

@Repository
public interface IResumeDao extends CrudRepository<Resume, Long>{
	
	@Query(value = "FROM Resume WHERE id = :id")
	public Resume find(long id);
	
	@Query(value = "FROM Resume WHERE title = :keyString")
	public List<Resume> findByKey(String keyString);
	
	@Query(value = "FROM Resume WHERE id = :userId")
	public Resume findByUser(long userId);
	

}
