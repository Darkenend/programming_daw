/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */
package utilitats.arrays;

public class DoubleArrayAverageCalculation {
    public double averageCalculator(double[] thearray) {
        double storage = 0;
        for (int i = 0; i < thearray.length; i++) {
            storage = storage + thearray[i];
        }
        return storage;
    }
}
