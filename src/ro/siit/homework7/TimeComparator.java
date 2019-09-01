package ro.siit.homework7;

import java.util.Comparator;

public class TimeComparator implements Comparator <Athlete> {
    public int compare (Athlete a, Athlete b){
        return (a.getFinalTime()).compareTo(b.getFinalTime());
    }
}
