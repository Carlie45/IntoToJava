package com.edynamix.learning.intro_to_java.chapter9;

import java.util.Arrays;

public class Task10_MultiplyPolynomials {

	private static int[] multiplyPolynomials(int[] pol1, int[] pol2) {
		int[] result = new int[pol1.length + pol2.length - 1];
		
		int i = 0;
		int j = 0;
		for (i = 0; i < pol1.length; i++) {
			for (j = 0; j < pol2.length; j++) {
				result[i + j] += pol1[i] * pol2[j];
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] pol1 = {-3, 2, 1};
		int[] pol2 = {1,-2, 4};
		
		System.out.println(Arrays.toString(multiplyPolynomials(pol1, pol2)));
	}

}
