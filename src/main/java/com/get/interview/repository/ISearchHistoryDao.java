package com.get.interview.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.SearchHistory;

@Repository
public interface ISearchHistoryDao extends CrudRepository<SearchHistory, Long>  {

}
