package com.cls;

import com.google.inject.ImplementedBy;
import com.impl.NameData;

@ImplementedBy(NameData.class)
public interface Name {
	public void checkName();
}
