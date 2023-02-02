package com.guice.servlet;

import com.google.inject.servlet.ServletModule;

public class GuiceModule extends ServletModule{
	@Override
	protected void configureServlets() {
		serve("/hello").with(Main.class);
	}

}
