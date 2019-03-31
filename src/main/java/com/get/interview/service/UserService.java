package com.get.interview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.get.interview.model.Address;
import com.get.interview.model.Resume;
import com.get.interview.model.User;
import com.get.interview.repository.IUserDao;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Override
	public User save(User user) {
		return userDao.save(user);
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
	}

	@Override
	public List<User> findAll() {
		return (List<User>) userDao.findAll();
	}

	@Override
	public User findById(long userId) {
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
		return userDao.update(user);
	}

	@Override
	public List<User> findByfirstName(String name) {
		return userDao.findByfirstName(name);
	}

	@Override
	public User findByUsernamePwd(String username, String pwd) {
		return userDao.findByUsernameAndPassword(username, pwd);
	}

	@Override
	public void saveUserResume(long userId, Resume resume) {
		User user = userDao.findById(userId).get();
		user.setResume(resume);
		resume.setUser(user);
		userDao.save(user);
	}
}
