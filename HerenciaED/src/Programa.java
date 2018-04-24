import java.util.Scanner;

/**
 * This program creates a list of students and then displays their information,
 * it's set in the Harry Potter Universe
 * @author Álvaro Real
 * @author darkenend.net
 * @version 2.0.0
 */

public class Programa {
    private static int[] student_amount = new int[4];
    private static Alumno[] op;
    private static boolean devmode = false;
    private static int counter = 0, current_house = 0;

    /**
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        studentInput();
        op = new Alumno[student_amount[0]+student_amount[1]+student_amount[2]+student_amount[3]];
        if (devmode == true) System.err.println(op.length);
        studentCreate(student_amount[0]);
        studentCreate(student_amount[1]);
        studentCreate(student_amount[2]);
        studentCreate(student_amount[3]);
        studentPrint();
        printHouseCount(student_amount);
    }

    /**
     * This method uses a loop to create different students
     * @param house_count This is a int array that basically keeps track of how many alumni have been created
     */
    public static void studentCreate(int house_count) {
        for (int i = 0; i < house_count; i++) {
            switch (current_house) {
                case 0:
                    op[counter]=new Gryffindor();
                    break;
                case 1:
                    op[counter]=new Slytherin();
                    break;
                case 2:
                    op[counter]=new Ravenclaw();
                    break;
                case 3:
                    op[counter]=new Hufflepuff();
                    break;
            }
            counter++;
        }
        current_house++;
    }

    /**
     * This method uses a loop to print the students' information
     */
    public static void studentPrint() {
        for (int i = 0; i < op.length; i++) {
            System.out.println("Alumno "+(i+1));
            System.out.println("Nombre: "+op[i].getFullName());
            System.out.println("Casa: "+op[i].getHouse());
            System.out.println("Edad: "+op[i].getAge());
            System.out.println("Opinion sobre los deberes: "+op[i].getReply());
            System.out.println("Asignatura preferida: "+op[i].getFav_sub());
            System.out.println(op[i].getProperty());
            System.out.println();
        }
    }

    public static void printHouseCount(int[] house_count) {
        System.out.println("Alumnos en Gryffindor: "+house_count[0]);
        System.out.println("Alumnos en Slytherin: "+house_count[1]);
        System.out.println("Alumnos en Ravenclaw: "+house_count[2]);
        System.out.println("Alumnos en Hufflepuff: "+house_count[3]);
    }

    public static void studentInput() {
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    System.out.println("Introduce el numero de alumnos de Gryffindor: ");
                    break;
                case 1:
                    System.out.println("Introduce el numero de alumnos de Slytherin: ");
                    break;
                case 2:
                    System.out.println("Introduce el numero de alumnos de Ravenclaw: ");
                    break;
                case 3:
                    System.out.println("Introduce el numero de alumnos de Hufflepuff: ");
            }
            student_amount[i]=kb.nextInt();
            student_amount[i]=setDevmode(student_amount[i]);
            while (student_amount[i]<1) {
                System.out.println("Introduce un numero positivo");
                student_amount[i]=kb.nextInt();
            }
        }
    }

    /**
     * This method takes an integer to validate if the Developer Mode is active
     * @param xd The integer that it's fed to the method to validate the activation of the dev mode
     * @return Returns -1 if devmode is active to re-input a number, the standard number if it isn't 273
     */
    public static int setDevmode(int xd) {
        if (xd == 273) {
            devmode = true;
            System.err.println("DEVMODE ACTIVATED");
            return -1;
        } else {
            return xd;
        }
    }
}
