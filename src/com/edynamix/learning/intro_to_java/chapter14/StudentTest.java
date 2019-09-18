package com.edynamix.learning.intro_to_java.chapter14;

public class StudentTest {
	
	private static Student student;
	
	public static void setStudent(Student s) {
		StudentTest inst = new StudentTest();
		if (inst.student == null) {
			inst.student = s;
		}
	}

	public static Student getStudent() {
		return student;
	}
	
	public static void printStaticStudent() {
		student.print();
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Ivan", "Petrov", "Kirilov");
		Student s3 = new Student("Kolio", "Kolev", "Stoyanov", (byte) 1, "Kibersigurnost", "NBU", "kolio.stoyanov@nbu.bg", "0812345678");
		
		s1.print();
		s2.print();
		s3.print();
		

	}

}
