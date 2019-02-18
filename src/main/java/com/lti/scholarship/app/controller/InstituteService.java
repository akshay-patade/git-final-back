package com.lti.scholarship.app.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.scholarship.app.entity.Institute;
import com.lti.scholarship.app.entity.Student;
import com.lti.scholarship.app.repository.GenericRepository;
import com.lti.scholarship.app.repository.InstituteRepository;

@Service
public class InstituteService {
	
	@Autowired
	private GenericRepository genericRepository;

	@Autowired
	private InstituteRepository instituteRepository;

	@Transactional
	public void add(Institute institute) {
		genericRepository.store(institute);
	}
	
	@Transactional
	public Institute verify(Institute institute) {
	 Institute inst;
	 String uname=institute.getInstituteCode();
	 String passwd=institute.getPassword();
	 inst=instituteRepository.verify(uname, passwd);
	 System.out.println("going to controller");
	 return inst; 
	 
	}              
	
	
}
