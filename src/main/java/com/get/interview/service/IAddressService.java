package com.get.interview.service;

import java.util.List;

import com.get.interview.model.Address;

public interface IAddressService {
	
	void save(Address address);
	
	void delete(Address address);
	
	List<Address> findByCity(String street);
	
	List<Address> findByZip(String zip);
	
	List<Address> findByState(String state);

	Address find(Long id);



}
