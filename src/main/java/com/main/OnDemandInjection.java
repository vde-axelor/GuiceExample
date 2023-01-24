package com.main;

import com.google.inject.Guice;
import com.google.inject.Injector;

import com.module.NameModule;
import com.cls.Display;
import com.impl.NameData;
import com.cls.Name;

public class OnDemandInjection {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new NameModule());
		Name name = new NameData();
		injector.injectMembers(name);

		Display editor = injector.getInstance(Display.class);
		editor.displayName();
	}

}
