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
	public void Student(int id) {

		StudentDetail sd=  new StudentDetail();
		sd.setId(9);
//		sd.setName(name);
//		sd.setUsername(username);
//		sd.setPassword(password);
		
		System.out.println("Is transition is active ? " + em.get().getTransaction().isActive());
		em.get().persist(sd);
		System.out.println("Your name is : " + sd.getId());
	}
}
