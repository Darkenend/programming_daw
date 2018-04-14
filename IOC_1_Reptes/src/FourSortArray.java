/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;
public class FourSortArray {
	Scanner teclado = new Scanner(System.in);
	String[] strings=new String[5];
	String[] secondary=new String[5];
	String aux;
	
	public FourSortArray() {
		System.out.println("Introdueix 5 paraules, despres es mostraran ordenades");
		for (int i = 0; i < 5; i++) {
			strings[i]=teclado.next();
		}
		secondary=strings;
		System.out.println("Paraules introduides");
	}
	
	public void Sorting() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (secondary[j].compareTo(secondary[j+1])>0) {
					aux=secondary[j];
					secondary[j]=secondary[j+1];
					secondary[j+1]=aux;
				}
			}
		}
	}
	
	public void Printing() {
		System.out.println("Paraules ordenades");
		for (int i = 0; i < secondary.length; i++) {
			System.out.println(secondary[i]);
		}
	}
	
	public static void main(String[] args) {
		FourSortArray op=new FourSortArray();
		op.Sorting();
		op.Printing();
	}
}
