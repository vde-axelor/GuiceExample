package com.cls;

import com.google.inject.Inject;

public class User {
	private Name name;

	   @Inject
	   public User(Name name) {
	      this.name = name;
	   }

	   public void showName(){
	      name.checkName();
	   }
}
