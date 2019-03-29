package com.get.interview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.get.interview.repository.ISearchHistoryDao;

@Service
public class SearchHistoryService implements ISearchHistoryService{
	
	@Autowired
	private ISearchHistoryDao searchHistoryDao;

	
	
	public final ISearchHistoryDao getSearchHistoryDao() {
		return searchHistoryDao;
	}

	public final void setSearchHistoryDao(ISearchHistoryDao searchHistoryDao) {
		this.searchHistoryDao = searchHistoryDao;
	}
}
