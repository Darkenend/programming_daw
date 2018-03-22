/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

public class SenseSplit {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String userstring;
		String[] arraystring=new String[16];
		System.out.println("Introduce la linea:");
		userstring=teclado.nextLine();
		char charmiddle;
		String stringmiddle;
		int j=0;
		teclado.close();
		for (int i = 0; i < userstring.length(); i++) {
			if (userstring.charAt(i)==' ') {
				j++;
			} else {
				if (arraystring[j]==null) {
					charmiddle=userstring.charAt(i);
					stringmiddle=Character.toString(charmiddle);
					arraystring[j]=stringmiddle;
				} else {
					arraystring[j]=arraystring[j]+userstring.charAt(i);
				}
			}
		}
		for (int i = 0; i < arraystring.length; i++) {
			if (arraystring[i] != null) {
				System.out.println(arraystring[i]);
			}
		}
	}
}
