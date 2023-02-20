package com.clone.shallow;

public class Student implements Cloneable {
	
	int number;	

	public Student(int number) {
		super();
		this.number = number;
	}

	public void m() {
		System.out.println("m-method called");
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
