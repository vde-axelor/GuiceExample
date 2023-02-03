package com.guice.Persistence;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.guice.GuiceModule;

public class testpersist {
	
public static void main(String[] args) {
	Injector ij = Guice.createInjector(new GuiceModule(),new JpaPersistModule("jpa"));
	PersistService ps =  ij.getInstance(PersistService.class);
	ps.start();
	
	StudentService ss = ij.getInstance(StudentService.class);
	ss.Student("test","test","test","test");			
	System.out.println("Added Successfully...");
}
}
