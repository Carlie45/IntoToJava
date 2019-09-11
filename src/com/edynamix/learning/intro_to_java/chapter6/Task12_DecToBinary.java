package com.edynamix.learning.intro_to_java.chapter6;

public class Task12_DecToBinary {
	
	public static String decToBinary(int decimal) {
		String binary = "";
		
		while (decimal > 0) {
			binary = (decimal % 2) + binary;
			decimal = decimal / 2;
		}
		
		return binary;
	}

	public static void main(String[] args) {
		int k = 5;
		String binary = decToBinary(k);
		
		System.out.println(binary);
	}

}
