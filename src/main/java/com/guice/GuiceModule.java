package com.guice;

import com.google.inject.servlet.ServletModule;

public class GuiceModule extends ServletModule{
	@Override
	protected void configureServlets() {
		serve("/hello").with(Main.class);
	}

}
