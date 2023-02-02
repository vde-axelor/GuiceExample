package com.guice.servlet.app;

import com.google.inject.servlet.ServletModule;
import com.guice.servlet.Main;

public class StudentModule extends ServletModule{
	@Override
	protected void configureServlets() {
		serve("/hello").with(Main.class);
	}
}
