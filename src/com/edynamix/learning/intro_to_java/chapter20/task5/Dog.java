package com.edynamix.learning.intro_to_java.chapter20.task5;

public class Dog extends Animal {

    public Dog(int age, String name, char gender) {
        super(age, name, gender);
    }

    @Override
    public void makeSound() {
        System.out.println("Bau, bau.");
    }
}