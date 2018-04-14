/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

public class CharCounter {
	Scanner teclado = new Scanner(System.in);
	String userstring;
	String stringcompare;
	char userchar;
	int count = 0;
	
	public CharCounter() {
		System.out.println("Este programa va a pedir una letra y una frase, y a continuacion contara cuantas veces se repite dicha letra.");
	}
	
	public void charInput() {
		System.out.println("Introduce la letra:");
		userchar = teclado.nextLine().charAt(0);
	}
	
	public void stringInput() {
		System.out.println("Introduce la frase:");
		userstring = teclado.nextLine();
	}
	
	public void comparison() {
		for (int i = 0; i < stringcompare.length(); i++) {
			if (userchar == stringcompare.charAt(i)) {
				count++;
			}
		}
	}
	
	public void lowerConvert() {
		stringcompare=userstring.toLowerCase();
	}
	
	public void upperConvert() {
		stringcompare=userstring.toUpperCase();
	}
	
	public void print() {
		System.out.println("En la frase "+userstring+" se repite la letra "+userchar+" un total de "+count+" veces.");
	}

	public static void main(String[] args) {
		CharCounter op=new CharCounter();
		op.charInput();
		op.stringInput();
		op.lowerConvert();
		op.comparison();
		op.upperConvert();
		op.comparison();
		op.print();
	}

}
