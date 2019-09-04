package com.edynamix.learning.intro_to_java.chapter6;

public class Task14_DecToHex {

	public static void main(String[] args) {
		int n = 45;
		String hex = "";
		
		while(n > 0) {
			if (n % 16 <= 9) {
				hex = n % 16 + hex;
			} else {
				switch (n % 16) {
				case 10: hex = 'A' + hex; break;
				case 11: hex = 'B' + hex; break;
				case 12: hex = 'C' + hex; break;
				case 13: hex = 'D' + hex; break;
				case 14: hex = 'E' + hex; break;
				case 15: hex = 'F' + hex; break;
				}
			}
			
			n = n / 16;
		}
		System.out.println(hex);
	}

}
