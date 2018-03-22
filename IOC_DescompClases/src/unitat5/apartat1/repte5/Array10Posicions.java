/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */
package unitat5.apartat1.repte5;

import utilitats.arrays.Fill0To10IntArray;

public class Array10Posicions {
    private int[] array = new int[10];
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Array10Posicions op = new Array10Posicions();
        op.start();
    }

    //Start Process
    private void start() {
        Fill0To10IntArray rngeezus=new Fill0To10IntArray();
        array = rngeezus.integerRNG(array, array.length);
        int help = array.length/2;
        for (int i = 0; i < help; i++) {
            System.out.println("Buscant coincidencies per al valor "+array[i]+" en la posicio "+(i+1));
            for (int j = help; j < array.length; j++) {
                if (array[i] == array[j])
                    System.out.println("El valor " + array[i] + " es troba en les posicions " + (i + 1) + " i " + (j + 1));
            }
        }
    }
}
