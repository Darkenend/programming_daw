package ejercicioPractico;

import help.StringHelper;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class recuperaParametrizacion {

    /**
     * @param args Command line arguments
     */

    public static void main(String[] args) throws InterruptedException {
        /*
         *  TODO Implement Start
         *  TODO Figure out what's going on
         */
        recuperaParametrizacion op = new recuperaParametrizacion();
        op.start();
        op.exit();
    }

    //First level

    public void start() throws InterruptedException {
        Scanner keyboard = new Scanner(System.in);
        boolean end = false;
        String input, frase = "";
        System.out.println("Bienvenido al programa del examen de recuperacion Parametrizacion");
        // Loop that repeats actions while the user hasn't input the string
        // "fin"
        while (!end) {
            System.out.println();
            System.out.println("Palabras actuales:");
            System.out.println(frase);
            System.out.println();
            System.out.println("Menu de Palabras");
            System.out.println("[IN] Introducir palabras");
            System.out.println("[MA] Muestra todas las palabras y el número de palabras introducidas");
            System.out.println(
                    "[WS] Introduce un número de palabra y una combinación de tres letras y dice si la combinacion esta y devuelve el numero de veces que esta");
            System.out.println("[CA] Muestra la media de aparicion de un caracter en todas las palabras.");
            System.out.println(
                    "[WA] Numero de Palabras con numero impar de caracteres");
            System.out.println(
                    "[VP] Palabra con más vocales");
            System.out.println(
                    "[SP] Ordenar las palabras de menor a mayor longitud");
            System.out.println(
                    "[HP] Mostrar un histograma donde para cada palabra se muestran tantos asteriscos como caracteres tenga esa palabra");
            System.out.println("[FIN] Sale del programa");
            input = keyboard.nextLine();
            if (input.equalsIgnoreCase("in")) {
                System.out.println("Cargando primera opcion...");
                Thread.sleep(750);
                frase = inputWords(frase);
                Thread.sleep(750);
            } else if (input.equalsIgnoreCase("ma")) {
                System.out.println("Cargando segunda opcion");
                Thread.sleep(750);
                countWords(frase);
                Thread.sleep(750);
            } else if (input.equalsIgnoreCase("ws")) {
                System.out.println("Cargando tercera opcion");
                Thread.sleep(750);
                countThreeCharSeq(frase);
                Thread.sleep(750);
            } else if (input.equalsIgnoreCase("ca")) {
                System.out.println("Cargando cuarta opcion");
                Thread.sleep(750);
                avgCharAppearance(frase);
                Thread.sleep(750);
            } else if (input.equalsIgnoreCase("wa")) {
                System.out.println("Cargando quinta opcion");
                Thread.sleep(750);
                oddCharacterLengthAmount(frase);
                Thread.sleep(750);
            } else if (input.equalsIgnoreCase("vp")) {
                System.out.println("Cargando sexta opcion");
                Thread.sleep(750);
                wordWithMostVowels(frase);
                Thread.sleep(750);
            } else if (input.equalsIgnoreCase("sp")) {
                System.out.println("Cargando septima opcion");
                Thread.sleep(750);
                allWordsSortedByLength(frase);
                Thread.sleep(750);
            } else if (input.equalsIgnoreCase("hp")) {
                System.out.println("Cargando octava opcion");
                Thread.sleep(750);
                wordHistogram(frase);
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

    //Second level
    public String inputWords(String original) {
        /*
         * This method asks the user
         * for a word, then concatenates
         * the input word to the original
         * string, to then return it
         */
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String input_word = keyboard.next();
        if (original == "") {
            original = input_word;
        } else {
            original = original+", "+input_word;
        }

        return original;
    }

    public void countWords(String original) {
        StringHelper SH = new StringHelper();
        String[] string_array = SH.splitter(original);
        System.out.println("Frase: "+original);
        System.out.println("Numero de Palabras: "+string_array.length);
    }

    public void countThreeCharSeq(String original) {
        StringHelper SH = new StringHelper();
        Scanner keyboard = new Scanner(System.in);
        String[] string_array = SH.splitter(original);
        int word_num, counter = 0;
        String search_chars;
        System.out.println("Introduce un numero:");
        word_num = keyboard.nextInt();
        while (word_num > string_array.length || word_num < 1) {
            System.out.println("Numero invalido, introduce un numero correcto:");
            word_num = keyboard.nextInt();
        }
        System.out.println("Introduce tres caracteres:");
        search_chars = keyboard.next();
        while (search_chars.length() != 3) {
            System.out.println("Error, introduce tres caracteres:");
            search_chars = keyboard.next();
        }
        //We use a new string to store the particular word
        String word = string_array[word_num-1];
        //We use a -2 to give room for the 3 characters
        for (int i = 0; i < word.length()-2; i++) {
            //We pack the three next characters, and then compare them
            String help_search = String.valueOf(word.charAt(i))+String.valueOf(word.charAt(i+1))+String.valueOf(word.charAt(i+2));
            if ( help_search.equalsIgnoreCase(search_chars)) {
                counter++;
            }
        }
        if (counter!=0) {
            System.out.println("En la palabra "+word+" la combinacion "+search_chars+" ha aparecido un total de "+counter+" veces.");
        } else {
            System.out.println("En la palabra "+word+" la combinacion "+search_chars+" no ha aparecido");
        }
    }

    public void avgCharAppearance(String original) {
        StringHelper SH = new StringHelper();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce un caracter");
        String search_char = keyboard.next();
        int counter = 0;
        while (search_char.length() != 1) {
            System.out.println("Error, introduce un caracter");
            search_char = keyboard.next();
        }
        String[] string_array = SH.splitter(original);
        for (int i = 0; i < string_array.length; i++) {
            for (int j = 0; j < string_array[i].length(); j++) {
                if ( search_char.equalsIgnoreCase(String.valueOf(string_array[i].charAt(j)))) {
                    counter++;
                }
            }
        }
        float res = (float)counter/(float)string_array.length;
        System.out.println("La letra "+search_char+" aparece un total de "+res+" veces por palabra.");
    }

    public void oddCharacterLengthAmount(String original) {
        StringHelper SH = new StringHelper();
        String[] string_array = SH.splitter(original);
        System.out.println("Numero de Palabras con numero de caracteres impar:");
        for (int i = 0; i < string_array.length; i++) {
            if (string_array[i].length()%2!=0) {
                System.out.println(i+1);
            }
        }
    }

    public void wordWithMostVowels(String original) {
        StringHelper SH = new StringHelper();
        String[] string_array = SH.splitter(original);
        int counter = 0, max = 0;
        String word_max = "Ninguna";
        System.out.println("La palabra con mas vocales es:");
        for (int i = 0; i < string_array.length; i++) {
            counter = 0;
            for (int j = 0; j < string_array[i].length(); j++) {
                if ( String.valueOf(string_array[i].charAt(j)).equalsIgnoreCase("a") || String.valueOf(string_array[i].charAt(j)).equalsIgnoreCase("e") ||String.valueOf(string_array[i].charAt(j)).equalsIgnoreCase("i") ||String.valueOf(string_array[i].charAt(j)).equalsIgnoreCase("o") ||String.valueOf(string_array[i].charAt(j)).equalsIgnoreCase("u")) {
                    counter++;
                }
            }
            if (counter > max) {
                word_max=string_array[i];
                max=counter;
            }
        }
        System.out.println(word_max+" con "+max+" vocales.");
    }

    public void allWordsSortedByLength(String original) {
        StringHelper SH = new StringHelper();
        String[] string_array = SH.splitter(original);
        Arrays.sort(string_array, Comparator.comparingInt(String::length));
        for (int i = 0; i < string_array.length; i++) {
            System.out.println(string_array[i]);
        }
    }

    public void wordHistogram(String original) {
        StringHelper SH = new StringHelper();
        String[] string_array = SH.splitter(original);
        System.out.println("Histograma de palabras");
        for (int i = 0; i < string_array.length; i++) {
            System.out.print(string_array[i]+": ");
            for (int j = 0; j < string_array[i].length(); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
