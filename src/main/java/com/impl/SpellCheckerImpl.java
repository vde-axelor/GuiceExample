package com.impl;

import com.cls.SpellChecker;
import com.google.inject.name.Named;

public class SpellCheckerImpl implements SpellChecker{
	private String name;

	   public SpellCheckerImpl(){}

	   public SpellCheckerImpl(@Named("Name") String name){
	      this.name = name;
	   } 

	   @Override
	   public void checkSpelling() { 
	      System.out.println("Inside checkSpelling." );
	      System.out.println(name); 
	   }
}
