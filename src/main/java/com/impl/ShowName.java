package com.impl;

import com.cls.Data;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class ShowName implements Data{
	@Inject @Named("NAME")
	   private String name;

	   public ShowName(){}

	   @Override
	   public void show() { 
	      System.out.println("Inside Name" );
	      System.out.println("------------");
	      System.out.println(name); 
	   }
}
