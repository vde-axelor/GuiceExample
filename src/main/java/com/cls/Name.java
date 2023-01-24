package com.cls;

import com.google.inject.ImplementedBy;
import com.impl.UserData;

@ImplementedBy(UserData.class)
public interface Name {
	public void checkName();
}
