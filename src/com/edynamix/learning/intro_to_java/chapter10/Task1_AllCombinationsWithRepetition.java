package com.edynamix.learning.intro_to_java.chapter10;

public class Task1_AllCombinationsWithRepetition {
	
	public static int n;
    public static int k;
    public static int[] combination;
 
    public static void findCombinations(int currentLoop, int counter) {
        if (currentLoop == n) {
            printCombination();
            return;
        }
 
        for (int i = counter; i <= k; i++) {
            combination[currentLoop] = i;
            findCombinations(currentLoop + 1, counter++);
        }
    }
 
    public static void printCombination() {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", combination[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        n = 3;
        k = 3;
        combination = new int[n];
 
        findCombinations(0, 1);
    }

}
