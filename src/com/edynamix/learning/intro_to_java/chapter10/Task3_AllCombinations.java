package com.edynamix.learning.intro_to_java.chapter10;

public class Task3_AllCombinations {

	public static String[] words = {"test", "rock", "fun", "jump"};
    public static int k;
    public static String[] combination;
 
    public static void findCombinations(int currentLoop, int counter) {
        if (currentLoop == k) {
            printCombination();
            return;
        }
 
        while(counter < words.length) {
            combination[currentLoop] = words[counter];
            counter++;
            findCombinations(currentLoop + 1, counter);
        }
    }
 
    public static void printCombination() {
        for (int i = 0; i < k; i++) {
            System.out.print(combination[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        k = 2;
        combination = new String[k];
 
        findCombinations(0, 0);
    }

}
