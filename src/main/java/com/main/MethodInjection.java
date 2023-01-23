package com.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.module.DisplayModule;
import com.cls.Display;

public class MethodInjection {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new DisplayModule());
	    Display display = injector.getInstance(Display.class);
	    display.displayname();
	}

}
