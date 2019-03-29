package com.get.interview.model;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String email;
	@Column
	private String phoneNumber;
	@Column
	private Date dateOfBirth;
	@Column
	private String username;
	@Column 
	private String password;
	@Column
    @ElementCollection(targetClass=String.class)
	private List<String> links;

	@OneToOne(cascade = CascadeType.ALL)
	private Address address;		
	@OneToOne
	private Resume resume;
	@OneToMany(mappedBy = "applicant")
	private List<Application> applications;
	@OneToMany
	private List<JobPost> savedJobs;
	@OneToMany
	private List<SearchHistory> searchHistory;
	@OneToMany
	private List<Note> notes;
	
	
	public final long getId() {
		return id;
	}
	public final void setId(long id) {
		this.id = id;
	}
	public final String getFirstName() {
		return firstName;
	}
	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public final String getLastName() {
		return lastName;
	}
	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public final String getEmail() {
		return email;
	}
	public final void setEmail(String email) {
		this.email = email;
	}
	public final String getPhoneNumber() {
		return phoneNumber;
	}
	public final void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public final Date getDateOfBirth() {
		return dateOfBirth;
	}
	public final void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public final String getUsername() {
		return username;
	}
	public final void setUsername(String username) {
		this.username = username;
	}
	public final String getPassword() {
		return password;
	}
	public final void setPassword(String password) {
		this.password = password;
	}
	public final List<String> getLinks() {
		return links;
	}
	public final void setLinks(List<String> links) {
		this.links = links;
	}
	public final Address getAddress() {
		return address;
	}
	public final void setAddress(Address address) {
		this.address = address;
	}
	public final Resume getResume() {
		return resume;
	}
	public final void setResume(Resume resume) {
		this.resume = resume;
	}
	public final List<Application> getApplications() {
		return applications;
	}
	public final void setApplications(List<Application> applications) {
		this.applications = applications;
	}
	public final List<JobPost> getSavedJobs() {
		return savedJobs;
	}
	public final void setSavedJobs(List<JobPost> savedJobs) {
		this.savedJobs = savedJobs;
	}
	public final List<SearchHistory> getSearchHistory() {
		return searchHistory;
	}
	public final void setSearchHistory(List<SearchHistory> searchHistory) {
		this.searchHistory = searchHistory;
	}
	public final List<Note> getNotes() {
		return notes;
	}
	public final void setNotes(List<Note> notes) {
		this.notes = notes;
	}
}