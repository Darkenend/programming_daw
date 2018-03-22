import java.util.Scanner;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class AplicacionCuentaBancaria {

    /**
     * @param args Command line arguments
     */

    public static void main(String[] args) {
        boolean account_active = false;
        int coun = 1;
        Scanner keyboard = new Scanner(System.in);
        /*
         *  TODO Implement Menu for New Account's Functionality (IN PROGRESS)
         *  TODO Implement Menu for Active Account
         *  TODO Implement Menu for Active Account's Functionality
         *  TODO Create way of switching accounts (Maybe 2-size array that stores all info during execution time?)
         */
        System.out.println("Bienvenido a la aplicacion de Dark-Bank");
        while (!account_active) {
            System.out.println("------- | MENU | -------");
            System.out.println("Introduce una opcion");
            System.out.println("[1] - Introducir cuenta");
            System.out.println("[2] - Salir");
            int option = keyboard.nextInt();
            while (option != 1 && option != 2) {
                System.out.println("Opcion invalida");
                System.out.println("Introduce una opcion");
                System.out.println("[1] - Introducir cuenta");
                System.out.println("[2] - Salir");
                option = keyboard.nextInt();
            }
            if (option==2) System.exit(0);
            System.out.println("Vas a introducir una cuenta, quieres continuar? [Yes/No]");
            String opt = keyboard.nextLine();
            opt = String.valueOf(opt.charAt(1));
            if (opt.equalsIgnoreCase("n")) {
                System.exit(0);
            }
        }
    }

}
