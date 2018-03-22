/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

public class FraseAmbMesAs {
	private boolean end = false;
	private int A_num = 0;
	private String string_maxA = null;
	private String string_current = null;

	public static void main(String[] args) {
		FraseAmbMesAs op = new FraseAmbMesAs();
		op.start();
	}

	public void start() {
		System.out.println("Introdueix una frase per a contar les seues A, la frase 'fi' acabara el programa.");
		while (end == false) {
			string_processing();
		}
		good_bye();
	}

	public void string_processing() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Introdueix la frase a procesar:");
		string_current = keyboard.nextLine();

		if (string_current.equalsIgnoreCase("fi")) {
			end = true;
		} else {
			compareA();
		}
	}

	public void compareA() {
		int A_amount_temp = 0;
		for (int i = 0; i < string_current.length(); i++) {
			if (string_current.charAt(i) == 'a' || string_current.charAt(i) == 'A') {
				A_amount_temp++;
			}
		}
		if (A_amount_temp > A_num) {
			A_num = A_amount_temp;
			string_maxA = string_current;
		}
		resultPrint();
	}

	public void resultPrint() {
		System.out.println("La frase en mes A es:");
		System.out.println(string_maxA);
		System.out.println("La frase te " + A_num + " As");
	}

	public void good_bye() {
		System.out.println("Resultats finals:");
		System.out.println("La frase en mes A es:");
		System.out.println(string_maxA);
		System.out.println("La frase te " + A_num + " As");
	}
}
