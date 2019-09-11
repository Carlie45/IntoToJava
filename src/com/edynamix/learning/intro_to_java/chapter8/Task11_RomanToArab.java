package com.edynamix.learning.intro_to_java.chapter8;

public class Task11_RomanToArab {

	private static int getValueForChar(char c) {
		int value = 0;
		switch(c) {
		case 'I': value = 1; break;
		case 'V': value = 5; break;
		case 'X': value = 10; break;
		case 'L': value = 50; break;
		case 'C': value = 100; break;
		case 'D': value = 500; break;
		case 'M': value = 1000; break;
		}
		
		return value;
	}
	
	public static int romanToArab(String roman) {
		int arab = 0;
		
		for (int i = 0; i < roman.length() - 1; i++) {
			char current = roman.charAt(i);
			char next = roman.charAt(i + 1);
			
			if (getValueForChar(current) >= getValueForChar(next)) {
				arab += getValueForChar(current);
			} else {
				arab -= getValueForChar(current);
			}
		}
		
		arab += getValueForChar(roman.charAt(roman.length() - 1));
		
		return arab;
	}
	
	public static void main(String[] args) {
		String roman = "XCIX";
		int arab = romanToArab(roman);
		
		System.out.println(arab);
	}

}
