package com.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.module.TextEditorModule;
import com.cls.TextEditor;

public class InbuiltBinding {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new TextEditorModule());
	    TextEditor editor = injector.getInstance(TextEditor.class);
	    editor.makeSpellCheck();
	    System.out.println("Hello");
	}

}
