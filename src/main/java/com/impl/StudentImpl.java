package com.impl;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;
import com.service.StudentService;
import javax.persistence.EntityManager;
import com.app.Student;

public class StudentImpl implements StudentService{
	@Inject
	private Provider<EntityManager>  em;
	
	@Transactional
	public void Student(String name,String city,String username,String password) {

		Student sd=  new Student();
		sd.setName(name);
		sd.setCity(city);
		sd.setUsername(username);
		sd.setPassword(password);
		em.get().persist(sd);
		System.out.println("Your Id is : " + sd.getId());
		System.out.println("Your Name is:"+sd.getName());
		System.out.println("Your City is:"+sd.getCity());
		
	}
}
