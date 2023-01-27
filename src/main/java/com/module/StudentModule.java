package com.module;

import com.cls.ShowStudent;
import com.cls.StudentTracker;
import com.impl.StudentImpl;
import com.interceptor.StudentInterceptor;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;


public class StudentModule extends AbstractModule{
	@Override
	   protected void configure() {
		bind(ShowStudent.class).to(StudentImpl.class);
		bindInterceptor(Matchers.any(),Matchers.annotatedWith(StudentTracker.class),new StudentInterceptor());
	}
}
