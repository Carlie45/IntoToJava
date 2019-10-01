package com.edynamix.learning.intro_to_java.chapter20;

public abstract class Shape {

    protected double width;
    protected double height;

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    protected abstract double calculateSurface();

}
