/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

public class BURNITDOWN {

	public static void main(String[] args) {
		Persona persona=new Persona();
		Empleado empleado=new Empleado();
		persona.loadData();
		empleado.loadPay();
		persona.printData();
		empleado.printPay();
	}
}
