/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;
public class SevenDivideTwoRealNumbers {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num1, num2;
		// START OF THE PROGRAM
		System.out.println("Introduce dos numeros reales y se mostrara el resultado.");
		System.out.println("Introduce el primer numero");
		num1=teclado.nextDouble();
		System.out.println("Introduce el segundo numero");
		num2=teclado.nextDouble();
		while (num2==0) {
			System.out.println("El segundo numero no puede ser 0");
			System.out.println("Introduce el segundo numero");
			num2=teclado.nextDouble();
		}
		System.out.println("El resultado es: "+(num1/num2));
		teclado.close();
	}

}
