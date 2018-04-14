/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */
import java.util.Scanner;

public class OnePairIntPass {
	//We summon here everything needed to make the program work
	Scanner teclado = new Scanner(System.in);
	int pass;
	String username = null;
	boolean dev_mode = false, valid_pass=false;
	
	//The first step will be the input of the data
	public void input() {
		System.out.println("Introduce tu usuario:");
		username=teclado.nextLine();
		System.out.println("Introduce tu contraseña:");
		pass=teclado.nextInt();
		//273 is a master key for all the dev modes in my programs, and it will output some "error messages" for debug purposes
		if (pass == 273) {
			dev_mode = true;
			System.err.println("DEV MODE ON, RE-INPUT PASSWORD");
			System.out.println("Introduce tu contraseña:");
			pass=teclado.nextInt();
		}
	}
	
	//The second step is the operation part
	public void operating() {
		if (dev_mode == true) {
			System.err.println("Entering operating section");
			System.err.println("Calculating if the pass-number is correct");
			if (pass%2==0) {
				System.err.println("Pass-number: VALID");
				valid_pass=true;
			}
			else {
				System.err.println("Pass-number: INVALID");
			}
		}
		//What I do is code first the "else" part and then copy it over to the part over it, and fill it with debug messages
		else {
			if (pass%2==0) {
				valid_pass=true;
			}
		}
	}
	
	//The third step is the display of the results
	public void display() {
		if (valid_pass) {
			System.out.println("Contraseña Correcta");
		} else {
			System.out.println("La contraseña es incorrecta para el usuario: " + username);
		}
	}
	
	//Here's the main function where it will all be loaded in
	public static void main(String[] args) {
		OnePairIntPass operation=new OnePairIntPass();
		operation.input();
		operation.operating();
		operation.display();
	}
}
