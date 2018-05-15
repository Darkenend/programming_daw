import java.util.Scanner;
import java.util.Random;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Game {
    private static Player[] players = new Player[4];
    private static int playercount = 1;
    private static Scanner keyboard = new Scanner(System.in);
    private static int[] card_indexes = new int[20];
    private static int card_indexes_helper = 0;
    private static Card[] card_set = new Card[48];
    private static Random rng = new Random();
    private static boolean[] finish_status = {true, true, true, true};

    /**
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido al casino de New Vegas");
        System.out.println("En Blackjack gana la persona con el 'delta' positivo mas cercano a 0 respecto de 21, si el delta es negativo (Es decir, se ha pasado de 21), se ha perdido");

        /*DOESN'T WORK AT THE MOMENT, IT DOES A WEIRD ENDLESS LOOP, BUT PRETTY MUCH EVERYTHING ELSE WORKS, UNCOMMENT FOR TESTING

        System.out.println("¿Cuantos jugadores van a haber? (Máximo 4)");
        playercount = keyboard.nextInt();
        while (playercount < 1 || playercount > 4) {
            System.out.println("Error, numero invalido, vuelve a introducirlo: ");
            playercount = keyboard.nextInt();
        }
        */
        playerCreation();
        System.out.println("Creando baraja de cartas...");
        cardSetCreation();
        //This way we make sure that there's no confusions
        for (int i = 0; i < card_indexes.length; i++) {
            card_indexes[i]=273;
        }
        System.out.println("Jugadores: ");
        for (int i = 0; i < playercount; i++) {
            System.out.println(players[i].getName());
        }
        matchProcess();
        matchFinished();
        System.out.println("Hasta luego!");
    }

    /**
     * This method is dedicated to the creation of players
     */
    private static void playerCreation() {
        for (int i = 0; i < playercount; i++) {
            System.out.println("Introduce el nombre del jugador "+(i+1)+": ");
            String temp=keyboard.next();
            players[i]=new Player(temp);
            finish_status[i]=false;
        }
        keyboard.nextLine();
    }

    /**
     * This method creates the set of cards that we'll play with
     */
    private static void cardSetCreation() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {
                card_set[j+(i*12)] = new Card(j+1);
                switch (i) {
                    case 0:
                        card_set[j+(i*12)].setSuit("Copas");
                        break;
                    case 1:
                        card_set[j+(i*12)].setSuit("Oros");
                        break;
                    case 2:
                        card_set[j+(i*12)].setSuit("Espadas");
                        break;
                    case 3:
                        card_set[j+(i*12)].setSuit("Bastos");
                }
            }
        }
    }

    /**
     * This method gives a card to a player
     * @param player_id this "id" will identify which player will recieve which card
     */
    private static void cardDrawing(int player_id) {
        int help=rng.nextInt(48);
        boolean card_repeated = true;
        while (card_repeated) {
            for (int j = 0; j < card_indexes.length; j++) {
                if (help == card_indexes[j]) {
                    card_repeated = true;
                } else {
                    card_repeated = false;
                }
            }
        }
        players[player_id].addCard(card_set[help]);
        card_indexes[card_indexes_helper] = help;
        card_indexes_helper++;
    }

    /**
     * This is the method which sorts out how the match will go on
     */
    private static void matchProcess() {
        //Players get 2 cards
        for (int i = 0; i < playercount; i++) {
            cardDrawing(i);
            cardDrawing(i);
        }
        while (!finish_status[0] || !finish_status[1] || !finish_status[2] || !finish_status[3]) {
            for (int i = 0; i < playercount; i++) {
                System.out.println("Turno de "+players[i].getName());
                //They show cards
                cardShowing(i);
                scoreRecap(i);
                endTurn(i);
                if (i == playercount-1) {
                    i = 0;
                }
            }
        }
    }

    /**
     * This method shows a player's cards
     * @param p_id this "id" will identify the current player
     */
    private static void cardShowing(int p_id) {
        System.out.println("Tus cartas son:");
        for (Card card_current:
                players[p_id].hand) {
            System.out.println(card_current.toString());
        }
    }

    /**
     * This method does a recap of the player's score
     * @param p_id this "id" will identify the current player
     */
    private static void scoreRecap(int p_id) {
        System.out.println("Tu puntuacion actual es: ");
        int current_score = 0;
        for (int j = 0; j < players[p_id].hand.length; j++) {
            int card_val = players[p_id].hand[j].getValue();
            if (card_val > 9) {
                current_score+=10;
                players[p_id].setScore_current(current_score);
            } else {
                current_score+=card_val;
                players[p_id].setScore_current(current_score);
            }
        }
        System.out.println(current_score);
        System.out.println("Delta: "+(21-current_score));
    }

    /**
     * This method is the one that asks if the player wants another card and then actuates appropriately
     * @param p_id this "id" will identify the current player
     */
    private static void endTurn(int p_id) {
        if (players[p_id].getScore_current() < 21) {
            System.out.println("¿Quieres otra carta? (S/N)");
            String response = keyboard.nextLine();
            if (response.equalsIgnoreCase("s")) {
                cardDrawing(p_id);
                finish_status[p_id]=false;
            } else {
                finish_status[p_id]=true;
            }
        } else if (players[p_id].getScore_current() == 21) {
            System.out.println("Te toca esperar...");
            finish_status[p_id]=true;
        } else {
            System.out.println("Te has pasado, una pena...");
            finish_status[p_id]=true;
        }
    }

    private static void matchFinished() {
        System.out.println("Resultados finales:");
        for (int i = 0; i < playercount; i++) {
            if (players[i].getScore_current() > 21) {
                System.out.println(players[i].getName()+" se ha pasado con "+players[i].getScore_current());
            } else if (players[i].getScore_current() == 21) {
                System.out.println(players[i].getName()+" se la ha marcado con "+players[i].getScore_current()+", enhorabuena");
            } else {
                System.out.println(players[i].getName()+" ha conseguido "+players[i].getScore_current());
            }
        }
    }
}