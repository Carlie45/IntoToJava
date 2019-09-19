package com.edynamix.learning.intro_to_java.chapter14;

public class SchoolTest {

	public static void main(String[] args) {
		Discipline d1 = new Discipline("Maths", 20, 20);
		Discipline d2 = new Discipline("BEL", 20, 20);
		
		Teacher t1 = new Teacher();
		t1.addDiscipline(d1);
		
		Teacher t2 = new Teacher();
		t2.addDiscipline(d2);
		
		SchoolClass sc = new SchoolClass();
		sc.setId("ne znam");
		sc.addTeacher(t1);
		sc.addTeacher(t2);
		
		SchoolStudent ss1 = new SchoolStudent("Angel", 1);
		School school = new School();
		school.addClass(sc);
		school.addStudent(ss1);
		System.out.println(school);
	}

}
