
/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

public class Club {
	private Member member1, member2, member3;
	

	public Club() {
		Scanner teclado = new Scanner(System.in);
		// TODO Auto-generated constructor stub
		member1 = new Member(teclado);
		member2 = new Member(teclado);
		member3 = new Member(teclado);
	}

	public void maxage() {
		System.out.println("Socio con mayor antiguedad:");
		if (member1.returnClub_Age() > member2.returnClub_Age()
				&& member1.returnClub_Age() > member3.returnClub_Age()) {
			member1.Print();
		} else {
			if (member2.returnClub_Age() > member3.returnClub_Age()) {
				member2.Print();
			} else {
				member3.Print();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Club club = new Club();
		club.maxage();
	}
}
