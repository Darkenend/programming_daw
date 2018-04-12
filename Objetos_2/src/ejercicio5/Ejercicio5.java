package ejercicio5;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Ejercicio5 {

    /**
     * @param args Command line arguments
     */

    public static void main(String[] args) {
        String abc="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        System.out.println("Cifrado Cesar: "+cifradoCesar(abc));
    }

    public static String cifradoCesar(String cadenaACifrar) {
        String abc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        int pos;
        String coded_string="";
        for (int i = 0; i < cadenaACifrar.length(); i++) {
            pos=abc.indexOf(cadenaACifrar.charAt(i));
            coded_string+=abc.charAt((pos+3)%abc.length());
        }
        return coded_string;
    }
}