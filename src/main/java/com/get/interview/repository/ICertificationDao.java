package com.get.interview.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.Certification;

@Repository
public interface ICertificationDao extends CrudRepository<Certification, Long>{

}
