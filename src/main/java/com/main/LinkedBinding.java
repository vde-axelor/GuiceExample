package com.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.module.UserModule;
import com.module.UserModule;
import com.cls.User;

public class LinkedBinding {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new UserModule());
	    User user = injector.getInstance(User.class);
	    user.showName(); 
	}

}
