package com.main;

import com.google.inject.Guice;
import com.google.inject.Injector;

import com.module.UserModule;
import com.cls.User;

public class NameBinding {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new UserModule());
	    User editor = injector.getInstance(User.class);
	    editor.ShowName();
	}

}
