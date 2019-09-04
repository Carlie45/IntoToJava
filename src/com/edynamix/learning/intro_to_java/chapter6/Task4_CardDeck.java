package com.edynamix.learning.intro_to_java.chapter6;

public class Task4_CardDeck {

	public static void main(String[] args) {
		String[] colours = new String[]{"hearts", "clubs", "spades", "diamonds"};
		String[] namedCards = new String[]{"jack", "queen", "king", "ace"};
		
		for (int i = 2; i <= 10; i++) {
			for (String colour : colours) {
				System.out.print(i + colour + " ");
			}
			System.out.println();
		}
		
		for (String namedCard : namedCards) {
			for (String colour : colours) {
				System.out.print(namedCard + " " + colour + " ");
			}
			System.out.println();
		}
	}

}
