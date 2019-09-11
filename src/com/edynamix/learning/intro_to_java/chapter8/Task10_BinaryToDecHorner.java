package com.edynamix.learning.intro_to_java.chapter8;

import com.edynamix.learning.intro_to_java.chapter6.Task13_BinaryToDec;

public class Task10_BinaryToDecHorner {
		
	public static int binaryToDec(String binary) {
		if (binary.length() == 1) {
			return binary.charAt(0) - '0';
		}
		
		return (binary.charAt(binary.length() - 1) - '0') + 2 * binaryToDec(binary.substring(0, binary.length() - 1));
	}

	public static void main(String[] args) {
		String binary = "11001";
		int dec = binaryToDec(binary);
		
		System.out.println(dec);
		System.out.println(Task13_BinaryToDec.binaryToDec(binary));
	}

}
