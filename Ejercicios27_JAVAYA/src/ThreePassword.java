/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */
import java.util.Scanner;

public class ThreePassword {
	String pass="123abc";
	String userinput;
	Scanner teclado = new Scanner(System.in);
	
	//Constructor, here's where the input will be done
	public ThreePassword() {
		System.out.println("Introduce la contraseña:");
		userinput=teclado.nextLine();
	}
	
	//Comparison of the user input
	public void Comparison() {
		if (userinput.equals(pass)) {
			System.out.println("Contraseña Correcta");
		}
		else {
			System.out.println("Contraseña Incorrecta");
		}
	}
	
	public static void main(String[] args) {
		ThreePassword op=new ThreePassword();
		op.Comparison();
	}

}
