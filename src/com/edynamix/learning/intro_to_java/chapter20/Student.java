package com.edynamix.learning.intro_to_java.chapter20;

public class Student extends Human implements Comparable {

    private double mark;

    public Student() {
    }

    public Student(String firstName, String lastName, double mark) {
        super(firstName, lastName);
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mark=" + mark +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object obj) {
        Student other = (Student) obj;
        if (other.mark - this.mark > 0) {
            return -1;
        } else if (other.mark - this.mark < 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
