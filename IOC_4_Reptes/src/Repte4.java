/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

public class Repte4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Repte4 op = new Repte4();
		op.start();
	}
	
	public void start() {
		Scanner teclado = new Scanner(System.in);
		//Simple loop that contains the 4 numbers that have been introducted by the user in a int array
		System.out.println("Introdueix 4 nombres:");
		int[] arrayint = new int[4];
		for (int i = 0; i < 4; i++) {
			System.out.println("Introdueix el nombre "+(i+1)+" de 4:");
			arrayint[i]=teclado.nextInt();
		}
		//Jump to checkMin to find out which number is the solution
		int min = checkMin(arrayint[0], arrayint[1], arrayint[2], arrayint[3]);
		System.out.println("El nombre minim es: "+min);
		teclado.close();
	}
	
	public int checkMin (int a, int b, int c, int d) {
		int min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		if (d < min) {
			min = d;
		}
		//we return min
		return min;
	}

}
