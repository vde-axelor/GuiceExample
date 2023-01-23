package com.cls;

import com.google.inject.Inject;


public class Display {
	private Name name;

	   @Inject
	   public Display(Name name) {
	      this.name = name;
	   }

	   public void displayname(){
	      name.checkName();
	   }
}
