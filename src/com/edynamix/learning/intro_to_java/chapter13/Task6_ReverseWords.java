package com.edynamix.learning.intro_to_java.chapter13;

public class Task6_ReverseWords {

	public static void main(String[] args) {
		String line = "C# is not C++ and PHP is not Delphi";
		String[] words = line.split(" ");
		
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			sb.insert(0, word + " ");
		}
		
		System.out.println(sb.toString());
	}

}
