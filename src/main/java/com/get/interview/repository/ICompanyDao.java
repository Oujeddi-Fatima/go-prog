package com.get.interview.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.Company;

@Repository
public interface ICompanyDao extends CrudRepository<Company, Long> {

	public static final String LIST_COMPANIES = "SELECT id, name FROM Company";

	@Query(value = LIST_COMPANIES, nativeQuery = true)
	Iterable<Company> findName();
}
