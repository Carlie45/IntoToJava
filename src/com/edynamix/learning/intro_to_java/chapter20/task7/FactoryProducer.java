package com.edynamix.learning.intro_to_java.chapter20.task7;

public class FactoryProducer {

    public static AbstractShapeFactory getFactory(boolean isSquare) {
        if (isSquare) {
            return new SquareShapeFactory();
        } else {
            return new CircleShapeFactory();
        }
    }
}
