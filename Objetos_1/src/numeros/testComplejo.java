package numeros;

import java.util.Scanner;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class testComplejo {
    private static double re;
    private static double im;

    /**
     * @param args Command line arguments
     */

    public static void main(String[] args) {
        testComplejo op = new testComplejo();
        op.input();
        Complejo obj1 = new Complejo(re, im);
        System.out.println("Entrando en el menu...");
        Scanner keyboard = new Scanner(System.in);
        boolean fin = false;
        int option = 0;
        while (!fin) {
            System.out.println("¿Que opcion deseas?");
            System.out.println();
            System.out.println("1 - Consultar parte real:");
            System.out.println("2 - Consultar parte imaginaria:");
            System.out.println("3 - Cambiar parte real");
            System.out.println("4 - Cambiar parte imaginaria");
            System.out.println("5 - Ver numero completo");
            System.out.println("6 - Sumar 2 numeros");
            System.out.println("7 - Salir");
            option = keyboard.nextInt();
            switch (option) {
                case 1:
                    System.out.println(obj1.consulta_Real());
                    break;
                case 2:
                    System.out.println(obj1.consulta_Imag());
                    break;
                case 3:
                    System.out.println("Introduce la nueva parte real:");
                    double in_real = keyboard.nextDouble();
                    obj1.cambia_Real(in_real);
                    break;
                case 4:
                    System.out.println("Introduce la nueva parte imaginaria");
                    double in_imag = keyboard.nextDouble();
                    obj1.cambia_Imag(in_imag);
                    break;
                case 5:
                    String complete = obj1.toString();
                    System.out.println(complete);
                    break;
                case 6:
                    System.out.println("Introduce la parte entera:");
                    double he_re = keyboard.nextDouble();
                    System.out.println("Introduce la parte imaginaria:");
                    double he_im = keyboard.nextDouble();
                    Complejo obj2 = new Complejo(he_re, he_im);
                    obj1.sumar(obj2);
                    break;
                case 7:
                    fin = true;
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        }
        System.out.println("Hasta luego!");
    }

    public void input() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce la parte entera:");
        re = keyboard.nextDouble();
        System.out.println("Introduce la parte imaginaria:");
        im = keyboard.nextDouble();
        System.out.println("Numeros introducidos.");
    }

}
