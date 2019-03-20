package com.get.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.get.interview.service.ILanguageService;

@RestController
@RequestMapping("language")
public class LanguageController {
	@Autowired
	private ILanguageService languageService;

	
	
	public ILanguageService getLanguageService() {
		return languageService;
	}

	public void setLanguageService(ILanguageService languageService) {
		this.languageService = languageService;
	}
}
