/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */
import java.util.Scanner;

public class TwoRespectiveDay {
	private Scanner teclado = new Scanner(System.in);
	private String day;
	private int n;
	
	private void input() {
		System.out.println("Introduce el dia de la semana:");
		n=teclado.nextInt();
		while (n < 1 || (n > 7 && n != 273)) {
			System.err.println("El numero no es valido");
			System.out.println("Introduce el dia de la semana:");
			n=teclado.nextInt();
		}
	}
	
	private void operation() {
		switch (n) {
		case 1:
			day="Lunes";
			break;
		case 2:
			day="Martes";
			break;
		case 3:
			day="Miercoles";
			break;
		case 4:
			day="Jueves";
			break;
		case 5:
			day="Viernes";
			break;
		case 6:
			day="Sabado";
			break;
		case 7:
			day="Domingo";
			break;
		case 273:
			day="No Dev Mode available!";
			break;
		default:
			day="Mistakes were made";
			break;
		}
	}
	
	private void display() {
		System.out.println("El dia "+n+" de la semana corresponde al "+day);
	}
	
	public static void main(String[] args) {
		TwoRespectiveDay operations=new TwoRespectiveDay();
		operations.input();
		operations.operation();
		operations.display();
	}
}
