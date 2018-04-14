/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */
import java.util.Scanner;

//Let's do it
public class OneIrregularMatrix {
	//Matrix with only 1 dimension created and a keyboard scanner
	int[][] matrix= new int[5][];
	Scanner teclado = new Scanner(System.in);
	
	//First part: Here's where the matrix is created fully
	public void matrixcreation() {
		for (int i = 0; i < 5; i++) {
			matrix[i]=new int[i+1];
		}
	}
	
	//Second part: The matrix's data is input by the user
	public void input() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Introduce el valor asignado a "+(i+1)+","+(j+1)+":");
				matrix[i][j]=teclado.nextInt();
			}
		}
	}
	
	//LET'S PRINT IT
	public void output() {
		System.out.println("Matriz:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		OneIrregularMatrix operation=new OneIrregularMatrix();
		operation.matrixcreation();
		operation.input();
		operation.output();
	}
}
