
/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

public class TwoTripleAttemptTest {
	public static final char Answer = 'b';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int intentos = 0;
		System.out.println("Endevina la pregunta.");
		System.out.println("Quin dels següents no és un tipus primitiu?");
		System.out.println("a) Enter");
		System.out.println("b) Scanner");
		System.out.println("c) Caràcter");
		System.out.println("d) Booleà");
		System.out.print("La teva resposta és l'opció: ");
		// Es llegeix la cadena de text.
		while (intentos < 3) {
			System.out.println(intentos + " de 3 intentos.");
			String paraula = teclado.next();
			// És una paraula d'un únic caràcter?
			if (paraula.length() == 1) {
				// S'extreu el caràcter de la cadena de text.
				char caracter = paraula.charAt(0);
				// És un caràcter vàlid? (a, b, c o d)
				if ((caracter >= 'a') && (caracter <= 'd')) {
					// La resposta final és correcta?
					if (caracter == Answer) {
						System.out.println("Efectivament, la resposta era '" + Answer + "'.");
						System.exit(0);
					} else {
						System.out.println("La resposta '" + caracter + "' és incorrecta.");
						intentos++;
					}
				} else {
					System.out.println("'" + caracter + "' és una opció incorrecta.");
				}
			} else {
				// No ho era.
				System.out.println("\"" + paraula + "\" no és un caràcter individual.");
			}
			teclado.nextLine();
		}
		teclado.close();
	}
}
