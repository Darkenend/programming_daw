/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

public class MesVocals {

	public static void main(String[] args) {
		MesVocals programa = new MesVocals();
		programa.inici();
	}

	public void inici() {
		System.out.println("Escriu una frase: ");
		Scanner lector = new Scanner(System.in);
		String frase = lector.nextLine();
		String res = cercaMesVocals(frase);
		lector.close();
		System.out.println("La frase amb més vocals és \"" + res + "\".");
	}

	public String cercaMesVocals(String frase) {
		String[] paraules = frase.split(" ");
		String res = paraules[0];
		int maxVocals = comptaVocals(paraules[0]);
		for (int i = 1; i < paraules.length; i++) {
			int parVocals = comptaVocals(paraules[i]);
			if (parVocals > maxVocals) {
				maxVocals = parVocals;
				res = paraules[i];
			}
		}
		return res;
	}

	public int comptaVocals(String paraula) {
		int numVocals = 0;
		String paraulaMin = paraula.toLowerCase();
		for (int i = 0; i < paraulaMin.length(); i++) {
			boolean esVocal = mirarVocal(paraulaMin.charAt(i));
			if (esVocal) {
				numVocals++;
			}
		}
		return numVocals;
	}

	public boolean mirarVocal(char c) {
		boolean res = false;
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			res = true;
		}
		return res;
	}

}