package com.edynamix.learning.intro_to_java.chapter14;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {

	private String id;
	private List<Teacher> teachers = new ArrayList<>();
	
	public SchoolClass() {
		
	}
	
	public SchoolClass(String id, List<Teacher> teachers) {
		this.id = id;
		this.teachers = teachers;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	
	public void addTeacher(Teacher t) {
		teachers.add(t);
	}
	
	public void removeTeacher(Teacher t) {
		teachers.remove(t);
	}

	@Override
	public String toString() {
		return "SchoolClass [id=" + id + ", teachers=" + teachers + "]";
	}
	
}
