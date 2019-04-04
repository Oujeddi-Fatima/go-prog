package com.get.interview;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter;


@CrossOrigin
@SpringBootApplication
public class GetInterviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetInterviewApplication.class, args);
	}

	
}