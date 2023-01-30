package com.cls;

import com.google.inject.servlet.ServletModule;
public class GuiceModule extends ServletModule{
	@Override
	protected void configureServlets() {
		serve("/*").with(test.class);
	}
}
