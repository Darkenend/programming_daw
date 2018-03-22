
/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

public class saludosDespedida {
	public String primerApellido(String apellidosIntroducidos) {
		String[] apellido = apellidosIntroducidos.split(" ");
		return apellido[0];
	}

	public String saludo(String a1) {
		String fraseSaludo = "Estimado señor/a " + a1;
		return fraseSaludo;
	}

	public static void despedida(String a3) {
		System.out.println("Le deseamos un buen dia " + a3);
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombre, apellidos;
		String primerApellido, segundoApellido, fraseApellido1;

		System.out.println("Inserta tu nombre");
		nombre = teclado.nextLine();
		System.out.println("Inserta tus apellidos");
		apellidos = teclado.nextLine();

		saludosDespedida problema = new saludosDespedida();
		teclado.close();
		// ok llama al programa solo

		primerApellido = problema.primerApellido(apellidos); // ok

		fraseApellido1 = problema.saludo(primerApellido); // ok
		System.out.println(fraseApellido1);

		despedida(nombre); // ok

	}

}
