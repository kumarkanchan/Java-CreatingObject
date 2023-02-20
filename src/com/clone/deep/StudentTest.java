package com.clone.deep;

public class StudentTest {

	public static void main(String[] args) {
		try {

			Course science = new Course("Math", "Computer", "CS");
			
			Student student1 = new Student(111, "Kanchan", science);

			System.out.println(student1.course.subject1);

			Student student2 = (Student) student1.clone();
			System.out.println(student1.hashCode());
			System.out.println(student2.hashCode());
			student2.course.subject1 = "Math-Statics";
			System.out.println(student2.course.subject1);

		} catch (Exception e) {
			System.out.println("Catch... " + e);
		}
	}
}
