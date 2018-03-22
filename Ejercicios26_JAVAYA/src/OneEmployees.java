/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */
import java.util.Scanner;

//Let's start this
public class OneEmployees {
	Scanner teclado = new Scanner(System.in);
	String name;
	float pay;
	
	public OneEmployees() {
		System.out.println("Introduce el nombre del empleado:");
		name=teclado.nextLine();
		System.out.println("Introduce el sueldo:");
		pay=teclado.nextFloat();
	}
	
	public void taxpay() {
		if (pay>3000) {
			System.out.println("El empleado debe pagar impuestos.");
		} else {
			System.out.println("El empleado no debe pagar impuestos");
		}
	}
	
	public static void main(String[] args) {
		OneEmployees op=new OneEmployees();
		op.taxpay();
	}

}
