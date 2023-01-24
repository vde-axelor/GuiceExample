package com.main;

import com.google.inject.Guice;
import com.google.inject.Injector;

import com.module.NameModule;
import com.cls.Display;

public class FieldInjection {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new NameModule());
	     Display display = injector.getInstance(Display.class);
	     display.displayName();
	}

}
