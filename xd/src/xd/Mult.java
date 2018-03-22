package xd;

import java.util.Scanner;

/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */


public class Mult {

    public static void main(String[] args) {
        Mult op = new Mult();
        op.start();
    }

    //Start Process
    private void start() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce el numero a multiplicar:");
        int n1 = keyboard.nextInt();
        System.out.println("Introduce el numero por el que se multiplica:");
        int n2 = keyboard.nextInt();
        int result = mult(n1, n2);
        keyboard.close();
        System.out.println("Resultado: "+result);
    }

    private int mult(int num1, int num2) {
        int result = 0;
    	if (num2 == 0)
            result = 0;
        if (num2 > 0)
            result = num1+mult(num1, num2-1);
        if (num2 < 0)
            result = -mult(num1, -num2);
        return result;
    }
}