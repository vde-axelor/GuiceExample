package com.cls;

import com.google.inject.Inject;
import com.cls.Name;

public class Display {
	private Name name;

	   @Inject
	   public Display( Name name) {
	      this.name = name;
	   }

	   public void displayName(){
	      name.checkName();
	   } 
}
