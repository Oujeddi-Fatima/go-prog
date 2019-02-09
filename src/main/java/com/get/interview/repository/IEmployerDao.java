package com.get.interview.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.Employer;

@Repository
public interface IEmployerDao extends CrudRepository<Employer, Long> {

}
