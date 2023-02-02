package com.guice.servlet.app;

import com.google.inject.AbstractModule;

public class StdModule extends AbstractModule{
	@Override
	 protected void configure(){
		bind(StudentService.class).to(StudentImpl.class);
		
	}
}
