package com.get.interview.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.get.interview.model.Note;

@Repository
public interface INoteDao extends CrudRepository<Note, Long>{

}
