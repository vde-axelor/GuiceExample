package com.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.module.StudentModule;
import com.app.Student;



public class Main {

	public static void main(String[] args) {
		Injector ij = Guice.createInjector(new StudentModule());
		Student sa = ij.getInstance(Student.class);
		
		
		System.out.println("Student Data ");
		System.out.println("--------------------------------");
		sa.displayName();
	}

}
