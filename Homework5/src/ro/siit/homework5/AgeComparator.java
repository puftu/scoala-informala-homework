package ro.siit.homework5;

import java.util.Comparator;

public class AgeComparator implements Comparator <Person> {

    public int compare (Person a, Person b){
        return a.getAge()-b.getAge();
    }
}
