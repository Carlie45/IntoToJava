package com.edynamix.learning.intro_to_java.chapter8;

import com.edynamix.learning.intro_to_java.chapter6.Task13_BinaryToDec;
import com.edynamix.learning.intro_to_java.chapter6.Task14_DecToHex;

public class Task9_BinaryToHex {
	
	public static String binaryToHex(String binary) {
		String hex = "";
		
		while (binary.length() > 0) {
			int lastFourDigitsStartIndex = binary.length() - 4;
			String hexLetter = "";
			if (lastFourDigitsStartIndex >= 0) {
				hexLetter = binary.substring(lastFourDigitsStartIndex);
				binary = binary.substring(0, lastFourDigitsStartIndex);
			} else {
				hexLetter = binary;
				binary = "";
			}
			
			int decLetter = Task13_BinaryToDec.binaryToDec(hexLetter);
			hex = Task14_DecToHex.decToHex(decLetter) + hex;
		}
		
		return hex;
	}

	public static void main(String[] args) {
		String binary = "10101000111110";
		String hex = binaryToHex(binary);
		
		System.out.println(hex);
	}

}
