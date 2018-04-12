package ejercicio3;
import java.util.Scanner;
/**
 * This software calculates the binomial coefficients.
 * @author Álvaro Real
 * @author darkenend.net
 * @version 0.2.0
 */
public class Ejercicio3 {
    /**
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        /*
         *  TODO Create main stuff
         */
        Scanner kb = new Scanner(System.in);
        int n_in, k_in;
        System.out.println("Introduce el valor de N");
        n_in=kb.nextInt();
        while (n_in<0) {
            System.out.println("N Invalido, debe ser mayor de 0");
            n_in=kb.nextInt();
        }
        System.out.println("Introduce el valor de K");
        k_in=kb.nextInt();
        while (k_in<0) {
            System.out.println("K Invalido, debe ser mayor de 0");
            k_in=kb.nextInt();
        }
        while (n_in<=k_in) {
            System.out.println("El coeficiente binomial no se puede calcular.");
            System.out.println("Debe cambiar los numeros");
            System.out.println("Introduce el valor de N");
            n_in=kb.nextInt();
            while (n_in<0) {
                System.out.println("N Invalido, debe ser mayor de 0");
                n_in=kb.nextInt();
            }
            System.out.println("Introduce el valor de K");
            k_in=kb.nextInt();
            while (k_in<0) {
                System.out.println("K Invalido, debe ser mayor de 0");
                k_in=kb.nextInt();
            }
        }
        System.out.println("coeBin("+n_in+","+k_in+")="+coeficienteBinomial(n_in,k_in));
    }

    /**
     * This method will calculate recursively the factorial of a number that we give to it
     * @param n This is the number from which we will calculate the factorial
     * @return We'll return the result, basically n!
     */
    public static int factorial(int n) {
        int res = 0;
        if (n == 0) res = 1;
        if (n > 0) res = n*factorial(n-1);
        return res;
    }

    /**
     * This method calculates the binomial coefficient
     * @param n One of the numbers we input
     * @param k One of the numbers we input
     * @return Returns the binomial coefficient
     */
    public static int coeficienteBinomial(int n, int k) {
        int res = 0;
        res = factorial(n) /( factorial(k) * factorial(n-k));
        return res;
    }
}
