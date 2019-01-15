package com.get.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GetInterviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetInterviewApplication.class, args);
	}
}

import java.util.Date;

public class AcademicRecord {
	
	private String schoolName;
	private String degree;
	private Date startDate;
	private Date completionDate;
	private float gpa;
	

}
