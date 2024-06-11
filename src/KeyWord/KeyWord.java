package KeyWord;

import java.lang.reflect.Array;
import java.security.Key;
import java.util.ArrayList;

public class KeyWord {
    private String word;
    private String definition;
    private ArrayList<KeyWord> seeAlso;
    private ArrayList<KeyWord> allWords = new ArrayList<>();

    public KeyWord(String word, String definition){
        this.word = word;
        this.definition = definition;
        seeAlso = new ArrayList<>();
        //allWords = new ArrayList<>();
    }

    public void addMethod(KeyWord keyWord){
        allWords.add(keyWord);
    }

    public void addSeeAlso(KeyWord word){
        seeAlso.add(word);
    }

    //The contains() method checks whether a string contains a sequence of characters.
    //Returns true if the characters exist and false if not.

    public ArrayList<KeyWord> matches(String searchWord, KeyWord word) {
        ArrayList<KeyWord> matchesList = new ArrayList<>();
        if (word.word.toLowerCase().contains(searchWord.toLowerCase())) {
            for (KeyWord keyWord : allWords) {
                matchesList.add(keyWord);
            }
        }
            return matchesList;
    }

    @Override
    public String toString(){
        return "Word: " + word + "\nDefinition: " + definition + "\nSee also: " + seeAlso;
    }


}

