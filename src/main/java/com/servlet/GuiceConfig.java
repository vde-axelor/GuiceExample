package com.servlet;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.servlet.GuiceModule;

public class GuiceConfig extends GuiceServletContextListener{
	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new GuiceModule());
	}
}
