package com.servlet;

import com.google.inject.servlet.ServletModule;
import com.servlet.HelloServlet;

public class GuiceModule extends ServletModule{
	@Override
	protected void configureServlets() {
		serve("/hello").with(HelloServlet.class);
	}

}
