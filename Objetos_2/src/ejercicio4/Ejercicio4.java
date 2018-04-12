package ejercicio4;

import java.util.Scanner;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Ejercicio4 {

    /**
     * This exercise actually does the calculations following the Ullman Conjecture
     * @param args Command line arguments
     */

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = -1;
        while (n < 0) {
            System.out.println("Introduce un numero mayor que 0");
            n = kb.nextInt();
        }
        System.out.println(n+", ");
        while (n!=1) {
            if (n % 2 == 0) n = n / 2;
            else n = 3 * n + 1;
            System.out.println(n+", ");
        }
        System.out.println("Hasta la proxima!");
    }
}