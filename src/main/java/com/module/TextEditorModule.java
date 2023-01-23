package com.module;

import com.cls.SpellChecker;
import com.google.inject.AbstractModule;
import com.impl.SpellCheckerImpl;

public class TextEditorModule extends AbstractModule{
	@Override
	   protected void configure() {
	      bind(SpellChecker.class).to(SpellCheckerImpl.class);
	   } 
}
