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
    private static Jugador[] jugadores;
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
        playercount=keyboard.nextInt();
        while (playercount < 1 || playercount > 6) {
            System.out.println("Invalid player count");
            playercount=keyboard.nextInt();
        }
        System.out.println("Player count: "+playercount);
        jugadores = new Jugador[playercount];
        System.out.println("Creating players...");
        String name;
        int round_counter=1;
        int playercurrent=0;
        // Action loop until game finishes
        while (!game_finished) {
            if (round_counter==273) {
                System.out.println("You can hear a snake in the background... Now everyone is dead.");
                System.exit(273);
            }
            ronda(round_counter, jugadores[playercurrent]);
            if (game_finished) break;
            round_counter++;
            if (playercurrent!=(playercount-1)) playercurrent++;
            else playercurrent=0;
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
