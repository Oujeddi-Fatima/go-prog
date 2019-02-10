package com.get.interview.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.get.interview.model.Certification;
import com.get.interview.service.ICertificationService;

@RestController
@RequestMapping("certification")
public class CertificationController {
	
	@Autowired
	private ICertificationService certificationService;
	
	@RequestMapping(method = RequestMethod.POST)
	public Certification save(@RequestBody Certification certification) {
		return certificationService.save(certification);	
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public void delete(@RequestBody Long id) {
		certificationService.delete(id);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public @ResponseBody Certification findById(@PathVariable Long id) {
		return certificationService.findById(id);
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Certification> findAll(){
		return certificationService.findAll();
		
	}
	
	@RequestMapping(value = "{date}", method = RequestMethod.GET)
	public Certification findByexpirationDate(@RequestBody Date date) {
		return certificationService.findByexpirationDate(date);
		
	}

	public ICertificationService getCertificationService() {
		return certificationService;
	}

	public void setCertificationService(ICertificationService certificationService) {
		this.certificationService = certificationService;
	} 
	

}
