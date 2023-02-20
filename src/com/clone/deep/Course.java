package com.clone.deep;

public class Course implements Cloneable{
	String subject1;
	String subject2;
	String subject3;

	public Course(String subject1, String subject2, String subject3) {
		super();
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
