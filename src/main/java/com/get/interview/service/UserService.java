package com.get.interview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.get.interview.model.Address;
import com.get.interview.model.User;
import com.get.interview.persistence.IUserDao;

@Service
public class UserService implements IUserService {

	@Autowired 
	private IUserDao userDao;
	
	@Override
	public User save(User user) {
		return userDao.save(user);
	}
	@Override
	public List<User> findAll(){
		return (List<User>) userDao.findAll();
	}
	@Override
	public User findById(long userId){
		return userDao.findById(userId).get();
	}

	
	
	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}
	
	
	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<User> findByAddress(Address location) {
		// TODO Auto-generated method stub
		return null;
	}
}
