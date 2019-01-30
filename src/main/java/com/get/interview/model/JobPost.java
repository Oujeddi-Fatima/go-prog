package com.get.interview.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class JobPost {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String title;
	@Column
	private String level;
	@Column
	private String description;
	@Column
	private String requirement;
	@Column
	private String requiredQalification;
	@Column
	private Date postDate;
	@Column
	private Date closeDate;
	@Column
	private Long estimatedSalary;
	
	@OneToOne
	@JoinTable(name = "company_activity")
	private Company company;
	
	@OneToOne
	@JoinTable(name = "address_activity")
	private Address address;
	
	@OneToMany
	@JoinTable(name ="question_activity")
	private List<Question> questions;
	
	@OneToMany
	@JoinTable(name ="application_activity")
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
}