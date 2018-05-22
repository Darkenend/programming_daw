import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Game {

    private static ArrayList<Player> players = new ArrayList<>();
    private static ArrayList<Card> cardset = new ArrayList<>();
    private static boolean[] finished;
    private static Scanner keyboard = new Scanner(System.in);
    private static int[] repeated_indexes = new int[20];

    /**
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        cardset_generation();

        System.out.println("Welcome to the Lucky 38!");
        System.out.println("As the Courier has helped to rebuild the casino, we're gonna open in a while our BlackJack tables, use this as a training tool!");
        System.out.println("How many players will be at the desk?");
        int playercount = keyboard.nextInt();
        keyboard.nextLine();
        player_creation(playercount);
        System.out.println("This is the player list:");
        for (Player printing:players) {
            System.out.println(printing.getName());
        }
        System.out.println("Do you want to start a match with these players?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int help = keyboard.nextInt();
        while (help != 1 && help != 2) {
            System.out.println("Do you want to start a match with these players?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            help = keyboard.nextInt();
        }
        if (help == 1) {
            game_procedure();
        }
    }

    private static void game_procedure() {
        int current_player = 0;
        firstCardDrawing();
        while (!areAllBooleansFalse(finished)) {
            System.out.println(players.get(current_player).getName()+"'s turn: ");
            players.get(current_player);
        }
    }

    private static void firstCardDrawing() {
        int p_id = 0;
        for (Player fcd_player:players) {
            drawCard(p_id);
            drawCard(p_id);
            p_id++;
        }
    }

    private static void drawCard(int p_id) {
        Random rng = new Random();
        int gen_index = rng.nextInt(48);
        while (isIntRepeated(repeated_indexes ,gen_index)) {
            gen_index = rng.nextInt(48);
        }
        players.get(p_id).addCard(cardset.get(gen_index).getValue(), cardset.get(gen_index).getSuit());
        addIndexToRepeated(gen_index);
    }

    private static void addIndexToRepeated(int given_index) {
        for (int i = 0; i < repeated_indexes.length; i++) {
            if (repeated_indexes[i] == 273) {
                repeated_indexes[i]=given_index;
                break;
            }
        }
    }

    private static boolean isIntRepeated(int[] given_array,int given_index) {
        for (int i = 0; i < given_array.length; i++) {
            if (given_index == given_array[i]) {
                return true;
            }
        }
        return false;
    }

    private static boolean areAllBooleansFalse(boolean[] given_array) {
        for (int i = 0; i < given_array.length; i++) {
            if (!given_array[i]) {
                return false;
            }
        }
        return true;
    }

    private static void player_creation(int given_playercount) {
        for (int i = 0; i < given_playercount; i++) {
            System.out.println("Player "+(i+1)+"'s name: ");
            String player_name = keyboard.next();
            players.add(new Player(player_name));
        }
        finished = new boolean[players.size()];
        for (int i = 0; i < finished.length; i++) {
            finished[i] = false;
        }
    }
    private static void cardset_generation() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {
                switch (i) {
                    case 0:
                        cardset.add(new Card(j+1, "Oros"));
                        break;
                    case 1:
                        cardset.add(new Card(j+1, "Copas"));
                        break;
                    case 2:
                        cardset.add(new Card(j+1, "Bastos"));
                        break;
                    case 3:
                        cardset.add(new Card(j+1, "Espadas"));
                        break;
                }
            }
        }
        for (int i = 0; i < repeated_indexes.length; i++) {
            repeated_indexes[i] = 273;
        }
    }
}