package com.guice;

public class HelloImpl implements HelloService{
	@Override
	public String Name(String name) {
		name="Vishwa";
		return "test";
	}

}
