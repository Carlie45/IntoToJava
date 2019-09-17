package com.edynamix.learning.intro_to_java.chapter13;

public class Task3_ReplaceWithUpperCase {
	
	private static final String START_TAG = "<upcase>";
	private static final String END_TAG = "</upcase>";

	public static void main(String[] args) {
		String line = "We are living in a <upcase>yellow submarine</upcase>. We don't have <upcase>anything</upcase> else.";
		
		int startIndex = line.indexOf(START_TAG);
		int endIndex = line.indexOf(END_TAG);
	
		StringBuilder modified = new StringBuilder();
		while (startIndex != -1) {
			// Append everything before the opening tag. 
			modified.append(line.substring(0, startIndex));
			
			int startIndexOfContentBetweenTags = startIndex + START_TAG.length();
			// Append the content between the tags in upper case.
			modified.append(line.substring(startIndexOfContentBetweenTags, endIndex).toUpperCase());
			
			int endIndexOfClosingTag = endIndex + END_TAG.length();
			
			line = line.substring(endIndexOfClosingTag);
			
			// Find the next indexes.
			startIndex = line.indexOf(START_TAG);
			endIndex = line.indexOf(END_TAG);
		}

		// Append what is left after the last occurrence of the closing tag. 
		modified.append(line);
		
		System.out.println(modified.toString());

	}

}
