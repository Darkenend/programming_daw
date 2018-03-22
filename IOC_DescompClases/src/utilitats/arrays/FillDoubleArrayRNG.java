/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */
package utilitats.arrays;

public class FillDoubleArrayRNG {
    public double[] doubleRNG(double[] thearray, int thelength) {
        for (int i = 0; i < thelength; i++) {
            thearray[i] = Math.random() * (100 - (-100)) + (-100);
            System.out.println("Numero " + (i + 1) + " de " + thelength);
        }
        return thearray;
    }
}
