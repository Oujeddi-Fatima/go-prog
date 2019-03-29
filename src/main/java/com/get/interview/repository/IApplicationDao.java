package com.get.interview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.Application;

@Repository
public interface IApplicationDao extends CrudRepository<Application, Long>{
	
	@Query(value= "FROM Application WHERE jobPost.id= :jobPostId")
	public List<Application> findByJobPost(Long jobPostId);
	
	@Query(value= "FROM Application WHERE applicant.id=: userId")
	public Application findByUser(Long userId);
}
