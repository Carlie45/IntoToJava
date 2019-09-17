package com.edynamix.learning.intro_to_java.chapter13;

import java.util.Scanner;

public class Task1_ReversedString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		String line = sc.nextLine();
		sc.close();

		StringBuilder sb = new StringBuilder();
		for (int i = line.length() - 1; i >= 0; i--) {
			sb.append(line.charAt(i));
		}
	
		System.out.println(sb.toString());
	}

}
