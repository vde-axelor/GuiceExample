package com.module;

import com.google.inject.AbstractModule;

import com.impl.StudentImpl;
import com.service.StudentService;

public class StdModule extends AbstractModule{
	@Override
	 protected void configure(){
		bind(StudentService.class).to(StudentImpl.class);
		
	}
}
