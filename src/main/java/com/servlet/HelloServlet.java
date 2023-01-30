package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.servlet.HelloService;

@Singleton
public class HelloServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Inject
	private HelloService hs;
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		PrintWriter pw=res.getWriter();
		pw.print(hs.Hello());
	}

}
