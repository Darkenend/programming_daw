/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

public class AmbSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String userstring;
		System.out.println("Introdueix la frase:");
		userstring=teclado.nextLine();
		String[] stringarray = userstring.split(" ");
		for (int i = 0; i < stringarray.length; i++) {
			System.out.println(stringarray[i]+" ");
		}
		teclado.close();
	}
}
