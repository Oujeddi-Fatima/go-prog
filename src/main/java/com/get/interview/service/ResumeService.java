package com.get.interview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.get.interview.model.Address;
import com.get.interview.model.Certification;
import com.get.interview.model.Degree;
import com.get.interview.model.Resume;
import com.get.interview.model.WorkExperience;
import com.get.interview.repository.IResumeDao;

@Service
public class ResumeService implements IResumeService{
	
	@Autowired
	private IResumeDao resumeDao;
		
	@Override
	public Resume save(Resume resume) {
		return resumeDao.save(resume);
	}

	@Override
	public void delete(long id) {
		resumeDao.deleteById(id);
		
	}

	@Override
	public Resume find(long id) {
		return resumeDao.findById(id).get();
	}

	@Override
	public Iterable<Resume> find() {
		return resumeDao.findAll();
	}


	public IResumeDao getResumeDao() {
		return resumeDao;
	}

	public void setResumeDao(IResumeDao resumeDao) {
		this.resumeDao = resumeDao;
	}


}
