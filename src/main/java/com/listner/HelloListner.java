package com.listner;

import com.google.inject.Guice;
import com.google.inject.Injector;

import com.google.inject.servlet.GuiceServletContextListener;
import com.module.GuiceModule;

public class HelloListner extends GuiceServletContextListener{
	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new GuiceModule());
	
	}
//	public Injector ij = Guice.createInjector(new JpaPersistModule("jpa"),new StudentModule());
//	PersistService ps =  ij.getInstance(PersistService.class);
//	ps.start();
}
