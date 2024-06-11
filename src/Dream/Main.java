package Dream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    Dream dream1 = new Dream(LocalDate.of(2023,8,12), 12.5, DreamType.NEUTRAL);
    Dream dream2 = new Dream(LocalDate.of(2024,2,11), 7,    DreamType.NEUTRAL);
    Dream dream3 = new Dream(LocalDate.of(2024,6,14), 9,    DreamType.NIGHTMARE);
    Dream dream4 = new Dream(LocalDate.of(2022,3,16), 8,    DreamType.PROBLEMSOLVING);
    Dream dream5 = new Dream(LocalDate.of(2024,8,20), 12,   DreamType.PROBLEMSOLVING);

    ArrayList<Dream> dreamList = new ArrayList<>();
    dream1.addDreamToList(dreamList, dream1);
    dream2.addDreamToList(dreamList, dream2);
    dream3.addDreamToList(dreamList, dream3);
    dream4.addDreamToList(dreamList, dream4);
    dream5.addDreamToList(dreamList, dream5);

    //dream1.sortDreamListByDate(dreamList);
    // System.out.println(dream1.sortDreamListByDate(dreamList));

        System.out.println(dream1);
        System.out.println(dream2);
        System.out.println(dream3);
        System.out.println(dream4);
        System.out.println(dream5);

    }
}
