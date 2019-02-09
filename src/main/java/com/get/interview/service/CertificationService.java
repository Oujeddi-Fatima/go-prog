package com.get.interview.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.get.interview.model.Certification;
import com.get.interview.repository.ICertificationDao;

@Service
public class CertificationService implements ICertificationService{
	
	@Autowired
	private ICertificationDao certificationDao;
		

	@Override
	public Certification save(Certification certification) {
		// TODO Auto-generated method stub
		return certificationDao.save(certification);
	}

	@Override
	public void delete(long id) {
		certificationDao.deleteById(id);
	}

	@Override
	public Certification findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Certification> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Certification findByexpirationDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}
	

	public ICertificationDao getCertificationDao() {
		return certificationDao;
	}

	public void setCertificationDao(ICertificationDao certificationDao) {
		this.certificationDao = certificationDao;
	}

}
