package com.edynamix.learning.intro_to_java.chapter6;

public class Task13_BinaryToDec {
	
	public static int binaryToDec(String binary) {
		char[] arr = binary.toCharArray();
		int dec = 0;
		
		for (int i = arr.length - 1; i >= 0; i--) {
			dec += (arr[i] - '0') * Math.pow(2, arr.length - 1 - i);
		}
		
		return dec;
	}

	public static void main(String[] args) {
		String binary = "101";
		int dec = binaryToDec(binary);
		
		System.out.println(dec);
	}

}
