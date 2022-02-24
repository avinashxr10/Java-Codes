package com.jtcindia.spring;

import java.beans.PropertyEditorSupport;
import java.util.*;

public class ListEditor extends PropertyEditorSupport {

	public void setAsText(String txt) {
		String str[] = txt.split(",");
		List<String> list = Arrays.asList(str);
		this.setValue(list);
	}

}
