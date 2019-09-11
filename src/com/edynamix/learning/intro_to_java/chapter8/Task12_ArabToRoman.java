package com.edynamix.learning.intro_to_java.chapter8;

public class Task12_ArabToRoman {
	
	private static char getRomanLetterForValue(int value) {
		char letter = 0;
		switch(value) {
		case 1: letter = 'I'; break;
		case 5: letter = 'V'; break;
		case 10: letter = 'X'; break;
		case 50: letter = 'L'; break;
		case 100: letter = 'C'; break;
		case 500: letter = 'D'; break;
		case 1000: letter = 'M'; break;
		}
		
		return letter;
	}

	public static String arabToRoman(int arab) {
		String roman = "";
		if (arab > 3999) {
			throw new IllegalArgumentException("Number out of range for roman numbers.");
		}

		int biggestLetter = 1000;
		while(arab != 0) {
			int n = arab / biggestLetter;
			
			if (n == 4 || n == 9) {
				roman += getRomanLetterForValue(biggestLetter);
				roman += getRomanLetterForValue((n + 1) * biggestLetter);
			} else {
				if (n >= 5) {
					roman += getRomanLetterForValue(biggestLetter/2);
					n = n - 5;
				}
				for (int i = 1; i <= n; i++) {
					roman += getRomanLetterForValue(biggestLetter);
				}
			}
			
			arab = arab % biggestLetter;
			biggestLetter = biggestLetter / 10;
		}
		
		return roman;
	}
	
	public static void main(String[] args) {
		int arab = 394;
		String roman = arabToRoman(arab);
		
		System.out.println(roman);
	}

}
