package com.module;

import com.cls.Name;
import com.google.inject.AbstractModule;
import com.impl.UserCity;
import com.impl.UserData;

public class UserModule extends AbstractModule{
	@Override
	   protected void configure() {
	      bind(Name.class).to(UserData.class);
	      bind(UserData.class).to(UserCity.class);
	   } 
}
