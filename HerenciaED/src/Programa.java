import java.util.Random;
import java.util.Scanner;

/**
 * This program creates a list of students and then displays their information,
 * it's set in the Harry Potter Universe
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.1.0
 */

public class Programa {

    /**
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        int student_amount;
        Scanner kb = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        student_amount = kb.nextInt();
        while (student_amount < 1) {
            System.out.println("Debes introducir un numero positivo");
            student_amount = kb.nextInt();
        }
        Alumno[] op = new Alumno[student_amount];
        studentCreate(op);
        studentPrint(op);
    }

    /**
     * This method uses a loop to create different students
     * @param alumni_array This is an array of the "Alumno" object that stores the alumni's information
     */
    public static void studentCreate(Alumno[] alumni_array) {
        for (int i = 0; i < alumni_array.length; i++) {
            Random rng = new Random();
            int temp = rng.nextInt(4);
            switch (temp) {
                case 0:
                    alumni_array[i] = new Gryffindor();
                    break;
                case 1:
                    alumni_array[i] = new Slytherin();
                    break;
                case 2:
                    alumni_array[i] = new Ravenclaw();
                    break;
                case 3:
                    alumni_array[i] = new Hufflepuff();
                    break;
            }
        }
    }

    /**
     * This method uses a loop to print the students' information
     * @param alumni_array This is an array of the "Alumno" object that stores the alumni's information
     */
    public static void studentPrint(Alumno[] alumni_array) {
        for (int i = 0; i < alumni_array.length; i++) {
            System.out.println("Alumno "+(i+1));
            System.out.println("Nombre: "+alumni_array[i].name+" "+alumni_array[i].lastname);
            System.out.println("Casa: "+alumni_array[i].house);
            System.out.println("Edad: "+alumni_array[i].age);
            System.out.println("Opinion sobre los deberes: "+alumni_array[i].reply);
            System.out.println("Asignatura preferida: "+alumni_array[i].fav_sub);
            switch (alumni_array[i].house) {
                case "Gryffindor":
                    System.out.println("Mascota: "+alumni_array[i].property);
                    break;
                case "Slytherin":
                    System.out.println("Arma: "+alumni_array[i].property);
                    break;
                case "Ravenclaw":
                    System.out.println("Libro: "+alumni_array[i].property);
                    break;
                case "Hufflepuff":
                    System.out.println("Planta: "+alumni_array[i].property);
                    break;
            }
            System.out.println();
        }
    }
}
