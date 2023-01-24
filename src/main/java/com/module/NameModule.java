package com.module;

import com.cls.Name;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.impl.UserData;

public class NameModule extends AbstractModule{
	@Override
	   protected void configure() { 
			bind(String.class)
	         	.annotatedWith(Names.named("Name"))
	         	.toInstance("Vishwa Desai");
      
	   } 
	
}
