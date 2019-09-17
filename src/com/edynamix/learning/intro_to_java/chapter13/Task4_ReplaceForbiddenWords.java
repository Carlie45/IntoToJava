package com.edynamix.learning.intro_to_java.chapter13;

public class Task4_ReplaceForbiddenWords {

	public static void main(String[] args) {
		String line = "Microsoft announced its next generation Java compiler today. "
				+ "It uses advanced parser and special optimizer for the Microsoft JVM.";
		
		String forbiddenWordsString = "Java,JVM,Microsoft";
		String[] forbiddenWords = forbiddenWordsString.split(",");
		
		for (String forbiddenWord : forbiddenWords) {
			StringBuilder newWord = new StringBuilder();
			for ( int i = 0; i < forbiddenWord.length(); i++) {
				newWord.append("*");
			}
			line = line.replaceAll(forbiddenWord, newWord.toString());
		}

		System.out.println(line);
	}

}
