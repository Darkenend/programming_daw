/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

@SuppressWarnings("unused")
public class Empleado extends Persona {
		protected int pay;
	public void loadPay() {
		System.out.println("Ingresa el sueldo:");
		pay=teclado.nextInt();
	}
	
	public void printPay() {
		System.out.println("El sueldo es: "+pay);
	}
}
