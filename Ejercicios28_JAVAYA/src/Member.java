
/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

public class Member {
	private String name;
	private int club_age;

	public Member(Scanner teclado) {
		// TODO Auto-generated constructor stub
		System.out.println("Introduce el nombre del miembro:");
		name = teclado.next();
		System.out.println("Introduce su antiguedad en años:");
		club_age = teclado.nextInt();
	}

	public void Print() {
		System.out.println(name + " tiene una antiguedad de " + club_age + " años.");
	}

	public int returnClub_Age() {
		return club_age;
	}
}
