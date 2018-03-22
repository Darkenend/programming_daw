import java.util.Scanner;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Ejercicio4 {

    /**
     * @param args Command line arguments
     */

    public static void main(String[] args) {
        /*
         *  TODO Implement Start
         *  TODO Figure out what's going on
         */
        String profesion;
        int edad=0, rebeliones = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Dame tu edad");
            edad=teclado.nextInt();
            System.out.println("Dame tu profesión");
            profesion=teclado.nextLine();
            System.out.println("Dime en cuantas rebeliones has participado");
            rebeliones=teclado.nextInt();
        } while (!profesion.equals("jedi")&&!profesion.equals("Soldado imperial")&&!profesion.equals("droide"));
        if (rebeliones>4) {
            System.out.println("Tú eres gafe");
        } else {
            if (profesion.equals("constructor de la estrella de la muerte")) {
                System.out.println("Has pensado en el testamento?");
            } else {
                if (profesion.equals("Emperador")) {
                    System.out.println("Siento que tienes tanta fuerza en ti que podrías ser profesor de ED");
                }
            }
            System.out.println("Este ejercicio va dedicado");
        }
        if (edad>120 || profesion.equals("droide")) {
            System.out.println("Tú no estas vivo");
        }
        System.out.println("Gracias por usar nuestros servicios!");
    }
}
