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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column
	private String name;
	@Column
	private String infoNumber;
	@Column
	private String primeObjective;
	@Column
	private String vision;
	@Column
	private String mission;
	@Column
	private Date startDate;
	@Column
	private String fax;
	@Column
	private BusinessType businessType;

	@Column
	@ElementCollection(targetClass = String.class)
	private List<String> phone;

	@Column
	@ElementCollection(targetClass = String.class)
	private List<String> contacts;

	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	@JsonBackReference
	@ManyToOne(cascade = CascadeType.ALL)
	private Employer employer;

	public final long getId() {
		return id;
	}

	public final void setId(long id) {
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getInfoNumber() {
		return infoNumber;
	}

	public final void setInfoNumber(String infoNumber) {
		this.infoNumber = infoNumber;
	}

	public final String getPrimeObjective() {
		return primeObjective;
	}

	public final void setPrimeObjective(String primeObjective) {
		this.primeObjective = primeObjective;
	}

	public final String getVision() {
		return vision;
	}

	public final void setVision(String vision) {
		this.vision = vision;
	}

	public final String getMission() {
		return mission;
	}

	public final void setMission(String mission) {
		this.mission = mission;
	}

	public final Date getStartDate() {
		return startDate;
	}

	public final void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public final String getFax() {
		return fax;
	}

	public final void setFax(String fax) {
		this.fax = fax;
	}

	public final BusinessType getBusinessType() {
		return businessType;
	}

	public final void setBusinessType(BusinessType businessType) {
		this.businessType = businessType;
	}

	public final List<String> getPhone() {
		return phone;
	}

	public final void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public final List<String> getContacts() {
		return contacts;
	}

	public final void setContacts(List<String> contacts) {
		this.contacts = contacts;
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

}
