package com.get.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.get.interview.service.ISearchHistoryService;

@RestController
@RequestMapping("searchhistory")
public class SearchHistoryController {
	@Autowired
	private ISearchHistoryService historyService;


	
		public ISearchHistoryService getHistoryService() {
		return historyService;
	}

	public void setHistoryService(ISearchHistoryService historyService) {
		this.historyService = historyService;
	}
}
