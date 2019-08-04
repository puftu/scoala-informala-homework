package ro.siit.homework5;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {
    public static void main(String[] args) {

        Adress adresa1 = new Adress("Brasov", "Romania");
        Adress adresa2 = new Adress("Constanta", "Romania");
        Adress adresa3 = new Adress("Cluj", "Romania");
        Adress adresa4 = new Adress("Bavaria", "Germany");
        Adress adresa5 = new Adress("Wien", "Austria");
        Adress adresa6 = new Adress("Crete", "Greece");

        Hobby ski = new Hobby("ski", 2);
        ski.addAdress(adresa1);
        ski.addAdress(adresa4);
        ski.addAdress(adresa5);

        Hobby swimming = new Hobby("swimming", 5);
        swimming.addAdress(adresa2);
        swimming.addAdress(adresa6);

        System.out.println(ski);
        System.out.println(swimming);

        Person person1 = new Person("Paul", 28);
        Person person2 = new Person("Oana", 26);
        Map<Person, Hobby> map = new HashMap();
        map.put(person1, swimming);
        map.put(person2, ski);
        System.out.println(map);

        for (Person p : map.keySet()) {
            if (p.getName() == "Paul") {
                System.out.println(p.getName() + " are urmatorul hobby: " + map.get(p).getName() + " care poate fi practicat in: " + map.get(p).getAdress());
            }
        }

    }
}
