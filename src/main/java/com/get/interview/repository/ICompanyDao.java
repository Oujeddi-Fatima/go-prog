package com.get.interview.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.Company;

@Repository
public interface ICompanyDao extends CrudRepository<Company, Long> {

}
