import java.util.Scanner;
public class Uno {
	private static Scanner teclado;
	
	
	public static void main(String[] ar) {	
		Uno a=new Uno();
		teclado=new Scanner(System.in);
		
		System.out.print("Inserte su edad: ");
		int edad=teclado.nextInt();
		System.out.print("Inserte sus ingresos: ");
        float ingresos=teclado.nextFloat();
        System.out.print("Inserte sus creditos: ");
        int creditos=teclado.nextInt();
        if(edad<90) {
        	if(ingresos<40000) {
        		if(creditos>=20) {
        			int aux=(creditos/6)*100;
        			if(aux<800) {
        				System.out.println("La beca es de "+aux+"€");
        			} else {
        				System.out.println("La beca es de 800€");
        			}
        		} else {
        			System.out.println("La beca es de 10€");
        		}
        	} else {
        		System.out.println("No se le ha podido conceder la beca");
        	}
        } else {
        	System.out.println("No se le ha podido conceder la beca");
        }
    }
}