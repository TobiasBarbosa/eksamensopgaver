package KeyWord;

import java.security.Key;

public class Main {
    public static void main(String[] args) {

        KeyWord word1 = new KeyWord("Formodentligt", "Noget som med sandsynglighed sker");
        KeyWord word2 = new KeyWord("Fortræffeligt", "Når noget er præcist og et sjovt tilfælde");
        KeyWord word3 = new KeyWord("Usandsynligt", "Noget, som formodentligt ikke sker");
        KeyWord word4 = new KeyWord("Sandsynligvis", "Noget, som nok sker");
        word1.addSeeAlso(word4);
        word1.addSeeAlso(word3);

        word1.addMethod(word1);
        word2.addMethod(word2);
        word3.addMethod(word3);


        System.out.println(word1.matches("for", word1));
    }
}
