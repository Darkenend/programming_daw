/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

public class Repte6 {
	Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Repte6 op = new Repte6();
		op.start();
	}
	
	public void start()	{
		int[] value = {1, 2, 3, 4, 5, 4, 3, 2, 1, 273};
		int userinput;
		System.out.println("Introdueix un nombre:");
		userinput=teclado.nextInt();
		int display=counting(value, userinput);
		System.out.println("El nombre "+userinput+" s'ha trobat "+display+" vegades.");
	}
	
	public int counting(int[] array, int integer) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			if (integer==array[i]) {
				result++;
			}
		}
		return result;
	}

}
