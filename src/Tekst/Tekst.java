package Tekst;

import java.util.ArrayList;

public class Tekst {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private ArrayList<String> textList;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Tekst(){
        textList = new ArrayList<>();
    }

    //***ADD METHOD***--------------------------------------------------------------------------------------------------
    public void addTextToList(String text){
        textList.add(text);
    }

    //***METHODS***-----------------------------------------------------------------------------------------------------
    public int findNoOfStringsInList(){
    int stringCount = 0;
        for(String text : textList){
         stringCount++;
    }
        return stringCount;
    }

    public ArrayList<String> findUniques(){
        ArrayList<String> uniqueList = new ArrayList<>();

        for(String text : textList){
            if(!uniqueList.contains(text)){
                uniqueList.add(text);
            }
        }
        return uniqueList;
    }

    public int findNoOfUniqueStringsInList(){
        ArrayList<String> uniqueList = new ArrayList<>();
        int uniqueCount = 0;
        for(String text : textList){
            if(!uniqueList.contains(text)){
                uniqueList.add(text);
                uniqueCount++;
            }
        }
        return uniqueCount;
    }

    //***TO STRING***---------------------------------------------------------------------------------------------------
    public String toString(){
        return "Tekstlijer: "                + textList                     + '\n' +
               "Unikke tekstlinjer: "        + findUniques()                + '\n' +
               "Antal tekststrenge: "        + findNoOfStringsInList()      + '\n' +
               "Antal unikke tekststrenge: " + findNoOfUniqueStringsInList();
    }

    //***END CLASS***---------------------------------------------------------------------------------------------------
}
