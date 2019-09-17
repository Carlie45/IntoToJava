package com.edynamix.learning.intro_to_java.chapter8;

import com.edynamix.learning.intro_to_java.chapter6.Task13_BinaryToDec;
import com.edynamix.learning.intro_to_java.chapter6.Task14_DecToHex;

public class Task2_BinaryToHexAndDec {
	
	public static String binaryToHex(String binary) {
		String hex = "";
		
		char[] lastFourLetters = new char[4];
		while (binary != "") {
			for (int j = 3; j >= 0; j--) {
				int index = binary.length() - 4 + j;
				if (index < 0) {
					lastFourLetters[j] = '0';
				} else {
					lastFourLetters[j] = binary.charAt(index);
				}
				
			}
			
			hex = binaryGroupToLetterInHex(lastFourLetters) + hex;
			
			if (binary.length() >= 4) {
				binary = binary.substring(0, binary.length() - 4);
			} else {
				break;
			}
		}
		
		return hex;
	}
	
	private static String binaryGroupToLetterInHex(char[] binary) {
		int decimal = Task13_BinaryToDec.binaryToDec(new String(binary));		
		String s = Task14_DecToHex.decToHex(decimal);
		return s;
	}

	public static void main(String[] args) {
		System.out.println(binaryToHex("1111010110011110"));

	}

}
