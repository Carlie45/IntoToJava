package com.edynamix.learning.intro_to_java.chapter14;

import java.util.ArrayList;
import java.util.List;

public class School {
	
	private List<SchoolStudent> students = new ArrayList<>();
	private List<SchoolClass> classes = new ArrayList<>();
	
	public School() {

	}
	
	public School(List<SchoolStudent> students, List<SchoolClass> classes) {
		this.students = students;
		this.classes = classes;
	}

	public List<SchoolStudent> getStudents() {
		return students;
	}

	public void setStudents(List<SchoolStudent> students) {
		this.students = students;
	}

	public List<SchoolClass> getClasses() {
		return classes;
	}

	public void setClasses(List<SchoolClass> classes) {
		this.classes = classes;
	}
	
	public void addStudent(SchoolStudent s) {
		students.add(s);
	}
	
	public void removeStudent(SchoolStudent s) {
		students.remove(s);
	}
	
	public void addClass(SchoolClass sc) {
		classes.add(sc);
	}
	
	public void removeClass(SchoolClass sc) {
		classes.remove(sc);
	}

	@Override
	public String toString() {
		return "School [students=" + students + ", classes=" + classes + "]";
	}

}
