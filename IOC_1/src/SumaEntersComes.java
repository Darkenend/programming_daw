/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

public class SumaEntersComes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriu una serie de nombres separats per comes");
		String text = teclado.nextLine();
		teclado.close();
		String[] arraytext = text.split(",");
		int suma=0;
		for (int i = 0; i < arraytext.length; i++) {
			int value = Integer.parseInt(arraytext[i]);
			suma=suma+value;
		}
		System.out.println("La suma dona: "+suma);
	}
}
