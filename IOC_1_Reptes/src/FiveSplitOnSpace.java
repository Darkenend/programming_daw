/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;
public class FiveSplitOnSpace {
	Scanner teclado = new Scanner(System.in);
	String input;
	String[] stringarray;
	public FiveSplitOnSpace() {
		// TODO Auto-generated constructor stub
		System.out.println("Introdueix una frase:");
		input=teclado.nextLine();
	}
	
	public void Conversion() {
		stringarray=input.split(" ");
	}
	
	public void Print() {
		for (int i = 0; i < stringarray.length; i++) {
			System.out.println(stringarray[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiveSplitOnSpace op=new FiveSplitOnSpace();
		op.Conversion();
		op.Print();
	}

}
