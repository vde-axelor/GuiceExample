package com.guice;

import com.google.inject.AbstractModule;

import com.guice.StudentImpl;
public class StudentModule extends AbstractModule{
	@Override
	 protected void configure(){
		bind(StudentService.class).to(StudentImpl.class);
		
	}
}
