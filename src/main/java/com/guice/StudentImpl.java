package com.guice;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;

import javax.persistence.EntityManager;

import com.guice.StudentDetail;
import com.guice.StudentService;
public class StudentImpl implements StudentService{
	@Inject
	private Provider<EntityManager>  em;
	
	@Transactional
	public void Student(String name,String city,String username,String password) {

		StudentDetail sd=  new StudentDetail();
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
