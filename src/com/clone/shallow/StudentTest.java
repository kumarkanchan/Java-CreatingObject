package com.clone.shallow;

public class StudentTest {

	public static void main(String[] args) {
		try {
			Student s1 = new Student(111);
			Student s2 = (Student) s1.clone();

			s1.number = 111;
			s2.number = 333;

			System.out.println(s1.number);
			s1.m();

			System.out.println("-----------");
			System.out.println(s2.number);
			s2.m();

			System.out.println("-----------");
			System.out.println(s1.hashCode() == s2.hashCode());
			

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
