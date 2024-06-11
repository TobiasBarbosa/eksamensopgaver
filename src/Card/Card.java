package Card;

public class Card {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private String suit;
    private int value;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Card(String suit, int value){
        validateSuit(suit);
        validateValue(value);
    }

    //***METHODS***-----------------------------------------------------------------------------------------------------
    public void validateSuit(String suit){
        if(suit.equalsIgnoreCase("hearts") || suit.equalsIgnoreCase("diamonds") ||
           suit.equalsIgnoreCase("clubs") || suit.equalsIgnoreCase("spades")){
            this.suit = suit;
        } else {
            throw new IllegalArgumentException("Suits have to be either 'hearts', 'diamonds', 'clubs' or 'spades'");
        }
    }

    public void validateValue(int value) {
        if (value >= 1 && value <= 13) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("Value has to be between 1 and 13");
        }
    }

    public String beats(Card card1, Card card2){
        if(card1.equals(card2)){
            throw new IllegalArgumentException("Two of the same cards does not exist in the same deck of cards");
        }

    if(card1.suit.equalsIgnoreCase("spades") && card2.suit.equalsIgnoreCase("hearts")){
            return "card 1 has won";
        } if (card1.suit.equalsIgnoreCase("hearts") && card2.suit.equalsIgnoreCase("diamonds")) {
            return "card 1 has won";
        } if (card1.suit.equalsIgnoreCase("diamonds") && card2.suit.equalsIgnoreCase("clubs")){
            return "card 1 has won";
        } else if (card1.suit.equals(card2.suit) && card1.value > card2.value) {
                return "card 1 has won";
            } else if (card1.value == card2.value){
                return "It is a tie!";
        } else {
                return "card 2 has won";
            }
        }


    //***TO STRING METHOD***--------------------------------------------------------------------------------------------
    public String toString(){
    return "Card\n"   +
            "Suit: "  + suit + '\n' +
            "Value: " + value + '\n' ;
    }

    //------------------------------------------------------------------------------------------------------------------
}
