package com.guice.servlet;

public class HelloImpl implements HelloService{
	@Override
	public String Hello() {
		return "Hello world...";
	}

}
