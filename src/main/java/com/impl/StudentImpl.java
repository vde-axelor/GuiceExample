package com.impl;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;

import javax.persistence.EntityManager;

import com.app.StudentDetail;
import com.service.StudentService;
public class StudentImpl implements StudentService{
	@Inject
	private Provider<EntityManager>  em;
	
	@Transactional
	public void Student(String name,String username,String password) {

		StudentDetail sd=  new StudentDetail();
		sd.setName(name);
		sd.setUsername(username);
		sd.setPassword(password);
		em.get().persist(sd);
		System.out.println("Your Id is : " + sd.getId());
	}
}
