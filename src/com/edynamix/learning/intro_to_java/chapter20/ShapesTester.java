package com.edynamix.learning.intro_to_java.chapter20;

public class ShapesTester {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle(2,3);
        shapes[1] = new Rectangle(3,4);
        shapes[2] = new Circle(1);

        for (Shape shape : shapes) {
            System.out.println(shape.calculateSurface());
        }
    }

}
