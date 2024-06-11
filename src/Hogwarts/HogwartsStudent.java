package Hogwarts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HogwartsStudent {

    private String firstName;
    private String lastName;
    private String house;
    private ArrayList<HogwartsStudent> hogwartsStudentList = new ArrayList<>();

    public HogwartsStudent(String firstName, String lastName, String house){
    this.firstName = firstName;
    this.lastName = lastName;
    setHouse(house);
    }

    public String getLastName(){
        return lastName;
    }

    public void setHouse(String house){
        if(house.equalsIgnoreCase("Gryffindor") || house.equalsIgnoreCase("Hufflepuff") ||
                house.equalsIgnoreCase("Slytherin") || house.equalsIgnoreCase("Ravenclaw")){
            this.house = house;
        } else {
            throw new IllegalArgumentException("House needs to be either 'Gryffindor', 'Hufflepuff', 'Ravenclaw' or 'Slytherin'");
        }
    }

    public void addHogwartsStudent(HogwartsStudent hogwartsStudent){
        hogwartsStudentList.add(hogwartsStudent);
    }

    public ArrayList<HogwartsStudent> sortLastName(){
        Collections.sort(hogwartsStudentList, new lastNameComparator());
        return hogwartsStudentList;
    }

    public ArrayList<HogwartsStudent> getHogwartsStudentList(){
        return hogwartsStudentList;
    }

    public String toString(){
        return "Hogwarts student\n" +
                "First name: " + firstName + '\n' +
                "Last name: " + lastName + '\n' +
                "House: " + house + '\n' ;
    }


}
