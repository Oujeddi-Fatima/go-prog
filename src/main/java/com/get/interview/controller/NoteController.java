package com.get.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.get.interview.service.INoteService;

@RestController
@RequestMapping("note")
public class NoteController {

	@Autowired
	private INoteService noteService;

	
	
	public INoteService getNoteService() {
		return noteService;
	}

	public void setNoteService(INoteService noteService) {
		this.noteService = noteService;
	}
}
