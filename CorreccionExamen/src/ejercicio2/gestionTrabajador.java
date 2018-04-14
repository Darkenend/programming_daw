package ejercicio2;

import java.util.Scanner;

public class gestionTrabajador {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String name;
		int age, rank, test;
		System.out.println("Introduce el nombre:");
		name=teclado.nextLine();
		System.out.println("Introduce la edad:");
		age=teclado.nextInt();
		System.out.println("Introduce tu categoria: (0 - Empleado, 1 - Encargado, 2 - Directivo)");
		rank=teclado.nextInt();
		System.out.println("Introduce tu antiguedad: (0 - Novato, 1 - Maduro, 2 - Experto)");
		test=teclado.nextInt();
		Trabajador op = new Trabajador(name, age, rank, test);
		double sueldo = op.calcularSueldo(age, rank, test);
		System.out.println("El sueldo es: "+sueldo);
	}
}
