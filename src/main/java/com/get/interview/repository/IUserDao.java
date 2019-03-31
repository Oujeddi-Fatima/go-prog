package com.get.interview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.Address;
import com.get.interview.model.User;

@Repository
public interface IUserDao extends CrudRepository<User, Long>{

	@Query(value = "FROM User WHERE id =: user")
	public User update(User user);
	
	@Query(value = "FROM User WHERE firstName =: name")
	public List<User> findByfirstName(String name);

	public User findByUsernameAndPassword(String username, String password);
}
