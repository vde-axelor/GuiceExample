package com.cls;

import java.util.logging.Logger;

import com.google.inject.Inject;

public class TextEditor {
	private Logger logger;

	   @Inject
	   public TextEditor( Logger logger) {
	      this.logger = logger;
	   }

	   public void makeSpellCheck(){
	      logger.info("In TextEditor.makeSpellCheck() method");
	   } 
}
