/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */
package unitat5.apartat1.repte1;

import utilitats.arrays.DoubleArrayAverageCalculation;
import utilitats.arrays.FillDoubleArrayRNG;

import java.util.Scanner;

public class DualArraySuperiorAverage {
    private int resval;
    private double result1, result2;
    private double[] array1, array2;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DualArraySuperiorAverage op = new DualArraySuperiorAverage();
        op.start();
    }

    public void start() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introdueix el nombre de nombres a introduir en cada cadena de nombres:");
        int input = keyboard.nextInt();
        DoubleArrayAverageCalculation douarr = new DoubleArrayAverageCalculation();
        FillDoubleArrayRNG RNGeezus = new FillDoubleArrayRNG();
        keyboard.close();
        array1 = new double[input];
        array2 = new double[input];
        array1 = RNGeezus.doubleRNG(array1, input);
        array2 = RNGeezus.doubleRNG(array2, input);
        result1 = douarr.averageCalculator(array1);
        result2 = douarr.averageCalculator(array2);
        resval = Double.compare(result1, result2);
        if (resval == 0) {
            System.out.println("Les cadenes tenen mitjanes iguals.");
        } else if (resval > 0) {
            System.out.println("La primera cadena te una mitjana superior");
        } else {
            System.out.println("La segona cadena te una mitjana superior");
        }
    }
}
