package com.serialization2;

import java.io.Serializable;
public class Student implements Serializable {

	public int id;
	public String name;
	public String address;
	public int mobile;

	public void info() {
		System.out.println("Student Information is: ");
		System.out.println("ID :" + id + "Name: " + name + "Address: " + address + "Mobile : " + mobile);
	}
}
