package com.get.interview.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.Resume;

@Repository
public interface IResumeDao extends CrudRepository<Resume, Long>{

}
