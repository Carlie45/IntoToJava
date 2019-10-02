package com.edynamix.learning.intro_to_java.chapter20.task5;

public class Tomcat extends Cat {

    public Tomcat(int age, String name, char gender) {
        super(age, name, gender);
    }

    @Override
    public void makeSound() {
        System.out.println("Mrrrrrr.");
    }
}
