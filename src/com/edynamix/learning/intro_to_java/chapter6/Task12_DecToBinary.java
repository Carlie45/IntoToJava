package com.edynamix.learning.intro_to_java.chapter6;

public class Task12_DecToBinary {

	public static void main(String[] args) {
		int k = 5;
		String binary = "";
		
		while (k > 0) {
			binary = (k % 2) + binary;
			k = k / 2;
		}
		System.out.println(binary);
	}

}
