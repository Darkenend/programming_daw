/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */
package javaapplication3;

import java.util.Scanner;

/**
 * @author ED
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double media = 0, totalEntrada = 0, totalValido = 0, minimo = 0, maximo = 0, suma = 0;
        int i = 0;
        double valor[] = rellenarArray();

        System.out.println("Introduzca el mínimo");
        minimo = Double.parseDouble(teclado.nextLine());
        System.out.println("Introduzca el máximo");
        maximo = Double.parseDouble(teclado.nextLine()); //Nodo 1


        while (i < 100 && valor[i] != -999) { //Nodo 2 y 3
            totalEntrada++; //Nodo 4
            if (valor[i] >= minimo && //Nodo 5
                    valor[i] <= maximo) { //Nodo 6
                totalValido++; //Nodo 7
                suma += valor[i]; //Nodo 8
            }
            i++; //Nodo 9
        }
        if (totalValido > 0) { //Nodo 10
            media = suma / totalValido;
        } else { //Nodo 11
            media = -999;
        }
        System.out.println("media: " + media + "\nTotal de números válidos: " + totalEntrada + "\nTotal de valores válidos: " + totalValido); //Nodo 12

    }

    public static double[] rellenarArray() {
        double num[] = new double[100];
        for (int i = 0; i < num.length; i++) {
            num[i] = (Math.random() - 0.5) * 2000;
        }

        return num;
    }
}