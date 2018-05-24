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
        System.out.println("[1]. Yes");
        System.out.println("[2]. No");
        int help = keyboard.nextInt();
        while (help != 1 && help != 2) {
            System.out.println("Do you want to start a match with these players?");
            System.out.println("[1]. Yes");
            System.out.println("[2]. No");
            help = keyboard.nextInt();
        }
        if (help == 1) {
            game_procedure();
            endGame();
        }
        System.out.println("We'll see ya sometime else, wastelander, take care!");
    }

    private static void game_procedure() {
        int current_player = 0;
        firstCardDrawing();
        while (!areAllBooleansFalse(finished)) {
            System.out.println(players.get(current_player).getName()+"'s turn: ");
            players.get(current_player).showCards();
            players.get(current_player).scoreRecap();
            if (players.get(current_player).getScore() > 21) {
                System.out.println("You have overflown, you've lost.");
                finished[current_player] = true;
            } else {
                int switcher = menuGameProcedure();
                switch (switcher) {
                    case 0:
                        finished[current_player] = true;
                        break;
                    case 1:
                        drawCard(current_player);
                        break;
                }
            }
            current_player++;
            if (current_player == players.size()) {
                current_player = 0;
            }
        }
    }

    public static void endGame() {
        System.out.println("End Game Results:");
        String winner_name = "";
        int winner_score = 0;
        for (Player trash:players) {
            System.out.println(trash.getName()+": "+trash.getScore());
            if (trash.getScore() > winner_score && trash.getScore() < 22) {
                winner_score = trash.getScore();
                winner_name = trash.getName();
            }
        }
        System.out.println("The winner is: "+winner_name+" with a score of "+winner_score);
    }

    public static int menuGameProcedure() {
        System.out.println("Next action?");
        System.out.println("[0]. I had enough");
        System.out.println("[1]. One more card");
        int solv = keyboard.nextInt();
        while (solv < 0 || solv > 1) {
            System.out.println("Next action?");
            System.out.println("[0]. I had enough");
            System.out.println("[1]. One more card");
            solv = keyboard.nextInt();
        }
        return solv;
    }

    private static void firstCardDrawing() {
        int p_id = 0;
        for (Player fcd_player:players) {
            System.out.println(fcd_player.getName()+" gets the 2 first cards...");
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
                        cardset.add(new Card(j+1, "Spades"));
                        break;
                    case 1:
                        cardset.add(new Card(j+1, "Hearts"));
                        break;
                    case 2:
                        cardset.add(new Card(j+1, "Diamonds"));
                        break;
                    case 3:
                        cardset.add(new Card(j+1, "Trees"));
                        break;
                }
            }
        }
        for (int i = 0; i < repeated_indexes.length; i++) {
            repeated_indexes[i] = 273;
        }
    }
}