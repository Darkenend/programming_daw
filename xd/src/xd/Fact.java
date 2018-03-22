package xd;
import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		Fact op = new Fact();
		op.start();
	}
	
	private void start() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el numero del cual se calculara el factorial:");
		long base = teclado.nextLong();
		while (base < 0) {
			System.out.println("Introduce un numero no negativo");
			base = teclado.nextLong();
		}
		long result = factorial(base);
		System.out.println("El resultado es: "+result);
		teclado.close();
	}
	
	private long factorial(long base_xd) {
		long resultat = 0;
		if (base_xd == 0) resultat = 1;
		if (base_xd > 0) resultat = base_xd*factorial(base_xd-1);
		return resultat;
	}
}
