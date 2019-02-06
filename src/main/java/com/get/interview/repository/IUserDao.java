package com.get.interview.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.get.interview.model.User;

@Repository
public interface IUserDao extends CrudRepository<User, Long>{

}
