package com.get.interview.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.Application;

@Repository
public interface IApplicationDao extends CrudRepository<Application, Long>{

}
