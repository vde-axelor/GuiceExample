package com.module;

import com.cls.Name;
import com.google.inject.AbstractModule;
import com.impl.NameData;

public class DisplayModule extends AbstractModule{
	@Override
	   protected void configure() {
	      bind(Name.class).to(NameData.class);
	   } 
}
