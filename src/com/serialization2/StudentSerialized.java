package com.serialization2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentSerialized {

	public static void main(String[] args) {
		Student s = new Student();
		s.id = 111;
		s.name = "KK";
		s.address = "BLR";
		s.mobile = 97656;

		try {
			FileOutputStream out = new FileOutputStream(
					"D:\\Eclipseworkspace\\Java\\CREATE OBJECT\\src\\com\\serialization2\\a.txt");
			ObjectOutputStream oo = new ObjectOutputStream(out);
			oo.writeObject(s);

			System.out.println("Successfully Serialized!!");

		} catch (Exception e) {
			System.out.println("Exception is : " + e);
		}

	}

}
