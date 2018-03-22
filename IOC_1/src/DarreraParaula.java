/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

public class DarreraParaula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ves escrivint paraules.");
		System.out.println("Per a acabar, escriu la paraula fi");
		String lastword = "";
		boolean fi = false;
		do {
			String word=teclado.next();
			if (word.equals("fi")) {
				fi = true;
			} else {
				if (word.compareTo(lastword) > 0) {
					lastword=word;
				}
			}
		} while (!fi);
		teclado.close();
		System.out.println("La darrera paraula es: "+lastword);
	}
}
