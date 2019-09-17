package com.edynamix.learning.intro_to_java.chapter13;

public class Task5_ParseURL {

	public static void main(String[] args) {
		String url = "http://www.devbg.org/forum/index.php";
		
		int indexOfProtocolEnd = url.indexOf("://");
		String protocol = url.substring(0, indexOfProtocolEnd);
		System.out.printf("[protocol]=\"%s\"%n", protocol);
		
		url = url.substring(indexOfProtocolEnd + "://".length());
		int indexOfHostEnd = url.indexOf("/");
		String host = url.substring(0, indexOfHostEnd);
		System.out.printf("[host]=\"%s\"%n", host);
		
		String resource = url.substring(indexOfHostEnd);
		System.out.printf("[resource]=\"%s\"%n", resource);
	}

}
