package Card;

public class Main {

    public static void main(String[] args) {

        Card card1 = new Card("diamonds", 6);
        Card card2 = new Card("hearts", 6);


        System.out.println(card1.beats(card1,card2));
    }
}
