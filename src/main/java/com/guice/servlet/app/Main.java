package com.guice.servlet.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;

@Singleton
public class Main extends HttpServlet {

	private static final long serialVersionUID = 1L;
	@Inject
	private StudentService ss;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		PrintWriter pw = res.getWriter();
		pw.print("Hello");

		Injector ij = Guice.createInjector(new StdModule(), new JpaPersistModule("jpa"));
		PersistService ps = ij.getInstance(PersistService.class);
		ps.start();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = emf.createEntityManager();

		StudentService ss = ij.getInstance(StudentService.class);
		String name = req.getParameter("name");
		String city = req.getParameter("city");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		StudentData sd = new StudentData();
		sd.setName(name);
		sd.setCity(city);
		sd.setUsername(username);
		sd.setPassword(password);
		em.persist(sd);
		pw.print("Added Successfully...");

		ss.Student("test","test","test","test");
		pw.print("Added Successfully...");
		System.out.println("Added Successfully...");
//		String name = req.getParameter("name");
//		String city = req.getParameter("city");
//		String username = req.getParameter("username");
//		String password = req.getParameter("password");
//		pw.println("Name is: "+ name);
//		pw.println("City is: "+ city);
//		pw.println("UserName is: "+ username);
//		pw.println("Password is: "+ password);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		doGet(req, res);
	}
}
