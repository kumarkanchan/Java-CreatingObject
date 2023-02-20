package com.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialize {

	public static void main(String[] args) {
		Employee e = null;
		try {
			FileInputStream fis = new FileInputStream(
					"D:\\Eclipseworkspace\\Java\\CREATE OBJECT\\src\\com\\serialization\\a.txt");
			ObjectInputStream in = new ObjectInputStream(fis);
			e = (Employee) in.readObject();
			in.close();
			fis.close();
		} catch (Exception ee) {
			System.out.println("Class Not Found !!");
			System.out.println(ee);
			return;
		}

		System.out.println("Deserialized Employee");
		System.out.println("Name : " + e.name);
		System.out.println("Address : " + e.address);
		System.out.println("SSN : " + e.SSN);
		System.out.println("Number : " + e.number);
	}
}
