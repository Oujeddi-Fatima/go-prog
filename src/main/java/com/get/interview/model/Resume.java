package com.get.interview.model;

import java.util.List;

public class Resume {	
	
	private long id;
	private String title;
	private String description;
	private String skills;
	private String achievements;
	private boolean visible;
	
	private User user;
	private List<String> languages;
	private List<AcademicRecord> academicRecords;
	private List<WorkExperience> workExperience;
	private List<Certification> certifications;
	private List<Project> projects;
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getAchievements() {
		return achievements;
	}
	public void setAchievements(String achievements) {
		this.achievements = achievements;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	public List<AcademicRecord> getAcademicRecords() {
		return academicRecords;
	}
	public void setAcademicRecords(List<AcademicRecord> academicRecords) {
		this.academicRecords = academicRecords;
	}
	public List<WorkExperience> getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(List<WorkExperience> workExperience) {
		this.workExperience = workExperience;
	}
	public List<Certification> getCertifications() {
		return certifications;
	}
	public void setCertifications(List<Certification> certifications) {
		this.certifications = certifications;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	
}