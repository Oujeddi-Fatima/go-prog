package com.get.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.get.interview.model.Degree;
import com.get.interview.model.User;
import com.get.interview.service.IUserService;
import com.get.interview.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
		
	@Autowired
	private IUserService userService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void saveUser(@RequestBody User user) {
		userService.save(user);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<User> getUsers() {
		return userService.findAll();
	}

	@RequestMapping(value="{id}", method = RequestMethod.GET)
	public @ResponseBody User getUser(@PathVariable long id)  {
		return userService.findById(id);
	}
	
	@RequestMapping(value="user", method = RequestMethod.GET)
	public @ResponseBody User updateUser(@PathVariable User user) {
		return userService.update(user);
	}
	
	
	 @RequestMapping(method = RequestMethod.DELETE) 
	 public void deleteUser(@RequestBody User user) {
		 userService.delete(user);
		 }
	 
	
	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
}
