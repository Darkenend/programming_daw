package ejercicio1;

import utilidad.StringHelper;

import java.util.Scanner;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class examenParametrizacion {

    /**
     * @param args Command line arguments
     */

    public static void main(String[] args) throws InterruptedException {
        /*
         *  TODO Implement Start
         *  TODO Figure out what's going on
         */
        examenParametrizacion op = new examenParametrizacion();
        op.start();
        op.exit();
    }

    //First level

    public void start() throws InterruptedException {
        Scanner keyboard = new Scanner(System.in);
        boolean end = false;
        String input;
        String[] string_array = {null};
        System.out.println("Bienvenido al programa del examen de Parametrizacion");
        // Loop that repeats actions while the user hasn't input the string
        // "fin"
        while (!end) {
            System.out.println();
            System.out.println("Frases actuales:");
            for (int i = 0; i < string_array.length-1; i++) {
                System.out.println(string_array[i]);
            }
            System.out.println();
            System.out.println("Menu de Frases");
            System.out.println("[IN] Introducir frases");
            System.out.println("[MA] Muestra el numero de frases introducidas y cuantas palabras tiene cada una");
            System.out.println(
                    "[WS] Introduce un numero de frase y una palabra, y muestra el numero de veces que esta esa palabra en esa frase.");
            System.out.println("[CA] Muestra la media de aparicion de un caracter en una frase.");
            System.out.println(
                    "[WA] Muestra el total de palabras que hay en todas las frases que se han introducido hasta ahora.");
            System.out.println("[FIN] Sale del programa");
            input = keyboard.nextLine();
            if (input.equalsIgnoreCase("in")) {
                System.out.println("Cargando primera opcion...");
                Thread.sleep(750);
                string_array = firstOption(string_array);
                Thread.sleep(750);
            } else if (input.equalsIgnoreCase("ma")) {
                System.out.println("Cargando segunda opcion");
                Thread.sleep(750);
                secondOption(string_array);
                Thread.sleep(750);
            } else if (input.equalsIgnoreCase("ws")) {
                System.out.println("Cargando tercera opcion");
                Thread.sleep(750);
                thirdOption(string_array);
                Thread.sleep(750);
            } else if (input.equalsIgnoreCase("ca")) {
                System.out.println("Cargando cuarta opcion");
                Thread.sleep(750);
                fourthOption(string_array);
                Thread.sleep(750);
            } else if (input.equalsIgnoreCase("wa")) {
                System.out.println("Cargando quinta opcion");
                Thread.sleep(750);
                fifthOption(string_array);
                Thread.sleep(750);
            } else if (input.equalsIgnoreCase("fin")) {
                System.out.println("¿Seguro que quieres salir? [si/no]");
                input = keyboard.nextLine();
                if (input.equalsIgnoreCase("si"))
                    end = true;
            } else {
                System.out.println("Comando no valido.");
                Thread.sleep(750);
            }
        }
        keyboard.close();
    }

    public void exit() {
        System.out.println("Esperamos que le haya servido nuestro software.");
    }

    //Second Level

    public String[] firstOption(String[] string_array_first) {
        StringHelper SH = new StringHelper();
        Scanner keyboard = new Scanner(System.in);
        int tre = string_array_first.length;
        string_array_first = SH.extendArray(string_array_first);
        System.out.println("Introduce la frase:");
        String input = keyboard.nextLine();
        string_array_first[tre-1] = input;
        System.out.println("La frase introducida es: "+string_array_first[tre-1]);
        return string_array_first;
    }

    public void secondOption(String[] string_array_second) {
        StringHelper SH = new StringHelper();
        int string_amount = string_array_second.length;
        System.out.println("Hay "+string_amount+" frases.");
        for (int i = 0; i < string_array_second.length-1; i++) {
            int xd = SH.stringWordCounter(string_array_second[i]);
            System.out.println("En la frase "+(i+1)+" hay "+xd+" palabras.");
        }
    }

    public void thirdOption(String[] string_array_third) {
        StringHelper SH = new StringHelper();
        Scanner keyboard = new Scanner(System.in);
        int counter = 0;
        System.out.println("Introduce una palabra");
        String s_input = keyboard.nextLine();
        System.out.println("Introduce un numero de frase");
        int u_input = keyboard.nextInt();
        while (u_input < 1 || u_input > string_array_third.length) {
            System.out.println("El numero es invalido, introduce un numero valido.");
            u_input = keyboard.nextInt();
        }
        u_input=u_input-1;
        String[] array_word = SH.stringWordSeparator(string_array_third[u_input]);
        for (int i = 0; i < array_word.length; i++) {
            if (s_input.equalsIgnoreCase(array_word[i])) {
                counter++;
            }
        }
        System.out.println("En la frase "+string_array_third[u_input]+" aparece la palabra "+s_input+" "+counter+" veces.");
    }

    public void fourthOption(String[] string_array_fourth) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce una letra");
        String left = keyboard.next();
        while (left.length() > 1) {
            System.out.println("Has introducido mas de una letra.");
            System.out.println("Introduce una letra");
            left = keyboard.next();
        }
        float counter = 0;
        for (int i = 0; i < string_array_fourth.length-1; i++) {
            for (int j = 0; j < string_array_fourth[i].length(); j++) {
                String right= String.valueOf(string_array_fourth[i].charAt(j));
                if (left.equalsIgnoreCase(right)) {
                    counter++;
                }
            }
        }
        float res = counter/(float)(string_array_fourth.length-1);
        System.out.println("La letra "+left+" aparece una media de "+res+" veces por frase.");
    }

    public void fifthOption(String[] string_array_fifth) {
        StringHelper SH = new StringHelper();
        int counter = 0;
        String[] help;
        for (int i = 0; i < string_array_fifth.length-1; i++) {
            help = SH.stringWordSeparator(string_array_fifth[i]);
            for (int j = 0; j < help.length; j++) {
                counter++;
            }
        }
        System.out.println("Hay un total de "+counter+" palabras.");
    }
}
