package com.get.interview.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.get.interview.model.Language;

@Repository
public interface ILanguageDao extends CrudRepository<Language, Long> {

}
