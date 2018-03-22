/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

//Let's start it
public class fourMailSystem {
	
	//Let's summon everything
	Scanner teclado = new Scanner(System.in);
	String[] array_names=new String[5];
	String[] array_mails=new String[5];
	String usermail_input;
	int array_maillength;
	int z=0;
	boolean at=false;

	public fourMailSystem() {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < array_names.length; i++) {
			System.out.println("Introduce el nombre de la persona "+(i+1)+":");
			array_names[i]=teclado.nextLine();
			System.out.println("Introduce el mail de la persona "+(i+1)+":");
			array_mails[i]=teclado.nextLine();
			}
		}
	
	//Second step, print all data
	public void printAll() {
		System.out.println("Imprimiendo informacion de todos los usuarios...");
		for (int i = 0; i < array_mails.length; i++) {
			System.out.println("Persona "+(i+1)+":");
			System.out.println(array_names[i]);
			System.out.println(array_mails[i]);
		}
	}
	
	//This is the step when we're gonna ask the user for a person's name and print the mail
	public void scanningMail() {
		//Let's create a string array for names 
		System.out.println("Inserta nombre de la persona:");
		usermail_input=teclado.nextLine();
		for (int i = 0; i < array_names.length; i++) {
			if (usermail_input.equalsIgnoreCase(array_names[i])) {
				System.out.println("El correo es:"+array_names[i]);
				break;
				//We do a break to avoid more than 1 mail being displayed
			}
		}
	}
	
	/*
	 * Here's where we print all mails without @
	 * , all this will be done on a loop that
	 * prints all mails from the array_mailsnoat
	 */
	public void printNoAt() {
		//Simple loop
		System.out.println("Correos sin '@':");
		for (int i = 0; i < array_mails.length; i++) {
			char[] charAt=array_mails[i].toCharArray();
			for (int j = 0; j < charAt.length; j++) {
				if (charAt[j]=='@') {
					at=true;
				}
			}
			if (at==false) {
				System.out.println(array_mails[i]);
			}
			at=false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fourMailSystem op=new fourMailSystem();
		op.printAll();
		op.scanningMail();
		op.printNoAt();
	}

}
