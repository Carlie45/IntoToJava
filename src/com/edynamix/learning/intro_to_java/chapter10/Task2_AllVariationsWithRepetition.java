package com.edynamix.learning.intro_to_java.chapter10;

public class Task2_AllVariationsWithRepetition {

	public static int n;
    public static int k;
    public static int[] variations;
 
    public static void findVariations(int currentLoop) {
        if (currentLoop == n) {
        	printVariation();
            return;
        }
 
        for (int counter = 1; counter <= k; counter++) {
            variations[currentLoop] = counter;
            findVariations(currentLoop + 1);
        }
    }
 
    public static void printVariation() {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", variations[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        n = 3;
        k = 3;
        variations = new int[n];
 
        findVariations(0);
    }

}
