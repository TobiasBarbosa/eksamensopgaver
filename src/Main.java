import Article.Article;
import BMI.BMI;
import Film.Film;
import Film.Producer;
import MotherBoard.MotherBoard;
import Rafflebaeger.Raflebaeger;
import Tekst.Tekst;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Main {

    public static <Film> void main(String[] args) {


        //****BMI****---------------------------------------------------------------------------------------------------
        BMI bmi1 = new BMI(1.80, 81.7);
        System.out.println(bmi1);

        //****ARTICLE****-----------------------------------------------------------------------------------------------
        //Article article1 = new Article("HEJ", "A blank string is a string that has whitespace as its value. " +
                //"Its length is always greater than 0 and neither empty nor null. For example:", "Monir Mooghen");

        //System.out.println(article1);

        //***TEKST***---------------------------------------------------------------------------------------------------
//        String tekst1 = "hej";
//        String tekst2 = "hej2";
//        String tekst3 = "hej2";
//        String tekst4 = "Hej3";
//
//        Tekst tekstliste1 = new Tekst();
//        tekstliste1.addTextToList(tekst1);
//        tekstliste1.addTextToList(tekst2);
//        tekstliste1.addTextToList(tekst3);
//        tekstliste1.addTextToList(tekst4);
//
//        System.out.println(tekstliste1);

        //***FILM***----------------------------------------------------------------------------------------------------
//        Producer producer1 = new Producer("Christopher Nolan");
//        Film film1 = new Film("Inception", 2010, producer1);
//        Film film2 = new Film("Batman2");

//        System.out.println(producer1);
//        System.out.println(film1);
//        System.out.println(film2);

        //***RAFLEBAEGER***---------------------------------------------------------------------------------------------
//        Raflebaeger raflebaeger1 = new Raflebaeger(5);
//        raflebaeger1.shakeRaffle();

        //***PERSONS***-------------------------------------------------------------------------------------------------
//        ArrayList<Person> personer = new ArrayList<>();
//        personer.add(person1);
//        personer.add(person2);
//        for(Person person : personer){
//        out.println(person);
//        }
//        try {
//            File file = new File("personer.csv");
//            PrintStream out = new PrintStream(file);
//        }
//        catch (FileNotFoundException fileNotFoundException){
//            fileNotFoundException.printStackTrace();
//
//        }

        //***MOTHERBOARD***---------------------------------------------------------------------------------------------


        //***END CLASS***-----------------------------------------------------------------------------------------------
    }
}
