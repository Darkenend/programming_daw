import java.util.ArrayList;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Player {
    private String name;
    private ArrayList<Card> hand = new ArrayList<>();
    private int score;
    private int delta;

    public Player(String given_name) {
        setName(given_name);
        setScore(0);
    }

    public void addCard(int card_val, String card_suit) {
        hand.add(new Card(card_val, card_suit));
    }

    public void showCards() {
        for (Card mycard:hand) {
            System.out.println("Card: "+mycard.toString());
        }
    }

    public void scoreRecap() {
        int help = 0;
        for (Card mycard:hand) {
            if (mycard.getValue() > 10) {
                help=help+10;
            } else {
                help=help+mycard.getValue();
            }
        }
        setScore(help);
        System.out.println("Current score: "+getScore());
        System.out.println("Current delta: "+getDelta());
    }

    public int getScore() {
        return this.score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setScore(int given_score) {
        this.score = given_score;
        setDelta();
    }
    public int getDelta() {
        return delta;
    }
    public void setDelta() {
        this.delta = 21 - getScore();
    }
}