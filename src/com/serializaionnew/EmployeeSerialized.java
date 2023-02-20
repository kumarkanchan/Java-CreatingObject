package com.serializaionnew;

import java.io.FileOutputStream; 
import java.io.ObjectOutputStream;

public class EmployeeSerialized {

	public static void main(String[] args) {

		Employee emp = new Employee();

		try {
			FileOutputStream fos = new FileOutputStream(
					"D:\\Eclipseworkspace\\Java\\CREATE OBJECT\\src\\com\\serializaionnew\\studentfile.txt");
			ObjectOutputStream out = new ObjectOutputStream(fos);

			out.writeObject(emp);
			System.out.println("Serialized Successfully");

		} catch (Exception e) {
			System.out.println("Not Serialized!!");
			System.out.println("Exception is: " + e);
		}

	}

}
