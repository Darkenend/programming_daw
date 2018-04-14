import java.util.Random;
import java.util.Scanner;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
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
        for (int i = 0; i < student_amount; i++) {
            Random rng = new Random();
            int temp = rng.nextInt(4);
            switch (temp) {
                case 0:
                    op[i] = new Gryffindor();
                    break;
                case 1:
                    op[i] = new Slytherin();
                    break;
                case 2:
                    op[i] = new Ravenclaw();
                    break;
                case 3:
                    op[i] = new Hufflepuff();
                    break;
                default:
                    System.out.println("This shouldn't be read");
                    break;
            }
        }
        for (int i = 0; i < student_amount; i++) {
            System.out.println("Alumno "+(i+1));
            System.out.println("Nombre: "+op[i].name+" "+op[i].lastname);
            System.out.println("Casa: "+op[i].house);
            System.out.println("Edad: "+op[i].age);
            System.out.println("Opinion sobre los deberes: "+op[i].reply);
            System.out.println("Asignatura preferida: "+op[i].fav_sub);
            switch (op[i].house) {
                case "Gryffindor":
                    System.out.println("Mascota: "+op[i].property);
                    break;
                case "Slytherin":
                    System.out.println("Arma: "+op[i].property);
                    break;
                case "Ravenclaw":
                    System.out.println("Libro: "+op[i].property);
                    break;
                case "Hufflepuff":
                    System.out.println("Planta: "+op[i].property);
                    break;
            }
            System.out.println();
        }
    }
}
