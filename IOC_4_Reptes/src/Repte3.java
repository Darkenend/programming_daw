/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;
public class Repte3 {
	Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		Repte3 op = new Repte3();
		op.start();
	}
	public void start() {
		System.out.println("Introdueix un nombre real:");
		double num=readNum();
		System.out.println("El nombre es: "+num);
		System.out.println("Introdueix un altre nombre real:");
		num=readNum();
		System.out.println("El altre nombre es: "+num);
	}
	public double readNum() {
		double test=teclado.nextDouble();
		return test;
	}
}
