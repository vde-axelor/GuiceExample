package com.Cls;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Service.HelloWorld;
import com.google.inject.Inject;
import com.google.inject.Singleton;
@Singleton
public class Test extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Inject
	private HelloWorld helloWorld;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.getWriter().print(helloWorld.Hello());
		
	}
}
