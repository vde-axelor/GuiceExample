package com.module;

import com.cls.Name;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.impl.UserName;

public class UserModule extends AbstractModule{
	@Override
	   protected void configure() {
	      bind(Name.class).annotatedWith(Names.named("Hello"))
	         .to(UserName.class);
	   } 
}
