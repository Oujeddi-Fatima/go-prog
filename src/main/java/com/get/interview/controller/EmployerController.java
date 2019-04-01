package com.get.interview.controller;

import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.get.interview.model.Company;
import com.get.interview.model.Employer;
import com.get.interview.model.JobPost;
import com.get.interview.model.User;
import com.get.interview.service.IEmployerService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("employer")
public class EmployerController {

	@Autowired
	private IEmployerService employerService;

	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestBody Employer employer) {
		employerService.save(employer);
	}

	@RequestMapping(method = RequestMethod.DELETE)

	public void delete(@RequestBody Employer employer) {
		employerService.delete(employer);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public @ResponseBody Employer find(@PathVariable long id) {
		Employer employer = employerService.findById(id);
		if (employer != null) {
			Link resumeLink = linkTo(methodOn(UserController.class).getUserResume(employer.getUserId()))
					.withRel("resume");
			Link applicationsLink = linkTo(methodOn(UserController.class).getUserApplication(employer.getUserId()))
					.withRel("applications");
			Link applicationsNotes = linkTo(methodOn(UserController.class).getUserNotes(employer.getUserId()))
					.withRel("notes");
			Link savedJobsLink = linkTo(methodOn(UserController.class).getUserSavedJobs(employer.getUserId()))
					.withRel("savedJobs");
			Link searchHistoryLink = linkTo(methodOn(UserController.class).getUserSearchHistory(employer.getUserId()))
					.withRel("searchHistory");

			Link isEmployer = linkTo(methodOn(EmployerController.class).find(employer.getUserId())).withRel("employer");
			Link companies = linkTo(methodOn(EmployerController.class).findCompany(employer.getUserId()))
					.withRel("companies");
			Link jobPosts = linkTo(methodOn(EmployerController.class).findJobPosts(employer.getUserId()))
					.withRel("jobPosts");

			employer.getCompany().stream().forEach(company -> {
				Link companyLink = linkTo(methodOn(CompanyController.class).getCompany(company.getCompanyId()))
						.withSelfRel();
				company.add(companyLink);
			});
			employer.getJobPosts().stream().forEach(jobPost -> {
				Link jobPostLink = linkTo(methodOn(JobPostController.class).getJobPostById(jobPost.getJobPostId()))
						.withSelfRel();
				jobPost.add(jobPostLink);
			});
			employer.add(savedJobsLink);
			employer.add(searchHistoryLink);
			employer.add(resumeLink);
			employer.add(applicationsLink);
			employer.add(applicationsNotes);
			employer.add(isEmployer);
			employer.add(companies);
			employer.add(jobPosts);
		}
		return employer;
	}

	@RequestMapping(value = "{id}/companies", method = RequestMethod.GET)
	public @ResponseBody List<Company> findCompany(@PathVariable long id) {
		return employerService.findById(id).getCompany();
	}

	@RequestMapping(value = "{id}/jobposts", method = RequestMethod.GET)
	public @ResponseBody List<JobPost> findJobPosts(@PathVariable long id) {
		return employerService.findById(id).getJobPosts();
	}

	@RequestMapping(params = { "job" }, method = RequestMethod.GET)
	public @ResponseBody Employer find(@RequestParam String job) {
		return employerService.find(job);
	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Iterable<Employer> find() {
		return employerService.findAll();
	}

	@RequestMapping(params = { "company" }, method = RequestMethod.GET)
	public @ResponseBody List<Employer> findbyCompany(@RequestParam Company company) {
		return employerService.findbyCompany(company);
	}

	public IEmployerService getEmployerService() {
		return employerService;
	}

	public void setEmployerService(IEmployerService employerService) {
		this.employerService = employerService;
	}

}
