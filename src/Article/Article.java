package Article;

import java.util.ArrayList;

public class Article {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private String heading;
    private String body;
    private String author;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Article(String heading, String body, String author){
        this.heading = heading;
        this.body    = body;
        this.author  = author;
    }

    //***METHODS***-----------------------------------------------------------------------------------------------------
    public String getLongestWord(){
        String[] bodyWords = body.split(" ");
        String longestWord = "";
        for (String word : bodyWords) {
            if(word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
             return longestWord;
    }

    public ArrayList<String> getWordList() {
        String[] bodyWords = body.split(" ");
        ArrayList<String> tempArrayList = new ArrayList<>();
        ArrayList<String> wordList = new ArrayList<>();
        for (String word : bodyWords) {
            tempArrayList.add(word);
            if (!wordList.contains(word)) {
                wordList.add(word);
            }
        }
        return wordList;
    }

    //***TO STRING***---------------------------------------------------------------------------------------------------
    public String toString(){
        return "Heading: "      + heading + '\n'   +
               "Body: "         + body    + '\n'   +
               "Author:"        + author  + '\n'   +
               "Longest word: " + getLongestWord() + '\n' +
               "Word list: "    + getWordList()    ;
    }

    //------------------------------------------------------------------------------------------------------------------
}
