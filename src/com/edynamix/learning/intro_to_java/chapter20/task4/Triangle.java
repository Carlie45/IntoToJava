package com.edynamix.learning.intro_to_java.chapter20.task4;

public class Triangle extends Shape {

    public Triangle(double width, double height) {
        super(width, height);
    }

    @Override
    protected double calculateSurface() {
        return width * height / 2;
    }
}
