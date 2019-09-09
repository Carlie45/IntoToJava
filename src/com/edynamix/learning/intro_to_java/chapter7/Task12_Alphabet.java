package com.edynamix.learning.intro_to_java.chapter7;

import java.util.Scanner;

public class Task12_Alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		char[] word  = sc.next().toCharArray();
		
		char[] alphabet = new char[26];
		for (int i = 0; i < 26; i++) {
			alphabet[i] = (char) ('a' + i);
		}
		
		
		for (int k = 0; k < word.length; k++) {
			for(int j = 0; j < 26; j++) {
				if (word[k] == alphabet[j]) {
					System.out.println(word[k] + " = " + j);
				}
			}
		}

	}

}
