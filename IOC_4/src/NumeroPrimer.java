/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Random;
import java.util.Scanner;

public class NumeroPrimer {

	public static void main(String[] args) {
		NumeroPrimer op = new NumeroPrimer();
		op.start();
	}
	
	public void start() {
		int user = 0, checked = 0;
		boolean primenumber = false;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introdueix el nombre de repeticions.");
		user = teclado.nextInt();
		Random random = new Random();
		teclado.close();
		for (int i = 0; i < user; i++) {
			checked = anyRandomIntRange(random, 2, 50);
			primenumber = prime(checked);
			if (primenumber == true) {
				System.out.println("El nombre "+checked+" es primer.");
			} else {
				System.out.println("El nombre "+checked+" no es primer.");
			}
		}
	}
	
	public int anyRandomIntRange (Random random, int min, int max) {
		int result = random.nextInt(max)+min;
		return result;
	}
	
	public boolean prime(int test) {
		boolean checking = true; 
		for (int i = 2; i < test; i++) {
			if (test%i==0) {
				checking=false;
			}
		}
        return checking != false;
	}
}
