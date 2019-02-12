package com.get.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.get.interview.model.User;
import com.get.interview.service.IUserService;

@RestController
@RequestMapping("User")
public class UserController {
		
	@Autowired
	private IUserService userService;
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody User saveUser(@RequestBody User user) {
		return userService.save(user);
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
	
	@RequestMapping(value="name", method = RequestMethod.GET) 
	public @ResponseBody List<User> findByfirstName(@PathVariable String name){
		return userService.findByfirstName(name);		
	}
	  
	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
}
