/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

//Let's start
public class fiveStringSeparation {
	//Summon everything!
	Scanner teclado = new Scanner(System.in);
	String sentence;
	
	public fiveStringSeparation() {
		// TODO Auto-generated constructor stub
		System.out.println("Introduce la frase a separar");
		sentence=teclado.nextLine();
	}
	
	public void printingLmao() {
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i)==' ') {
                System.out.println();
            } else {
                System.out.print(sentence.charAt(i));
            }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fiveStringSeparation op=new fiveStringSeparation();
		op.printingLmao();
	}

}
