/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

public class CalculTirada {

    public static final int CARES_DAU = 6;

    //Variables globals
    final int[] llistaTirades = new int[CARES_DAU*2 -1];
    int valor = 0;

    public static void main (String[] args) {
        CalculTirada programa = new CalculTirada();
        programa.inici();
    }

    public void inici() {
        llegirValor();
        generarTirades();
        mostrarProbabilitat();
    }

    public void llegirValor() {
        System.out.println("Escriu el valor a calcular [2 - 12].");
        Scanner lector = new Scanner(System.in);
        while (valor == 0) {
            if (lector.hasNextInt()) {
                valor = lector.nextInt();
                comprovarValor();
            } else {
                lector.next();
            }
        }
        lector.nextLine();
    }

    public void generarTirades() {
        for(int i = 1; i <= CARES_DAU; i++) {
            for(int j = 1; j <= CARES_DAU; j++) {
                llistaTirades[i + j - 2]++;
            }
        }
    }

    public void mostrarProbabilitat() {
        int acumulador = 0;
        for (int i = 0; i <= (valor - 2); i++) {
            acumulador = acumulador + llistaTirades[i];
        }
        double resultat = (acumulador*100)/ (CARES_DAU*CARES_DAU) ;
        System.out.println("La probabilitat es " + resultat + "%.");

    }

    public void comprovarValor() {
        if ((valor < 2)||(valor > CARES_DAU*2)) {
            System.out.println("El valor no es entre 2 i 12.");
            valor = 0;
        }
    }

}
