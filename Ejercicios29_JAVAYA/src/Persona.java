/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

public class Persona {
	protected Scanner teclado;
	protected String name;
	protected int age;

	public Persona() {
		teclado = new Scanner(System.in);
	}
	
	public void loadData() {
		System.out.println("Introduce el nombre:");
		name=teclado.nextLine();
		System.out.println("Introduce la edad:");
		age=teclado.nextInt();
	}
	
	public void printData() {
		System.out.println("Nombre: "+name);
		System.out.println("Edad: "+age);
	}
}
