package com.get.interview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.BusinessType;
import com.get.interview.model.Company;

@Repository
public interface ICompanyDao extends CrudRepository<Company, Long> {
	
	@Query(value = "FROM Company WHERE name =: name")
	public Company findByName(String name);
	
	@Query(value = "FROM Company WHERE id =: id")
	public Company find(long id);
	
	@Query(value = "FROM Company WHERE businessType =: businessType")
	public List<Company> findByBusinessType(BusinessType businessType);

}
