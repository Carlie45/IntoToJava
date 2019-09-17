package com.edynamix.learning.intro_to_java.chapter12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Task9_ReadWriteBinaryFile {
	
	private static byte[] getBinaryFileContent(String fileName) throws IOException {
		File file = new File(fileName);
		long fileLength = file.length();
		InputStream input = new FileInputStream(file);
		
		byte[] fileInBytes = new byte[(int) fileLength];
		input.read(fileInBytes, 0, (int) fileLength);
		input.close();
		
		return fileInBytes;
	}
	
	private static void printInFile(byte[] fileContent, String outputFileName) throws IOException {
		File file = new File(outputFileName);
		OutputStream output = new FileOutputStream(file);
		output.write(fileContent);
		output.close();
	}

	public static void main(String[] args) {
		String fileName = "./resources/cert.crt";
		try {
			byte[] content = getBinaryFileContent(fileName);
			printInFile(content, "./resources/copied-cert.crt");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
