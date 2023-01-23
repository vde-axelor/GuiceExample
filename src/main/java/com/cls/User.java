package com.cls;

import com.google.inject.Inject;
import com.impl.ShowName;

public class User {
	private ShowName name;

	   @Inject
	   public User(ShowName name) {
	      this.name = name;
	   }

	   public void displayName(){
	      name.show();
	   } 
}
