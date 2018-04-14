/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

public class ConcatenaText {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String text = "";
		int num_frases;
		System.out.println("Introdueix el nombre de frases que vols introduir.");
		num_frases=teclado.nextInt();
		System.out.println("Introdueix les frases y prem la tecla ENTER");
		for (int i = 0; i <= num_frases; i++) {
			text=text+" "+teclado.nextLine();
		}
		teclado.close();
		System.out.println(text);
	}
}
