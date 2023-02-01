package com.Cls;


import com.google.inject.servlet.ServletModule;
public class GuiceModule extends ServletModule{
	@Override
	protected void configureServlets() {
		serve("/*").with(Test.class);
	}
}
