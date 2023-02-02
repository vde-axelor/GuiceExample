package com.main;

import com.google.inject.Guice;

import com.google.inject.Injector;

import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.module.StdModule;
import com.service.StudentService;
public class Main{
	public static void main(String[] args) {
		
		Injector ij = Guice.createInjector(new StdModule(),new JpaPersistModule("jpa"));
		PersistService ps =  ij.getInstance(PersistService.class);
		ps.start();
		
		StudentService ss = ij.getInstance(StudentService.class);
		ss.Student("XYZ","Mumbai","xyz","xyz321");
		
		System.out.println("Added Successfully...");
	}
	

}

