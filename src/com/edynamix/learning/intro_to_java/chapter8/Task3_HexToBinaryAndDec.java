package com.edynamix.learning.intro_to_java.chapter8;

import com.edynamix.learning.intro_to_java.chapter6.Task12_DecToBinary;
import com.edynamix.learning.intro_to_java.chapter6.Task15_HexToDec;

public class Task3_HexToBinaryAndDec {
	
	public static String hexToBinary(String hex) {
		String binary = "";
		
		for(int i = 0; i < hex.length(); i++) {
			int decLetter = Task15_HexToDec.hexToDecimal(hex.charAt(i) + "");
			String decLetterInBinary = Task12_DecToBinary.decToBinary(decLetter);
			while (i != 0 && decLetterInBinary.length() != 4) {
				decLetterInBinary = "0" + decLetterInBinary;
			}
			
			binary = binary + decLetterInBinary;
		}
		
		return binary;
	}

	public static void main(String[] args) {
		// Hex to binary.
		System.out.println(hexToBinary("2A3E"));
		System.out.println(hexToBinary("FA"));
		System.out.println(hexToBinary("FFFF"));
		System.out.println(hexToBinary("5A0E9"));
		
		// Hex to decimal.
		System.out.println(Task15_HexToDec.hexToDecimal("2A3E"));
		System.out.println(Task15_HexToDec.hexToDecimal("FA"));
		System.out.println(Task15_HexToDec.hexToDecimal("FFFF"));
		System.out.println(Task15_HexToDec.hexToDecimal("5A0E9"));
	}

}
