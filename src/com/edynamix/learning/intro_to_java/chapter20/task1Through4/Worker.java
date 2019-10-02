package com.edynamix.learning.intro_to_java.chapter20.task1Through4;

public class Worker extends Human {

    private double salary;
    private int workedHours;

    public Worker(String firstName, String lastName, double salary, int workedHours) {
        super(firstName, lastName);
        this.salary = salary;
        this.workedHours = workedHours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    private double findSalaryForOneHour() {
        return salary / workedHours;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "salary=" + salary +
                ", workedHours=" + workedHours +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
