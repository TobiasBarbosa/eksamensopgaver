package Dream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Dream {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private LocalDate date;
    private double duration;
    private DreamType type;
    private DateComparator dateComparator;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Dream(LocalDate date, double duration, DreamType type){
        this.date = date;
        this.duration = duration;
        this.type = type;
    }

    //***GETTER METHOD***-----------------------------------------------------------------------------------------------
    public LocalDate getDate(){
        return date;
    }

    //***ADD METHOD***--------------------------------------------------------------------------------------------------
    public void addDreamToList(ArrayList<Dream> dreamList, Dream dream){
        dreamList.add(dream);
    }

    //***OTHER METHODS***-----------------------------------------------------------------------------------------------
    public ArrayList<Dream> sortDreamListByDate(ArrayList<Dream> dreamList){
        ArrayList<Dream> dreamDateList = new ArrayList<>();

        for(Dream dream : dreamList){
            dreamDateList.add(dream);
        }
        Collections.sort(dreamDateList, dateComparator);
        return dreamDateList;
    }

    public String isPleasant(){
        String isPleasantDream = "";

        //1 Dream is never pleasant if it is a nightmare
        if (type.equals(DreamType.NIGHTMARE)){
            isPleasantDream += "You did not have a pleasant dream.";
        }

        //2 Dream is pleasant if it is problem-solving and under 10min
        if((type.equals(DreamType.PROBLEMSOLVING) && (duration < 10))){
            isPleasantDream += "You had a pleasant dream";
        } else if((type.equals(DreamType.PROBLEMSOLVING) && (duration > 10))) {
            isPleasantDream += "You did not have a pleasant dream";
        }

        //3 Dream is pleasant if it is neutral and over 10min
        if((type.equals(DreamType.NEUTRAL) && (duration > 10))){
            isPleasantDream += "You had a pleasant dream";
        } else if((type.equals(DreamType.NEUTRAL) && (duration < 10))) {
            isPleasantDream += "You did not have a pleasant dream";
        }

        return isPleasantDream;

    }


    //***TO STRING METHOD***--------------------------------------------------------------------------------------------
    public String toString(){
        return  "Dream"                           + '\n' +
                "Date: "           + date         + '\n' +
                "Duration: "       + duration     + " min" +'\n' +
                "Type: "           + type         + '\n' +
                "Pleasant dream? " + isPleasant() + '\n' ;
    }

    //------------------------------------------------------------------------------------------------------------------
}
