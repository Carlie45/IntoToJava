package com.edynamix.learning.intro_to_java.chapter20.task7;

public class CircleShapeFactory extends AbstractShapeFactory {
    @Override
    Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else {
            throw new IllegalArgumentException("Unknown shape type.");
        }
    }
}
