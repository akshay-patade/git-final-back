package com.lti.scholarship.app.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.scholarship.app.entity.Institute;
import com.lti.scholarship.app.entity.Student;

@Repository
public class InstituteRepository extends GenericRepository {
	
	//@PersistenceContext  //To create object of EntityManager
	private GenericRepository genericRepository;
	
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public void add(Institute institute) {
		genericRepository.store(institute);
	}
	
	@Transactional
	public  Institute verify(String instituteCode,String password) {
		Institute inst;
		Query q=em.createQuery("from Institute as  t where t.instituteCode=?1 and t.password=?2 ");
		q.setParameter(1, instituteCode);
		q.setParameter(2, password);
		System.out.println("institute repository called");
		System.out.println(instituteCode);
		System.out.println(password);
		try {
		inst=(Institute)q.getSingleResult();
		}
		catch(Exception e) {
			inst=null;
		}
		return inst;
		
	}
	
	
}
