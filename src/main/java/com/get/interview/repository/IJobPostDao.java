package com.get.interview.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.JobPost;

@Repository
public interface IJobPostDao extends CrudRepository<JobPost, Long>{

}
