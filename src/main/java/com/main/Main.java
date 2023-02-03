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
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.module.StdModule;
import com.service.StudentService;

@Singleton
public class Main extends HttpServlet {

	@Inject
	Provider<EntityManager> em;
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		PrintWriter pw = res.getWriter();
		pw.print("hello");

		Injector ij = Guice.createInjector(new StdModule(), new JpaPersistModule("jpa"));
		PersistService ps = ij.getInstance(PersistService.class);
		ps.start();
		 // EntityManagerFactory emf =Persistence.createEntityManagerFactory("jpa"); 
		// EntityManager em =emf.createEntityManager();

		StudentService ss = ij.getInstance(StudentService.class); // String
//		name = req.getParameter("name"); // String city=req.getParameter("city"); //
//		String username = req.getParameter("username"); // String
//		password = req.getParameter("password");
//		StudentData sd = new StudentData();
//		sd.setName("RAM");
//		sd.setCity("Vapi");
//		sd.setUsername("ram");
//		sd.setPassword("ram123");
//		em.get().persist(sd);
//		pw.print("Added Successfully...");

		ss.Student("test", "test", "test", "test"); 
		pw.print("Added Successfully...");
		System.out.println("Added Successfully...");

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		doGet(req, res);
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