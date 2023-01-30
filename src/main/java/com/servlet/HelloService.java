package com.servlet;

import com.google.inject.ImplementedBy;
import com.servlet.HelloImpl;

@ImplementedBy(HelloImpl.class)
public interface HelloService {
	String Hello();
}
