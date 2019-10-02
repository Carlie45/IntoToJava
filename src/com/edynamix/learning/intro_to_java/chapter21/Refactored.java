package com.edynamix.learning.intro_to_java.chapter21;

public class Refactored {

    public static void main(String... args) {
        final int VALUE = 8;
        switch (VALUE) {
            case 8:
                System.out.println("9 9 9");

                int charToSubtract = 'f';
                final int ITERATIONS_COUNT = 5;
                for (int k = 0; k < ITERATIONS_COUNT; k++) {
                    int numberToPrint = k - charToSubtract;
                    System.out.println("Current number: " + numberToPrint);
                }
                break;
            default:
                System.out.print("4 ");
                break;
        }
        System.out.println("Cycle");
    }
}
