package com.listner;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.google.inject.servlet.GuiceServletContextListener;
import com.module.GuiceModule;
import com.module.StudentModule;

public class HelloListner extends GuiceServletContextListener{
	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new GuiceModule());
	
	}
	Injector ij = Guice.createInjector(new JpaPersistModule("jpa"),new StudentModule());
	PersistService ps =  ij.getInstance(PersistService.class);
//	ps.start();
}
