package com.module;

import com.google.inject.AbstractModule;
import com.google.inject.servlet.ServletModule;
import com.impl.StudentImpl;
import com.service.StudentService;
import javax.servlet.Filter;

public class StudentModule extends ServletModule{
	@Override
	protected void configure(){
		bind(StudentService.class).to(StudentImpl.class);
		
	}
}
