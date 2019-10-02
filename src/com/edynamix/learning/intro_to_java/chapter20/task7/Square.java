package com.edynamix.learning.intro_to_java.chapter20.task7;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw " + getClass());
    }
}
