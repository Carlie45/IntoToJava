package com.edynamix.learning.intro_to_java.chapter10;

public class Task6_AllPermutations {

	public static int n = 3;
    public static int[] permutations = new int[n];
 
    public static void findPermutations(int k) {
        if (k == 0) {
        	printPermutation();
            return;
        }

        
        for (int i = 0; i < k; i++) {
        	int temp = permutations[i];
        	permutations[i] = permutations[k];
        	permutations[k] = temp;
        	findPermutations(k - 1);
        	temp = permutations[i];
        	permutations[i] = permutations[k];
        	permutations[k] = temp;
        	findPermutations(k - 1);
        }
        
    }
 
    public static void printPermutation() {
        for (int i = 0; i < n; i++) {
            System.out.print(permutations[i] + " ");
        }
        System.out.println();
    }
	
	public static void main(String[] args) {
		for (int i = 1; i <= n; i++) {
			permutations[i - 1] = i;
		}
		
		findPermutations(n - 1);
	}

}
