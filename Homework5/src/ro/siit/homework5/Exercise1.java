package ro.siit.homework5;

import java.util.Set;
import java.util.TreeSet;

public class Exercise1 {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>(new NameComparator());
        set.add(new Person("Alexandru", 20));
        set.add(new Person("Maria", 18));
        set.add(new Person("George", 28));
        set.add(new Person("Andrei", 24));
        set.add(new Person("Valentina", 21));
        set.add(new Person("Oana", 26));
        set.add(new Person("Radu", 31));

        System.out.println("Sorted by name: " + set);
        Set<Person> set1 = new TreeSet<>(new AgeComparator());
        set1.add(new Person("Alexandru", 20));
        set1.add(new Person("Maria", 18));
        set1.add(new Person("George", 28));
        set1.add(new Person("Andrei", 24));
        set1.add(new Person("Valentina", 21));
        set1.add(new Person("Oana", 26));
        set1.add(new Person("Radu", 31));

        System.out.println("Sorted by age: " + set1);


    }


}
