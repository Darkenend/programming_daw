/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

public class InverteixArrayText {
	
	public static final int num_words = 5;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] array=new String[5];
		String[] array2=new String[5];
		System.out.println("Has d'escriure "+num_words+" paraules.");
		System.out.println("Ha d'haver una per linia.");
		for (int i = 0; i < array.length; i++) {
			array[i]=teclado.next();
		}
		for (int i = 0; i < array2.length; i++) {
			array2[4-i]=array[i];
		}
		teclado.close();
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

}
