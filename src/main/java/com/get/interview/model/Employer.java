package com.get.interview.model;
import java.util.Date;
import java.util.List;

public class Employer extends User{
	
	private Date joinDate;
	private String cDescription;
	private String jobTitle;
	private Date experience;
	private String workPhone;
	private String workFax;
	
	private Company company;
	private List<JobPost> jobPosts;
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public String getcDescription() {
		return cDescription;
	}
	public void setcDescription(String cDescription) {
		this.cDescription = cDescription;
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