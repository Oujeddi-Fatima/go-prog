package com.get.interview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.Address;
import com.get.interview.model.JobPost;

@Repository
public interface IJobPostDao extends CrudRepository<JobPost, Long>{
	
	@Query(value = "FROM JobPost WHERE address.id =: address")
	public List<JobPost> findByAddress(Address address);
	
	@Query(value ="FROM JobPost WHERE title=: keyString")
	public List<JobPost> findByKey(String keyString);

}
