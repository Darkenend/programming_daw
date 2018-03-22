/*
 * This program is created by Alvaro "Darkenend" Real,
 * it won't be used for any other purpose by anyone
 * else aside of him for correction purposes, it may
 * or may not be re-used by "Darkenend" to help him
 * with new projects and endeavours.
 */

import java.util.Scanner;

public class GestorNotes {
    //Global stuff needed for the build
    private String[] stringHistogram = {"Suspes", "Aprovat", "Be", "Notable", "Excel·lent"};
    private boolean end = false;
    private boolean keepcontinue = true;
    private int num_notes = 0;
    private float[] notes = new float[40];
    private int[] histogram = new int[stringHistogram.length];
    Scanner keyboard = new Scanner(System.in);

    //main function
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        GestorNotes op = new GestorNotes();
        op.start();
        op.end();
    }

    //start process - FIRST LEVEL
    public void start() {
        System.out.println("Benvingut al Gestor de Notes");
        while (!end) {
            mainMenu();
            menuProcessing();
        }
    }

    //main menu print that gives access to the other menus
    public void mainMenu() {
        System.out.println("----------------------------");
        System.out.println("[RT] Registrar notes.");
        System.out.println("[MJ] Consultar nota mitjana.");
        System.out.println("[HT] Histograma de notes.");
        System.out.println("[FI] Sortir.");
        System.out.print("Opció: ");
    }

    //main menu processing
    public void menuProcessing() {
        String input = keyboard.nextLine();
        if (input.equalsIgnoreCase("rt")) {
            register();
        } else if (input.equalsIgnoreCase("mj")) {
            average();
        } else if (input.equalsIgnoreCase("ht")) {
            histogramDisplay();
        } else if (input.equalsIgnoreCase("fi")) {
            end = true;
        } else {
            System.out.println("Opcio incorrecta!");
        }
    }

    //SECOND LEVEL
    public void register() {
        System.out.println("Escriu les notes, posa -1 per acabar:");
        while (keepcontinue) {
            if (num_notes == notes.length) {
                System.out.println("Ja no queda més espai.");
                keepcontinue = false;
            }
        readValues();
        }
        keyboard.nextLine();
    }

    public void average() {
        if (num_notes > 0) {
            System.out.print("La nota mitjana es de ");
            averageCalculation();
            System.out.print(".");
            System.out.println();
        } else {
            System.out.println("No hi ha notes registrades.");
        }
    }

    public void histogramDisplay() {
        histogramCalculation();
        for (int i = 0; i < histogram.length; i++) {
            System.out.print(stringHistogram[i]+":");
            for (int j = 0; j < histogram[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //THIRD LEVEL
    public void readValues() {
        if (keyboard.hasNextFloat()) {
            float value = keyboard.nextFloat();
            if (value == -1) {
                keepcontinue=false;
            } else {
                notes[num_notes]=value;
                num_notes++;
            }
        } else {
            keyboard.next();
        }
    }

    public void averageCalculation() {
        float storage = 0;
        for (int i = 0; i < num_notes; i++) {
            storage = storage + notes[i];
        }
        System.out.print((storage/num_notes));
    }

    public void histogramCalculation() {
        for (int i = 0; i < num_notes; i++) {
            if ((notes[i] >= 9)&&(notes[i] <= 10)) {
                histogram[3]++;
            } else if (notes[i] >= 6.5) {
                histogram[2]++;
            } else if (notes[i] >= 5) {
                histogram[1]++;
            } else {
                histogram[0]++;
            }
        }
    }

    //end process
    public void end() {
        System.out.println("El programa esta finalitzat.");
    }
}
