package com.edynamix.learning.intro_to_java.chapter12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task8_ReadFile {
	
	private static String getFileContent(String fileName) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
		String line = "";
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		br.close();
		
		return sb.toString();
	}
	
	public static void main(String[] args) {

		String fileName = "./resources/test.txt";
		try {
			String content = getFileContent(fileName);
			System.out.println(content);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
