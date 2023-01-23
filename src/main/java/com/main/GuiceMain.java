package com.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.module.TextEditorModule;
import com.cls.TextEditor;

public class GuiceMain {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new TextEditorModule());
	    TextEditor editor = injector.getInstance(TextEditor.class);
	    editor.makeSpellCheck(); 
	}

}
