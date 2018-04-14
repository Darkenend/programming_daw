/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

public class ThreeCountAChar {
	Scanner teclado = new Scanner(System.in);
	int string_amount;
	int count = 0;
	String[] strings;
	public ThreeCountAChar() {
		System.out.println("¿Cuantas frases deseas introducir?");
		string_amount=teclado.nextInt();
		String[] strings = new String[string_amount];
		for (int i = 0; i < string_amount; i++) {
			System.out.println("Introduce la frase "+(i+1));
			strings[i]=teclado.nextLine();
			strings[i]=strings[i].toLowerCase();
		}
		for (int i = 0; i < strings.length; i++) {
			for (int j = 0; j < strings[i].length(); j++) {
				if (strings[i].charAt(j)=='a') {
					count++;
				}
			}
		}
		System.out.println("En total se han contado "+count+" 'a's.");
	}
}
