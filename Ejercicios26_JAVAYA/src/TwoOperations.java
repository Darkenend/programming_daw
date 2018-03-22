/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */
import java.util.Scanner;

//Let's start it
public class TwoOperations {
	Scanner teclado = new Scanner(System.in);
	int v1,v2;
	
	public TwoOperations() {
		System.out.println("Introduce el primer valor:");
		v1=teclado.nextInt();
		System.out.println("Introduce el segundo valor:");
		v2=teclado.nextInt();
	}
	
	public void sum() {
		int sum;
		sum=v1+v2;
		System.out.println("La suma es:"+sum);
	}
	
	public void sub() {
		int sub;
		sub=v1-v2;
		System.out.println("La resta es:"+sub);
	}
	
	public void mul() {
		int mul;
		mul=v1*v2;
		System.out.println("La multiplicacion es:"+mul);
	}
	
	public void div() {
		int div;
		div=v1/v2;
		System.out.println("La division es:"+div);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoOperations op=new TwoOperations();
		op.sum();
		op.sub();
		op.mul();
		op.div();
	}

}
