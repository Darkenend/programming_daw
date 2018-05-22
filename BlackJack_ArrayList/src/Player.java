import java.util.ArrayList;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Player {
    private String name;
    private ArrayList<Card> hand = new ArrayList<>();

    public Player(String given_name) {
        setName(given_name);
    }

    public void addCard(int card_val, String card_suit) {
        hand.add(new Card(card_val, card_suit));
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}