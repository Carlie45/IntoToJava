package com.edynamix.learning.intro_to_java.chapter14;

public class Discipline {

	private String name;
	private int lessonsCount;
	private int exercisesCount;
	
	public Discipline() {
		
	}
	
	public Discipline(String name, int lessonsCount, int exercisesCount) {
		this.name = name;
		this.lessonsCount = lessonsCount;
		this.exercisesCount = exercisesCount;
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLessonsCount() {
		return lessonsCount;
	}

	public void setLessonsCount(int lessonsCount) {
		this.lessonsCount = lessonsCount;
	}

	public int getExercisesCount() {
		return exercisesCount;
	}

	public void setExercisesCount(int exercisesCount) {
		this.exercisesCount = exercisesCount;
	}

	@Override
	public String toString() {
		return "Discipline [name=" + name + ", lessonsCount=" + lessonsCount + ", exercisesCount=" + exercisesCount
				+ "]";
	}
	
}
