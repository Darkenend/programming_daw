/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Card {
    private int value;
    private String suit;

    public Card(int given_value, String given_suit) {
        setValue(given_value);
        setSuit(given_suit);
    }

    @Override
    public String toString() {
        return "The card is the "+getValue()+" of "+getSuit()+".";
    }

    //Getters and Setters
    public int getValue() {
        return value;
    }
    private void setValue(int value) {
        this.value = value;
    }
    public String getSuit() {
        return suit;
    }
    private void setSuit(String suit) {
        this.suit = suit;
    }
}