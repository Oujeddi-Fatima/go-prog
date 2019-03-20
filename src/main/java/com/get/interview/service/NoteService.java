package com.get.interview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.get.interview.repository.INoteDao;

@Service
public class NoteService implements INoteService{
	@Autowired
	private INoteDao noteDao;
	
	

	public final INoteDao getNoteDao() {
		return noteDao;
	}

	public final void setNoteDao(INoteDao noteDao) {
		this.noteDao = noteDao;
	}
}
