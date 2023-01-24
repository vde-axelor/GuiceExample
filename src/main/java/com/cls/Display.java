package com.cls;

import com.google.inject.Inject;
import com.cls.Name;

public class Display {
	private Name name;

	   @Inject
	   public void setSpellChecker(Name name){
	   this.name = name;
	   }
	   public Display() { }

	   public void displayName(){
	      name.checkName();
	   } 
}
