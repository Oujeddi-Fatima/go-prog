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
		
	
	public IResumeDao getResumeDao() {
		return resumeDao;
	}

	public void setResumeDao(IResumeDao resumeDao) {
		this.resumeDao = resumeDao;
	}

	@Override
	public Resume save(Resume resume) {
		// TODO Auto-generated method stub
		return resumeDao.save(resume);
	}

	@Override
	public void delete(long id) {
		resumeDao.deleteById(id);
		
	}

	@Override
	public Resume find(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Resume> findByAddress(Address address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Resume> findByKey(String keyString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resume findByUser(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Resume> findByExperience(WorkExperience workExperience) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Resume> findByDegree(Degree degree) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Resume> findByCertification(Certification certification) {
		// TODO Auto-generated method stub
		return null;
	}

}
