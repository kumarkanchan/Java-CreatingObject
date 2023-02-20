package com.serializaionnew;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EmployeeDeserialize {

	public static void main(String[] args) {
		Employee employee = null;

		try {
			FileInputStream fis = new FileInputStream(
					"D:\\Eclipseworkspace\\Java\\CREATE OBJECT\\src\\com\\serializaionnew\\studentfile.txt");
			ObjectInputStream input = new ObjectInputStream(fis);
			employee = (Employee) input.readObject();

			System.out.println("Deserialized Successfully");

		} catch (Exception e) {
			System.out.println("Exception is : " + e);
			System.out.println("Not Deserialized!!");
		}

		// employee.empinfo();
		System.out.println("Employee Information : ");
		System.out.println("ID : " + employee.id);
		System.out.println("NAME : " + employee.name);
		System.out.println("ADDRESS: " + employee.address);
		System.out.println("MOBILE : " + employee.mobile);
	}
}
