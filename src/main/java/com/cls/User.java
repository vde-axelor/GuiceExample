package com.cls;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class User {
	 private Name name;
	   
	   @Inject
	   public User(@Named("Hello") Name name) {
	      this.name = name;      
	   }

	   public void ShowName(){
	      name.checkName(); 
	   }  
}
