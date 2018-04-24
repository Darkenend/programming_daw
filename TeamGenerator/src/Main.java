import java.util.*;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Main {
    private static String[] names;
    private static String[] team1;
    private static String[] team2;
    private static Scanner kb = new Scanner(System.in);
    /**
     * @param args Command line arguments
     */

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Introduce el numero de alumnos");
        int clev = kb.nextInt();
        names = new String[clev];
        team1 = new String[(int) Math.ceil(clev/2)+1];
        team2 = new String[(int) Math.ceil(clev/2)+1];
        System.out.println("Introduce el nombre de los alumnos");
        nameInput();
        System.out.println("Nombres introducidos, ordenando");
        sortInTeams();
        System.out.println("Equipo 1:");
        printTeam(team1);
        System.out.println();
        System.out.println("Equipo 2:");
        printTeam(team2);
    }

    public static void nameInput() throws InterruptedException {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Introduce el nombre del alumno "+(i+1)+": ");
            Thread.sleep(100);
            names[i] = kb.nextLine();
            System.out.println("Introducido: "+names[i]);
        }
        names[0]="Alvaro Real";
    }

    public static void sortInTeams() {
        Random rng = new Random();
        int help, team1_count = 0, team2_count = 0;
        for (int i = 0; i < names.length; i++) {
            help = rng.nextInt(100);
            if (help > 50) {
                if (team1_count == (int) Math.ceil(names.length/2)) {
                    team2[team2_count] = names[i];
                    team2_count++;
                } else {
                    team1[team1_count] = names[i];
                    team1_count++;
                }
            } else {
                if (team2_count == (int) Math.ceil(names.length/2)) {
                    team1[team1_count] = names[i];
                    team1_count++;
                } else {
                    team2[team2_count] = names[i];
                    team2_count++;
                }
            }
        }
    }

    public static void printTeam(String[] team_printing) {
        for (int i = 0; i < team_printing.length; i++) {
            if (team_printing[i] != null) System.out.println(team_printing[i]);
        }
    }
}
