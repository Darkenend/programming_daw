/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */
import java.util.Scanner;

//Let's start it
public class Examen_Practic {
	Scanner teclado = new Scanner(System.in);
	int i = 0;
	float[] array1 = new float[10];
	float[] array2 = new float[10];
	float[] result = new float[40];
	int n;
	float nsum = 0;
	float max = 0;
	float userswitchin = 0;
	float userswitchout = 0;
	int f;
	
	public Examen_Practic() {
		//Input goes here, two loops for filling the arrays
		for (int i=0; i < array1.length; i++) {
			System.out.println("Introduce el valor "+(i+1)+" del Vector 1:");
			array1[i]=teclado.nextFloat();
		}
		System.out.println("Vector 1 introducido.");
		for (int i=0; i < array2.length; i++) {
			System.out.println("Introduce el valor "+(i+1)+" del Vector 2:");
			array2[i]=teclado.nextFloat();
		}
		System.out.println("Vector 2 introducido.");
		System.out.println("Introduce el numero a reemplazar:");
		userswitchin=teclado.nextFloat();
		System.out.println("Introduce el numero por el que reemplazar:");
		userswitchout=teclado.nextFloat();
		System.out.println("Introduce el numero de los primeros n valores que deseas sumar:");
		n=teclado.nextInt();
		/*
		 * Correction so the users don't input a invalid number.
		 */
		while (n<1 || n>result.length) {
			System.err.println("Numero invalido, introducelo otra vez:");
			n=teclado.nextInt();
		}
		System.out.println("Introduccion de datos Completa");
	}
	
	/*
	 * The 4 next are the operations,
	 * the following have a +10, +20 and +30,
	 * so that way we store the sums,
	 * the subs, the mults and the divs in 1 array,
	 * but organized in the order they were calculated.
	 */
	
	public void sum() {
		System.out.println("Empezando calculo de sumas...");
		for (int i = 0; i < array1.length; i++) {
			result[i]=(array1[i]+array2[i]);
			System.out.println("Suma: "+(i+1)+" de 10");
		}
	}
	
	public void sub() {
		System.out.println("Empezando calculo de restas...");
		for (int i = 0; i < array1.length; i++) {
			result[(i+10)]=(array1[i]-array2[i]);
			System.out.println("Resta: "+(i+1)+" de 10");
		}
	}
	
	public void mul() {
		System.out.println("Empezando calculo de multiplicaciones...");
		for (int i = 0; i < array1.length; i++) {
			result[(i+20)]=(array1[i]*array2[i]);
			System.out.println("Multiplicacion: "+(i+1)+" de 10");
		}
	}
	
	public void div() {
		System.out.println("Empezando calculo de divisiones...");
		for (int i = 0; i < array1.length; i++) {
			result[(i+30)]=(array1[i]/array2[i]);
			System.out.println("Divisiones: "+(i+1)+" de 10");
		}
	}
	
	public void firstnvaluessum() {
		nsum=0;
		for (int i = 0; i < n; i++) {
			nsum=nsum+result[i];
		}
		System.out.println("La suma de los "+n+" primeros valores es igual a: "+nsum);
	}
	
	public void max() {
		//Simple loop to compare result to max, and if result is bigger than max, result replaces max
		for (int i = 0; i < result.length; i++) {
			if (result[i]>max) {
				max=result[i];
			}
		}
		System.out.println("El valor maximo es: "+max);
	}
	
	public void second2mult() {
		int multcount=0;
		int mult=0;
		/*
		 * ONLY FOR DEBUG PURPOSES:
		 * Paste this part of code to print the whole results array,
		 * then compare the positions of the numbers to the result
		 * given to check mistakes, this should work perfectly as
		 * it has been coded already.
		 * for (int i = 0; i < result.length; i++) {
		 	System.out.println((i+1)+":"+result[i]);
		}
		 */
		for (int i = 0; i < result.length; i++) {
			if (multcount<2 && result[i]%2==0) {
				multcount++;
				mult=i;
			}
		}
		System.out.println("El segundo multiplo de 2 esta en la posicion "+(mult+1));
	}
	
	//Let's flip it up!
	public void Switch() {
		float[] resultswitched=new float[40];
		for (int i = 0; i < result.length; i++) {
			resultswitched[i]=result[i];
		}
		for (int i = 0; i < resultswitched.length; i++) {
			if (resultswitched[i]==userswitchin) {
				resultswitched[i]=userswitchout;
			}
		}
	}

	//And now we execute ***everything*** (You have to imagine this line was written in Discord or Reddit)
	public static void main(String[] args) {
		Examen_Practic op=new Examen_Practic();
		op.sum();
		op.sub();
		op.mul();
		op.div();
		op.firstnvaluessum();
		op.max();
		op.second2mult();
		op.Switch();
	}

}