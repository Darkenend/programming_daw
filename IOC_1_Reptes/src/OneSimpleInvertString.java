/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

public class OneSimpleInvertString {
	Scanner teclado = new Scanner(System.in);
	String input;
	
	public OneSimpleInvertString() {
		System.out.println("Inserta una frase:");
		input=teclado.nextLine();
	}
	
	public void InvertedPrint() {
		for (int i = 0; i < input.length(); i++) {
			System.out.print(input.charAt(input.length()-i-1));
		}
	}

	public static void main(String[] args) {
		OneSimpleInvertString op=new OneSimpleInvertString();
		op.InvertedPrint();
	}
}
