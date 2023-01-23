package com.provider;

import com.cls.SpellChecker;
import com.google.inject.Provider;
import com.impl.SpellCheckerImpl;

public class SpellCheckerProvider implements Provider<SpellChecker>{
	@Override
	   public SpellChecker get() {
	      String dbUrl = "ABC";
	      String user = "Pune";

	      SpellChecker SpellChecker = (com.cls.SpellChecker) new SpellCheckerImpl(dbUrl, user);
	      return SpellChecker;
	   }
}
