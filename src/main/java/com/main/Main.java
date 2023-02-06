package com.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.module.StudentModule;
import com.service.StudentService;

@Singleton
public class Main extends HttpServlet{

	private static final long serialVersionUID = 1L;
	

	
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		Injector ij = Guice.createInjector(new JpaPersistModule("jpa"),new StudentModule());
		PersistService ps =  ij.getInstance(PersistService.class);
		ps.start();
		
		StudentService ss = ij.getInstance(StudentService.class);
		ss.Student("Om","Mumbai","om","om321");

		
		System.out.println("Added Successfully...");
	}
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		doGet(req,res);
	}

}
