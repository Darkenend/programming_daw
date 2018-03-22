/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;
public class SixAcronymGenerator {
	Scanner teclado = new Scanner(System.in);
	String input, output;
	String[] array;
	public SixAcronymGenerator() {
		// TODO Auto-generated constructor stub
		System.out.println("Introduce lo que se desee acronimizar:");
		input=teclado.nextLine();
	}
	
	public void SplitAndJoining() {
		array=input.split(" ");
		output = "";
		for (int i = 0; i < array.length; i++) {
				output=output+array[i].charAt(0);
		}
	}
	
	public void Print() {
		System.out.println("El acronimo es "+output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SixAcronymGenerator op=new SixAcronymGenerator();
		op.SplitAndJoining();
		op.Print();
	}

}
