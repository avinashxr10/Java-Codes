package com.jtcindia.spring;

import java.beans.PropertyEditorSupport;

public class StudentIdEditor extends PropertyEditorSupport {
	public void setAsText(String txt) {
		String p1 = txt.substring(0, 3);
		String p2 = txt.substring(9, 4);
		StudentId sid = new StudentId(p1, Integer.parseInt(p2));
		this.setValue(sid);
	}
}
