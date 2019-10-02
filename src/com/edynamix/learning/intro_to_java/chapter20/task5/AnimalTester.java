package com.edynamix.learning.intro_to_java.chapter20.task5;

public class AnimalTester {

    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog(3, "Sharo", 'm');
        animals[1] = new Frog(1, "Tara", 'f');
        animals[2] = new Kitten(1, "Lucy", 'f');
        animals[3] = new Tomcat(5, "Richard", 'm');

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.makeSound();
        }
    }
}
