package Dream;

import java.time.LocalDate;
import java.util.Comparator;

public class DateComparator implements Comparator<Dream> {

    @Override public int compare(Dream d1, Dream d2){
        return (d1.getDate().compareTo(d2.getDate()) +
                d2.getDate().compareTo(d1.getDate()));
    }
}
