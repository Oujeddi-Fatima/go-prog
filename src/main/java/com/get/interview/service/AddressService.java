package com.get.interview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.get.interview.model.Address;
import com.get.interview.repository.IAddressDao;

@Service
public class AddressService implements IAddressService{
	
	@Autowired
	private IAddressDao addressDao;
	
	@Override
	public void save(Address address) {
		
		addressDao.save(address);
	}

	@Override
	public void delete(Address address) {
		addressDao.delete(address);
	}

	@Override
	public Address find(Long id) {
		
		return addressDao.findById(id).get();
	}

	@Override
	public List<Address> findByCity(String city) {		
		return addressDao.findByCity(city);
	}

	@Override
	public List<Address> findByZip(String zip) {
		
		return null;
	}

	@Override
	public List<Address> findByState(String state) {
		
		return null;
	}
	
	public IAddressDao getAddressDao() {
		return addressDao;
	}

	public void setAddressDao(IAddressDao addressDao) {
		this.addressDao = addressDao;
	}


}
