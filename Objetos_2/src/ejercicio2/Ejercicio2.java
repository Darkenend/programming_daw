package ejercicio2;

import java.util.Scanner;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Ejercicio2 {


    /**
     * This method gets the "integer" part of the double
     * that we give it as an input
     * @param numero Double number that we input
     * @return Will return the "integer" part of the double
     */

    public static int getParteEntera(double numero) {
        int result = 0;
        String str_num = String.valueOf(numero);
        int break_pos = str_num.indexOf('.');
        result = Integer.parseInt(str_num.substring(0, break_pos));
        return result;
    }

    /**
     * This method gets the "float" part of the double
     * that we give it as an input
     * @param numero
     * @return Will return the "float" part of the double
     */
    public static int getParteDecimal(double numero) {
        int result = 0;
        String str_num = String.valueOf(numero);
        int break_pos = str_num.indexOf('.');
        result = Integer.parseInt(str_num.substring(break_pos+1));
        return result;
    }

    /**
     * Don't really think you need to get
     * a description of what a main is, right?
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        int menu=0;
        double number=0;
        do {
            //read a valid double
            boolean valid_num=false;
            do {
                System.out.println("Introduzca un número double:");
                if (kb.hasNextDouble()) {
                    number = kb.nextDouble();
                    valid_num = true;
                } else {
                    System.out.println("Numero erroneo, intentalo otra vez");
                    kb.next();
                }
            } while (!valid_num);
            //We show now the menu
            System.out.println("¿Que desea hacer con el numero?");
            System.out.println("1. Obtener la parte entera");
            System.out.println("2. Obtener la parte decimal");
            System.out.println("3. Salir del programa");
            //We process the input
            valid_num=false;
            do {
                System.out.println("Introduzca opcion:");
                if (kb.hasNextInt()){
                    menu=kb.nextInt();
                    if (menu>=1 && menu<=3) {
                        valid_num=true;
                    } else {
                        System.out.println("Debe introducir entre 1 y 3");
                    }
                } else {
                    System.out.println("Numero erroneo");
                    kb.next();
                }
            } while (!valid_num);
            if (menu==1) {
                System.out.println("La parte entera de "+number+" es "+getParteEntera(number));
            } else if (menu==2) {
                System.out.println("La parte decimal de "+number+" es "+getParteDecimal(number));
            } else {
                //This is in case menu it's 3
                System.out.println("Hasta la proxima");
            }
        } while (menu!=3);
    }
}
