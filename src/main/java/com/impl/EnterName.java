package com.impl;

import com.cls.Name;
import com.google.inject.Inject;

public class EnterName implements Name{
	private String fname;
	   private String lname;

	   @Inject
	   public EnterName(String fname, 
	      String lname){
	      this.fname = fname;
	      this.lname = lname;
	   } 

	   @Override
	   public void ShowName() { 
	      System.out.println("Inside ShowName." );
	      System.out.println("-----------------");
	      System.out.print("First Name:");
	      System.out.println(fname);
	      System.out.print("Last Name:");
	      System.out.println(lname);
	   }
}
