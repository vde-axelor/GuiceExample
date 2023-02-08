package com.impl;

import com.cls.ShowStudent;

public class StudentImpl implements ShowStudent{
	@Override
	public void show(String name,String city,String username,String password) {
		System.out.println("Name  : " + name);
		System.out.println("City  : " + city);
		System.out.println("User Name  : " + username);
		System.out.println("password  : " + password);
	}
}
