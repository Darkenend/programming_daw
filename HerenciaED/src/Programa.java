import java.util.Random;
import java.util.Scanner;

/**
 * This program creates a list of students and then displays their information,
 * it's set in the Harry Potter Universe
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.2.0
 */

public class Programa {
    private static int[] student_amount = new int[4];

    /**
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        studentInput();
        Alumno[] op = new Alumno[student_amount[0]+student_amount[1]+student_amount[2]+student_amount[3]];
        studentCreate(op, student_amount[0]);
        studentCreate(op, student_amount[1]);
        studentCreate(op, student_amount[2]);
        studentCreate(op, student_amount[3]);
        studentPrint(op);
        printHouseCount(student_amount);
    }

    /**
     * This method uses a loop to create different students
     * @param alumni_array This is an array of the "Alumno" object that stores the alumni's information
     * @param house_count This is a int array that basically keeps track of how many alumni have been created
     */
    public static void studentCreate(Alumno[] alumni_array, int house_count) {
        for (int i = 0; i < house_count; i++) {

        }
    }

    /**
     * This method uses a loop to print the students' information
     * @param alumni_array This is an array of the "Alumno" object that stores the alumni's information
     */
    public static void studentPrint(Alumno[] alumni_array) {
        for (int i = 0; i < alumni_array.length; i++) {
            System.out.println("Alumno "+(i+1));
            System.out.println("Nombre: "+alumni_array[i].getFullName());
            System.out.println("Casa: "+alumni_array[i].getHouse());
            System.out.println("Edad: "+alumni_array[i].getAge());
            System.out.println("Opinion sobre los deberes: "+alumni_array[i].getReply());
            System.out.println("Asignatura preferida: "+alumni_array[i].getFav_sub());
            System.out.println(alumni_array[i].getProperty());
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
        System.out.println("Introduce el numero de alumnos de Gryffindor: ");
        student_amount[0]=kb.nextInt();
        while (student_amount[0]<1) {
            System.out.println("Introduce un numero positivo");
            student_amount[0]=kb.nextInt();
        }
        System.out.println("Introduce el numero de alumnos de Slytherin: ");
        student_amount[1]=kb.nextInt();
        while (student_amount[1]<1) {
            System.out.println("Introduce un numero positivo");
            student_amount[1]=kb.nextInt();
        }
        System.out.println("Introduce el numero de alumnos de Ravenclaw: ");
        student_amount[2]=kb.nextInt();
        while (student_amount[2]<1) {
            System.out.println("Introduce un numero positivo");
            student_amount[2]=kb.nextInt();
        }
        System.out.println("Introduce el numero de alumnos de Hufflepuff: ");
        student_amount[3]=kb.nextInt();
        while (student_amount[3]<1) {
            System.out.println("Introduce un numero positivo");
            student_amount[3]=kb.nextInt();
        }
    }
}
