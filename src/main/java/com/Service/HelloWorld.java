package com.Service;
import com.Impl.GuiceImpl;
import com.google.inject.ImplementedBy;

@ImplementedBy(GuiceImpl.class)
public interface HelloWorld {
	String Hello();
}
