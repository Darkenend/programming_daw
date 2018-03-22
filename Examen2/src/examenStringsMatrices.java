/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;
public class examenStringsMatrices {
	//Here we create everything that will be needed throughout ALL the program
	Scanner teclado = new Scanner(System.in);
	String input1;
	boolean palindrome = false;
	static boolean devmode = false;
	Float[][] floatmatrix;
	int nin1, nin2;
	String[] stringarray;
	static int choice = 0;
	
	public examenStringsMatrices() {
		// TODO Auto-generated constructor stub
		System.out.println("Bienvenido.");
		System.out.println("Introduce una frase:");
		input1=teclado.nextLine();
		stringarray=input1.split(" ");
		for (int i = 0; i < stringarray.length; i++) {
			if (stringarray[i].equalsIgnoreCase("Darkenend")) {
				devmode=true;
			}
		}
		System.out.println("Introduce el valor X de la matriz");
		nin1=teclado.nextInt();
		while (nin1 < 1) {
			System.out.println("Introduce el valor de X, debe ser superior a 1");
			nin1=teclado.nextInt();
		}
		System.out.println("Introduce el valor Y de la matriz");
		nin2=teclado.nextInt();
		while (nin2 < 1) {
			System.out.println("Introduce el valor de Y, debe ser superior a 1");
			nin2=teclado.nextInt();
		}
		floatmatrix = new Float[nin1][nin2];
		System.out.println("Introduce que parte quieres seleccionar de la clase:");
		System.out.println("[1] Mitad normal, mitad invertida");
		System.out.println("[2] Palindromos");
		System.out.println("[3] Vocales");
		System.out.println("[4] Matriz de Floats");
		System.out.println("Cualquier otro numero para las 4");
		choice=teclado.nextInt();
	}
	
	/*
	 * Program will be split in "Phases"
	 * that are coded in the following
	 * order: 2 numbers, the first indicates
	 * which Phase the method is about, the 
	 * second indicates the part of said
	 * method.
	 */
	
	
	//PHASE 1
	public void Phase11() {
		System.out.println(" - Parte 1 - ");
		//Inputhelp3 is initialized as nothing so that way we avoid errors.
		String inputhelp1, inputhelp2;
		int half= input1.length()/2;
		inputhelp1=input1.substring(0, half);
		inputhelp2=input1.substring(half);
		String inputhelp3=new StringBuilder(inputhelp2).reverse().toString();
		if (devmode==true) {
			System.out.println("inputhelp1: "+inputhelp1);
			System.out.println("inputhelp2: "+inputhelp2);
			System.out.println("inputhelp3: "+inputhelp3);
		}
		System.out.println(inputhelp1+inputhelp3);
	}
	
	//PHASE 2
	public void Phase21() {
		System.out.println(" - Parte 2 - ");
		//Same as in phase 1 to avoid errors
		String inputhelp1 = "";
		for (int i = 0; i < stringarray.length; i++) {
			inputhelp1=stringarray[i];
			if (devmode==true) {
				System.out.println("inputhelp1: "+inputhelp1);
			}
			String inputhelp2=new StringBuilder(inputhelp1).reverse().toString();
			if (devmode==true) {
				System.out.println("inputhelp2: "+inputhelp2);
			}
			if (inputhelp1.equals(inputhelp2)==true) {
				palindrome=true;
			}
		}
	}
	
	public void Phase22() {
		if (palindrome==true) {
			System.out.println("La frase si contiene algun palindromo");
		} else {
			System.out.println("La frase no contiene algun palindromo");
		}
		
	}
	
	//PHASE 3
	public void Phase31() {
		System.out.println(" - Parte 3 - ");
		int vocalcount = 0;
		String lowercase=input1.toLowerCase();
		for (int i = 0; i < lowercase.length(); i++) {
			if (lowercase.charAt(i)=='a' || lowercase.charAt(i)=='e' || lowercase.charAt(i)=='i' || lowercase.charAt(i)=='o' || lowercase.charAt(i)=='u') {
				vocalcount++;
			}
		}
		System.out.println("El numero de vocales es: "+vocalcount);
	}
	
	//PHASE 4
	public void Phase41() {
		System.out.println(" - Parte 4 - ");
	}
	
	public void Phase42() {
		System.out.println("Introduce a continuacion los valores de la matriz:");
		for (int i = 0; i < nin1; i++) {
			for (int j = 0; j < nin2; j++) {
				System.out.println("Introduce el valor que corresponde en "+(i+1)+"-"+(j+1));
				floatmatrix[i][j]=teclado.nextFloat();
			}
		}
	}
	
	public void Phase43() {
		float result = 0;
		for (int i = 0; i < nin1; i++) {
			for (int j = 0; j < nin2; j++) {
				result=result+floatmatrix[i][j];
			}
			System.out.println("El resultado de la fila "+(i+1)+" es: "+result);
			result = 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		examenStringsMatrices op=new examenStringsMatrices();
		switch (choice) {
		case 1:
			op.Phase11();
			break;
		
		case 2:
			op.Phase21();
			op.Phase22();
			break;
			
		case 3:
			op.Phase31();
			break;
			
		case 4:
			op.Phase41();
			op.Phase42();
			op.Phase43();
			break;

		default:
			op.Phase11();
			op.Phase21();
			op.Phase22();
			op.Phase31();
			op.Phase41();
			op.Phase42();
			op.Phase43();
			break;
		}
		if (devmode==true && choice != 1 && choice != 2 && choice != 3 && choice != 4) {
			System.out.println("Carlos, un 10? ;)");
		}
	}

}
