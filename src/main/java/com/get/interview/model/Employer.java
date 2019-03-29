package com.get.interview.model;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Employer extends User{
	
	@Column
	private Date joinDate;	
	@Column
	private String Description;
	@Column
	private String jobTitle;
	@Column
	private Date experience;
	@Column
	private String workPhone;
	@Column
	private String workFax;
	
	@JsonManagedReference
	@OneToMany(mappedBy= "employer")
	private List<Company> company;
	
	
	@OneToMany(mappedBy = "employer")
	private List<JobPost> jobPosts;

	
	
	
	public final Date getJoinDate() {
		return joinDate;
	}

	public final void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public final String getDescription() {
		return Description;
	}

	public final void setDescription(String description) {
		Description = description;
	}

	public final String getJobTitle() {
		return jobTitle;
	}

	public final void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public final Date getExperience() {
		return experience;
	}

	public final void setExperience(Date experience) {
		this.experience = experience;
	}

	public final String getWorkPhone() {
		return workPhone;
	}

	public final void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public final String getWorkFax() {
		return workFax;
	}

	public final void setWorkFax(String workFax) {
		this.workFax = workFax;
	}

	public final List<Company> getCompany() {
		return company;
	}

	public final void setCompany(List<Company> company) {
		this.company = company;
	}

	public final List<JobPost> getJobPosts() {
		return jobPosts;
	}

	public final void setJobPosts(List<JobPost> jobPosts) {
		this.jobPosts = jobPosts;
	}
}