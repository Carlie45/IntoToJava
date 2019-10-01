package com.edynamix.learning.intro_to_java.chapter20;

public class Rectangle extends Shape {

    public Rectangle(double width, double height) {
        super(width, height);
    }

    @Override
    protected double calculateSurface() {
        return width * height;
    }
}
