package com.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class StudentInterceptor implements MethodInterceptor{
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		//use MethodInterceptor
		  	System.out.println("Entering method: " + invocation.getMethod().getName());
	        Object result = invocation.proceed();
	        System.out.println("Exiting method: " + invocation.getMethod().getName());
	        return result;
	}
}
