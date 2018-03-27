import java.util.Scanner;

/**
 * <h1>Juego - Russian Roulette</h1>
 *
 * This is the main single hub from where the game will basically
 * proceed, the gameMain is the game menu itself, making it possible
 * to use from a different place, such as a multi game hub.
 *
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Juego {
    /*
        TODO Optimize player creation, it's shit
        TODO Find out why finJuego() isn't used
        It is turn based, after someone dies, the game is finished.
     */
    private static String[][] jugadores;
    private static Revolver revolver = new Revolver();
    private static boolean game_finished = false;

    /**
     * The main, it self constructs the class and then accesses
     * the main hub from there.
     * @param args They will be completely ignored.
     */
    public static void main(String[] args) {
        Juego op = new Juego();
        op.gameMain();
    }


    /**
     * The game itself, this will be accessed and will proceed with the user's inputs.
     */
    public static void gameMain() {
        Scanner keyboard = new Scanner(System.in);
        int playercount = 6;
        System.out.println("Welcome to the russian roulette game!");
        System.out.println("First we're gonna ask you for the number of players you're gonna use.");
        //playercount=keyboard.nextInt();
        /*if (playercount < 1 || playercount > 6)*/ playercount=6;
        System.out.println("Player count: "+playercount);
        jugadores = new String[3][playercount];
        System.out.println("Creating players...");
        String name;

        /*
            BIG ASS SWITCH TO CREATE THE PLAYERS
         */
        /*switch (playercount) {
            case 1:
                System.out.println("I mean, you're dead, but go ahead mate.");
                System.out.println("Input your name (1): ");
                name = keyboard.nextLine();
                jugadores[0][0]="1";
                jugadores[1][0]=name;
                jugadores[2][0]="true";
                Jugador pla11 = new Jugador(1, name);
                break;
            case 2:
                System.out.println("Input your name (1): ");
                name = keyboard.nextLine();
                Jugador pla21 = new Jugador(1, name);
                jugadores[0][0]="1";
                jugadores[1][0]=name;
                jugadores[2][0]="true";
                System.out.println("Input your name (2): ");
                name = keyboard.nextLine();
                Jugador pla22 = new Jugador(2, name);
                jugadores[0][1]="2";
                jugadores[1][1]=name;
                jugadores[2][1]="true";
                break;
            case 3:
                System.out.println("Input your name (1): ");
                name = keyboard.nextLine();
                Jugador pla31 = new Jugador(1, name);
                jugadores[0][0]="1";
                jugadores[1][0]=name;
                jugadores[2][0]="true";
                System.out.println("Input your name (2): ");
                name = keyboard.nextLine();
                Jugador pla32 = new Jugador(2, name);
                jugadores[0][1]="2";
                jugadores[1][1]=name;
                jugadores[2][1]="true";
                System.out.println("Input your name (3): ");
                name = keyboard.nextLine();
                Jugador pla33 = new Jugador(3, name);
                jugadores[0][2]="3";
                jugadores[1][2]=name;
                jugadores[2][2]="true";
                break;
            case 4:
                System.out.println("Input your name (1): ");
                name = keyboard.nextLine();
                Jugador pla41 = new Jugador(1, name);
                jugadores[0][0]="1";
                jugadores[1][0]=name;
                jugadores[2][0]="true";
                System.out.println("Input your name (2): ");
                name = keyboard.nextLine();
                Jugador pla42 = new Jugador(2, name);
                jugadores[0][1]="2";
                jugadores[1][1]=name;
                jugadores[2][1]="true";
                System.out.println("Input your name (3): ");
                name = keyboard.nextLine();
                Jugador pla43 = new Jugador(3, name);
                jugadores[0][2]="3";
                jugadores[1][2]=name;
                jugadores[2][2]="true";
                System.out.println("Input your name (4): ");
                name = keyboard.nextLine();
                Jugador pla44 = new Jugador(4, name);
                jugadores[0][3]="4";
                jugadores[1][3]=name;
                jugadores[2][3]="true";
                break;
            case 5:
                System.out.println("Input your name (1): ");
                name = keyboard.nextLine();
                Jugador pla51 = new Jugador(1, name);
                jugadores[0][0]="1";
                jugadores[1][0]=name;
                jugadores[2][0]="true";
                System.out.println("Input your name (2): ");
                name = keyboard.nextLine();
                Jugador pla52 = new Jugador(2, name);
                jugadores[0][1]="2";
                jugadores[1][1]=name;
                jugadores[2][1]="true";
                System.out.println("Input your name (3): ");
                name = keyboard.nextLine();
                Jugador pla53 = new Jugador(3, name);
                jugadores[0][2]="3";
                jugadores[1][2]=name;
                jugadores[2][2]="true";
                System.out.println("Input your name (4): ");
                name = keyboard.nextLine();
                Jugador pla54 = new Jugador(4, name);
                jugadores[0][3]="4";
                jugadores[1][3]=name;
                jugadores[2][3]="true";
                System.out.println("Input your name (5): ");
                name = keyboard.nextLine();
                Jugador pla55 = new Jugador(5, name);
                jugadores[0][4]="5";
                jugadores[1][4]=name;
                jugadores[2][4]="true";
                break;
            case 6:*/
        System.out.println("Input your name (1): ");
        name = keyboard.nextLine();
        Jugador pla61 = new Jugador(1, name);
        jugadores[0][0]="1";
        jugadores[1][0]=name;
        jugadores[2][0]="true";
        System.out.println("Input your name (2): ");
        name = keyboard.nextLine();
        Jugador pla62 = new Jugador(2, name);
        jugadores[0][1]="2";
        jugadores[1][1]=name;
        jugadores[2][1]="true";
        System.out.println("Input your name (3): ");
        name = keyboard.nextLine();
        Jugador pla63 = new Jugador(3, name);
        jugadores[0][2]="3";
        jugadores[1][2]=name;
        jugadores[2][2]="true";
        System.out.println("Input your name (4): ");
        name = keyboard.nextLine();
        Jugador pla64 = new Jugador(4, name);
        jugadores[0][3]="4";
        jugadores[1][3]=name;
        jugadores[2][3]="true";
        System.out.println("Input your name (5): ");
        name = keyboard.nextLine();
        Jugador pla65 = new Jugador(5, name);
        jugadores[0][4]="5";
        jugadores[1][4]=name;
        jugadores[2][4]="true";
        System.out.println("Input your name (6): ");
        name = keyboard.nextLine();
        Jugador pla66 = new Jugador(6, name);
        jugadores[0][5]="6";
        jugadores[1][5]=name;
        jugadores[2][5]="true";
                /*break;
        }*/
        int round_counter=1;

        // Action loop until game finishes
        while (!game_finished) {
            //For loop that goes around all the players, continues until the players have been reached (then resets itself) or someone is dead
            for (int i = 0; i < playercount; i++) {
                switch (i) {
                    case 0:
                        ronda(round_counter, pla61);
                        if (round_counter==273) {
                            System.out.println("You can hear a snake in the background... Now everyone is dead.");
                            System.exit(273);
                        }
                        break;
                    case 1:
                        ronda(round_counter, pla62);
                        if (round_counter==273) {
                            System.out.println("You can hear a snake in the background... Now everyone is dead.");
                            System.exit(273);
                        }
                        break;
                    case 2:
                        ronda(round_counter, pla63);
                        if (round_counter==273) {
                            System.out.println("You can hear a snake in the background... Now everyone is dead.");
                            System.exit(273);
                        }
                        break;
                    case 3:
                        ronda(round_counter, pla64);
                        if (round_counter==273) {
                            System.out.println("You can hear a snake in the background... Now everyone is dead.");
                            System.exit(273);
                        }
                        break;
                    case 4:
                        ronda(round_counter, pla65);
                        if (round_counter==273) {
                            System.out.println("You can hear a snake in the background... Now everyone is dead.");
                            System.exit(273);
                        }
                        break;
                    case 5:
                        ronda(round_counter, pla66);
                        if (round_counter==273) {
                            System.out.println("You can hear a snake in the background... Now everyone is dead.");
                            System.exit(273);
                        }
                        break;
                }
                //Game finished breaker, that way we avoid checking the players after the dead one
                if (game_finished) break;
                round_counter++;
            }
        }
    }

    /**
     * This method basically sums up a round, prints which round we're in and then actuates.
     * @param i_rc The round counter
     * @param player The player which picks up the revolver and then shoots
     */
    private static void ronda(int i_rc, Jugador player) {
        System.out.println("Round "+i_rc);
        System.out.println(player.nombre);
        if (player.disparar(revolver)) {
            System.out.println(player.nombre+" is dead.");
            if (finJuego()) {
                game_finished = true;
            }
        }
        revolver.siguienteBala();
    }


    /**
     * The method checks if the game has ended.
     * @return true if game is finished, false if it isn't
     */
    public static boolean finJuego() {
        if (revolver.disparar()) return true;
        else return false;
    }
}
