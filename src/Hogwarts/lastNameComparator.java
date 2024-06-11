package Hogwarts;

import java.util.Comparator;

public class lastNameComparator implements Comparator<HogwartsStudent> {

    public int compare(HogwartsStudent hs1, HogwartsStudent hs2){
        return hs1.getLastName().compareTo(hs2.getLastName());
    }
}
