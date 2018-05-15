/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Player {
    public static Card[] hand = new Card[5];
    private String name;
    public int score_current;

    public Player(String name_given) {
        setName(name_given);
        setEmptyCards();
        setScore_current(0);
    }

    private void setEmptyCards() {
        for (int i = 0; i < hand.length; i++) {
            hand[i] = new Card(0, "nada");
        }
    }

    public static void addCard(Card given_card) {
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getValue()==0) {
                hand[i]=given_card;
                break;
            }
        }
    }

    public int getCardValue(int card_id) {
        return hand[card_id].getValue();
    }

    //Standard Getters & Setters
    public Card[] getHand() {
        return hand;
    }
    public String getName() {
        return name;
    }
    public void setHand(Card[] hand) {
        this.hand = hand;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore_current() {
        return score_current;
    }
    public void setScore_current(int score_current) {
        this.score_current = score_current;
    }
}
