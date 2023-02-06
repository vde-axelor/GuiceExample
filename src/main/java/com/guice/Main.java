package com.guice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;




@Singleton
public class Main extends HttpServlet{

	private static final long serialVersionUID = 1L;
	@Inject
private HelloService hs;
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		PrintWriter pw=res.getWriter();
		pw.println(hs.Name("Vishwa"));
		
		Injector ij = Guice.createInjector(new StudentModule(),new JpaPersistModule("jpa"));
		PersistService ps =  ij.getInstance(PersistService.class);
		ps.start();
		
		StudentService ss = ij.getInstance(StudentService.class);
		ss.Student("test","test","test","test");			
		System.out.println("Added Successfully...");
		
		String name = req.getParameter("name");
		String city = req.getParameter("city");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		pw.println("Name is: "+ name);
		pw.println("City is: "+ city);
		pw.println("UserName is: "+ username);
		pw.println("Password is: "+ password);
	}
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		doGet(req,res);
	}
}
