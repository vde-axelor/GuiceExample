package com.module;

import javax.inject.Provider;

import com.cls.SpellChecker;
import com.google.inject.AbstractModule;
import com.impl.SpellCheckerImpl;
import com.provider.SpellCheckerProvider;

public class TextEditorModule extends AbstractModule{
	@Override
	   protected void configure() {
	      bind(SpellChecker.class).toProvider((Class<? extends Provider<? extends SpellChecker>>) SpellCheckerProvider.class);
	   } 
}
