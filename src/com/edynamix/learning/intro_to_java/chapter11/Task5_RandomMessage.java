package com.edynamix.learning.intro_to_java.chapter11;

import java.util.Random;

public class Task5_RandomMessage {

	private static final String[] MESSAGES = { "Продуктът е отличен.", "Това е страхотен продукт.",
			"Постоянно ползвам този продукт.", "Това е най-добрият продукт от тази категория." };

	private static final String[] CONSEQUENCES = { "Вече се чувствам добре.", "Успях да се променя.",
			"Той направи чудо.", "Не мога да повярвам, но вече се чувствам страхотно.",
			"Опитайте и вие. Аз съм много доволна." };

	private static final String[] FIRST_NAMES = { "Диана", "Петя", "Стела", "Елена", "Катя" };

	private static final String[] LAST_NAMES = { "Иванова", "Петрова", "Кирова" };

	private static final String[] CITIES = { "София", "Пловдив", "Варна", "Русе", "Бургас" };

	private static Random random = new Random();
	
	private static String getRandomStringFromArr(String[] arr) {
		int randIndex = random.nextInt(arr.length);
		return arr[randIndex];
	}
	
	public static void main(String[] args) {
		String randomMessage = "";
		randomMessage += getRandomStringFromArr(MESSAGES) + " ";
		randomMessage += getRandomStringFromArr(CONSEQUENCES) + " -- ";
		randomMessage += getRandomStringFromArr(FIRST_NAMES) + " ";
		randomMessage += getRandomStringFromArr(LAST_NAMES) + ", ";
		randomMessage += getRandomStringFromArr(CITIES);
		
		System.out.println(randomMessage);

	}

}
