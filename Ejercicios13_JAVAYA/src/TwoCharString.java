/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */
import java.util.Scanner;

public class TwoCharString {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String user;
		int n;
		String result=null;
		System.out.println("Introduce el numero de veces se debe repetir el caracter:");
		n=teclado.nextInt();
		System.out.println("Introduce el caracter a encadenar:");
		user=teclado.next();
		while (user.length() > 1) {
			System.err.println("Has introducido mas de un caracter");
			System.out.println("Introduce el caracter a encadenar:");
			user=teclado.next();
		}
		result=user;
		for (int i = 0; i < (n-1); i++) {
			result=result+user;
		}
		System.out.println("La cadena es:" + result);
		teclado.close();
	}
}
