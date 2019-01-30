package com.get.interview.model;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

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
	@Column
	private Company company;
	
	@OneToMany
	@JoinTable(name = "jobpost_activity")
	private List<JobPost> jobPosts;
	
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public String getcDescription() {
		return Description;
	}
	public void setcDescription(String cDescription) {
		this.Description = cDescription;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public Date getExperience() {
		return experience;
	}
	public void setExperience(Date experience) {
		this.experience = experience;
	}
	public String getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	public String getWorkFax() {
		return workFax;
	}
	public void setWorkFax(String workFax) {
		this.workFax = workFax;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public List<JobPost> getJobPosts() {
		return jobPosts;
	}
	public void setJobPosts(List<JobPost> jobPosts) {
		this.jobPosts = jobPosts;
	}
	
	
}