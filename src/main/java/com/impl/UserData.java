package com.impl;

import com.cls.Name;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class UserData implements Name{
	private String name = "Vishwa Desai";

	   public UserData(){}
	   
	   @Inject(optional=true)
	   public void setDbUrl(@Named("Name") String name){
	      this.name = name;
	   }

	   @Override
	   public void checkName() { 
	      System.out.println("Inside Name" );
	      System.out.println("------------");
	      System.out.print("Name: ");
	      System.out.println(name); 
	   }
}
