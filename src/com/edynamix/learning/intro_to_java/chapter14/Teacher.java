package com.edynamix.learning.intro_to_java.chapter14;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

	private List<Discipline> disciplines = new ArrayList<>();

	public Teacher() {
		
	}
	
	public Teacher(List<Discipline> disciplines) {
		this.disciplines = disciplines;
	}

	public List<Discipline> getDisciplines() {
		return disciplines;
	}

	public void setDisciplines(List<Discipline> disciplines) {
		this.disciplines = disciplines;
	}
	
	public void addDiscipline(Discipline d) {
		disciplines.add(d);
	}
	
	public void removeDiscipline(Discipline d) {
		disciplines.remove(d);
	}

	@Override
	public String toString() {
		return "Teacher [disciplines=" + disciplines + "]";
	}
	
}
