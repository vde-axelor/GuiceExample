package com.main;

import com.google.inject.Guice;

import com.google.inject.Injector;

import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.module.StudentModule;
import com.service.StudentService;
public class Main{
	public static void main(String[] args) {
		
		Injector ij = Guice.createInjector(new StudentModule(),new JpaPersistModule("jpaTest"));
		PersistService ps =  ij.getInstance(PersistService.class);
		ps.start();
		
		StudentService ss = ij.getInstance(StudentService.class);
		ss.Student("ABC","ABC","ABC123");
		
		System.out.println("Added Successfully...");
	}
	

}

