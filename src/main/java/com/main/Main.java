package com.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.module.StudentModule;
import com.app.StudentApp;



public class Main {

	public static void main(String[] args) {
		Injector ij = Guice.createInjector(new StudentModule());
		StudentApp sa = ij.getInstance(StudentApp.class);
		
		
		System.out.println("Student Data ");
		System.out.println("--------------------------------");
		sa.displayName();
	}

}
