package com.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "KK";
		e.address = "Bangalore";
		e.SSN = 234;
		e.number = 1234;

		try {
			FileOutputStream fos = new FileOutputStream("D:\\Eclipseworkspace\\Java\\CREATE OBJECT\\src\\com\\serialization\\a.txt");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(e);
			out.close();
			System.out.println("Data Serialized !!");

		} catch (Exception ee) {
			System.out.println("Exception is : " + ee);
		}
	}
}
