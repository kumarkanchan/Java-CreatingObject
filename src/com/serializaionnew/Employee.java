package com.serializaionnew;

import java.io.Serializable;

public class Employee implements Serializable {

	//Serializable - is a marker interface which they don't have any method, use to notify to JVM only.
	public int id = 111;
	public String name = "SUNITA";
	public String address = "BLR";
	public transient int mobile = 98765; //transient-does not participate in serialization

	public void empinfo() {
		System.out.println("Employee Information is : ");
		System.out.println("ID: " + id + "Name : " + name + " Address: " + address + " Mobile : " + mobile);
	}
}
