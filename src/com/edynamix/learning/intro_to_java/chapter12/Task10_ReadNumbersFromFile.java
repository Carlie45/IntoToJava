package com.edynamix.learning.intro_to_java.chapter12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task10_ReadNumbersFromFile {

	private static void printFileContent(String fileName) throws IOException, FileParseException {
		long lineNumber = 0;
		String line = "";
		try (BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)))) {
			while ((line = reader.readLine()) != "") {
				int number = Integer.parseInt(line);
				System.out.println(number);
				lineNumber++;
			}		
		} catch (NumberFormatException nfe) {
			throw new FileParseException(fileName, lineNumber, nfe.getMessage());
		}
	}
	
	public static void main(String[] args) {
		String fileName = "./resources/test.txt";
		try {
			printFileContent(fileName);
		} catch (IOException | FileParseException e) {
			e.printStackTrace();
		}
	}

}
