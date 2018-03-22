/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */
package utilitats.arrays;

import java.util.Random;

public class Fill0To10IntArray {
    public int[] integerRNG(int[] thearray, int thelength) {
        for (int i = 0; i < thelength; i++) {
            Random rngeezus = new Random();
            thearray[i] = rngeezus.nextInt(10)+1;
        }
        return thearray;
    }
}
