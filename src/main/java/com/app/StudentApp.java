package com.app;

import com.cls.ShowStudent;
import com.cls.StudentTracker;
import com.google.inject.Inject;

public class StudentApp {
private ShowStudent student;
	
	@Inject
	public StudentApp(ShowStudent student) {
		this.student = student;
	}
	
	@StudentTracker
	public void displayName() {
		student.show("Vishwa","Surat");
	}
}
