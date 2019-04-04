package com.get.interview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.Address;
import com.get.interview.model.JobPost;
import com.get.interview.model.Skill;

@Repository
public interface IJobPostDao extends CrudRepository<JobPost, Long> {

	Iterable<JobPost> findByEmployerUserId(long id);

	@Query(value = "FROM JobPost WHERE address.id =: address")
	public List<JobPost> findByAddress(Address address);

	@Query(value = "FROM JobPost WHERE title=: title")
	public List<JobPost> findByTitle(String title);

	@Query(value = "select distinct * from job_post where id in (select job_post_id from job_post_skill where skill_id in( select id from skill where skill like :skill))", nativeQuery = true)
	List<JobPost> findAllByskill(String skill);

}
