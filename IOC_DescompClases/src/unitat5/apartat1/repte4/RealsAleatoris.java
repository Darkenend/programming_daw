/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */
package unitat5.apartat1.repte4;

import java.util.Random;
public class RealsAleatoris {
    public static void main(String[] args) {
        RealsAleatoris programa = new RealsAleatoris();
        programa.inici();
    }
    public void inici() {
        //Inicialització
        Random rnd = new Random();
        long seed = rnd.nextLong();
        rnd.setSeed(seed);
        //Ús
        double valorA = rnd.nextDouble() * 100;
        double valorB = rnd.nextDouble() * 100;
        System.out.println("S'han generat els valors " + valorA + " i " + valorB);
    }
}
