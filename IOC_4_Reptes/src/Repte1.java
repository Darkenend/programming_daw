/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */


public class Repte1 {
	public static void main(String[] args) {
		Repte1 op = new Repte1();
		op.Start();
	}
	
	public void Start() {
		starPrint(2);
		starPrint(7);
		starPrint(3);
	}
	
	public void starPrint (int a) {
		System.out.println("Es van a imprimir "+a+" *");
		for (int i = 0; i < a; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
