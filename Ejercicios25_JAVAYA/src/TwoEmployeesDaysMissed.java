/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */
import java.util.Scanner;

//Let's do it
public class TwoEmployeesDaysMissed {
	//Creating everything we need...
	Scanner teclado = new Scanner(System.in);
	String[] name=new String[3];
	String name_input, less_misses_string;
	int[][] misses=new int[3][];
	int misses_input, less_misses_int = 32;
	
	
	//First Part: Input of data
	public void input() {
		for (int i = 0; i < name.length; i++) {
			System.out.println("Introduce el nombre del empleado:");
			name_input=teclado.next();
			name[i]=name_input;
			System.out.println("Introduce el numero de dias que ha faltado:");
			misses_input=teclado.nextInt();
			misses[i]=new int [misses_input];
			for (int j = 0; j < misses_input; j++) {
				System.out.println("Introduce el "+(j+1)+"º dia que el empleado faltó:");
				misses[i][j]=teclado.nextInt();
			}
		}
	}
	
	//Part Two: Let's print the misses
	public void misses() {
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]+" faltó " + misses[i].length + " dias.");
		}
	}

	//Part 3: Now we see who was the employee with less misses
	public void lessmisses() {
		for (int i = 0; i < misses.length; i++) {
			if (misses[i].length < less_misses_int) {
				less_misses_int=misses[i].length;
				less_misses_string=name[i];
			}
		}
		System.out.println("El empleado "+less_misses_string+" es el que menos faltó, con "+less_misses_int+" dias.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoEmployeesDaysMissed operations=new TwoEmployeesDaysMissed();
		operations.input();
		operations.misses();
		operations.lessmisses();
	}
}
