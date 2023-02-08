package com.module;

import com.google.inject.persist.PersistFilter;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.google.inject.servlet.ServletModule;
import com.main.Main;

public class GuiceModule extends ServletModule{
	@Override
	protected void configureServlets() {
		install(new JpaPersistModule("jpa"));  
	    filter("/*").through(PersistFilter.class);
		serve("/hello").with(Main.class);
	}

}
