package com.get.interview.model;

import java.util.Date;
import java.util.List;

public class JobPost {
	
	private String title;
	private String level;
	private String description;
	private String requirement;
	private String requiredQalification;
	private Date postDate;
	private Date closeDate;
	private Long estimatedSalary;
	
	private Company company;
	private Address address;
	private List<Question> questions;
	private List<Application> applications;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRequirement() {
		return requirement;
	}
	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}
	public String getRequiredQalification() {
		return requiredQalification;
	}
	public void setRequiredQalification(String requiredQalification) {
		this.requiredQalification = requiredQalification;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public Date getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}
	public Long getEstimatedSalary() {
		return estimatedSalary;
	}
	public void setEstimatedSalary(Long estimatedSalary) {
		this.estimatedSalary = estimatedSalary;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	public List<Application> getApplications() {
		return applications;
	}
	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}
	
	
}