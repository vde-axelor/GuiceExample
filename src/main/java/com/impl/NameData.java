package com.impl;

import com.cls.Name;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class NameData implements Name{
	private String uname;

	   public NameData(){}
	   
	   @Inject 
	   public void setName(@Named("Name") String uname){
	      this.uname = uname;
	   }

	   @Override
	   public void checkName() { 
	      System.out.println("Inside Name" );
	      System.out.println("-----------");
	      System.out.println(uname); 
	   }
}
