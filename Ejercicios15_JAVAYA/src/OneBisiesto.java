/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */
import java.util.Scanner;

public class OneBisiesto {
	//Summoning everything needed
	Scanner teclado = new Scanner(System.in);
	int year;
	boolean bisiesto = false;
	
	//The first part, data input
	public void input() {
		System.out.println("Introduce el año del cual se quiere comprobar si es bisiesto:");
		year=teclado.nextInt();
	}
	
	//Operation part, checking that we have the correct year
	public void esBisiesto() {
		if (year%100==0) {
			if (year%4==0 && year%400==0) {
				bisiesto=true;
			}
		} else if (year%4==0) {
			bisiesto=true;
		}
	}
	
	public void display() {
		if (bisiesto==true) {
			System.out.println("El año "+year+" es bisiesto.");
		} else {
			System.out.println("El año "+year+" no es bisiesto.");
		}
	}
	
	public static void main(String[] args) {
		OneBisiesto operations=new OneBisiesto();
		operations.input();
		operations.esBisiesto();
		operations.display();
	}
}
