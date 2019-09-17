package com.edynamix.learning.intro_to_java.chapter12;

public class FileParseException extends Exception {
	
	public FileParseException(String fileName, long lineNumber, String message) {
		super("An exception occured while processing file \"" + fileName + "\" at line " + lineNumber 
				+ ". Exception message: " + message);
	}

}
