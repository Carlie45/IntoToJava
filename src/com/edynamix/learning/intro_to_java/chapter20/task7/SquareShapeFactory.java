package com.edynamix.learning.intro_to_java.chapter20.task7;

public class SquareShapeFactory extends AbstractShapeFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        } else {
            throw new IllegalArgumentException("Unknown shape type.");
        }
    }
}
