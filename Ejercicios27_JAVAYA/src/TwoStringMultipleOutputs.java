/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Arrays;
import java.util.Scanner;

public class TwoStringMultipleOutputs {
	//we summon everything needed for the whole program here
	Scanner teclado = new Scanner(System.in);
	String userstring;
	char[] charArray;
	char[] charArrayInverted;
	int vocal_count = 0;
	boolean bothways;
	String userstring_inverted;
	
	//Constructor shite we need to start, as in, let the user input the fucking data.
	public TwoStringMultipleOutputs() {
		System.out.println("Introduce una frase:");
		userstring=teclado.nextLine();
	}
	
	//Let's convert the string to a damned array
	public void StringToCharArray() {
		charArray = userstring.toCharArray();
	}
	
	//This is the first half printing
	public void FirstHalf() {
		System.out.println("La primera mitad es:");
		for (int i = 0; i < ((charArray.length)/2); i++) {
			System.out.print(charArray[i]);
		}
		System.out.println();
	}
	
	//This is the last char printed
	public void LastChar() {
		System.out.println("El ultimo caracter es:");
		System.out.println(charArray[(charArray.length)-1]);
		System.out.println();
	}
	
	//Inverted because why the fuck not?
	public void Inverted() {
		System.out.println("Invertido es:");
		charArrayInverted= new char[charArray.length];
		int j=(charArray.length-1);
		for (int i = 0; i < charArray.length; i++) {
			charArrayInverted[j]=charArray[i];
			j--;
		}
		
		for (int i = 0; i < charArrayInverted.length; i++) {
			System.out.print(charArrayInverted[i]);
		}
	}
	
	//Now it must be separated because why the fuck not
	public void Separated() {
		System.out.println("Caracteres separados por guiones:");
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]+"-");
		}
		System.out.println("");
	}
	
	//Time to check the exact ones
	public void Vowels() {
		System.out.println("Vocales en total:");
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i]=='a' || charArray[i]=='e' || charArray[i]=='i' || charArray[i]=='o' || charArray[i]=='u') {
				vocal_count++;
			}
			if (charArray[i]=='A' || charArray[i]=='E' || charArray[i]=='I' || charArray[i]=='O' || charArray[i]=='U') {
				vocal_count++;
			}
		}
		System.out.println(vocal_count);
	}
	
	//Can it be read both ways? Let's do it
	public void Bothways() {
		//Let's convert the fucking arrays to strings back
		userstring=Arrays.toString(charArray);
		userstring_inverted=Arrays.toString(charArrayInverted);
		
		//Now we set them as lowercase all
		userstring=userstring.toLowerCase();
		userstring_inverted=userstring_inverted.toLowerCase();
		
		//Now we compare them
		if (userstring.equals(userstring_inverted)) {
			System.out.println("La frase se puede leer en los 2 sentidos");
		}
		else {
			System.out.println("La frase no se puede leer en los 2 sentidos");
		}
	}
	
	//And everything goes here to be executeeeeeeeeeeeeeeeeed!
	public static void main(String[] args) {
		TwoStringMultipleOutputs op=new TwoStringMultipleOutputs();
		op.StringToCharArray();
		op.FirstHalf();
		op.LastChar();
		op.Inverted();
		op.Separated();
		op.Vowels();
		op.Bothways();
	}
}
