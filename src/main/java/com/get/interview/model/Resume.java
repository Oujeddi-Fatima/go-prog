package com.get.interview.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Resume {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String title;
	@Column
	private String description;

	@OneToOne
	private User user;

	@Column
	@OneToMany(cascade = CascadeType.ALL)
	private List<WorkExperience> workExperiences;
	@Column
	@OneToMany(cascade = CascadeType.ALL)
	private List<AcademicRecord> academicRecords;
	@Column
	@OneToMany(cascade = CascadeType.ALL)
	private List<Certification> certifications;
	@Column
	@OneToMany(cascade = CascadeType.ALL)
	private List<Project> projects;
	@Column
	@OneToMany(cascade = CascadeType.ALL)
	private List<Language> languages;
	@Column
	@OneToMany(cascade = CascadeType.ALL)
	private List<Skill> skills;

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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<WorkExperience> getWorkExperiences() {
		return workExperiences;
	}

	public void setWorkExperiences(List<WorkExperience> workExperiences) {
		this.workExperiences = workExperiences;
	}

	public List<AcademicRecord> getAcademicRecords() {
		return academicRecords;
	}

	public void setAcademicRecords(List<AcademicRecord> academicRecords) {
		this.academicRecords = academicRecords;
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

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
}