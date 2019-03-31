package com.get.interview.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import com.get.interview.model.Resume;
import com.get.interview.service.IResumeService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("resume")
public class ResumeController {
	
	@Autowired
	private IResumeService resumeService;

	@RequestMapping(method = RequestMethod.POST)
	public long saveResume(@RequestBody Resume resume) {
		return resumeService.save(resume).getResumeId();
	}
	
	@RequestMapping(value="{id}", method = RequestMethod.DELETE)
	public void deleteResume(@PathVariable long id) {
		resumeService.delete(id);
	}
	
	@RequestMapping(value="{id}", method = RequestMethod.GET)
	public @ResponseBody Resume getResume(@PathVariable long id) {
		return resumeService.find(id);
	}
	

	@RequestMapping(value="key/{keyString}", method = RequestMethod.GET)
	public @ResponseBody List<Resume> getUsers(@PathVariable String keyString) {
		return resumeService.findByKey(keyString);
	}
	
	

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Iterable<Resume> getResumes() {
		Iterable<Resume> resumeList = resumeService.find();
		for(Resume resume : resumeList) {
			 Link resumeLink = linkTo(ResumeController.class)
					 .slash(resume.getResumeId()).withSelfRel();
			 resume.add(resumeLink);
		}
		Link link = linkTo(methodOn(ResumeController.class)
			      .getResumes()).withSelfRel();
		Resources<Resume> resumes = new Resources<Resume>(resumeList, link);
		return resumes;
	}
	
	
	

	public IResumeService getResumeService() {
		return resumeService;
	}

	public void setResumeService(IResumeService resumeService) {
		this.resumeService = resumeService;
	}

	
}
