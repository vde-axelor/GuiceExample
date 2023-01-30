package com.service;
import com.impl.GuiceImpl;
import com.google.inject.ImplementedBy;

@ImplementedBy(GuiceImpl.class)
public interface HelloWorld {
	String Hello();
}
