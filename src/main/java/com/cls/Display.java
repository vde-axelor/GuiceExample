package com.cls;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.name.Names;
import com.cls.Name;

public class Display {
	private Name spellChecker;

	private Name name;

	   @Inject
	   public Display( Name name) {
	      this.name = name;
	   }

	   public void displayname(){
	      name.checkName();
	   } 
	}


	class DisplayModule extends AbstractModule {

	   @Override
	   protected void configure() { 
	      bind(String.class)
	         .annotatedWith(Names.named("Name"))
	         .toInstance("Vishwa Desai");
	   } 
}
