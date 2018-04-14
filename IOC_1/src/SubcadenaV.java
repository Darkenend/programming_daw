/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

public class SubcadenaV {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introdueix una frase:");
		String mainstring = teclado.nextLine();
		String helpstring = mainstring.toLowerCase();
		int first = helpstring.indexOf("v");
		int last = helpstring.lastIndexOf("v");
		if (first == -1) {
			System.out.println("No hi ha ninguna v");
		} else if (first == last) {
			System.out.println("Sols hi ha una v");
		} else {
			System.out.println(mainstring.substring(first, last+1));
		}
		teclado.close();
	}
}
