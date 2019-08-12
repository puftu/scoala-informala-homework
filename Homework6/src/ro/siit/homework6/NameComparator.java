package ro.siit.homework6;


import java.util.Comparator;

public class NameComparator implements Comparator <Student> {

    public int compare (Student a, Student b){
        return a.getLastName().compareTo(b.getLastName());
    }

}
