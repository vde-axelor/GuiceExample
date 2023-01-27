package com.impl;

import com.cls.ShowStudent;

public class StudentImpl implements ShowStudent{
	@Override
	public void show(String name,String city) {
		System.out.println("Name  : " + name);
		System.out.println("City  : " + city);
	}
}
