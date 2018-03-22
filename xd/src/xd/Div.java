package xd;

import java.util.Scanner;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Div {

    /**
     * @param args Command line arguments
     */

    public static void main(String[] args) {
        Div op = new Div();
        op.start();
    }

    //Start process
    public void start() {
        Scanner keyboard = new Scanner(System.in);
        int dividendo, divisor;
        int[] array_res = new int[2];
        System.out.println("Introduce el numero a dividir");
        dividendo = keyboard.nextInt();
        System.out.println("Introduce el numero por el que sera dividido");
        divisor = keyboard.nextInt();
        array_res=divide(dividendo, divisor);
        System.out.println("Numeros: "+dividendo+", "+divisor);
        System.out.println("Resultado: "+array_res[0]);
        System.out.println("Resto: "+array_res[1]);
    }

    public int[] divide(int dividendo, int divisor) {
        int[] array_res_make = {0, 0};
        if (divisor>dividendo) {
            array_res_make[0]=0;
            array_res_make[1]=dividendo;
        } else {
            array_res_make=divide(dividendo-divisor, divisor);
            array_res_make[0]++;
        }
        return array_res_make;
    }
}
