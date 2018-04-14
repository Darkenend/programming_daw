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
        student_amount = kb.nextInt();
        while (student_amount < 1) {
            System.out.println("Debes introducir un numero positivo");
            student_amount = kb.nextInt();
        }
        Alumno[] op = new Alumno[student_amount];
    }

}
