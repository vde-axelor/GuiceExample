package com.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Student;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.impl.StudentImpl;
import com.listner.HelloListner;
import com.module.GuiceModule;
import com.module.StudentModule;
import com.service.StudentService;

@Singleton
public class Main extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Inject private StudentService studentService;
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
//		Injector ij =Guice.createInjector(new JpaPersistModule("jpa"),new StudentModule());
//		
//		PersistService ps =  ij.getInstance(PersistService.class);
//		ps.start();
//		hs.getInjector().getInstance(PersistService.class).start();;
		String name=req.getParameter("name");
		String city=req.getParameter("city");
		String username=req.getParameter("username");
		String password=req.getParameter("password");
//		StudentImpl ss=new StudentImpl();
//		ss.Student(name, city, username, password);
//		StudentService ss1=new StudentService() {
//			
//			@Override
//			public void Student(String name, String city, String username, String password) {
//				Student(name,city,username,password);
//				
//			}
//		};
		studentService.Student(name, city, username, password);
		PrintWriter pw=res.getWriter();
		pw.println(name);
		pw.println(city);
		pw.println(username);
		pw.println(password);
	
		System.out.println(name+" "+city+" "+username+" "+password);

		
		System.out.println("Added Successfully...");
	}
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		doGet(req,res);
	}

}
