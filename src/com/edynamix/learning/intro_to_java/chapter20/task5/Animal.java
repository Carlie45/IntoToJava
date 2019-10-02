package com.edynamix.learning.intro_to_java.chapter20.task5;

public abstract class Animal {

    protected int age;
    protected String name;
    protected char gender;

    public Animal(int age, String name, char gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    protected abstract void  makeSound();
}
