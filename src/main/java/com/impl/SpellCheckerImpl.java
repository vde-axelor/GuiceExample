package com.impl;

import com.cls.SpellChecker;
import com.google.inject.Inject;

public class SpellCheckerImpl implements SpellChecker{
	private String name;
	   private String city;
	  

	   @Inject
	   public SpellCheckerImpl(String name, 
	      String city){
	      this.name = name;
	      this.city = city;
	   } 

	   @Override
	   public void checkSpelling() { 
	      System.out.println("Inside checkSpelling." );
	      System.out.println("---------------------");
	      System.out.print("Name: ");
	      System.out.println(name);
	      System.out.print("City: ");
	      System.out.println(city);
	   }
}
