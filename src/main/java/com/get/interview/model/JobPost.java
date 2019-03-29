package com.get.interview.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	private Address address;	
	
	@ManyToOne
	private Employer employer;
	@OneToMany(mappedBy ="jobPost")
	private List<Application> applications;
	
	@OneToOne
	private Company company;
	@OneToMany
	private List<Skill> skillSet;
	@OneToMany
	private List<Question> questions;
	
	
	public final long getId() {
		return id;
	}
	public final void setId(long id) {
		this.id = id;
	}
	public final String getTitle() {
		return title;
	}
	public final void setTitle(String title) {
		this.title = title;
	}
	public final String getLevel() {
		return level;
	}
	public final void setLevel(String level) {
		this.level = level;
	}
	public final String getDescription() {
		return description;
	}
	public final void setDescription(String description) {
		this.description = description;
	}
	public final String getRequirement() {
		return requirement;
	}
	public final void setRequirement(String requirement) {
		this.requirement = requirement;
	}
	public final String getRequiredQalification() {
		return requiredQalification;
	}
	public final void setRequiredQalification(String requiredQalification) {
		this.requiredQalification = requiredQalification;
	}
	public final Date getPostDate() {
		return postDate;
	}
	public final void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public final Date getCloseDate() {
		return closeDate;
	}
	public final void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}
	public final Long getEstimatedSalary() {
		return estimatedSalary;
	}
	public final void setEstimatedSalary(Long estimatedSalary) {
		this.estimatedSalary = estimatedSalary;
	}
	public final Address getAddress() {
		return address;
	}
	public final void setAddress(Address address) {
		this.address = address;
	}
	public final Employer getEmployer() {
		return employer;
	}
	public final void setEmployer(Employer employer) {
		this.employer = employer;
	}
	public final List<Application> getApplications() {
		return applications;
	}
	public final void setApplications(List<Application> applications) {
		this.applications = applications;
	}
	public final Company getCompany() {
		return company;
	}
	public final void setCompany(Company company) {
		this.company = company;
	}
	public final List<Skill> getSkillSet() {
		return skillSet;
	}
	public final void setSkillSet(List<Skill> skillSet) {
		this.skillSet = skillSet;
	}
	public final List<Question> getQuestions() {
		return questions;
	}
	public final void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
}