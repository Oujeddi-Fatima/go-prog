package com.get.interview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.Company;
import com.get.interview.model.Employer;

@Repository
public interface IEmployerDao extends CrudRepository<Employer, Long> {

	@Query(value = "FROM Employer WHERE jobTitle=: job")
	public Employer find(String job) ;
	
	@Query(value = "FROM Employer WHERE company=: company")
	public List<Employer> findbyCompany(Company company) ;
}
