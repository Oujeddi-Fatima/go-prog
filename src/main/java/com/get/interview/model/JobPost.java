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

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class JobPost extends ResourceSupport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long jobPostId;
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
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	@JsonBackReference(value = "jobpost-employer")
	@ManyToOne(cascade = CascadeType.ALL)
	private Employer employer;
	@JsonManagedReference(value = "jobpost-application")
	@OneToMany(mappedBy = "jobPost", cascade = {CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.REMOVE})
	private List<Application> applications;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REFRESH })
	private Company company;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Skill> skill;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Question> questions;

	public long getJobPostId() {
		return jobPostId;
	}

	public void setJobPostId(long jobPostId) {
		this.jobPostId = jobPostId;
	}

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public List<Application> getApplications() {
		return applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public List<Skill> getSkill() {
		return skill;
	}

	public void setSkill(List<Skill> skill) {
		this.skill = skill;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
}