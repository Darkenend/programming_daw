/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */
import java.util.Scanner;

public class OneMail {
	//Summon keyboard and create the needed variables
	Scanner teclado = new Scanner(System.in);
	String userinput;
	boolean at=false;
	int length;
	
	//Constructor, here goes the data input
	public OneMail() {
		System.out.println("Introduce tu eMail:");
		userinput=teclado.nextLine();
		length=userinput.length();
	}
	
	//With this method we check each character to see if @ is present, and verify it's existence with a boolean
	public void HasAt() {
		for (int i = 0; i < length; i++) {
			if (userinput.charAt(i)=='@') {
				at=true;
			}
		}
	}
	
	//This will output what's needed
	public void Output() {
		if (at == true) {
			System.out.println("El mail contiene el caracter: @");
		} else {
			System.out.println("El mail no contiene el caracter: @");
		}
	}
	
	//And here's the main where everything is executed
	public static void main(String[] args) {
		OneMail op=new OneMail();
		op.HasAt();
		op.Output();
	}

}
