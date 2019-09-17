package com.edynamix.learning.intro_to_java.chapter11;

public class Task4_10Cats {

	public static void main(String[] args) {

		Task3_Cat[] cats = new Task3_Cat[10];
				 
		for (int i = 0; i < cats.length; i++) {
			cats[i] = new Task3_Cat();
			cats[i].setName("Cat" + i);
		}
				
		for (int i = 0; i < cats.length; i++) {
			cats[i].sayMiau();
		}
	}

}
