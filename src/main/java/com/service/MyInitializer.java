package com.service;

import com.google.inject.persist.PersistService;
import com.google.inject.Inject;
import com.google.inject.persist.PersistService;
public class MyInitializer {
	@Inject 
	MyInitializer(PersistService service) {
	    service.start();
	}
}
