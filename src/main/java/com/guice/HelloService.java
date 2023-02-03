package com.guice;

import com.google.inject.ImplementedBy;

@ImplementedBy(HelloImpl.class)
public interface HelloService {
//	String Hello();
	String Name();
	
}
