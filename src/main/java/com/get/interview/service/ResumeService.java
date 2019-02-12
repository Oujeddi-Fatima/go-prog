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
	public void delete(Resume resume) {
		resumeDao.delete(resume);		
	}

	@Override
	public Resume find(long id) {
		return resumeDao.find(id);
	}
	
	@Override
	public List<Resume> findByKey(String keyString) {
		return resumeDao.findByKey(keyString);
	}

	@Override
	public Resume findByUser(long userId) {
		return resumeDao.find(userId);
	}
	
	public IResumeDao getResumeDao() {
		return resumeDao;
	}

	public void setResumeDao(IResumeDao resumeDao) {
		this.resumeDao = resumeDao;
	}


}
