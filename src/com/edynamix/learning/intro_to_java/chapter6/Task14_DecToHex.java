package com.edynamix.learning.intro_to_java.chapter6;

public class Task14_DecToHex {
	
	public static String decToHex(int decimal) {
		String hex = "";
		
		while(decimal > 0) {
			if (decimal % 16 <= 9) {
				hex = decimal % 16 + hex;
			} else {
				switch (decimal % 16) {
				case 10: hex = 'A' + hex; break;
				case 11: hex = 'B' + hex; break;
				case 12: hex = 'C' + hex; break;
				case 13: hex = 'D' + hex; break;
				case 14: hex = 'E' + hex; break;
				case 15: hex = 'F' + hex; break;
				}
			}
			
			decimal = decimal / 16;
		}
		
		return hex;
	}

	public static void main(String[] args) {
		int decimal = 45;
		String hex = decToHex(decimal);
		
		System.out.println(hex);
	}

}
