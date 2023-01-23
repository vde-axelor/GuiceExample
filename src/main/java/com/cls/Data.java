package com.cls;

import com.google.inject.ImplementedBy;
import com.impl.ShowName;

@ImplementedBy(ShowName.class)
public interface Data {
	 public void show();
}
