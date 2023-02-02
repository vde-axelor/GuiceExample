package com.guice.servlet.app;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;

import javax.persistence.EntityManager;

import com.guice.servlet.app.StudentData;
import com.guice.servlet.app.StudentService;
public class StudentImpl implements StudentService{
	@Inject
	private Provider<EntityManager>  em;
	
	@Transactional
	public void Student(String name,String city,String username,String password) {

		StudentData sd=  new StudentData();
		sd.setName(name);
		sd.setCity(city);
		sd.setUsername(username);
		sd.setPassword(password);
		em.get().persist(sd);
		System.out.println("Your Id is : " + sd.getId());
	}
}
