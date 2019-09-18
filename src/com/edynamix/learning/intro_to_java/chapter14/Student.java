package com.edynamix.learning.intro_to_java.chapter14;

public class Student {
	
	private String firstName;
	private String surname;
	private String lastName;
	private byte course;
	private String speciality;
	private String university;
	private String email;
	private String phoneNumber;
	
	private static int studentCount = 0;

	public Student() {
		studentCount++;
	}
	
	public Student (String firstName, String surname, String lastName) {
		this();
		this.firstName = firstName;
		this.surname = surname;
		this.lastName = lastName;
	}

	public Student(String firstName, String surname, String lastName, byte course, String speciality, String university,
			String email, String phoneNumber) {
		this(firstName, surname, lastName);
		this.course = course;
		this.speciality = speciality;
		this.university = university;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	
	public void print() {
		System.out.println(this.toString());
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public byte getCourse() {
		return course;
	}

	public void setCourse(byte course) {
		this.course = course;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static int getStudentCount() {
		return studentCount;
	}

	public static void setStudentCount(int studentCount) {
		Student.studentCount = studentCount;
	}

	public String toString() {
		return "Student [firstName=" + firstName + ", surname=" + surname + ", lastName=" + lastName + ", course="
				+ course + ", speciality=" + speciality + ", university=" + university + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
}
