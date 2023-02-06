package com.module;

import com.google.inject.servlet.ServletModule;
import com.main.Main;

public class GuiceModule extends ServletModule{
	@Override
	protected void configureServlets() {
		serve("/hello").with(Main.class);
	}

}
