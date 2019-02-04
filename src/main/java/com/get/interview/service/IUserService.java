package com.get.interview.service;

import java.util.List;

import com.get.interview.model.Address;
import com.get.interview.model.User;

public interface IUserService {

	User save(User user);

	List<User> findAll();

	User findById(long userId);
	
	User update(User user);
	
	void delete(User user);
	
	List<User> findByAddress(Address location);	

}
