package com.get.interview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.Address;


@Repository
public interface IAddressDao extends CrudRepository<Address, Long>{
	
	@Query(value= "FROM Address where city= :city")
	public List<Address> findByCity(String city);

}
