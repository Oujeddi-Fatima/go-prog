package com.get.interview.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.get.interview.model.Application;
import com.get.interview.model.JobPost;
import com.get.interview.model.Note;
import com.get.interview.model.Resume;
import com.get.interview.model.SearchHistory;
import com.get.interview.model.User;
import com.get.interview.service.IUserService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private IUserService userService;

	@RequestMapping(method = RequestMethod.POST)
	public void saveUser(@RequestBody User user) {
		userService.save(user);
	}

	@RequestMapping(value = "{userId}/resume", method = RequestMethod.POST)
	public void saveUserResume(@PathVariable long userId, @RequestBody Resume resume) {
		userService.saveUserResume(userId, resume);
	}

	@RequestMapping(value = "{userId}/application", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveUserApplication(@PathVariable long userId, @RequestBody Application application) {
		userService.saveUserApplication(userId, application);
	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<User> getUsers() {
		List<User> users = userService.findAll();
		for (final User user : users) {
			Link selfLink = linkTo(methodOn(UserController.class).getUser(user.getUserId())).withSelfRel();
			Link resumeLink = linkTo(methodOn(UserController.class).getUserResume(user.getUserId())).withRel("resume");
			user.add(selfLink);
			user.add(resumeLink);
		}

		return users;
	}

	@RequestMapping(params = { "username", "password" }, method = RequestMethod.GET)
	public @ResponseBody User getUser(@RequestParam String username, @RequestParam(name = "password") String pwd) {
		User user = userService.findByUsernamePwd(username, pwd);
		Link resumeLink = linkTo(methodOn(UserController.class).getUserResume(user.getUserId())).withRel("resume");
		Link applicationsLink = linkTo(methodOn(UserController.class).getUserApplication(user.getUserId()))
				.withRel("applications");
		Link applicationsNotes = linkTo(methodOn(UserController.class).getUserNotes(user.getUserId())).withRel("notes");
		Link savedJobsLink = linkTo(methodOn(UserController.class).getUserSavedJobs(user.getUserId()))
				.withRel("savedJobs");
		Link searchHistoryLink = linkTo(methodOn(UserController.class).getUserSearchHistory(user.getUserId()))
				.withRel("searchHistory");
		Link isEmployer = linkTo(methodOn(EmployerController.class).find(user.getUserId())).withRel("employer");
		user.add(savedJobsLink);
		user.add(searchHistoryLink);
		user.add(resumeLink);
		user.add(applicationsLink);
		user.add(applicationsNotes);
		user.add(isEmployer);
		return user;
	}

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public @ResponseBody User getUser(@PathVariable long id) {
		User user = userService.findById(id);
		Link resumeLink = linkTo(methodOn(UserController.class).getUserResume(user.getUserId())).withRel("resume");
		Link applicationsLink = linkTo(methodOn(UserController.class).getUserApplication(user.getUserId()))
				.withRel("applications");
		Link applicationsNotes = linkTo(methodOn(UserController.class).getUserNotes(user.getUserId())).withRel("notes");
		Link savedJobsLink = linkTo(methodOn(UserController.class).getUserSavedJobs(user.getUserId()))
				.withRel("savedJobs");
		Link searchHistoryLink = linkTo(methodOn(UserController.class).getUserSearchHistory(user.getUserId()))
				.withRel("searchHistory");
		Link isEmployer = linkTo(methodOn(EmployerController.class).find(user.getUserId())).withRel("employer");
		user.add(savedJobsLink);
		user.add(searchHistoryLink);
		user.add(resumeLink);
		user.add(applicationsLink);
		user.add(applicationsNotes);
		user.add(isEmployer);
		return user;
	}

	@RequestMapping(value = "{id}/resume", method = RequestMethod.GET)
	public @ResponseBody Resume getUserResume(@PathVariable long id) {
		return userService.findById(id).getResume();
	}

	@RequestMapping(value = "{id}/applications", method = RequestMethod.GET)
	public @ResponseBody List<Application> getUserApplication(@PathVariable long id) {
		return userService.findById(id).getApplications();
	}

	@RequestMapping(value = "{id}/notes", method = RequestMethod.GET)
	public @ResponseBody List<Note> getUserNotes(@PathVariable long id) {
		return userService.findById(id).getNotes();
	}

	@RequestMapping(value = "{id}/savedjobs", method = RequestMethod.GET)
	public @ResponseBody List<JobPost> getUserSavedJobs(@PathVariable long id) {
		return userService.findById(id).getSavedJobs();
	}

	@RequestMapping(value = "{id}/history", method = RequestMethod.GET)
	public @ResponseBody List<SearchHistory> getUserSearchHistory(@PathVariable long id) {
		return userService.findById(id).getSearchHistory();
	}
//	@RequestMapping(value = "{user}", method = RequestMethod.GET)
//	public @ResponseBody User updateUser(@PathVariable User user) {
//		return userService.update(user);
//	}

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
