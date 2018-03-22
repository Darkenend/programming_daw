/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

public class Repte5 {
	Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Repte5 op = new Repte5();
		op.start();
	}
	
	public void start() {
		double[] start_array = new double[5];
		for (int i = 0; i < start_array.length; i++) {
			System.out.println("Introdueix la nota "+(i+1)+" de 5:");
			start_array[i]=teclado.nextDouble();
			while (start_array[i] < 0 || start_array[i]>10) {
				System.out.println("Error al introduir la nota");
				System.out.println("Introdueix la nota "+(i+1)+" de 5:");
				start_array[i]=teclado.nextDouble();
			}
		}
		double average_display = average(start_array[0], start_array[1], start_array[2], start_array[3], start_array[4]);
		System.out.println("La mitjana de les notes introduides es: "+average_display);
		if (average_display<5) {
			System.out.println("Suspes");
		}	else if (average_display<6) {
			System.out.println("Aprovat");
		}	else if (average_display<7) {
			System.out.println("Be");
		}	else if (average_display<9) {
			System.out.println("Notable");
		}	else {
			System.out.println("Excel·lent");
		}
	}
	
	public double average(double a, double b, double c, double d, double e) {
		double average_result = 0;
		average_result=(a+b+c+d+e)/5;
		return average_result;
	}
}
