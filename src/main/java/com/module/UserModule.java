package com.module;

import com.cls.Data;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.impl.ShowName;

public class UserModule extends AbstractModule{
	@Override
	   protected void configure() { 
	      bind(String.class)
	         .annotatedWith(Names.named("NAME"))
	         .toInstance("Vishwa Desai");
	   } 
}
