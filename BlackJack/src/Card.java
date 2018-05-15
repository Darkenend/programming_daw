/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class Card {
    private int value;
    private String suit;

    /**
     * Card constructor
     * @param value_given the value of said card, from 1 to 12
     */
    public Card(int value_given) {
        this.setValue(value_given);
    }

    /**
     * ONLY USED FOR EMPTY CREATION
     * @param value_given it will always be 0
     * @param suit_given it will always be 'none'
     */
    public Card(int value_given, String suit_given) {
        this.setValue(value_given);
        this.setSuit(suit_given);
    }

    //This method returns the info about the card
    @Override
    public String toString() {
        return "La carta es: "+getValue()+" de "+getSuit();
    }

    //Standard Getters & Setters
    public int getValue() {
        return value;
    }
    private String getSuit() {
        return suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
    private void setValue(int value) {
        this.value = value;
    }
}
