package com.cls;

import com.google.inject.Inject;

public class TextEditor {
	private Name name;
	   @Inject
	   public TextEditor( Name name) {
	      this.name = name;
	   }
	   public void makename(){
	      name.ShowName();
	   } 
}
