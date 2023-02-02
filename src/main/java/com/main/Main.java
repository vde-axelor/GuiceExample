package com.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.StudentData;
import com.google.inject.Guice;

import com.google.inject.Injector;

import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.module.StdModule;
import com.service.StudentService;
@WebServlet(urlPatterns = ("/student"))
public class Main extends HttpServlet{

	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		Injector ij = Guice.createInjector(new StdModule(),new JpaPersistModule("jpa"));
		PersistService ps =  ij.getInstance(PersistService.class);
		ps.start();
		PrintWriter pw=res.getWriter();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("form");
		EntityManager em = emf.createEntityManager();
		StudentService ss = ij.getInstance(StudentService.class);
		String name=req.getParameter("name");
		String city=req.getParameter("city");
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		StudentData sd=new StudentData();
		sd.setName(name);
		sd.setCity(city);
		sd.setUsername(username);
		sd.setPassword(password);
		em.persist(sd);
		em.getTransaction().commit();
		pw.print("Added Successfully...");  
	    em.close();
	    emf.close();
//		ss.Student("Om","Pune","omdesai","omd123");
//		pw.print("Added Successfully...");
		System.out.println("Added Successfully...");

	}
	
	protected void goPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		doGet(req,res);
	}

}

//public static void main(String[] args) {
//	
//	Injector ij = Guice.createInjector(new StdModule(),new JpaPersistModule("jpa"));
//	PersistService ps =  ij.getInstance(PersistService.class);
//	ps.start();
//	
//	StudentService ss = ij.getInstance(StudentService.class);
//	ss.Student("Vishwa","Surat","vdesai","vtv3218");
//	
//	System.out.println("Added Successfully...");
//}