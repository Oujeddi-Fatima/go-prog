package com.get.interview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.get.interview.repository.ILanguageDao;

@Service
public class LanguageService implements ILanguageService{
	
	@Autowired
	private ILanguageDao languageDao;

	
	
	public ILanguageDao getLanguageDao() {
		return languageDao;
	}

	public void setLanguageDao(ILanguageDao languageDao) {
		this.languageDao = languageDao;
	}
}
