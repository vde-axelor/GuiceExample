package com.main;



//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

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
		ss.Student("rita","ritadesai","rita123");
		
		System.out.println("Added Successfully...");
	}
	

}

