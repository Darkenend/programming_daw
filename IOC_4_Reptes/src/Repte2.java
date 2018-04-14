/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

public class Repte2 {

	public static void main(String[] args) {
		Repte2 op = new Repte2();
		op.start();
	}
	
	public void start() {
		String startstring = "darkenend";
		System.out.println("Abans de modificar: "+startstring);
		modifyString(startstring);
		System.out.println("Despres de modificar: "+startstring);
	}
	
	public void modifyString(String modified) {
		modified="Darkenend";
		System.out.println("S'ha modificat a: "+modified);
	}
}
