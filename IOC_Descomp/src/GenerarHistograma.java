
/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Random;
import java.util.Scanner;

public class GenerarHistograma {
	private int roll;
	private int[] roll_history = new int[12];
	private int max;

	public static void main(String[] args) {
		GenerarHistograma op = new GenerarHistograma();
		System.out.println("Benvingut al histograma 2d6");
		op.start();
		op.histogram();
	}

	public void start() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introdueix el nombre de tirades:");
		int roll_amount = teclado.nextInt();
		System.out.println("A continuacio s'obtindran les dades de les " + roll_amount + " tirades.");
		teclado.close();
		System.out.println("");
		for (int i = 0; i < roll_amount; i++) {
			dice2d6Roll();
			switch (roll) {
			case 1:
				roll_history[0]++;
				break;
			case 2:
				roll_history[1]++;
				break;
			case 3:
				roll_history[2]++;
				break;
			case 4:
				roll_history[3]++;
				break;
			case 5:
				roll_history[4]++;
				break;
			case 6:
				roll_history[5]++;
				break;
			case 7:
				roll_history[6]++;
				break;
			case 8:
				roll_history[7]++;
				break;
			case 9:
				roll_history[8]++;
				break;
			case 10:
				roll_history[9]++;
				break;
			case 11:
				roll_history[10]++;
				break;
			case 12:
				roll_history[11]++;
				break;
			}
		}

	}

	private void dice2d6Roll() {
		Random ran = new Random();
		int die1 = ran.nextInt(5)+1;
		int die2 = ran.nextInt(5)+1;
		roll = die1 + die2;
	}

	private void histogram() {
		for (int i = 0; i < roll_history.length; i++) {
			if (i != 0) {
				System.out.print((i + 1) + ": ");
				for (int j = 0; j < roll_history[i]; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
		for (int i = 0; i < roll_history.length; i++) {
			if (roll_history[i] > roll_history[max]) {
				max = i;
			}
		}
		System.out.println("El maxim es " + (max + 1));
	}
}
