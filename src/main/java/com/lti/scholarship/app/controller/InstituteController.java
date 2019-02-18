package com.lti.scholarship.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.scholarship.app.Message;
import com.lti.scholarship.app.entity.Institute;
import com.lti.scholarship.app.entity.Student;

@RestController
@CrossOrigin
public class InstituteController {
	
	@Autowired
	private InstituteService instituteService;
	
	
	@RequestMapping(path="/institute/add", method=RequestMethod.POST)
	@CrossOrigin
	public String add(@RequestBody Institute institute) {
		instituteService.add(institute);
		return "record added successfully";

	}
	
	@RequestMapping(path="/institute/verify", method=RequestMethod.POST)
	@CrossOrigin
	public Message verify(@RequestBody Institute institute) {
		System.out.println("verify called");
		System.out.println(institute.getInstituteCode());
		System.out.println(institute.getPassword());
		Institute it = instituteService.verify(institute);
		System.out.println("data fetched");
		if (it != null) {
			return new Message("true");
		}
		return new Message("false");
	}

	}
	
	

		
