package ro.siit.homework5;

import java.util.Comparator;

public class NameComparator implements Comparator <Person> {

    public int compare (Person a, Person b){
        return a.getName().compareTo(b.getName());
    }

}
