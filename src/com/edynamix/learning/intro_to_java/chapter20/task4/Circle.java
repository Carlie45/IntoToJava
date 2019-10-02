package com.edynamix.learning.intro_to_java.chapter20.task4;

public class Circle extends Shape {

    public Circle(double radius) {
        super(radius, radius);
    }

    @Override
    protected double calculateSurface() {
        return Math.PI * width * height;
    }
}
